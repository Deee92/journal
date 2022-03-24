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

\#   | MUT (LOC) (CC) | mockable-fqn (LOC) (CC) | target-type | test-oo | test-po | test-co
---- | -------------- | ----------------------- | ----------- | ------- | ------- | -------
1    | `org.apache.pdfbox.cos.COSName.writePDF` | `java.io.OutputStream.write(int)` | parameter | 
2    | `org.apache.pdfbox.io.RandomAccessInputStream.read(byte[],int,int)` | `org.apache.pdfbox.io.RandomAccessRead.isEOF` | field | 5F | 5F | 5F
3    | `org.apache.pdfbox.io.RandomAccessInputStream.read` | `org.apache.pdfbox.io.RandomAccessRead.isEOF` | field | 1F | 1F | 1P
4    | `org.apache.pdfbox.io.RandomAccessInputStream.read` | `org.apache.pdfbox.io.RandomAccessRead.read` | field | 3P | 3P | 3P
5    | `org.apache.pdfbox.io.RandomAccessInputStream.available` | `org.apache.pdfbox.io.RandomAccessRead.length` | field | 1P 3F | 1P 3F | 4P
6    | `org.apache.pdfbox.io.RandomAccessInputStream.available` | `org.apache.pdfbox.io.RandomAccessRead.getPosition` | field | 4F | 4F | 4P
7    | `org.apache.pdfbox.multipdf.PDFMergerUtility.appendDocument` | `org.apache.pdfbox.pdmodel.PDDocument.getVersion` | parameter | - | 1F | 1F
8    | `org.apache.pdfbox.pdmodel.PDDocument.importPage` | `org.apache.pdfbox.pdmodel.PDPage.getRotation` | parameter | - | 1F | 1F
9    | `org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm(org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup)` | `org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup.apply` | parameter | - | 2P | 2P
10   | `org.apache.pdfbox.pdmodel.PDPageContentStream.setFont` | `org.apache.pdfbox.pdmodel.font.PDFont.willBeSubset` | parameter | - | 1P | 1P
11   | `org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.prepareForDecryption` | `org.apache.pdfbox.pdmodel.encryption.PDEncryption.isEncryptMetaData` | parameter | - | 1F | 1F
12   | `org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID` | `org.apache.fontbox.ttf.CmapSubtable.getGlyphId(int)` | field | 6F | 6F | 2F
13   | `org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getWidthFromFont` | `org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth(int)` | field | 1F | 1F | 1P
14   | `org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getWidthFromFont` | `org.apache.fontbox.ttf.TrueTypeFont.getUnitsPerEm` | field | 1F | 1F | 1P
15   | `org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB.toRGBImage` | `java.awt.image.Raster.getWidth` | parameter |
16   | `org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB.toRGBImage` | `java.awt.image.Raster.getHeight` | parameter |
17   | `org.apache.pdfbox.rendering.PDFRenderer.renderImage(int,float,org.apache.pdfbox.rendering.ImageType,org.apache.pdfbox.rendering.RenderDestination)` | `org.apache.pdfbox.rendering.ImageType.toBufferedImageType` | parameter | - | 1P | 1F (wip)
18   | `org.apache.pdfbox.rendering.PageDrawer.appendRectangle` | `java.awt.geom.Path2D$Float.moveTo(float,float)` | field | 
19   | `org.apache.pdfbox.rendering.PageDrawer.appendRectangle` | `java.awt.geom.Path2D.closePath` | field | 
20   | `org.apache.pdfbox.rendering.PageDrawer.appendRectangle` | `java.awt.geom.Point2D.getX` | parameter | 
21   | `org.apache.pdfbox.rendering.PageDrawer.appendRectangle` | `java.awt.geom.Point2D.getY` | parameter | 
22   | `org.apache.pdfbox.rendering.PageDrawer.fillPath` | `java.awt.geom.Path2D.setWindingRule(int)` | field |
23   | `org.apache.pdfbox.rendering.PageDrawer.fillPath` | `java.awt.geom.Path2D.reset` | field |
24   | `org.apache.pdfbox.rendering.PageDrawer.strokePath` | `java.awt.geom.Path2D.reset` | field |
25   | `org.apache.pdfbox.rendering.PageDrawer.drawImage` | `org.apache.pdfbox.pdmodel.graphics.image.PDImage.getInterpolate` | parameter | - | 1F | 1F
26   | `org.apache.pdfbox.rendering.PageDrawer.drawImage` | `org.apache.pdfbox.pdmodel.graphics.image.PDImage.isStencil` | parameter | - | 1F | 1F
27   | `org.apache.pdfbox.rendering.PageDrawer.drawPage` | `java.awt.Graphics2D.translate(double,double)` | field | x | x | x
28   | `org.apache.pdfbox.rendering.PageDrawer.drawPage` | `java.awt.Graphics2D.scale(double,double)` | field | x | x | x
29   | `org.apache.pdfbox.text.LegacyPDFStreamEngine.processPage` | `org.apache.pdfbox.pdmodel.PDPage.getRotation` | parameter | - | 1F | 1F
30   | `org.apache.pdfbox.text.TextPositionComparator.compare` | `org.apache.pdfbox.text.TextPosition.getDir` | parameter | 1P | 1P | 1F (wip)
31   | `org.apache.pdfbox.text.TextPositionComparator.compare` | `org.apache.pdfbox.text.TextPosition.getYDirAdj` | parameter | 1P | 1P | 1F (wip)
32   | `org.apache.pdfbox.tools.ExtractImages$ImageGraphicsEngine.drawImage` | `org.apache.pdfbox.pdmodel.graphics.image.PDImage.isStencil` | parameter | - | 1F | 1F
