### Our criteria
- C1: invoked on field or param
- C2: primitive params
- C3: primitive returned value
- C4: LOC
- C5: non-static

### 1. DrawObject - `process(Operator operator, List<COSBase> operands)`

    public void process(Operator operator, List<COSBase> operands) throws IOException {
        if (operands.isEmpty()) // rick: we mock this
        {
            throw new MissingOperandException(operator, operands);
        }
        COSBase base0 = operands.get(0); // rick: get does not return a primitive (!C3)
        if (!(base0 instanceof COSName))
        {
            return;
        }
        COSName objectName = (COSName) base0;
        // rick: context is inherited field (!C1), getResources returns non-primitive (!C3), is 1 LOC (!C4)
        // rick: getXObject is not invoked on field or param (!C1), takes a non-primitive param (!C2), returns non-primitive (!C3), is 31 LOC (C4)
        PDXObject xobject = context.getResources().getXObject(objectName);

        if (xobject == null)
        {
            // rick: getName is not invoked on field or param (!C1), does not return a primitive (!C3)
            throw new MissingResourceException("Missing XObject: " + objectName.getName());
        }
        else if (xobject instanceof PDImageXObject)
        {
            PDImageXObject image = (PDImageXObject)xobject;
            context.drawImage(image); // rick: context is inherited field (!C1), drawImage takes non-primitive param (!C2)
        }
        else if (xobject instanceof PDFormXObject)
        {
            try
            {
                context.increaseLevel(); // rick: context is inherited field (!C1), increaseLevel is 1 LOC (!C4)
                if (context.getLevel() > 25) // rick: context is inherited field (!C1), getLevel is 1 LOC (!C4)
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

---

### 8. COSWriter - `close()`

---

### 9. StandardSecurityHandler - `prepareForDecryption(PDEncryption encryption, COSArray documentIDArray, DecryptionMaterial decryptionMaterial)`

---

### 10. PDTrueTypeFont - `codeToGID(int code)`

---

### 11. PDTrueTypeFont - `getWidthFromFont(int code)`

---

### 12. PDColor - `getComponents()`

---

### 13. PDDeviceRGB - `toRGBImage(WritableRaster raster)`

---

### 14. PDDocumentCatalog - `getAcroForm(PDDocumentFixup acroFormFixup)`

---

