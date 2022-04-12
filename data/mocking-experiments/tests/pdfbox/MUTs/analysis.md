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
        // rick: getResources (1 LOC) - (context is inherited field) !C1 !C3 (1 LOC) !C4
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
                    // rick: context is inherited field (!C1), showTransparencyGroup takes non-primitive param (!C2)
                    context.showTransparencyGroup((PDTransparencyGroup) form);
                }
                else
                {
                    // rick: context is inherited field (!C1), showForm takes non-primitive param (!C2)
                    context.showForm(form);
                }
            }
            finally
            {
                // rick: context is inherited field (!C1)
                context.decreaseLevel();
            }
        }
    }

---

### 2. PDFStreamEngine - `process(Operator operator, List<COSBase> operands)`

    public void processPage(PDPage page) throws IOException {
        initPage(page); // rick: initPage is instance method (!C1), takes non-primitive param (!C2)
        if (page.hasContents()) // rick: we mock this
        {
            isProcessingPage = true;
            processStream(page); // rick: processStream is instance method (!C1), takes non-primitive param (!C2)
            isProcessingPage = false;
        }
    }

---

### 3. COSName - `writePDF(OutputStream output)`

    public void writePDF(OutputStream output) throws IOException {
        // rick: we mock this
        output.write('/');
        // rick: getName is instance method (!C1), returns non-primitive (!C3), is 1 LOC (!C4)
        // rick: getBytes is not invoked on field or param (!C1), takes non-primitive param (!C2), returns non-primitive (!C3)
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
                // rick: writeHexByte is not invoked on field or param (!C1), takes non-primitive param (!C2), is static (!C5)
                Hex.writeHexByte(b, output);
            }
        }
    }
    
---

### 4. RandomAccessInputStream - `read(byte[] b, int off, int len)`

    public int read(byte[] b, int off, int len) throws IOException {
        restorePosition(); // rick: instance method not invoked on field or param (!C1)
        if (input.isEOF()) // rick: we mock this
        {
            return -1;
        }
        int n = input.read(b, off, len); // rick: recursive call, accepts non-primitive param (!C2)
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
        restorePosition(); // rick: instance method not invoked on field or param (!C1)
        if (input.isEOF()) // rick: we mock this
        {
            return -1;
        }
        int b = input.read(); // rick: we mock this
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
        restorePosition(); // rick: instance method not invoked on field or param (!C1)
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
        // rick: getDocument returns non primitive (!C3)
        // rick: isClosed not invoked on field or param (!C1)
        if (source.getDocument().isClosed())
        {
            throw new IOException("Error: source PDF is closed.");
        }
        // rick: getDocument returns non primitive (!C3)
        // rick: isClosed not invoked on field or param (!C1)
        if (destination.getDocument().isClosed())
        {
            throw new IOException("Error: destination PDF is closed.");
        }

        PDDocumentCatalog destCatalog = destination.getDocumentCatalog(); // rick: getDocumentCatalog returns non-primitive (!C3)
        PDDocumentCatalog srcCatalog = source.getDocumentCatalog(); // rick: getDocumentCatalog returns non-primitive (!C3)
        
        // rick: isDynamicXfa is instance method, not invoked on field or param (!C1), accepts non-primitive params (!C2)
        // rick: getAcroForm is not invoked on field or param (!C1), returns non-primitive (!C3)
        if (isDynamicXfa(srcCatalog.getAcroForm()))
        {
            throw new IOException("Error: can't merge source document containing dynamic XFA form content.");
        }

        // rick: getDocumentInformation returns non-primitive (!C3), is 17 LOC (C4)
        PDDocumentInformation destInfo = destination.getDocumentInformation();
        // rick: getDocumentInformation returns non-primitive (!C3), is 17 LOC (C4)
        PDDocumentInformation srcInfo = source.getDocumentInformation();
        
        // rick: mergeInto is instance method, not invoked on field or param (!C1)
        // rick: getCOSObject is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3), is 1 LOC (!C4)
        // rick: getCOSObject is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3), is 1 LOC (!C4)
        // rick: emptySet is static (!C5), returns non-primitive (!C3)
        mergeInto(srcInfo.getCOSObject(), destInfo.getCOSObject(), Collections.<COSName>emptySet());

        // rick: we mock this
        float destVersion = destination.getVersion();
        // rick: we mock this
        float srcVersion = source.getVersion();

        if (destVersion < srcVersion)
        {
            // rick: we instrument this, it is not invoked
            destination.setVersion(srcVersion);
        }

        int pageIndexOpenActionDest = -1;
        // rick: getOpenAction is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
        if (destCatalog.getOpenAction() == null)
        {
            PDDestinationOrAction openAction = null;
            try
            {
                // rick: getOpenAction is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
                openAction = srcCatalog.getOpenAction();
            }
            catch (IOException ex)
            {
                LOG.error("Invalid OpenAction ignored", ex);
            }
            PDDestination openActionDestination = null;
            if (openAction instanceof PDActionGoTo)
            {
                // rick: getDestination is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3) 
                openActionDestination = ((PDActionGoTo) openAction).getDestination();
            }
            else if (openAction instanceof PDDestination)
            {
                openActionDestination = (PDDestination) openAction;
            }

            if (openActionDestination instanceof PDPageDestination)
            {
                // rick: getPage is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
                PDPage page = ((PDPageDestination) openActionDestination).getPage();
                if (page != null)
                {
                    // rick: getPages is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
                    // rick: indexOf is not invoked on field or param (!C1), takes non-primitive param (!C4)
                    pageIndexOpenActionDest = srcCatalog.getPages().indexOf(page);
                }
            }

            // rick: setOpenAction is invoked on local variable, not on field or param (!C1), takes non-primitive param (!C2)
            destCatalog.setOpenAction(openAction);
        }

        PDFCloneUtility cloner = new PDFCloneUtility(destination);
        // rick: mergeAcroForm is instance method, not invoked on field or param (!C1), takes non-primitive params (!C2)
        mergeAcroForm(cloner, destCatalog, srcCatalog);

        // rick: getCOSObject is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
        // rick: getDictionaryObject is not invoked on field or param (!C1), takes non-primitive param (!C2), returns non-primitive (!C3)
        COSArray destThreads = (COSArray) destCatalog.getCOSObject().getDictionaryObject(COSName.THREADS);
        
        // rick: cloneForNewDocument is invoked on local variable, not on field or param (!C1), takes non-primitive param (!C2), returns non-primitive (!C3)
        // rick: getDictionaryObject is not invoked on field or param (!C1), takes non-primitive param (!C2), returns non-primitive (!C3)
        COSArray srcThreads = (COSArray) cloner.cloneForNewDocument(destCatalog.getCOSObject().getDictionaryObject(COSName.THREADS));
        if (destThreads == null)
        {
            // rick: getCOSObject is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
            // rick: setItem is not invoked on field or param (!C1), takes non-primitive params (!C2)
            destCatalog.getCOSObject().setItem(COSName.THREADS, srcThreads);
        }
        else
        {
            // rick: addAll is invoked on local variable, not on field or param (!C1), takes non-primitive params (!C2)
            destThreads.addAll(srcThreads);
        }

        // rick: getNames is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
        PDDocumentNameDictionary destNames = destCatalog.getNames();
        // rick: getNames is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
        PDDocumentNameDictionary srcNames = srcCatalog.getNames();
        if (srcNames != null)
        {
            if (destNames == null)
            {
                // rick: getCOSObject is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
                // rick: setItem is not invoked on field or param (!C1), takes non-primitive params (!C2)
                // rick: cloneForNewDocument is invoked on local variable, not on field or param (!C1), takes non-primitive param (!C2) 
                destCatalog.getCOSObject().setItem(COSName.NAMES, cloner.cloneForNewDocument(srcNames));
            }
            else
            {
                // rick: cloneMerge is invoked on local variable, not on field or param (!C1), takes non-primitive params (!C2)
                cloner.cloneMerge(srcNames, destNames);
            }
        }
        
        // rick: getCOSObject is invoked on local variable, not on field or param (!C1)
        // rick: containsKey is not invoked on field or param (!C1), takes non-primitive param (!C2)
        if (destNames != null && destNames.getCOSObject().containsKey(COSName.ID_TREE))
        {
            // rick: getCOSObject is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
            // rick: removeItem is not invoked on field or param (!C1), takes non-primitive param (!C2)
            destNames.getCOSObject().removeItem(COSName.ID_TREE);
            LOG.warn("Removed /IDTree from /Names dictionary, doesn't belong there");
        }

        // rick: getDests is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3) 
        PDDocumentNameDestinationDictionary srcDests = srcCatalog.getDests();
        if (srcDests != null)
        {
            // rick: getDests is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3) 
            PDDocumentNameDestinationDictionary destDests = destCatalog.getDests();
            if (destDests == null)
            {
                // rick: getCOSObject is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
                // rick: setItem is not invoked on field or param (!C1), takes non-primitive params (!C2)
                // rick: cloneForNewDocument is invoked on local variable, not on field or param (!C1), takes non-primitive param (!C2)
                destCatalog.getCOSObject().setItem(COSName.DESTS, cloner.cloneForNewDocument(srcDests));
            }
            else
            {
                // rick: cloneMerge is invoked on local variable, not on field or param (!C1), takes non-primitive params (!C2)
                cloner.cloneMerge(srcDests, destDests);
            }
        }

        // rick: getDocumentOutline is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
        PDDocumentOutline srcOutline = srcCatalog.getDocumentOutline();
        if (srcOutline != null)
        {
            // rick: getDocumentOutline is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
            PDDocumentOutline destOutline = destCatalog.getDocumentOutline();
            // rick: getFirstChild is invoked on local variable, not on field or params (!C1), returns non-primitive (!C3)
            if (destOutline == null || destOutline.getFirstChild() == null)
            {
                // rick: cloneForNewDocument is invoked on local variable, not on field or param (!C1), takes non-primitive params (!C2), returns non-primitive (!C3)
                PDDocumentOutline cloned = new PDDocumentOutline((COSDictionary) cloner.cloneForNewDocument(srcOutline));
                // rick: setDocumentOutline is invoked on local variable, not on field or param (!C1), takes non-primitive param (!C2)
                destCatalog.setDocumentOutline(cloned);
            }
            else
            {
                // rick: getFirstChild is invoked on local variable, not on field or param (!C1), returns non-primitive (!C2)
                PDOutlineItem destLastOutlineItem = destOutline.getFirstChild();
                // rick: getNextSibling is invoked on local variable, not on field or param (!C1), returns non-primitive (!C2)
                while (destLastOutlineItem.getNextSibling() != null)
                {
                    // rick: getNextSibling is invoked on local variable, not on field or param (!C1), returns non-primitive (!C2)
                    destLastOutlineItem = destLastOutlineItem.getNextSibling();
                }
                for (PDOutlineItem item : srcOutline.children())
                {
                    // rick: cloneForNewDocument is invoked on local variable, not on field or param (!C1), takes non-primitive params (!C2), returns non-primitive (!C3)
                    COSDictionary clonedDict = (COSDictionary) cloner.cloneForNewDocument(item);
                    // rick: removeItem is invoked on local variable, not on field or param (!C1), takes non-primitive param (!C2)
                    clonedDict.removeItem(COSName.PREV);
                    // rick: removeItem is invoked on local variable, not on field or param (!C1), takes non-primitive param (!C2)
                    clonedDict.removeItem(COSName.NEXT);
                    PDOutlineItem clonedItem = new PDOutlineItem(clonedDict);
                    // rick: insertSiblingAfter is invoked on local variable, not on field or param (!C1), takes non-primitive param (!C2)
                    destLastOutlineItem.insertSiblingAfter(clonedItem);
                    // rick: getNextSibling is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
                    destLastOutlineItem = destLastOutlineItem.getNextSibling();
                }
            }
        }

        // rick: getPageMode is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
        PageMode destPageMode = destCatalog.getPageMode();
        if (destPageMode == null)
        {
            // rick: getPageMode is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
            PageMode srcPageMode = srcCatalog.getPageMode();
            // rick: setPageMode is invoked on local variable, not on field or param (!C1), takes non-primitive param (!C2)
            destCatalog.setPageMode(srcPageMode);
        }

        // rick: getCOSObject is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
        // rick: getCOSDictionary is not invoked on local variable (!C1), takes non-primitive param (!C2)
        COSDictionary destLabels = destCatalog.getCOSObject().getCOSDictionary(COSName.PAGE_LABELS);
        
        // rick: getCOSObject is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
        // rick: getCOSDictionary is not invoked on local variable (!C1), takes non-primitive param (!C2)
        COSDictionary srcLabels = srcCatalog.getCOSObject().getCOSDictionary(COSName.PAGE_LABELS);
        
        if (srcLabels != null)
        {
            // rick: getNumberOfPages is invoked on param (C1), returns primitive (C3), but is 1 LOC (!C4)
            int destPageCount = destination.getNumberOfPages();
            COSArray destNums;
            if (destLabels == null)
            {
                destLabels = new COSDictionary();
                destNums = new COSArray();
                // rick: setItem is invoked on local variable, not on field or param (!C1), takes non-primitive param (!C2)
                destLabels.setItem(COSName.NUMS, destNums);
                // rick: getCOSObject is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
                // rick: setItem is not invoked on field or param (!C1), takes non-primitive params (!C2)
                destCatalog.getCOSObject().setItem(COSName.PAGE_LABELS, destLabels);
            }
            else
            {
                // rick: getDictionaryObject is invoked on local variable, not on field or param (!C1), takes non-primitive params (!C2), returns non-primitive (!C3)
                destNums = (COSArray) destLabels.getDictionaryObject(COSName.NUMS);
            }
            // rick: getDictionaryObject is invoked on local variable, not on field or param (!C1), takes non-primitive params (!C2), returns non-primitive (!C3) 
            COSArray srcNums = (COSArray) srcLabels.getDictionaryObject(COSName.NUMS);
            if (srcNums != null)
            {
                // rick: size is invoked on local variable, not on field or param (!C1)
                int startSize = destNums.size();
                // rick: size is invoked on local variable, not on field or param (!C1)
                for (int i = 0; i < srcNums.size(); i += 2)
                {
                    // rick: getObject is invoked on local variable, not on field or param (!C1), returns non-primitive (!C3)
                    COSBase base = srcNums.getObject(i);
                    if (!(base instanceof COSNumber))
                    {
                        LOG.error("page labels ignored, index " + i + " should be a number, but is " + base);
                        // rick: size is invoked on local variable, not on field or param (!C1)
                        while (destNums.size() > startSize)
                        {
                            // rick: remove is invoked on local variable, not on field or param (!C1)
                            destNums.remove(startSize);
                        }
                        break;
                    }
                    COSNumber labelIndex = (COSNumber) base;
                    long labelIndexValue = labelIndex.intValue();
                    destNums.add(COSInteger.get(labelIndexValue + destPageCount));
                    destNums.add(cloner.cloneForNewDocument(srcNums.getObject(i + 1)));
                }
            }
        }

        COSStream destMetadata = destCatalog.getCOSObject().getCOSStream(COSName.METADATA);
        COSStream srcMetadata = srcCatalog.getCOSObject().getCOSStream(COSName.METADATA);
        if (destMetadata == null && srcMetadata != null)
        {
            try
            {
                PDStream newStream = new PDStream(destination, srcMetadata.createInputStream(), (COSName) null);           
                mergeInto(srcMetadata, newStream.getCOSObject(), 
                        new HashSet<COSName>(Arrays.asList(COSName.FILTER, COSName.LENGTH)));           
                destCatalog.getCOSObject().setItem(COSName.METADATA, newStream);
            }
            catch (IOException ex)
            {
                // PDFBOX-4227 cleartext XMP stream with /Flate 
                LOG.error("Metadata skipped because it could not be read", ex);
            }
        }

        COSDictionary destOCP = destCatalog.getCOSObject().getCOSDictionary(COSName.OCPROPERTIES);
        COSDictionary srcOCP = srcCatalog.getCOSObject().getCOSDictionary(COSName.OCPROPERTIES);
        if (destOCP == null && srcOCP != null)
        {
            destCatalog.getCOSObject().setItem(COSName.OCPROPERTIES, cloner.cloneForNewDocument(srcOCP));
        }
        else if (destOCP != null && srcOCP != null)
        {
            cloner.cloneMerge(srcOCP, destOCP);
        }
        
        mergeOutputIntents(cloner, srcCatalog, destCatalog);

        // merge logical structure hierarchy
        boolean mergeStructTree = false;
        int destParentTreeNextKey = -1;
        Map<Integer, COSObjectable> srcNumberTreeAsMap = null;
        Map<Integer, COSObjectable> destNumberTreeAsMap = null;
        PDStructureTreeRoot srcStructTree = srcCatalog.getStructureTreeRoot();
        PDStructureTreeRoot destStructTree = destCatalog.getStructureTreeRoot();
        if (destStructTree == null && srcStructTree != null)
        {
            destStructTree = new PDStructureTreeRoot();
            destCatalog.setStructureTreeRoot(destStructTree);
            destStructTree.setParentTree(new PDNumberTreeNode(PDParentTreeValue.class));
            // PDFBOX-4429: remove bogus StructParent(s)
            for (PDPage page : destCatalog.getPages())
            {
                page.getCOSObject().removeItem(COSName.STRUCT_PARENTS);
                for (PDAnnotation ann : page.getAnnotations())
                {
                    ann.getCOSObject().removeItem(COSName.STRUCT_PARENT);
                }
            }
        }
        if (destStructTree != null)
        {
            PDNumberTreeNode destParentTree = destStructTree.getParentTree();
            destParentTreeNextKey = destStructTree.getParentTreeNextKey();
            if (destParentTree != null)
            {
                destNumberTreeAsMap = getNumberTreeAsMap(destParentTree);
                if (destParentTreeNextKey < 0)
                {
                    if (destNumberTreeAsMap.isEmpty())
                    {
                        destParentTreeNextKey = 0;
                    }
                    else
                    {
                        destParentTreeNextKey = Collections.max(destNumberTreeAsMap.keySet()) + 1;
                    }
                }
                if (destParentTreeNextKey >= 0 && srcStructTree != null)
                {
                    PDNumberTreeNode srcParentTree = srcStructTree.getParentTree();
                    if (srcParentTree != null)
                    {
                        srcNumberTreeAsMap = getNumberTreeAsMap(srcParentTree);
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
        for (PDPage page : srcCatalog.getPages())
        {
            PDPage newPage = new PDPage((COSDictionary) cloner.cloneForNewDocument(page.getCOSObject()));
            if (!mergeStructTree)
            {
                // PDFBOX-4429: remove bogus StructParent(s)
                newPage.getCOSObject().removeItem(COSName.STRUCT_PARENTS);
                for (PDAnnotation ann : newPage.getAnnotations())
                {
                    ann.getCOSObject().removeItem(COSName.STRUCT_PARENT);
                }
            }
            newPage.setCropBox(page.getCropBox());
            newPage.setMediaBox(page.getMediaBox());
            newPage.setRotation(page.getRotation());
            PDResources resources = page.getResources();
            if (resources != null)
            {
                // this is smart enough to just create references for resources that are used on multiple pages
                newPage.setResources(new PDResources((COSDictionary) cloner.cloneForNewDocument(resources)));
            }
            else
            {
                newPage.setResources(new PDResources());
            }
            if (mergeStructTree)
            {
                // add the value of the destination ParentTreeNextKey to every source element 
                // StructParent(s) value so that these don't overlap with the existing values
                updateStructParentEntries(newPage, destParentTreeNextKey);
                objMapping.put(page.getCOSObject(), newPage.getCOSObject());
                List<PDAnnotation> oldAnnots = page.getAnnotations();
                List<PDAnnotation> newAnnots = newPage.getAnnotations();
                for (int i = 0; i < oldAnnots.size(); i++)
                {
                    objMapping.put(oldAnnots.get(i).getCOSObject(), newAnnots.get(i).getCOSObject());
                }
                // TODO update mapping for XObjects
            }
            destination.addPage(newPage);

            if (pageIndex == pageIndexOpenActionDest)
            {
                // PDFBOX-3972: reassign the page.
                // The openAction is either a PDActionGoTo or a PDPageDestination
                PDDestinationOrAction openAction = destCatalog.getOpenAction();
                PDPageDestination pageDestination;
                if (openAction instanceof PDActionGoTo)
                {
                    pageDestination = (PDPageDestination) ((PDActionGoTo) openAction).getDestination();
                }
                else
                {
                    pageDestination = (PDPageDestination) openAction;
                }
                pageDestination.setPage(newPage);
            }
            ++pageIndex;
        }
        if (mergeStructTree)
        {
            updatePageReferences(cloner, srcNumberTreeAsMap, objMapping);
            int maxSrcKey = -1;
            for (Map.Entry<Integer, COSObjectable> entry : srcNumberTreeAsMap.entrySet())
            {
                int srcKey = entry.getKey();
                maxSrcKey = Math.max(srcKey, maxSrcKey);
                destNumberTreeAsMap.put(destParentTreeNextKey + srcKey, cloner.cloneForNewDocument(entry.getValue()));
            }
            destParentTreeNextKey += maxSrcKey + 1;
            PDNumberTreeNode newParentTreeNode = new PDNumberTreeNode(PDParentTreeValue.class);

            newParentTreeNode.setNumbers(destNumberTreeAsMap);

            destStructTree.setParentTree(newParentTreeNode);
            destStructTree.setParentTreeNextKey(destParentTreeNextKey);

            mergeKEntries(cloner, srcStructTree, destStructTree);
            mergeRoleMap(srcStructTree, destStructTree);
            mergeIDTree(cloner, srcStructTree, destStructTree);
            mergeMarkInfo(destCatalog, srcCatalog);
            mergeLanguage(destCatalog, srcCatalog);
            mergeViewerPreferences(destCatalog, srcCatalog);
        }
    }
    
---

### 8. COSWriter - `close()`

    public void close() throws IOException {
        // rick: getStandardOutput is instance method, not invoked on field or param (!C1), returns non-primitive (!C3)
        if (getStandardOutput() != null)
        {
            // rick: getStandardOutput is instance method, not invoked on field or param (!C1), returns non-primitive (!C3)
            // rick: close is not invoked on field or param (!C1)
            getStandardOutput().close();
        }
        if (incrementalOutput != null)
        {
            // rick: we mock this
            incrementalOutput.close();
        }
    }

---

### 9. StandardSecurityHandler - `prepareForDecryption(PDEncryption encryption, COSArray documentIDArray, DecryptionMaterial decryptionMaterial)`

TODO

---

### 10. PDTrueTypeFont - `codeToGID(int code)`

TODO

---

### 11. PDTrueTypeFont - `getWidthFromFont(int code)`

    public float getWidthFromFont(int code) throws IOException {
        // rick: codeToGID is instance method, not invoked on field or param (!C1)
        int gid = codeToGID(code);
        // rick: we mock this
        float width = ttf.getAdvanceWidth(gid);
        // rick: we mock this
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
            // rick: clone is invoked on field (C1), but returns non-primitive (!C3)
            return components.clone();
        }
        // rick: copyOf is static (!C5)
        // rick: we mock getNumberOfComponents
        return Arrays.copyOf(components, colorSpace.getNumberOfComponents());
    }

---

### 13. PDDeviceRGB - `toRGBImage(WritableRaster raster)`

    public BufferedImage toRGBImage(WritableRaster raster) throws IOException {
        // rick: we mock getWidth
        // rick: we mock getHeight
        BufferedImage image = new BufferedImage(raster.getWidth(), raster.getHeight(), BufferedImage.TYPE_INT_RGB);
        // rick: setData is invoked on local variable, not on field or param (!C1), takes non-primitive params (!C2)
        image.setData(raster);
        return image;
    }
    
---

### 14. PDDocumentCatalog - `getAcroForm(PDDocumentFixup acroFormFixup)`

    public PDAcroForm getAcroForm(PDDocumentFixup acroFormFixup) {
        if (acroFormFixup != null && acroFormFixup != acroFormFixupApplied)
        {
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
            COSDictionary dict = (COSDictionary)root.getDictionaryObject(COSName.ACRO_FORM);
            cachedAcroForm = dict == null ? null : new PDAcroForm(document, dict);
        }
        return cachedAcroForm;
    }
---

### 15. PDDocument - `importPage(PDPage page)`

    public PDPage importPage(PDPage page) throws IOException
    {
        PDPage importedPage = new PDPage(new COSDictionary(page.getCOSObject()), resourceCache);
        PDStream dest = new PDStream(this, page.getContents(), COSName.FLATE_DECODE);
        importedPage.setContents(dest);
        addPage(importedPage);
        importedPage.setCropBox(new PDRectangle(page.getCropBox().getCOSArray()));
        importedPage.setMediaBox(new PDRectangle(page.getMediaBox().getCOSArray()));
        importedPage.setRotation(page.getRotation());
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
        if (fontStack.isEmpty())
        {
            fontStack.add(font);
        }
        else
        {
            fontStack.setElementAt(font, fontStack.size() - 1);
        }
        
        if (font.willBeSubset())
        {
            document.getFontsToSubset().add(font);
        }
        
        writeOperand(resources.add(font));
        writeOperand(fontSize);
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

### 20. PageDrawer - `drawImage(PDImage pdImage)`

TODO

---

### 21. PageDrawer - `drawPage(Graphics g, PDRectangle pageSize)`

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

---

### 24. LegacyPDFStreamEngine - `processPage(PDPage page)`

---

### 25. TextPositionComparator - `compare(TextPosition pos1, TextPosition pos2)`

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
