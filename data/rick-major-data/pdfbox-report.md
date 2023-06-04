
MUT \# | CUT | MUT | total mutants | mutants in MUT | baseline | oo | po | co | all |
-- | --- | --- | ------------- | -------------- | -------- | -- | -- | -- | --- |
1  | `DCTFilter` | `decode(InputStream,OutputStream,COSDictionary,int,DecodeOptions)` | 126 | 16 | x | x | x | x | x |
4  | `PDFontDescriptor` | `setCapHeight(float)` | 158 | 1 | x | x | x | x | x |
5  | `PDFontDescriptor` | `setXHeight(float)` | 158 | 1 | x | x | x | x | x |
7  | `COSName` | `writePDF(OutputStream)` | 597 | 30 |
8  | `GlyphTable` | `getGlyph(int)` | 52 |
9  | `PDTrueTypeFont` | `toUnicode(int,GlyphList)` | 
10 | `ScratchFileBuffer` | `seek(long)` |
12 | `RandomAccessInputStream` | `available()` |
13 | `RandomAccessInputStream` | `read(byte[],int,int)` |
14 | `PDDocumentCatalog` | `getPageMode()` |
15 | `PDICCBased` | `getNumberOfComponents()` | 
16 | `PDPageContentStream` | `setFont(PDFont,float)` |
17 | `PDColor` | `getComponents()` |
18 | `COSDictionary` | `containsValue(Object)` |
19 | `PDFontDescriptor` | `getCapHeight()` | 
20 | `PDIndexed` | `toRGBImage(WritableRaster)` |
21 | `PageDrawer` | `addOperator(OperatorProcessor)` |
22 | `RandomAccessInputStream` | `read()` |
23 | `PDResources` | `getFont(COSName)` |
27 | `PDTrueTypeFont` | `getWidthFromFont(int)` |
28 | `TextPositionComparator` | `compare(TextPosition,TextPosition)` |
29 | `AxialShadingContext` | `getRaster(int,int, int,int)` |
30 | `PDDocumentCatalog` | `getAcroForm(PDDocumentFixup)` |
31 | `PDResources` | `getXObject(COSName)` |
32 | `PDFRenderer` | `renderImage(int,float,ImageType,RenderDestination)` |
33 | `PDResources` | `getExtGState(COSName)` |
37 | `PDPage` | `setMediaBox(PDRectangle)` |
38 | `PDPage` | `setResources(PDResources)` |
39 | `PDFormXObject` | `setMatrix(AffineTransform)` |
40 | `PDResources` | `getShading(COSName)` |
41 | `COSWriter` | `close()` |
42 | `COSWriter` | `visitFromName(COSName)` |
47 | `PageDrawer` | `strokePath()` |
