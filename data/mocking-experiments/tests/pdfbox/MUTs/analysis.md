### Our criteria
- C1: invoked on field or param
- C2: primitive params
- C3: primitive returned value
- C4: LOC
- C5: non-static

### 1. DrawObject - `process(Operator operator, List<COSBase> operands)`

    public void process(Operator operator, List<COSBase> operands) throws IOException {
        // rick: we mock isEmpty
        if (operands.isEmpty())
        {
            throw new MissingOperandException(operator, operands);
        }
        
        // rick: get - C1 C2 !C3
        COSBase base0 = operands.get(0);
        if (!(base0 instanceof COSName))
        {
            return;
        }
        COSName objectName = (COSName) base0;
        // rick: getResources (1 LOC) - (context is inherited field) !C1 !C3 !C4
        // rick: getXObject (31 LOC) - !C1 !C2 !C3 C4
        PDXObject xobject = context.getResources().getXObject(objectName);

        if (xobject == null)
        {
            // rick: getName - !C1 !C3
            throw new MissingResourceException("Missing XObject: " + objectName.getName());
        }
        else if (xobject instanceof PDImageXObject)
        {
            PDImageXObject image = (PDImageXObject)xobject;
            // rick: drawImage - (context is inherited field) !C1 !C2
            context.drawImage(image);
        }
        else if (xobject instanceof PDFormXObject)
        {
            try
            {
                // rick: increaseLevel (1 LOC) - (context is inherited field) !C1 !C4
                context.increaseLevel();
                // rick: getLevel (1 LOC) - (context is inherited field) !C1 !C4
                if (context.getLevel() > 25)
                {
                    LOG.error("recursion is too deep, skipping form XObject");
                    return;
                }
                PDFormXObject form = (PDFormXObject) xobject;
                if (form instanceof PDTransparencyGroup)
                {
                    // rick: showTransparencyGroup - (context is inherited field) !C1 !C2
                    context.showTransparencyGroup((PDTransparencyGroup) form);
                }
                else
                {
                    // rick: showForm - (context is inherited field) !C1 !C2
                    context.showForm(form);
                }
            }
            finally
            {
                // rick: decreaseLevel - (context is inherited field) !C1
                context.decreaseLevel();
            }
        }
    }

---

### 2. PDFStreamEngine - `process(Operator operator, List<COSBase> operands)`

    public void processPage(PDPage page) throws IOException {
        // rick: initPage - !C1 !C2
        initPage(page);
        
        // rick: we mock hasContents
        if (page.hasContents())
        {
            isProcessingPage = true;
            // rick: processStream - !C1 !C2
            processStream(page);
            isProcessingPage = false;
        }
    }

---

### 3. COSName - `writePDF(OutputStream output)`

    public void writePDF(OutputStream output) throws IOException {
        // rick: we mock this
        output.write('/');
        // rick: getName (1 LOC) - !C1 !C3 !C4
        // rick: getBytes - !C1 !C2 !C3
        byte[] bytes = getName().getBytes(Charsets.UTF_8);
        for (byte b : bytes)
        {
            int current = b & 0xFF;

            if (current >= 'A' && current <= 'Z' ||
                    current >= 'a' && current <= 'z' ||
                    current >= '0' && current <= '9' ||
                    current == '+' ||
                    current == '-' ||
                    current == '_' ||
                    current == '@' ||
                    current == '*' ||
                    current == '$' ||
                    current == ';' ||
                    current == '.')
            {
                // rick: we mock this
                output.write(current);
            }
            else
            {
                // rick: we mock this
                output.write('#');
                // rick: writeHexByte - !C1 !C2 !C5
                Hex.writeHexByte(b, output);
            }
        }
    }
    
---

### 4. RandomAccessInputStream - `read(byte[] b, int off, int len)`

    public int read(byte[] b, int off, int len) throws IOException {
        // rick: restorePosition - !C1
        restorePosition();
        
        // rick: we mock this
        if (input.isEOF())
        {
            return -1;
        }
        // rick: read - !C2
        int n = input.read(b, off, len);
        if (n != -1)
        {
            position += n;
        }
        else
        {
            // rick: we instrument getPosition, it does not get invoked 
            // original comment:
            // should never happen due to prior isEOF() check
            // unless there is an unsynchronized concurrent access
            LOG.error("read() returns -1, assumed position: " +
                       position + ", actual position: " + input.getPosition());
        }
        return n;
    }

---

### 5. RandomAccessInputStream - `read()`

    public int read() throws IOException {
        // rick: restorePosition - !C1
        restorePosition();
        
        // rick: we mock isEOF
        if (input.isEOF())
        {
            return -1;
        }
        // rick: we mock read
        int b = input.read();
        if (b != -1)
        {
            position += 1;
        }
        else
        {
            // rick: we instrument getPosition, it does not get invoked 
            // original comment:
            // should never happen due to prior isEOF() check
            // unless there is an unsynchronized concurrent access
            LOG.error("read() returns -1, assumed position: " +
                       position + ", actual position: " + input.getPosition());
        }
        return b;
    }

---

### 6. RandomAccessInputStream - `available()`

    public int available() throws IOException {
        // rick: restorePosition - !C1
        restorePosition();
        
        // rick: we mock length and getPosition
        long available = input.length() - input.getPosition(); 
        if (available > Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        return (int)available;
    }
    
---

### 7. PDFMergerUtility - `appendDocument(PDDocument destination, PDDocument source)`

        public void appendDocument(PDDocument destination, PDDocument source) throws IOException {
        // rick: getDocument - C1 !C3
        // rick: isClosed - !C1
        if (source.getDocument().isClosed())
        {
            throw new IOException("Error: source PDF is closed.");
        }
        // rick: getDocument - C1 !C3
        // rick: isClosed - !C1
        if (destination.getDocument().isClosed())
        {
            throw new IOException("Error: destination PDF is closed.");
        }

        // rick: getDocumentCatalog - C1 !C3
        PDDocumentCatalog destCatalog = destination.getDocumentCatalog();
        // rick: getDocumentCatalog - C1 !C3
        PDDocumentCatalog srcCatalog = source.getDocumentCatalog();
        
        // rick: isDynamicXfa - !C1 !C2
        // rick: getAcroForm - !C1 !C3
        if (isDynamicXfa(srcCatalog.getAcroForm()))
        {
            throw new IOException("Error: can't merge source document containing dynamic XFA form content.");
        }

        // rick: getDocumentInformation (17 LOC) - C1 C2 !C3 C4
        PDDocumentInformation destInfo = destination.getDocumentInformation();
        // rick: getDocumentInformation (17 LOC) - C1 C2 !C3 C4
        PDDocumentInformation srcInfo = source.getDocumentInformation();
        
        // rick: mergeInto - !C1
        // rick: getCOSObject (1 LOC) - !C1 !C3 !C4
        // rick: getCOSObject (1 LOC) - !C1 !C3 !C4
        // rick: emptySet - !C3 !C5
        mergeInto(srcInfo.getCOSObject(), destInfo.getCOSObject(), Collections.<COSName>emptySet());

        // rick: we mock getVersion
        float destVersion = destination.getVersion();
        // rick: we mock getVersion
        float srcVersion = source.getVersion();

        if (destVersion < srcVersion)
        {
            // rick: we instrument setVersion, it is not invoked
            destination.setVersion(srcVersion);
        }

        int pageIndexOpenActionDest = -1;
        
        // rick: getOpenAction - !C1 !C3
        if (destCatalog.getOpenAction() == null)
        {
            PDDestinationOrAction openAction = null;
            try
            {
                // rick: getOpenAction - !C1 !C3
                openAction = srcCatalog.getOpenAction();
            }
            catch (IOException ex)
            {
                LOG.error("Invalid OpenAction ignored", ex);
            }
            PDDestination openActionDestination = null;
            if (openAction instanceof PDActionGoTo)
            {
                // rick: getDestination - !C1 !C3
                openActionDestination = ((PDActionGoTo) openAction).getDestination();
            }
            else if (openAction instanceof PDDestination)
            {
                openActionDestination = (PDDestination) openAction;
            }

            if (openActionDestination instanceof PDPageDestination)
            {
                // rick: getPage - !C1 !C3
                PDPage page = ((PDPageDestination) openActionDestination).getPage();
                if (page != null)
                {
                    // rick: getPages - !C1 !C3
                    // rick: indexOf - !C1 !C4
                    pageIndexOpenActionDest = srcCatalog.getPages().indexOf(page);
                }
            }

            // rick: setOpenAction - !C1 !C2
            destCatalog.setOpenAction(openAction);
        }

        PDFCloneUtility cloner = new PDFCloneUtility(destination);
        // rick: mergeAcroForm - !C1 !C2
        mergeAcroForm(cloner, destCatalog, srcCatalog);

        // rick: getCOSObject - !C1 !C3
        // rick: getDictionaryObject - !C1 !C2 !C3
        COSArray destThreads = (COSArray) destCatalog.getCOSObject().getDictionaryObject(COSName.THREADS);
        
        // rick: cloneForNewDocument - !C1 !C2 !C3
        // rick: getCOSObject - !C1 !C3
        // rick: getDictionaryObject - !C1 !C2 !C3
        COSArray srcThreads = (COSArray) cloner.cloneForNewDocument(destCatalog.getCOSObject().getDictionaryObject(COSName.THREADS));
        if (destThreads == null)
        {
            // rick: getCOSObject - !C1 !C3
            // rick: setItem - !C1 !C2
            destCatalog.getCOSObject().setItem(COSName.THREADS, srcThreads);
        }
        else
        {
            // rick: addAll - !C1 !C2
            destThreads.addAll(srcThreads);
        }

        // rick: getNames - !C1 !C3
        PDDocumentNameDictionary destNames = destCatalog.getNames();
        // rick: getNames - !C1 !C3
        PDDocumentNameDictionary srcNames = srcCatalog.getNames();
        if (srcNames != null)
        {
            if (destNames == null)
            {
                // rick: getCOSObject - !C1 !C3
                // rick: setItem - !C1 !C2
                // rick: cloneForNewDocument - !C1 !C2
                destCatalog.getCOSObject().setItem(COSName.NAMES, cloner.cloneForNewDocument(srcNames));
            }
            else
            {
                // rick: cloneMerge - !C1 !C2
                cloner.cloneMerge(srcNames, destNames);
            }
        }
        
        // rick: getCOSObject - !C1 !C3
        // rick: containsKey - !C1 !C2
        if (destNames != null && destNames.getCOSObject().containsKey(COSName.ID_TREE))
        {
            // rick: getCOSObject - !C1 !C3
            // rick: removeItem - !C1 !C2
            destNames.getCOSObject().removeItem(COSName.ID_TREE);
            LOG.warn("Removed /IDTree from /Names dictionary, doesn't belong there");
        }

        // rick: getDests - !C1 !C3
        PDDocumentNameDestinationDictionary srcDests = srcCatalog.getDests();
        if (srcDests != null)
        {
            // rick: getDests - !C1 !C3
            PDDocumentNameDestinationDictionary destDests = destCatalog.getDests();
            if (destDests == null)
            {
                // rick: getCOSObject - !C1 !C3
                // rick: setItem - !C1 !C2
                // rick: cloneForNewDocument - !C1 !C2 !C3
                destCatalog.getCOSObject().setItem(COSName.DESTS, cloner.cloneForNewDocument(srcDests));
            }
            else
            {
                // rick: cloneMerge - !C1 !C2
                cloner.cloneMerge(srcDests, destDests);
            }
        }

        // rick: getDocumentOutline - !C1 !C3
        PDDocumentOutline srcOutline = srcCatalog.getDocumentOutline();
        if (srcOutline != null)
        {
            // rick: getDocumentOutline - !C1 !C3
            PDDocumentOutline destOutline = destCatalog.getDocumentOutline();
            // rick: getFirstChild - !C1 !C3
            if (destOutline == null || destOutline.getFirstChild() == null)
            {
                // rick: cloneForNewDocument - !C1 !C2 !C3
                PDDocumentOutline cloned = new PDDocumentOutline((COSDictionary) cloner.cloneForNewDocument(srcOutline));
                // rick: setDocumentOutline - !C1 !C2
                destCatalog.setDocumentOutline(cloned);
            }
            else
            {
                // rick: getFirstChild - !C1 !C2
                PDOutlineItem destLastOutlineItem = destOutline.getFirstChild();
                // rick: getNextSibling - !C1 !C2
                while (destLastOutlineItem.getNextSibling() != null)
                {
                    // rick: getNextSibling - !C1 !C2
                    destLastOutlineItem = destLastOutlineItem.getNextSibling();
                }
                for (PDOutlineItem item : srcOutline.children())
                {
                    // rick: cloneForNewDocument - !C1 !C2 !C3
                    COSDictionary clonedDict = (COSDictionary) cloner.cloneForNewDocument(item);
                    // rick: removeItem - !C1 !C2
                    clonedDict.removeItem(COSName.PREV);
                    // rick: removeItem - !C1 !C2
                    clonedDict.removeItem(COSName.NEXT);
                    PDOutlineItem clonedItem = new PDOutlineItem(clonedDict);
                    // rick: insertSiblingAfter - !C1 !C2
                    destLastOutlineItem.insertSiblingAfter(clonedItem);
                    // rick: getNextSibling - !C1 !C3
                    destLastOutlineItem = destLastOutlineItem.getNextSibling();
                }
            }
        }

        // rick: getPageMode - !C1 !C3
        PageMode destPageMode = destCatalog.getPageMode();
        if (destPageMode == null)
        {
            // rick: !C1 !C3
            PageMode srcPageMode = srcCatalog.getPageMode();
            // rick: setPageMode - !C1 !C2
            destCatalog.setPageMode(srcPageMode);
        }

        // rick: getCOSObject - !C1 !C3
        // rick: getCOSDictionary - !C1 !C2
        COSDictionary destLabels = destCatalog.getCOSObject().getCOSDictionary(COSName.PAGE_LABELS);
        
        // rick: getCOSObject - !C1 !C3
        // rick: getCOSDictionary - !C1 !C2
        COSDictionary srcLabels = srcCatalog.getCOSObject().getCOSDictionary(COSName.PAGE_LABELS);
        
        if (srcLabels != null)
        {
            // rick: getNumberOfPages (1 LOC) - C1 C3 !C4
            int destPageCount = destination.getNumberOfPages();
            COSArray destNums;
            if (destLabels == null)
            {
                destLabels = new COSDictionary();
                destNums = new COSArray();
                
                // rick: setItem - !C1 !C2
                destLabels.setItem(COSName.NUMS, destNums);
                
                // rick: getCOSObject - !C1 !C3
                // rick: setItem - !C1 !C2
                destCatalog.getCOSObject().setItem(COSName.PAGE_LABELS, destLabels);
            }
            else
            {
                // rick: getDictionaryObject - !C1 !C2 !C3
                destNums = (COSArray) destLabels.getDictionaryObject(COSName.NUMS);
            }

            // rick: getDictionaryObject - !C1 !C2 !C3
            COSArray srcNums = (COSArray) srcLabels.getDictionaryObject(COSName.NUMS);
            if (srcNums != null)
            {
                // rick: size - !C1
                int startSize = destNums.size();
                // rick: size - !C1
                for (int i = 0; i < srcNums.size(); i += 2)
                {
                    // rick: getObject - !C1 !C3
                    COSBase base = srcNums.getObject(i);
                    if (!(base instanceof COSNumber))
                    {
                        LOG.error("page labels ignored, index " + i + " should be a number, but is " + base);
                        // rick: size - !C1
                        while (destNums.size() > startSize)
                        {
                            // rick: remove - !C1
                            destNums.remove(startSize);
                        }
                        break;
                    }
                    COSNumber labelIndex = (COSNumber) base;
                    // rick: intValue - !C1
                    long labelIndexValue = labelIndex.intValue();
                    
                    // rick: add - !C1 !C2
                    // rick: get - !C1 !C3 !C5
                    destNums.add(COSInteger.get(labelIndexValue + destPageCount));
                    
                    // rick: add - !C1 !C2
                    // rick: cloneForNewDocument - !C1 !C2 !C3
                    destNums.add(cloner.cloneForNewDocument(srcNums.getObject(i + 1)));
                }
            }
        }

        // rick: getCOSObject - !C1 !C3
        // rick: getCOSStream - !C1 !C2 !C3
        COSStream destMetadata = destCatalog.getCOSObject().getCOSStream(COSName.METADATA);
        
        // rick: getCOSObject - !C1 !C3
        // rick: getCOSStream - !C1 !C2 !C3
        COSStream srcMetadata = srcCatalog.getCOSObject().getCOSStream(COSName.METADATA);
        
        if (destMetadata == null && srcMetadata != null)
        {
            try
            {
                PDStream newStream = new PDStream(destination, srcMetadata.createInputStream(), (COSName) null);
                // rick: mergeInto - !C1 !C2
                // rick: getCOSObject - !C1 !C3
                // rick: asList - !C1 !C2 !C3 !C5
                mergeInto(srcMetadata, newStream.getCOSObject(), 
                        new HashSet<COSName>(Arrays.asList(COSName.FILTER, COSName.LENGTH)));           
                
                // rick: getCOSObject - !C1 !C3
                // rick: setItem - !C1 !C2
                destCatalog.getCOSObject().setItem(COSName.METADATA, newStream);
            }
            catch (IOException ex)
            {
                LOG.error("Metadata skipped because it could not be read", ex);
            }
        }

        // rick: getCOSObject - !C1 !C3
        // rick: getCOSDictionary - !C1 !C2 !C3
        COSDictionary destOCP = destCatalog.getCOSObject().getCOSDictionary(COSName.OCPROPERTIES);
        
        // rick: getCOSObject - !C1 !C3
        // rick: getCOSDictionary - !C1 !C2 !C3
        COSDictionary srcOCP = srcCatalog.getCOSObject().getCOSDictionary(COSName.OCPROPERTIES);
        
        if (destOCP == null && srcOCP != null)
        {
            // rick: getCOSObject - !C1 !C3
            // rick: setItem - !C1 !C2
            // rick: cloneForNewDocument - !C1 !C2 !C3
            destCatalog.getCOSObject().setItem(COSName.OCPROPERTIES, cloner.cloneForNewDocument(srcOCP));
        }
        else if (destOCP != null && srcOCP != null)
        {
            // rick: cloneMerge - !C1 !C2
            cloner.cloneMerge(srcOCP, destOCP);
        }
        
        // rick: mergeOutputIntents - !C1 !C2
        mergeOutputIntents(cloner, srcCatalog, destCatalog);

        boolean mergeStructTree = false;
        int destParentTreeNextKey = -1;
        Map<Integer, COSObjectable> srcNumberTreeAsMap = null;
        Map<Integer, COSObjectable> destNumberTreeAsMap = null;
        
        // rick: getStructureTreeRoot - !C1 !C3
        PDStructureTreeRoot srcStructTree = srcCatalog.getStructureTreeRoot();
        
        // rick: getStructureTreeRoot - !C1 !C3
        PDStructureTreeRoot destStructTree = destCatalog.getStructureTreeRoot();
        
        if (destStructTree == null && srcStructTree != null)
        {
            destStructTree = new PDStructureTreeRoot();
            // rick: setStructureTreeRoot - !C1 !C2
            destCatalog.setStructureTreeRoot(destStructTree);
            
            // rick: setParentTree - !C1 !C2
            destStructTree.setParentTree(new PDNumberTreeNode(PDParentTreeValue.class));
            
            // rick: getPages - !C1 !C3
            for (PDPage page : destCatalog.getPages())
            {
                // rick: getCOSObject - !C1 !C3
                // rick: removeItem - !C1 !C2
                page.getCOSObject().removeItem(COSName.STRUCT_PARENTS);
                
                // rick: getAnnotations - !C1 !C3
                for (PDAnnotation ann : page.getAnnotations())
                {
                    // rick: getCOSObject - !C1 !C3
                    // rick: removeItem - !C1 !C2
                    ann.getCOSObject().removeItem(COSName.STRUCT_PARENT);
                }
            }
        }
        if (destStructTree != null)
        {
            // rick: getParentTree - !C1 !C3
            PDNumberTreeNode destParentTree = destStructTree.getParentTree();
            
            // rick: getParentTreeNextKey - !C1
            destParentTreeNextKey = destStructTree.getParentTreeNextKey();
            
            if (destParentTree != null)
            {
                // rick: getNumberTreeAsMap - !C1 !C2 !C3
                destNumberTreeAsMap = getNumberTreeAsMap(destParentTree);
                if (destParentTreeNextKey < 0)
                {
                    // rick: isEmpty - !C1
                    if (destNumberTreeAsMap.isEmpty())
                    {
                        destParentTreeNextKey = 0;
                    }
                    else
                    {
                        // rick: max - !C2 !C5
                        destParentTreeNextKey = Collections.max(destNumberTreeAsMap.keySet()) + 1;
                    }
                }
                if (destParentTreeNextKey >= 0 && srcStructTree != null)
                {
                    // rick: getParentTree - !C1 !C3
                    PDNumberTreeNode srcParentTree = srcStructTree.getParentTree();
                    if (srcParentTree != null)
                    {
                        // rick: getNumberTreeAsMap - !C1 !C2 !C3
                        srcNumberTreeAsMap = getNumberTreeAsMap(srcParentTree);
                        
                        // rick: isEmpty - !C1
                        if (!srcNumberTreeAsMap.isEmpty())
                        {
                            mergeStructTree = true;
                        }
                    }
                }
            }
        }

        Map<COSDictionary, COSDictionary> objMapping = new HashMap<COSDictionary, COSDictionary>();
        int pageIndex = 0;
        
        // rick: getPages - !C1 !C3
        for (PDPage page : srcCatalog.getPages())
        {
            // rick: cloneForNewDocument - !C1 !C2 !C3
            PDPage newPage = new PDPage((COSDictionary) cloner.cloneForNewDocument(page.getCOSObject()));
            if (!mergeStructTree)
            {
                // rick: getCOSObject - !C1 !C3
                // rick: removeItem - !C1 !C2
                newPage.getCOSObject().removeItem(COSName.STRUCT_PARENTS);
                
                // rick: getAnnotations - !C1 !C3
                for (PDAnnotation ann : newPage.getAnnotations())
                {
                    // rick: getCOSObject - !C1 !C3
                    // rick: removeItem - !C1 !C2
                    ann.getCOSObject().removeItem(COSName.STRUCT_PARENT);
                }
            }
            // rick: setCropBox - !C1 !C2
            // rick: getCropBox - !C1 !C3
            newPage.setCropBox(page.getCropBox());
            
            // rick: setMediaBox - !C1 !C2
            // rick: getMediaBox - !C1 !C3
            newPage.setMediaBox(page.getMediaBox());
            
            // rick: setRotation - !C1
            // rick: getRotation - !C1
            newPage.setRotation(page.getRotation());
            
            // rick: getResources - !C1 !C3
            PDResources resources = page.getResources();
            if (resources != null)
            {
                // rick: setResources - !C1 !C2
                // rick: cloneForNewDocument - !C1 !C2 !C3
                newPage.setResources(new PDResources((COSDictionary) cloner.cloneForNewDocument(resources)));
            }
            else
            {
                 // rick: setResources - !C1 !C2
                newPage.setResources(new PDResources());
            }
            if (mergeStructTree)
            {
                // rick: updateStructParentEntries - !C1 !C2
                updateStructParentEntries(newPage, destParentTreeNextKey);
                
                // rick: put - !C1 !C2
                // rick: getCOSObject - !C1 !C3
                // rick: getCOSObject - !C1 !C3
                objMapping.put(page.getCOSObject(), newPage.getCOSObject());
                
                // rick: getAnnotations - !C1 !C3
                List<PDAnnotation> oldAnnots = page.getAnnotations();
                
                // rick: getAnnotations - !C1 !C3
                List<PDAnnotation> newAnnots = newPage.getAnnotations();
                
                for (int i = 0; i < oldAnnots.size(); i++)
                {
                    // rick: put - !C1 !C2
                    // rick: get - !C1 !C3
                    // rick: getCOSObject - !C1 !C3
                    // rick: get - !C1 !C3
                    // rick: getCOSObject - !C1 !C3
                    objMapping.put(oldAnnots.get(i).getCOSObject(), newAnnots.get(i).getCOSObject());
                }
            }
            
            // rick: addPage - C1 !C2
            destination.addPage(newPage);

            if (pageIndex == pageIndexOpenActionDest)
            {
                // rick: getOpenAction - !C1 !C2
                PDDestinationOrAction openAction = destCatalog.getOpenAction();
                
                PDPageDestination pageDestination;
                if (openAction instanceof PDActionGoTo)
                {
                    // rick: getDestination - !C1 !C3
                    pageDestination = (PDPageDestination) ((PDActionGoTo) openAction).getDestination();
                }
                else
                {
                    pageDestination = (PDPageDestination) openAction;
                }
                // rick: setPage - !C1 !C2
                pageDestination.setPage(newPage);
            }
            ++pageIndex;
        }
        if (mergeStructTree)
        {
            // rick: updatePageReferences - !C1 !C2
            updatePageReferences(cloner, srcNumberTreeAsMap, objMapping);
            int maxSrcKey = -1;
            // rick: entrySet - !C1 !C3
            for (Map.Entry<Integer, COSObjectable> entry : srcNumberTreeAsMap.entrySet())
            {
                // rick: getKey - !C1
                int srcKey = entry.getKey();
                // rick: max - !C5
                maxSrcKey = Math.max(srcKey, maxSrcKey);
                // rick: put - !C1 !C2
                // rick: cloneForNewDocument - !C1 !C2 !C3
                destNumberTreeAsMap.put(destParentTreeNextKey + srcKey, cloner.cloneForNewDocument(entry.getValue()));
            }
            destParentTreeNextKey += maxSrcKey + 1;
            PDNumberTreeNode newParentTreeNode = new PDNumberTreeNode(PDParentTreeValue.class);

            // rick: setNumbers - !C1 !C2
            newParentTreeNode.setNumbers(destNumberTreeAsMap);

            // rick: setParentTree - !C1 !C2
            destStructTree.setParentTree(newParentTreeNode);
            
            // rick: setParentTreeNextKey - !C1
            destStructTree.setParentTreeNextKey(destParentTreeNextKey);

            // rick: mergeKEntries - !C1 !C2
            mergeKEntries(cloner, srcStructTree, destStructTree);
            // rick: mergeRoleMap - !C1 !C2
            mergeRoleMap(srcStructTree, destStructTree);
            // rick: mergeIDTree - !C1 !C2
            mergeIDTree(cloner, srcStructTree, destStructTree);
            // rick: mergeMarkInfo - !C1 !C2
            mergeMarkInfo(destCatalog, srcCatalog);
            // rick: mergeLanguage - !C1 !C2
            mergeLanguage(destCatalog, srcCatalog);
            // rick: mergeViewerPreferences - !C1 !C2
            mergeViewerPreferences(destCatalog, srcCatalog);
        }
    }
    
---

### 8. COSWriter - `close()`

    public void close() throws IOException {
        // rick: getStandardOutput - !C1 !C3
        if (getStandardOutput() != null)
        {
            // rick: getStandardOutput - !C1 !C3
            // rick: close - !C1
            getStandardOutput().close();
        }
        if (incrementalOutput != null)
        {
            // rick: we mock close
            incrementalOutput.close();
        }
    }

---

### 9. StandardSecurityHandler - `prepareForDecryption(PDEncryption encryption, COSArray documentIDArray, DecryptionMaterial decryptionMaterial)` - TODO

---

### 10. PDTrueTypeFont - `codeToGID(int code)` - TODO

---

### 11. PDTrueTypeFont - `getWidthFromFont(int code)`

    public float getWidthFromFont(int code) throws IOException {
        // rick: codeToGID - !C1
        int gid = codeToGID(code);
        // rick: we mock getAdvanceWidth
        float width = ttf.getAdvanceWidth(gid);
        // rick: we mock getUnitsPerEm
        float unitsPerEM = ttf.getUnitsPerEm();
        if (unitsPerEM != 1000)
        {
            width *= 1000f / unitsPerEM;
        }
        return width;
    }
    
---

### 12. PDColor - `getComponents()`

    public float[] getComponents() {
        if (colorSpace instanceof PDPattern || colorSpace == null)
        {
            // rick: clone - C1 !C3
            return components.clone();
        }
        // rick: copyOf - !C2 !C3 !C5
        // rick: we mock getNumberOfComponents
        return Arrays.copyOf(components, colorSpace.getNumberOfComponents());
    }

---

### 13. PDDeviceRGB - `toRGBImage(WritableRaster raster)`

    public BufferedImage toRGBImage(WritableRaster raster) throws IOException {
        // rick: we mock getWidth
        // rick: we mock getHeight
        BufferedImage image = new BufferedImage(raster.getWidth(), raster.getHeight(), BufferedImage.TYPE_INT_RGB);
        // rick: setData - !C1 !C2
        image.setData(raster);
        return image;
    }
    
---

### 14. PDDocumentCatalog - `getAcroForm(PDDocumentFixup acroFormFixup)`

    public PDAcroForm getAcroForm(PDDocumentFixup acroFormFixup) {
        if (acroFormFixup != null && acroFormFixup != acroFormFixupApplied)
        {
            // rick: we mock apply
            acroFormFixup.apply();
            cachedAcroForm = null;
            acroFormFixupApplied =  acroFormFixup;
        }
        else if (acroFormFixupApplied != null)
        {
            LOG.debug("AcroForm content has already been retrieved with fixes applied - original content changed because of that");
        }

        if (cachedAcroForm == null)
        {
            // rick: getDictionaryObject - C1 !C2 !C3
            COSDictionary dict = (COSDictionary)root.getDictionaryObject(COSName.ACRO_FORM);
            cachedAcroForm = dict == null ? null : new PDAcroForm(document, dict);
        }
        return cachedAcroForm;
    }
---

### 15. PDDocument - `importPage(PDPage page)`

    public PDPage importPage(PDPage page) throws IOException
    {
        // rick: getCOSObject - C1 !C3
        PDPage importedPage = new PDPage(new COSDictionary(page.getCOSObject()), resourceCache);
        // rick: getContents - C1 !C3
        PDStream dest = new PDStream(this, page.getContents(), COSName.FLATE_DECODE);
        // rick: setContents - !C1 !C2
        importedPage.setContents(dest);
        // rick: addPage - !C1 !C2
        addPage(importedPage);
        
        // rick: setCropBox - !C1 !C2
        // rick: getCropBox - C1 !C3
        // rick: getCOSArray - !C1 !C3
        importedPage.setCropBox(new PDRectangle(page.getCropBox().getCOSArray()));
        
        // rick: setMediaBox - !C1 !C2
        // rick: getMediaBox - C1 !C3
        // rick: getCOSArray - !C1 !C3
        importedPage.setMediaBox(new PDRectangle(page.getMediaBox().getCOSArray()));
        
        // rick: setRotation - !C1
        // rick: we mock getRotation
        importedPage.setRotation(page.getRotation());
        
        // rick: getCOSObject - C1 !C3
        // rick: containsKey - !C1 !C2
        if (page.getResources() != null && !page.getCOSObject().containsKey(COSName.RESOURCES))
        {
            LOG.warn("inherited resources of source document are not imported to destination page");
            LOG.warn("call importedPage.setResources(page.getResources()) to do this");
        }
        return importedPage;
    }
    
---

### 16. PDPageContentStream - `setFont(PDFont font, float fontSize)`

    public void setFont(PDFont font, float fontSize) throws IOException {
        // rick: we instrument isEmpty, but serialization fails (fontStack is of type Stack<PDFont>)
        if (fontStack.isEmpty())
        {
            // rick: add - C1 !C2
            fontStack.add(font);
        }
        else
        {
            // rick: setElementAt - C1 !C2
            fontStack.setElementAt(font, fontStack.size() - 1);
        }
        
        // rick: we mock willBeSubset
        if (font.willBeSubset())
        {
            // rick: getFontsToSubset - C1 !C3
            // rick: add - !C1 !C2
            document.getFontsToSubset().add(font);
        }
        
        // rick: writeOperand - !C1 !C2
        // rick: add - !C2
        writeOperand(resources.add(font));
        
        // rick: writeOperand - !C1
        writeOperand(fontSize);
        
        // rick: writeOperator - !C1 !C2
        writeOperator(OperatorName.SET_FONT_AND_SIZE);
    }
    
---

### 17. PageDrawer - `appendRectangle(Point2D p0, Point2D p1, Point2D p2, Point2D p3)`

    public void appendRectangle(Point2D p0, Point2D p1, Point2D p2, Point2D p3) {
        // rick: we mock moveTo
        // rick: we mock getX
        // rick: we mock getY
        linePath.moveTo((float) p0.getX(), (float) p0.getY());
        
        // rick: we mock lineTo
        // rick: we mock getX
        // rick: we mock getY
        linePath.lineTo((float) p1.getX(), (float) p1.getY());
        linePath.lineTo((float) p2.getX(), (float) p2.getY());
        linePath.lineTo((float) p3.getX(), (float) p3.getY());

        // rick: we mock closePath
        linePath.closePath();
    }
    
---

### 18. PageDrawer - `fillPath(int windingRule)`

    public void fillPath(int windingRule) throws IOException {
        // rick: setComposite - C1 !C2
        // rick: getGraphicsState - !C1 !C3
        // rick: getNonStrokingJavaComposite - !C1 !C3
        graphics.setComposite(getGraphicsState().getNonStrokingJavaComposite());
        
        // rick: setPaint - C1 !C2
        // rick: getNonStrokingPaint - !C1 !C3
        graphics.setPaint(getNonStrokingPaint());
        
        // rick: setClip - !C1
        setClip();
        
        // rick: we mock setWindingRule
        linePath.setWindingRule(windingRule);

        // rick: getBounds2D - C1 !C3
        Rectangle2D bounds = linePath.getBounds2D();
        
        // rick: isRectangular - !C1 !C2
        // rick: getWidth - !C1
        // rick: getHeight - !C1
        boolean noAntiAlias = isRectangular(linePath) && bounds.getWidth() > 1 &&
                                                         bounds.getHeight() > 1;
        if (noAntiAlias)
        {
            // rick: setRenderingHint - C1 !C2
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                      RenderingHints.VALUE_ANTIALIAS_OFF);
        }

        Shape shape;
        
        // rick: getPaint - C1 !C3
        if (!(graphics.getPaint() instanceof Color))
        {
            Area area = new Area(linePath);
            // rick: intersect - !C1 !C2
            // rick: getClip - C1 !C3
            area.intersect(new Area(graphics.getClip()));
            
            // rick: intersectShadingBBox - !C1 !C2
            // rick: getGraphicsState - !C1 !C3
            // rick: getNonStrokingColor - !C1 !C3
            intersectShadingBBox(getGraphicsState().getNonStrokingColor(), area);
            shape = area;
        }
        else
        {
            shape = linePath;
        }
        // rick: isContentRendered - !C1
        if (isContentRendered())
        {
            // rick: fill - !C2
            graphics.fill(shape);
        }
        
        // rick: we mock reset
        linePath.reset();

        if (noAntiAlias)
        {
            // rick: setRenderingHints - !C1
            setRenderingHints();
        }
    }
    
---

### 19. PageDrawer - `strokePath()`

    public void strokePath() throws IOException {
        // rick: setComposite - C1, !C2
        // rick: getGraphicsState - !C1 !C3
        // rick: getStrokingJavaComposite - !C1 !C3
        graphics.setComposite(getGraphicsState().getStrokingJavaComposite());
        
        // rick: setPaint - !C2
        // rick: getStrokingPaint - !C1 !C3
        graphics.setPaint(getStrokingPaint());
        
        // rick: setStroke - !C2
        // rick: getStroke - !C1 !C3
        graphics.setStroke(getStroke());
        
        // rick: setClip - !C1
        setClip();
        
        // rick: isContentRendered - !C1
        if (isContentRendered())
        {
            // rick: draw - !C2
            graphics.draw(linePath);
        }
        
        // rick: we mock reset
        linePath.reset();
    }
    
---

### 20. PageDrawer - `drawImage(PDImage pdImage)` - TODO

---

### 21. PageDrawer - `drawPage(Graphics g, PDRectangle pageSize)` - TODO

---

### 22. PageDrawer - `endPath()`

    public void endPath() {
        if (clipWindingRule != -1)
        {
            // rick: we mock setWindingRule
            linePath.setWindingRule(clipWindingRule);

            // rick: getPathIterator - !C2 !C3
            // rick: isDone !C1
            if (!linePath.getPathIterator(null).isDone())
            {
                // rick: getGraphicsState - !C1 !C3
                // rick: intersectClippingPath - !C1 !C2
                getGraphicsState().intersectClippingPath(linePath);
            }

            lastClip = null;

            clipWindingRule = -1;
        }
        // rick: we mock reset
        linePath.reset();
    }
---

### 23. PDFRenderer - `renderImage(int pageIndex, float scale, ImageType imageType, RenderDestination destination)`

    public BufferedImage renderImage(int pageIndex, float scale, ImageType imageType, RenderDestination destination) throws IOException {
        // rick: getPage - C1 C2 !C3
        PDPage page = document.getPage(pageIndex);

        // rick: getCropBox - !C1 !C3
        PDRectangle cropbBox = page.getCropBox();
        
        // rick: getWidth - !C1
        float widthPt = cropbBox.getWidth();
        // rick: getHeight - !C1
        float heightPt = cropbBox.getHeight();

        // rick: max - !C5
        // rick: floor - !C5
        int widthPx = (int) Math.max(Math.floor(widthPt * scale), 1);
        
        // rick: max - !C5
        // rick: floor - !C5
        int heightPx = (int) Math.max(Math.floor(heightPt * scale), 1);

        if ((long) widthPx * (long) heightPx > Integer.MAX_VALUE)
        {
            throw new IOException("Maximum size of image exceeded (w * h * scale ^ 2) = "//
                    + widthPt + " * " + heightPt + " * " + scale + " ^ 2 > " + Integer.MAX_VALUE);
        }

        // rick: getRotation - !C1
        int rotationAngle = page.getRotation();

        // rick: we mock toBufferedImageType
        int bimType = imageType.toBufferedImageType();
        
        // rick: hasBlendMode - !C1 !C2
        if (imageType != ImageType.ARGB && hasBlendMode(page))
        {
            bimType = BufferedImage.TYPE_INT_ARGB;
        }

        BufferedImage image;
        if (rotationAngle == 90 || rotationAngle == 270)
        {
            image = new BufferedImage(heightPx, widthPx, bimType);
        }
        else
        {
            image = new BufferedImage(widthPx, heightPx, bimType);
        }

        pageImage = image;

        // rick: createGraphics - !C1 !C3
        Graphics2D g = image.createGraphics();
        
        // rick: getType - !C1 !C3
        if (image.getType() == BufferedImage.TYPE_INT_ARGB)
        {
            // rick: setBackground - !C1 !C2
            g.setBackground(new Color(0, 0, 0, 0));
        }
        else
        {
            // rick: setBackground - !C1 !C2
            g.setBackground(Color.WHITE);
        }
        
        // rick: clearRect - !C1
        g.clearRect(0, 0, image.getWidth(), image.getHeight());
        
        // rick: transform - !C1 !C2
        transform(g, page, scale, scale);

        // rick: createDefaultRenderingHints - !C1 !C2 !C3
        RenderingHints actualRenderingHints =
                renderingHints == null ? createDefaultRenderingHints(g) : renderingHints;
        
        PageDrawerParameters parameters =
                new PageDrawerParameters(this, page, subsamplingAllowed, destination,
                        actualRenderingHints, imageDownscalingOptimizationThreshold);
        
        // rick: createPageDrawer - !C1 !C2 !C3
        PageDrawer drawer = createPageDrawer(parameters);
        
        // rick: drawPage - !C1 !C2
        // rick: getCropBox - !C1 !C2
        drawer.drawPage(g, page.getCropBox());       
        
        // rick: dispose - !C1
        g.dispose();

        // rick: getType - !C1 !C3
        // rick: we mock toBufferedImageType
        if (image.getType() != imageType.toBufferedImageType())
        {
            // rick: getWidth - !C1
            // rick: getHeight - !C1
            // rick: we instrument toBufferedImageType (and mock its previous two calls) - this call is not invoked
            BufferedImage newImage = 
                    new BufferedImage(image.getWidth(), image.getHeight(), imageType.toBufferedImageType());
                    
            // rick: createGraphics - !C1 !C3
            Graphics2D dstGraphics = newImage.createGraphics();
            
            // rick: setBackground - !C1 !C2
            dstGraphics.setBackground(Color.WHITE);
            
            // rick: clearRect - !C1
            // rick: getWidth - !C1
            // rick: getHeight - !C1
            dstGraphics.clearRect(0, 0, image.getWidth(), image.getHeight());
            
            // rick: drawImage - !C1 !C2
            dstGraphics.drawImage(image, 0, 0, null);
            
            // rick: dispose - !C1
            dstGraphics.dispose();
            
            image = newImage;
        }

        return image;
    }

---

### 24. LegacyPDFStreamEngine - `processPage(PDPage page)`

    public void processPage(PDPage page) throws IOException {
        // rick: we mock getRotation
        this.pageRotation = page.getRotation();
        // rick: getCropBox - C1 !C3
        this.pageSize = page.getCropBox();

        // rick: getLowerLeftX (1 LOC) - C1 C3 !C4
        // rick: getLowerLeftY (1 LOC) - C1 C3 !C4
        if (pageSize.getLowerLeftX() == 0 && pageSize.getLowerLeftY() == 0)
        {
            translateMatrix = null;
        }
        else
        {
            // rick: getTranslateInstance - !C5
            // rick: getLowerLeftX (1 LOC) - C1 C3 !C4
            // rick: getLowerLeftY (1 LOC) - C1 C3 !C4
            translateMatrix = Matrix.getTranslateInstance(-pageSize.getLowerLeftX(), -pageSize.getLowerLeftY());
        }
        // rick: !C1 !C2
        super.processPage(page);
    }
    
---

### 25. TextPositionComparator - `compare(TextPosition pos1, TextPosition pos2)`

    public int compare(TextPosition pos1, TextPosition pos2) {
        // rick: compare - !C5 
        // rick: we mock getDir
        // rick: we mock getDir
        int cmp1 = Float.compare(pos1.getDir(), pos2.getDir());
        if (cmp1 != 0)
        {
            return cmp1;
        }
        
        // rick-TODO: we already mock pos - we should mock all interactions with it within the generated test
        // rick: getXDirAdj (1 LOC) - C1 C3 !C4
        float x1 = pos1.getXDirAdj();
        
        // rick: getXDirAdj (1 LOC) - C1 C3 !C4
        float x2 = pos2.getXDirAdj();
        
        // rick: we mock getYDirAdj
        float pos1YBottom = pos1.getYDirAdj();
        
        // rick: we mock getYDirAdj
        float pos2YBottom = pos2.getYDirAdj();

        // rick: getHeightDir (1 LOC) - C1 C3 !C4
        float pos1YTop = pos1YBottom - pos1.getHeightDir();
        // rick: getHeightDir (1 LOC) - C1 C3 !C4
        float pos2YTop = pos2YBottom - pos2.getHeightDir();

        // rick: abs - !C5
        float yDifference = Math.abs(pos1YBottom - pos2YBottom);

        if (yDifference < .1 ||
            pos2YBottom >= pos1YTop && pos2YBottom <= pos1YBottom ||
            pos1YBottom >= pos2YTop && pos1YBottom <= pos2YBottom)
        {
            // rick: compare - !C5
            return Float.compare(x1, x2);
        }
        else if (pos1YBottom < pos2YBottom)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }

---

### 26. ImageGraphicsEngine - `drawImage(PDImage pdImage)`

    public void drawImage(PDImage pdImage) throws IOException {
            if (pdImage instanceof PDImageXObject)
            {
                // rick: we mock isStencil
                if (pdImage.isStencil())
                {
                    // rick: processColor - !C1 !C2
                    // rick: getGraphicsState - !C1 !C3
                    // rick: getNonStrokingColor - !C1 !C3
                    processColor(getGraphicsState().getNonStrokingColor());
                }
                PDImageXObject xobject = (PDImageXObject)pdImage;
                // rick: contains - C1 !C2
                // rick: getCOSObject - !C1 !C3
                if (seen.contains(xobject.getCOSObject()))
                {
                    return;
                }
                // rick: add - C1 !C2
                // rick: getCOSObject - !C1 !C3
                seen.add(xobject.getCOSObject());
            }

            String name = filePrefix + "-" + imageCounter;
            imageCounter++;

            System.out.println("Writing image: " + name);
            
            // rick: write2file - !C1 !C2
            write2file(pdImage, name, useDirectJPEG, noColorConvert);
        }
---
