| MUT\# | MUT | CUT | valid mutants | killed baseline | killed oo | killed po | killed co | killed all |
|---|---|---|---|---|---|---|---|---|
| 1 | decode(InputStream, OutputStream, COSDictionary, int, DecodeOptions) | DCTFilter | 12 | 0 | - | 1 | 1 | 1 |
| 4 | setCapHeight(float) | PDFontDescriptor | 1 | 0 | - | 1 | 1 | 1 |
| 5 | setXHeight(float) | PDFontDescriptor | 1 | 0 | - | 1 | 1 | 1 |
| 7 | writePDF(OutputStream) | COSName | 29 | 0 | - | 8 | 8 | 8 |
| 8 | getGlyph(int) | GlyphTable | 24 | 0 | - | 8 | 7 | 8 |
| 9 | toUnicode(int, GlyphList) | PDTrueTypeFont | 17 | 0 | 7 | 5 | 5 | 7 |
| 10 | seek(long) | ScratchFileBuffer | 14 | 0 | - | 3 | 3 | 3 |
| 12 | available() | RandomAccessInputStream | 4 | 0 | 4 | 2 | 2 | 4 |
| 13 | read(byte[], int, int) | RandomAccessInputStream | 6 | 0 | 2 | 2 | 2 | 2 |
| 14 | getPageMode() | PDDocumentCatalog | 6 | 0 | - | 1 | 1 | 1 |
| 15 | getNumberOfComponents() | PDICCBased | 6 | 0 | 3 | 4 | 4 | 4 |
| 16 | setFont(PDFont,float) | PDPageContentStream | 2 | 0 | - | 1 | 1 | 1 |
| 17 | getComponents() | PDColor | 5 | 0 | - | 1 | 1 | 1 |
| 18 | containsValue(Object) | COSDictionary | 4 | 0 | 1 | 3 | 2 | 3 |
| 19 | getCapHeight() | PDFontDescriptor | 3 | 0 | 3 | 3 | 3 | 3 |
| 20 | toRGBImage(WritableRaster) | PDIndexed | 4 | 0 | - | 1 | 1 | 1 |
| 21 | addOperator(OperatorProcessor) | PageDrawer | 1 | 0 | - | 1 | 1 | 1 |
| 22 | read() | RandomAccessInputStream | 6 | 0 | 2 | 2 | 2 | 2 |
| 23 | getFont(COSName) | PDResources | 26 | 0 | - | 6 | 6 | 6 |
| 27 | getWidthFromFont(int) | PDTrueTypeFont | 5 | 0 | 5 | 2 | 2 | 5 |
| 28 | compare(TextPosition, TextPosition) | TextPositionComparator | 17 | 0 | 3 | 3 | - | 3 |
| 29 | getRaster(int, int, int, int) | AxialShadingContext | 28 | 0 | - | 3 | 3 | 3 |
| 30 | getAcroForm(PDDocumentFixup) | PDDocumentCatalog | 14 | 0 | - | 4 | 4 | 4 |
| 31 | getXObject(COSName) | PDResources | 19 | 0 | - | 7 | 6 | 7 |
| 32 | renderImage(int, float, ImageType, RenderDestination) | PDFRenderer | 17 | 0 | - | 1 | 3 | 3 |
| 33 | getExtGState(COSName) | PDResources | 17 | 0 | - | 7 | 6 | 7 |
| 37 | setMediaBox(PDRectangle) | PDPage | 4 | 0 | - | 3 | 3 | 3 |
| 38 | setResources(PDResources) | PDPage | 4 | 0 | - | 3 | 3 | 3 |
| 39 | setMatrix(AffineTransform) | PDFormXObject | 2 | 0 | - | 1 | 1 | 1 |
| 40 | getShading(COSName) | PDResources | 16 | 0 | - | 6 | 6 | 6 |
| 41 | close() | COSWriter | 5 | 0 | - | 2 | - | 2 |
| 42 | visitFromName(COSName) | COSWriter | 2 | 0 | - | 1 | 1 | 1 |
| 47 | strokePath() | PageDrawer | 1 | 0 | - | 1 | 1 | 1 |
| TOTAL | 33 MUTs |  | 322 | 0 / 322 | 30 / 68 (44%) | 98 / 322 (30.4%) | 91 / 300 (30.3%) | 107 / 322 (33.2%) |
