## Definitions:
1. **LOC** - Lines of code
2. **CC** - Cyclomatic complexity
3. **MUT** - Method under test (> 2 LOC)
4. **mockable-fqn** - Fully qualified name of the mockable method (> 1 LOC)
5. **target-type** - field / parameter
6. **test-oo** - Generated test with an _output oracle_ (stub + assertion + verification)
7. **test-po** - Generated test with a _parameter oracle_ (stub + assertion + verification with production parameters)
8. **test-co** - Generated test with a _sequence oracle_ (verification on the sequence and frequency of mockable invocations) 

---

\#   | MUT (LOC) (CC) | mockable-fqn (LOC) (CC) | target-type | test-oo | test-po | test-co
---- | -------------- | ----------------------- | ----------- | ------- | ------- | -------
0    | `org.apache.pdfbox.contentstream.operator.graphics.DrawObject.process` | `java.util.List.isEmpty` | parameter | 
1    | `org.apache.pdfbox.cos.COSName.writePDF` | `java.io.OutputStream.write(int)` | parameter |
2    | `org.apache.pdfbox.io.RandomAccessInputStream.read(byte[],int,int)` | `org.apache.pdfbox.io.RandomAccessRead.isEOF` | field |
3    | `org.apache.pdfbox.io.RandomAccessInputStream.read` | `org.apache.pdfbox.io.RandomAccessRead.isEOF` | field | 
4    | `org.apache.pdfbox.io.RandomAccessInputStream.read` | `org.apache.pdfbox.io.RandomAccessRead.read` | field | 
5    | `org.apache.pdfbox.io.RandomAccessInputStream.available` | `org.apache.pdfbox.io.RandomAccessRead.length` | field |
6    | `org.apache.pdfbox.io.RandomAccessInputStream.available` | `org.apache.pdfbox.io.RandomAccessRead.getPosition` | field |
7    | `org.apache.pdfbox.multipdf.PDFMergerUtility.appendDocument` | `org.apache.pdfbox.pdmodel.PDDocument.getVersion` | parameter |
8    | `org.apache.pdfbox.pdmodel.PDDocument.importPage` | `org.apache.pdfbox.pdmodel.PDPage.getRotation` | parameter |
9    | `org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm(org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup)` | `org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup.apply` | parameter |
10   | `org.apache.pdfbox.pdmodel.PDPageContentStream.setFont` | `org.apache.pdfbox.pdmodel.font.PDFont.willBeSubset` | parameter |
11   | `org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.prepareForDecryption` | `org.apache.pdfbox.pdmodel.encryption.PDEncryption.isEncryptMetaData` | parameter |
12   | `org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID` | `org.apache.fontbox.ttf.CmapSubtable.getGlyphId(int)` | field | 
13   | `org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getWidthFromFont` | `org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth(int)` | field |
14   | `org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getWidthFromFont` | `org.apache.fontbox.ttf.TrueTypeFont.getUnitsPerEm` | field |
15   | `org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB.toRGBImage` | `java.awt.image.Raster.getWidth` | parameter |
16   | `org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB.toRGBImage` | `java.awt.image.Raster.getHeight` | parameter |
17   | `org.apache.pdfbox.rendering.PDFRenderer.renderImage(int,float,org.apache.pdfbox.rendering.ImageType,org.apache.pdfbox.rendering.RenderDestination)` | `org.apache.pdfbox.rendering.ImageType.toBufferedImageType` | parameter |
18   | `org.apache.pdfbox.rendering.PageDrawer.appendRectangle` | `java.awt.geom.Path2D$Float.moveTo(float,float)` | field | 
19   | `org.apache.pdfbox.rendering.PageDrawer.appendRectangle` | `java.awt.geom.Path2D.closePath` | field | 
20   | `org.apache.pdfbox.rendering.PageDrawer.appendRectangle` | `java.awt.geom.Point2D.getX` | parameter | 
21   | `org.apache.pdfbox.rendering.PageDrawer.appendRectangle` | `java.awt.geom.Point2D.getY` | parameter | 
22   | `org.apache.pdfbox.rendering.PageDrawer.fillPath` | `java.awt.geom.Path2D.setWindingRule(int)` | field |
23   | `org.apache.pdfbox.rendering.PageDrawer.fillPath` | `java.awt.geom.Path2D.reset` | field |
24   | `org.apache.pdfbox.rendering.PageDrawer.strokePath` | `java.awt.geom.Path2D.reset` | field |
25   | `org.apache.pdfbox.rendering.PageDrawer.drawImage` | `org.apache.pdfbox.pdmodel.graphics.image.PDImage.getInterpolate` | parameter |
26   | `org.apache.pdfbox.rendering.PageDrawer.drawImage` | `org.apache.pdfbox.pdmodel.graphics.image.PDImage.isStencil` | parameter |
27   | `org.apache.pdfbox.rendering.PageDrawer.drawPage` | `java.awt.Graphics2D.translate(double,double)` | field
28   | `org.apache.pdfbox.rendering.PageDrawer.drawPage` | `java.awt.Graphics2D.scale(double,double)` | field
29   | `org.apache.pdfbox.text.LegacyPDFStreamEngine.processPage` | `org.apache.pdfbox.pdmodel.PDPage.getRotation` | parameter |
30   | `org.apache.pdfbox.text.TextPositionComparator.compare` | `org.apache.pdfbox.text.TextPosition.getDir` | parameter
31   | `org.apache.pdfbox.text.TextPositionComparator.compare` | `org.apache.pdfbox.text.TextPosition.getYDirAdj` | parameter
32   | `org.apache.pdfbox.tools.ExtractImages$ImageGraphicsEngine.drawImage` | `org.apache.pdfbox.pdmodel.graphics.image.PDImage.isStencil` | parameter
