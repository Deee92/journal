| MUT\# | MUT | CUT | total mutants in MUT | mutants not raising errors | killed by baseline | killed by oo | killed by po | killed by co | killed by (oo +) po + co |
|---|---|---|---|---|---|---|---|---|---|
| 1 | decode(InputStream, OutputStream, COSDictionary, int, DecodeOptions) | DCTFilter | 16 | 12 | 0 | - | 1 | 1 | 1 |
| 4 | setCapHeight(float) | PDFontDescriptor | 1 | 1 | 0 | - | 1 | 1 | 1 |
| 5 | setXHeight(float) | PDFontDescriptor | 1 | 1 | 0 | - | 1 | 1 | 1 |
| 7 | writePDF(OutputStream) | COSName | 30 | 29 | 0 | - | 8 | 8 | 8 |
| 8 | getGlyph(int) | GlyphTable | 24 | 24 | 0 | - | 8 | 7 | 8 |
| 9 | toUnicode(int, GlyphList) | PDTrueTypeFont | 17 | 17 | 0 | 7 | 5 | 5 | 7 |
| 10 | seek(long) | ScratchFileBuffer | 18 | 14 | 0 | - | 3 | 3 | 3 |
| 12 | available() | RandomAccessInputStream | 4 | 4 | 0 | 4 | 2 | 2 | 4 |
| 13 | read(byte[], int, int) | RandomAccessInputStream | 6 | 6 | 0 | 2 | 2 | 2 | 2 |
| 14 | getPageMode() | PDDocumentCatalog | 6 | 6 | 0 | - | 1 | 1 | 1 |
| 15 | getNumberOfComponents() | PDICCBased | 6 | 6 | 0 | 3 | 4 | 4 | 4 |
| 16 | setFont(PDFont,float) | PDPageContentStream | 3 | 2 | 0 | - | 1 | 1 | 1 |
| 17 | getComponents() | PDColor | 5 | 5 | 0 | - | 1 | 1 | 1 |
| 18 | containsValue(Object) | COSDictionary | 5 | 4 | 0 | 1 | 3 | 2 | 3 |
| 19 | getCapHeight() | PDFontDescriptor | 3 | 3 | 0 | 3 | 3 | 3 | 3 |
| 20 | toRGBImage(WritableRaster) | PDIndexed | 8 | 4 | 0 | - | 1 | 1 | 1 |
| 21 | addOperator(OperatorProcessor) | PageDrawer | 2 | 1 | 0 | - | 1 | 1 | 1 |
| 22 | read() | RandomAccessInputStream | 6 | 6 | 0 | 2 | 2 | 2 | 2 |
| 23 | getFont(COSName) | PDResources | 26 | 26 | 0 | - | 6 | 6 | 6 |
| 27 | getWidthFromFont(int) | PDTrueTypeFont | 5 | 5 | 0 | 5 | 2 | 2 | 5 |
| 28 | compare(TextPosition, TextPosition) | TextPositionComparator | 19 | 17 | 0 | 3 | 3 | - | 3 |
| 29 | getRaster(int, int, int, int) | AxialShadingContext | 37 | 28 | 0 | - | 3 | 3 | 3 |
| 30 | getAcroForm(PDDocumentFixup) | PDDocumentCatalog | 14 | 14 | 0 | - | 4 | 4 | 4 |
| 31 | getXObject(COSName) | PDResources | 19 | 19 | 0 | - | 7 | 6 | 7 |
| 32 | renderImage(int, float, ImageType, RenderDestination) | PDFRenderer | 23 | 17 | 0 | - | 1 | 3 | 3 |
| 33 | getExtGState(COSName) | PDResources | 17 | 17 | 0 | - | 7 | 6 | 7 |
| 37 | setMediaBox(PDRectangle) | PDPage | 4 | 4 | 0 | - | 3 | 3 | 3 |
| 38 | setResources(PDResources) | PDPage | 4 | 4 | 0 | - | 3 | 3 | 3 |
| 39 | setMatrix(AffineTransform) | PDFormXObject | 4 | 2 | 0 | - | 1 | 1 | 1 |
| 40 | getShading(COSName) | PDResources | 16 | 16 | 0 | - | 6 | 6 | 6 |
| 41 | close() | COSWriter | 5 | 5 | 0 | - | 2 | - | 2 |
| 42 | visitFromName(COSName) | COSWriter | 3 | 2 | 0 | - | 1 | 1 | 1 |
| 47 | strokePath() | PageDrawer | 1 | 1 | 0 | - | 1 | 1 | 1 |
| TOTAL | 33 MUTs |  | 358 | 322 | 0 / 322 | 30 / 322 | 98 / 322 | 91 / 322 | 107 / 322 (33.2%) |
