\#  | method FQN | test cases | passing | failing | comments
--- | ---------- | ---------- | ------- | ------- | --------
1 | org.apache.fontbox.cmap.CIDRange.map | 45 | 44 | 1 | ?
2 | org.apache.fontbox.cmap.CodespaceRange.isFullMatch | 45 | 45 | 0 |
3 | org.apache.pdfbox.pdfparser.XrefTrailerResolver.getTrailer | 5 | 5 | 0 | strings read from file (+ assertEquals on toString() ?)
4 | org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefTable | 9 | 9 | 0 | strings read from file
5 | org.apache.pdfbox.pdfparser.XrefTrailerResolver.getXrefType | 5 | 5 | 0 | strings read from file
6 | org.apache.pdfbox.util.SmallMap.size | 4 | 4 | 0 | strings read from file
7 | org.apache.fontbox.ttf.GlyfSimpleDescript.getEndPtOfContours | 79 | 79 | 0 
8 | org.apache.fontbox.ttf.GlyfSimpleDescript.getFlags | 1363 | 1363 | 0
9 | org.apache.fontbox.ttf.GlyfSimpleDescript.getXCoordinate | 1363 | 1363 | 0
10 | org.apache.fontbox.ttf.GlyfSimpleDescript.getYCoordinate | 1363 | 1363 | 0
11 | org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing | 59 | 59 | 0 | strings read from file
12 | org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB.toRGB | 1 | 1 | 0 | assertTrue on Arrays.equals()
13 | org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.toRGB | 1 | 1 | 0 | assertTrue on Arrays.equals()

