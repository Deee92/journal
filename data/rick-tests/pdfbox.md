| cut 	| mut 	| mocked 	| tests 	| oo 	| po 	| co 	| passing 	| failing 	| comments 	|
|---	|---	|---	|---	|---	|---	|---	|---	|---	|---	|
| org.apache.pdfbox.contentstream.PDFStreamEngine 	| addOperator(OperatorProcessor) 	| OperatorProcessor.getName() 	| 6 	| - 	| 3 	| 3 	| 6 	| 0 	| - 	|
| org.apache.pdfbox.contentstream.PDFStreamEngine 	| processPage(PDPage) 	| PDPage.hasContents() 	| 6 	| - 	| 3 	| 3 	| 0 	| 6 	| NPE 	|
| org.apache.pdfbox.cos.COSDictionary 	| containsValue(Object) 	| Map.containsValue(Object) 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	| - 	|
| org.apache.pdfbox.cos.COSName 	| writePDF(OutputStream) 	| OutputStream.write 	| 14 	| - 	| 7 	| 7 	| 14 	| 0 	| - 	|
| org.apache.pdfbox.filter.DCTFilter 	| decode(InputStream,OutputStream, COSDictionary,int,DecodeOptions) 	| OutputStream.write(byte[]) 	| 4 	| - 	| 2 	| 2 	| 4 	| 0 	| - 	|
| org.apache.pdfbox.io.RandomAccessInputStream 	| read() 	| RandomAccessRead.eof(), RandomAccessRead.read() 	| 9 	| 3 	| 3 	| 3 	| 9 	| 0 	| - 	|
| org.apache.pdfbox.io.RandomAccessInputStream 	| read(byte[],int,int) 	| RandomAccessRead.eof(), RandomAccessRead.read(byte[],int,int) 	| 15 	| 5 	| 5 	| 5 	| 15 	| 0 	| - 	|
| org.apache.pdfbox.io.RandomAccessInputStream 	| available() 	| RandomAccessRead.length(), RandomAccessRead.getPosition() 	| 12 	| 4 	| 4 	| 4 	| 12 	| 0 	| - 	|
| org.apache.pdfbox.multipdf.PDFMergerUtility 	| appendDocument(PDDocument,PDDocument) 	| PDDocument.getVersion() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.apache.pdfbox.pdfwriter.COSWriter 	| visitFromName() 	| COSName.writePDF(OutputStream) 	| 14 	| - 	| 7 	| 7 	| 14 	| 0 	| - 	|
| org.apache.pdfbox.pdfwriter.COSWriter 	| close() 	| OutputStream.close() 	| 12 	| - 	| 6 	| 6 	| 1 PO 	| 11 	| Bad file descriptor, wanted 10 but found 1 	|
| org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler 	| prepareForDecryption(PDEncryption,COSArray, DecryptionMaterial) 	| PDEncryption.isEncryptMetaData() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| Unknown Encryption Revision 0 	|
| org.apache.pdfbox.pdmodel.font.PDFontDescriptor 	| getCapHeight() 	| COSDictionary.getFloat(COSName,float) 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.font.PDFontDescriptor 	| setCapHeight(float) 	| COSDictionary.setFloat(COSName,float) 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.font.PDFontDescriptor 	| setXHeight(float) 	| COSDictionary.setFloat(COSName,float) 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.font.PDSimpleFont 	| toUnicode(int,GlyphList) 	| Encoding.getName(int) 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	| tests fail with *** Set.add *** 	|
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont 	| codeToGID(int) 	| CmapSubtable.getGlyphId(int), TrueTypeFont.nameToGID(java.lang.String) 	| 6 	| 2 	| 2 	| 2 	| - 	| - 	| corner case: same invocation signature 	|
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont 	| getWidthFromFont(int) 	| TrueTypeFont.getAdvanceWidth(int), TrueTypeFont.getUnitsPerEm() 	| 3 	| 1 	| 1 	| 1 	| 3 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.graphics.color.PDColor 	| getComponents() 	| PDColorSpace.getNumberOfComponents() 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB 	| toRGBImage(WritableRaster) 	| Raster.getWidth(), Raster.getHeight() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject 	| setMatrix(AffineTransform) 	| AffineTransform.getMatrix(double[]) 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState 	| intersectClippingPath(Area) 	| Area.intersect(Area) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.apache.pdfbox.pdmodel.PDDocumentCatalog 	| getAcroForm(PDDocumentFixup) 	| PDDocumentFixup.apply() 	| 4 	| - 	| 2 	| 2 	| 4 	| 0 	| Where is CO and PO 3?! 	|
| org.apache.pdfbox.pdmodel.PDDocumentCatalog 	| getPageMode() 	| COSDictionary.getNameAsString(COSName) 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.PDDocument 	| importPage(PDPage) 	| PDPage.getRotation() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.apache.pdfbox.pdmodel.PDPageContentStream 	| setFont(PDFont,float) 	| PDFont.willBeSubset() 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.PDPage 	| setResources(PDResources) 	| COSDictionary.setItem(COSName,COSObjectable) 	| 6 	| - 	| 3 	| 3 	| 6 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.PDPage 	| setMediaBox(PDRectangle) 	| COSDictionary.setItem(COSName,COSObjectable) 	| 4 	| - 	| 2 	| 2 	| 4 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.PDResources 	| getExtGState(COSName) 	| ResourceCache.put(COSObject,PDExtendedGraphicsState) 	| 4 	| - 	| 2 	| 2 	| 4 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.PDResources 	| getFont(COSName) 	| ResourceCache.put(COSObject,PDFont) 	| 6 	| - 	| 3 	| 3 	| 6 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.PDResources 	| getXObject(COSName) 	| ResourceCache.put(COSObject,PDXObject) 	| 4 	| - 	| 2 	| 2 	| 4 	| 0 	| - 	|
| org.apache.pdfbox.rendering.PageDrawer 	| appendRectangle(Point2D,Point2D,Point2D,Point2D) 	| Path2D$Float.moveTo(float,float), Path2D$Float.lineTo(float,float), Path2D.closePath(), Point2D.getX(), Point2D.getY() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| wanted but not invoked, error in invocation order 	|
| org.apache.pdfbox.rendering.PageDrawer 	| fillPath(int) 	| Graphics2D.setComposite(Composite), Graphics2D.setPaint(Paint), Path2D.setWindingRule(int), Graphics2D.setRenderingHint(RenderingHints$Key,Object), Graphics2D.fill(Shape), Path2D.reset() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.apache.pdfbox.rendering.PageDrawer 	| strokePath() 	| Graphics2D.setComposite(Composite), Graphics2D.setPaint(Paint), Graphics2D.setStroke(Stroke), Graphics2D.draw(Shape), Path2D.reset() 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.apache.pdfbox.rendering.PageDrawer 	| drawImage(PDImage) 	| PDImage.getInterpolate(), PDImage.isStencil() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.apache.pdfbox.rendering.PageDrawer 	| drawPage(Graphics,PDRectangle) 	| Graphics2D.translate(double,double), Graphics2D.scale(double,double) 	| 2 	| - 	| 1 	| 1 	| - 	| - 	| can't run 	|
| org.apache.pdfbox.rendering.PageDrawer 	| endPath() 	| Path2D.setWindingRule(int), Path2D.reset() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.apache.pdfbox.rendering.PDFRenderer 	| renderImage(int,float,ImageType,RenderDestination) 	| ImageType.toBufferedImageType() 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.apache.pdfbox.text.PDFTextStripper 	| processPage(PDPage) 	| PDPage.getRotation() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.apache.pdfbox.text.TextPositionComparator 	| compare(TextPosition,TextPosition) 	| TextPosition.getDir(), TextPosition.getYDirAdj() 	| 3 	| 1 	| 1 	| 1 	| 2 	| 1 CO 	| wanted 4 times but was once 	|
| org.apache.pdfbox.tools.PDFGraphicsStreamEngine 	| drawImage(PDImage) 	| PDImage.isStencil() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| File not found 	|
| TOTAL: 25 CUTs 	| 41 MUTs 	| 64 mocked methods 	| 181 	| 19 	| 81 	| 81 	| 133/173 	| 40/173 	|  	|
|  	|  	|  	|  	|  	|  	|  	|  	|  	|  	|
