## Definitions:
1. **LOC** - Lines of code
2. **CC** - Cyclomatic complexity
3. **MUT** - Method under test (> 2 LOC)
4. **mockable-fqn** - Fully qualified name of the mockable method (> 1 LOC)
5. **target-type** - field / parameter
6. **test-oo** - Generated test with an _output oracle_ (stub + assertion); valid if MUT returns a non-void primitive value
7. **test-po** - Generated test with a _parameter oracle_ (stub + assertion + verification with production parameters)
8. **test-co** - Generated test with a _sequence oracle_ (verification on the sequence and frequency of mockable invocations) 

---

\#   | MUT (LOC) (CC) | mockable-fqn (LOC) (CC) | target-type | test-oo | test-po | test-co | comments
---- | -------------- | ----------------------- | ----------- | ------- | ------- | ------- | --------
1    | [org.apache.pdfbox.contentstream.PDFStreamEngine.processPage]() | [org.apache.pdfbox.pdmodel.PDPage.hasContents()]() | PARAMETER | - | 0P/3 | 0P/3 | NPE
2    | [org.apache.pdfbox.contentstream.operator.graphics.DrawObject.process]() | [java.util.List.isEmpty()]() | PARAMETER | - | 2P/2 | 2P/2 | -
3    | [org.apache.pdfbox.cos.COSName.writePDF]() | [java.io.OutputStream.write(int)]() | PARAMETER | - | 7P/7 | 7P/7 | -
4    | [org.apache.pdfbox.io.RandomAccessInputStream.read(byte[],int,int)]() | [org.apache.pdfbox.io.RandomAccessRead.isEOF()]() | FIELD | 0P/5 | 5P/5 | 5P/5 | output 0 for OO
5    | [org.apache.pdfbox.io.RandomAccessInputStream.read]() | [org.apache.pdfbox.io.RandomAccessRead.isEOF()]() | FIELD | 3P/3 | 3P/3 | 3P/3 | -
6    | [org.apache.pdfbox.io.RandomAccessInputStream.available]() | [org.apache.pdfbox.io.RandomAccessRead.length()]() and [org.apache.pdfbox.io.RandomAccessRead.getPosition()]() | FIELD | 4P/4 | 4P/4 | 4P/4 | -
7    | [org.apache.pdfbox.multipdf.PDFMergerUtility.appendDocument]() | [org.apache.pdfbox.pdmodel.PDDocument.getVersion()]() | PARAMETER | - | 0P/1 | 0P/1 | NPE
8    | [org.apache.pdfbox.pdfwriter.COSWriter.close]() | [java.io.OutputStream.close()]() | FIELD | - | 1P/6 | 0P/6 | "Bad file descriptor"
9    | [org.apache.pdfbox.pdmodel.PDDocument.importPage]() | [org.apache.pdfbox.pdmodel.PDPage.getRotation()]() | PARAMETER | - | 0P/1 | 0P/1 | NPE
10   | [org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm(org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup)]() | [org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup.apply()]() | PARAMETER | - | 2P/2 | 2P/2 | -
11   | [org.apache.pdfbox.pdmodel.PDPageContentStream.setFont]() | [org.apache.pdfbox.pdmodel.font.PDFont.willBeSubset()]() | PARAMETER | - | 1P/1 | 1P/1 | -
12   | [org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.prepareForDecryption]() | [org.apache.pdfbox.pdmodel.encryption.PDEncryption.isEncryptMetaData()]() | PARAMETER | - | 0P/1 | 0P/1 | Breaks because of default value in mock
