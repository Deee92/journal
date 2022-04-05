## Definitions:
1. **LOC** - Lines of code
2. **CC** - Cyclomatic complexity
3. **MUT** - Method under test (> 1 LOC)
4. **mockable-fqn** - Fully qualified name of the mockable method (> 1 LOC)
5. **target-type** - field / parameter
6. **test-oo** - Generated test with an _output oracle_ (stub + assertion); generated if MUT returns a non-void primitive value
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
13   | [org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID]() | [org.apache.fontbox.ttf.CmapSubtable.getGlyphId(int)]() | FIELD | 2P/2 | 0P/2 | 0P/2 | OO pass with lenient stubbing?
14   | [org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getWidthFromFont]() | [org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth(int)](), [org.apache.fontbox.ttf.TrueTypeFont.getUnitsPerEm()]() | FIELD | 1P/1 | 1P/1 | 1P/1 | -
15   | [org.apache.pdfbox.pdmodel.graphics.color.PDColor.getComponents]() | [org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace.getNumberOfComponents()]() | FIELD | - | 1P/1 | 1P/1 | -
16   | [org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB.toRGBImage]() | [java.awt.image.Raster.getWidth()]() and [java.awt.image.Raster.getHeight()]() | PARAMETER | - | 0P/1 | 0P/1 | NPE after mockable method call
17   | [org.apache.pdfbox.rendering.PDFRenderer.renderImage(int,float,org.apache.pdfbox.rendering.ImageType,org.apache.pdfbox.rendering.RenderDestination)]() | [org.apache.pdfbox.rendering.ImageType.toBufferedImageType()]() | PARAMETER | - | 1P/1 | 1 | -
18   | [org.apache.pdfbox.rendering.PageDrawer.appendRectangle]() | [java.awt.geom.Point2D.getX()](), [java.awt.geom.Point2D.getY()](), [java.awt.geom.Path2D$Float.moveTo(float,float)](), [java.awt.geom.Path2D$Float.lineTo(float,float)](), and [java.awt.geom.Path2D.closePath()]() | PARAMETER, PARAMETER, FIELD, FIELD, FIELD | - | 0P/1 | 0P/1 | todo: fix
19   | [org.apache.pdfbox.rendering.PageDrawer.fillPath]() | [java.awt.geom.Path2D.setWindingRule(int)]() and [java.awt.geom.Path2D.reset()]() | FIELD | - | 0P/1 | 0P/1 | NPE
20   | [org.apache.pdfbox.rendering.PageDrawer.strokePath]() | [java.awt.geom.Path2D.reset()]() | FIELD | - | 0P/1 | 0P/1 | NPE
21   | [org.apache.pdfbox.rendering.PageDrawer.drawImage]() | [org.apache.pdfbox.pdmodel.graphics.image.PDImage.getInterpolate]() and [org.apache.pdfbox.pdmodel.graphics.image.PDImage.isStencil]() | PARAMETER | - | 0P/1 | 0P/1 | NPE
22   | [org.apache.pdfbox.rendering.PageDrawer.drawPage]() | [java.awt.Graphics2D.translate(double,double)]() and [java.awt.Graphics2D.scale(double,double)]() | FIELD | - | x/1 | x/1 | PO and CO crash
23   | [org.apache.pdfbox.rendering.PageDrawer.endPath]() | [java.awt.geom.Path2D.setWindingRule(int)]() and [java.awt.geom.Path2D.reset()]() | FIELD | - | 0P/1 | 0P/1 | NPE
24   | [org.apache.pdfbox.text.LegacyPDFStreamEngine.processPage]() | [org.apache.pdfbox.pdmodel.PDPage.getRotation()]() | PARAMETER | - | 0P/1 | 0P/1 | NPE
25   | [org.apache.pdfbox.text.TextPositionComparator.compare]() | [org.apache.pdfbox.text.TextPosition.getDir()]() and [org.apache.pdfbox.text.TextPosition.getYDirAdj()]() | PARAMETER | 1P/1 | 1P/1 | 0P/1 | todo: fix
26   | [org.apache.pdfbox.tools.ExtractImages$ImageGraphicsEngine.drawImage]() | [org.apache.pdfbox.pdmodel.graphics.image.PDImage.isStencil()]() | PARAMETER | - | 0P/1 | 0P/1 | FNF
