| cut 	| mut 	| mocked 	| tests 	| oo 	| po 	| co 	| passing 	| failing 	| comments 	|
|---	|---	|---	|---	|---	|---	|---	|---	|---	|---	|
| org.apache.fontbox.ttf.GlyphTable 	| getGlyph(int) 	| TTFDataStream.getCurrentPosition(), TTFDataStream.seek(long) 	| 4 	| - 	| 2 	| 2 	| 2 	| 2 (1PO, 1CO) 	| wanted but not invoked 	|
| org.apache.pdfbox.contentstream.PDFStreamEngine 	| addOperator(OperatorProcessor) 	| OperatorProcessor.getName() 	| 18 	| - 	| 9 	| 9 	| 18 	| 0 	| - 	|
| org.apache.pdfbox.contentstream.PDFStreamEngine 	| processPage(PDPage) 	| PDPage.hasContents() 	| 12 	| - 	| 6 	| 6 	| 0 	| 12 	| NPE 	|
| org.apache.pdfbox.cos.COSDictionary 	| containsValue(Object) 	| Map.containsValue(Object) 	| 12 	| 4 	| 4 	| 4 	| 12 	| 0 	| - 	|
| org.apache.pdfbox.cos.COSName 	| writePDF(OutputStream) 	| OutputStream.write 	| 48 	| - 	| 24 	| 24 	| 48 	| 0 	| - 	|
| org.apache.pdfbox.filter.DCTFilter 	| decode(InputStream,OutputStream, COSDictionary,int,DecodeOptions) 	| OutputStream.write(byte[]) 	| 12 	| - 	| 6 	| 6 	| 12 	| 0 	| - 	|
| org.apache.pdfbox.io.RandomAccessInputStream 	| read() 	| RandomAccessRead.eof(), RandomAccessRead.read() 	| 24 	| 8 	| 8 	| 8 	| 24 	| 0 	| - 	|
| org.apache.pdfbox.io.RandomAccessInputStream 	| read(byte[],int,int) 	| RandomAccessRead.eof(), RandomAccessRead.read(byte[],int,int) 	| 51 	| 17 	| 17 	| 17 	| 51 	| 0 	| - 	|
| org.apache.pdfbox.io.RandomAccessInputStream 	| available() 	| RandomAccessRead.length(), RandomAccessRead.getPosition() 	| 42 	| 14 	| 14 	| 14 	| 42 	| 0 	| - 	|
| org.apache.pdfbox.io.ScratchFileBuffer 	| seek(long) 	| ScratchFile.writePage(int,byte[]) 	| 8 	| - 	| 4 	| 4 	| 8 	| 0 	| - 	|
| org.apache.pdfbox.multipdf.PDFMergerUtility 	| appendDocument(PDDocument,PDDocument) 	| PDDocument.getVersion() 	| 6 	| - 	| 3 	| 3 	| 0 	| 6 	| NPE 	|
| org.apache.pdfbox.pdfwriter.COSWriter 	| visitFromName() 	| COSName.writePDF(OutputStream) 	| 42 	| - 	| 21 	| 21 	| 42 	| 0 	| - 	|
| org.apache.pdfbox.pdfwriter.COSWriter 	| close() 	| OutputStream.close() 	| 54 	| - 	| 27 	| 27 	| 4 PO 	| 50 	| Bad file descriptor, wanted 10 but found 1 	|
| org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler 	| prepareForDecryption(PDEncryption,COSArray, DecryptionMaterial) 	| PDEncryption.isEncryptMetaData() 	| 10 	| - 	| 5 	| 5 	| 0 	| 10 	| Unknown Encryption Revision 0 	|
| org.apache.pdfbox.pdmodel.font.PDFontDescriptor 	| getCapHeight() 	| COSDictionary.getFloat(COSName,float) 	| 12 	| 4 	| 4 	| 4 	| 12 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.font.PDFontDescriptor 	| setCapHeight(float) 	| COSDictionary.setFloat(COSName,float) 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.font.PDFontDescriptor 	| setXHeight(float) 	| COSDictionary.setFloat(COSName,float) 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.font.PDSimpleFont 	| toUnicode(int,GlyphList) 	| Encoding.getName(int) 	| 18 	| 6 	| 6 	| 6 	| 18 	| 0 	|  	|
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont 	| codeToGID(int) 	| CmapSubtable.getGlyphId(int), TrueTypeFont.nameToGID(java.lang.String) 	| 15 	| 5 	| 5 	| 5 	| - 	| - 	| corner case: same invocation signature 	|
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont 	| getWidthFromFont(int) 	| TrueTypeFont.getAdvanceWidth(int), TrueTypeFont.getUnitsPerEm() 	| 9 	| 3 	| 3 	| 3 	| 9 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.graphics.color.PDColor 	| getComponents() 	| PDColorSpace.getNumberOfComponents() 	| 8 	| - 	| 4 	| 4 	| 8 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB 	| toRGBImage(WritableRaster) 	| Raster.getWidth(), Raster.getHeight() 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.apache.pdfbox.pdmodel.graphics.color.PDICCBased 	| getNumberOfComponents() 	| ICC_Profile.getNumComponents() 	| 6 	| 2 	| 2 	| 2 	| 6 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.graphics.color.PDIndexed 	| toRGBImage(WritableRaster) 	| Raster.getWidth(), Raster.getHeight() 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject 	| setMatrix(AffineTransform) 	| AffineTransform.getMatrix(double[]) 	| 10 	| - 	| 5 	| 5 	| 10 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.graphics.shading.AxialShadingContext 	| getRaster(int,int,int,int) 	| AffineTransform.transform(float[],int,float[],int,int) 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState 	| intersectClippingPath(Area) 	| Area.intersect(Area) 	| 2 	| - 	| 1 	| 1 	| 0 	| 2 	| NPE 	|
| org.apache.pdfbox.pdmodel.PDDocumentCatalog 	| getAcroForm(PDDocumentFixup) 	| PDDocumentFixup.apply() 	| 14 	| - 	| 7 	| 7 	| 14 	| 0 	|  	|
| org.apache.pdfbox.pdmodel.PDDocumentCatalog 	| getPageMode() 	| COSDictionary.getNameAsString(COSName) 	| 6 	| - 	| 3 	| 3 	| 6 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.PDDocument 	| importPage(PDPage) 	| PDPage.getRotation() 	| 8 	| - 	| 4 	| 4 	| 0 	| 8 	| NPE 	|
| org.apache.pdfbox.pdmodel.PDPageContentStream 	| setFont(PDFont,float) 	| PDFont.willBeSubset() 	| 8 	| - 	| 4 	| 4 	| 8 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.PDPage 	| setResources(PDResources) 	| COSDictionary.setItem(COSName,COSObjectable) 	| 16 	| - 	| 8 	| 8 	| 16 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.PDPage 	| setMediaBox(PDRectangle) 	| COSDictionary.setItem(COSName,COSObjectable) 	| 14 	| - 	| 7 	| 7 	| 14 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.PDResources 	| getColorSpace(COSName,boolean) 	| ResourceCache.put(COSObject,PDColorSpace) 	| 8 	| - 	| 4 	| 4 	| 0 	| 8 	| invalid color space 	|
| org.apache.pdfbox.pdmodel.PDResources 	| getExtGState(COSName) 	| ResourceCache.put(COSObject,PDExtendedGraphicsState) 	| 20 	| - 	| 10 	| 10 	| 20 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.PDResources 	| getShading(COSName) 	| ResourceCache.put(COSObject,PDShading) 	| 2 	| - 	| 1 	| 1 	| 2 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.PDResources 	| getFont(COSName) 	| ResourceCache.put(COSObject,PDFont) 	| 22 	| - 	| 11 	| 11 	| 22 	| 0 	| - 	|
| org.apache.pdfbox.pdmodel.PDResources 	| getXObject(COSName) 	| ResourceCache.put(COSObject,PDXObject) 	| 12 	| - 	| 6 	| 6 	| 12 	| 0 	| - 	|
| org.apache.pdfbox.rendering.PageDrawer 	| appendRectangle(Point2D,Point2D,Point2D,Point2D) 	| Path2D$Float.moveTo(float,float), Path2D$Float.lineTo(float,float), Path2D.closePath(), Point2D.getX(), Point2D.getY() 	| 8 	| - 	| 4 	| 4 	| 0 	| 8 	| wanted but not invoked, error in invocation order 	|
| org.apache.pdfbox.rendering.PageDrawer 	| fillPath(int) 	| Graphics2D.setComposite(Composite), Graphics2D.setPaint(Paint), Path2D.setWindingRule(int), Graphics2D.setRenderingHint(RenderingHints$Key,Object), Graphics2D.fill(Shape), Path2D.reset() 	| 8 	| - 	| 4 	| 4 	| 0 	| 8 	| NPE 	|
| org.apache.pdfbox.rendering.PageDrawer 	| strokePath() 	| Graphics2D.setComposite(Composite), Graphics2D.setPaint(Paint), Graphics2D.setStroke(Stroke), Graphics2D.draw(Shape), Path2D.reset() 	| 6 	| - 	| 3 	| 3 	| 6 	| 0 	| - 	|
| org.apache.pdfbox.rendering.PageDrawer 	| drawImage(PDImage) 	| PDImage.getInterpolate(), PDImage.isStencil() 	| 6 	| - 	| 3 	| 3 	| 0 	| 6 	| NPE 	|
| org.apache.pdfbox.rendering.PageDrawer 	| drawPage(Graphics,PDRectangle) 	| Graphics2D.translate(double,double), Graphics2D.scale(double,double) 	| 8 	| - 	| 4 	| 4 	| - 	| - 	| can't run 	|
| org.apache.pdfbox.rendering.PageDrawer 	| endPath() 	| Path2D.setWindingRule(int), Path2D.reset() 	| 8 	| - 	| 4 	| 4 	| 0 	| 8 	| NPE 	|
| org.apache.pdfbox.rendering.PDFRenderer 	| renderImage(int,float,ImageType,RenderDestination) 	| ImageType.toBufferedImageType() 	| 8 	| - 	| 4 	| 4 	| 4 	| 4 (2CO, 2PO) 	| invalid space color kind 	|
| org.apache.pdfbox.text.PDFTextStripper 	| processPage(PDPage) 	| PDPage.getRotation() 	| 8 	| - 	| 4 	| 4 	| 0 	| 8 	| NPE 	|
| org.apache.pdfbox.text.TextPositionComparator 	| compare(TextPosition,TextPosition) 	| TextPosition.getDir(), TextPosition.getYDirAdj() 	| 12 	| 4 	| 4 	| 4 	| 8 	| 4 CO 	| wanted 4 times but was once 	|
| org.apache.pdfbox.tools.PDFGraphicsStreamEngine 	| drawImage(PDImage) 	| PDImage.isStencil() 	| 6 	| - 	| 3 	| 3 	| 0 	| 6 	| File not found 	|
