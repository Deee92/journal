\#   | MUT | mockable-fqn | target-type | is-invoked | test |
---- | --- | ------------ | ----------- | ---------- | ---- |
1    | `org.apache.fontbox.afm.FontMetrics.setCharMetrics` | `java.util.List.size` | field | no | -
2    | `org.apache.fontbox.ttf.GlyphTable.getGlyph` | `org.apache.fontbox.ttf.TTFDataStream.getCurrentPosition` | field | no | - 
3    | `org.apache.fontbox.ttf.GlyphTable.getGlyph` | `org.apache.fontbox.ttf.TTFDataStream.seek(long)` | field | no | - 
4    | `org.apache.fontbox.ttf.RAFDataStream.readSignedShort` | `java.io.RandomAccessFile.readShort` | field | no | - 
5    | `org.apache.fontbox.ttf.RAFDataStream.readUnsignedShort` | `java.io.RandomAccessFile.readSignedShort` | field | no | - 
6    | `org.apache.fontbox.ttf.RAFDataStream.read` | `java.io.RandomAccessFile.read` | field | yes | P
7    | `org.apache.fontbox.ttf.RAFDataStream.getCurrentPosition` | `java.io.RandomAccessFile.getFilePointer` | field | yes | F 
8    | `org.apache.fontbox.ttf.RAFDataStream.seek` | `java.io.RandomAccessFile.seek(long)` | field | yes | P
9    | `org.apache.pdfbox.contentstream.PDFStreamEngine.getGraphicsStackSize` | `java.util.Deque.size` | field | no | -
10   | `org.apache.pdfbox.contentstream.PDFStreamEngine.processPage` | `org.apache.pdfbox.pdmodel.PDPage.hasContents` | parameter | yes | F (NPE)
11   | `org.apache.pdfbox.contentstream.operator.DrawObject.process` | `java.util.List.isEmpty` | parameter | no | -
12   | `org.apache.pdfbox.contentstream.operator.color.SetColor.process` | `java.util.List.size` | parameter | no | -
13   | `org.apache.pdfbox.contentstream.operator.graphics.AppendRectangleToPath.process` | `java.util.List.size` | parameter | no | -
14   | `org.apache.pdfbox.contentstream.operator.graphics.DrawObject.process` | `java.util.List.isEmpty` | parameter | yes | P
15   | `org.apache.pdfbox.contentstream.operator.graphics.MoveTo.process` | `java.util.List.size` | parameter | no | - 
16   | `org.apache.pdfbox.contentstream.operator.state.Concatenate.process` | `java.util.List.size` | parameter | no | -
17   | `org.apache.pdfbox.contentstream.operator.state.SetFlatness.process` | `java.util.List.isEmpty` | parameter | no | -
18   | `org.apache.pdfbox.contentstream.operator.state.SetGraphicsStateParameters.process` | `java.util.List.isEmpty` | parameter | no | -
19   | `org.apache.pdfbox.contentstream.operator.state.SetLineCapStyle.process` | `java.util.List.isEmpty` | parameter | no | -
20   | `org.apache.pdfbox.contentstream.operator.state.SetLineDashPattern.process` | `java.util.List.size` | parameter | no | -
21   | `org.apache.pdfbox.contentstream.operator.state.SetLineJoinStyle.process` | `java.util.List.isEmpty` | parameter | no | -
22   | `org.apache.pdfbox.contentstream.operator.state.SetLineMiterLimit.process` | `java.util.List.isEmpty` | parameter | no | -
23   | `org.apache.pdfbox.contentstream.operator.state.SetLineWidth.process` | `java.util.List.isEmpty` | parameter | no | -
24   | `org.apache.pdfbox.contentstream.operator.state.SetMatrix.process` | `java.util.List.size` | parameter | no | -
25   | `org.apache.pdfbox.contentstream.operator.text.MoveText.process` | `java.util.List.size` | parameter | no | -
26   | `org.apache.pdfbox.contentstream.operator.text.MoveTextSetLeading.process` | `java.util.List.size` | parameter | no | -
27   | `org.apache.pdfbox.contentstream.operator.text.SetCharSpacing.process` | `java.util.List.isEmpty` | parameter | no | -
28   | `org.apache.pdfbox.contentstream.operator.text.SetCharSpacing.process` | `java.util.List.size` | parameter | no | -
29   | `org.apache.pdfbox.contentstream.operator.text.SetFontAndSize.process` | `java.util.List.size` | parameter | no | -
30   | `org.apache.pdfbox.contentstream.operator.text.SetWordSpacing.process` | `java.util.List.isEmpty` | parameter | no | -
31   | `org.apache.pdfbox.contentstream.operator.text.ShowText.process` | `java.util.List.isEmpty` | parameter | no | -
32   | `org.apache.pdfbox.contentstream.operator.text.ShowTextAdjusted.process` | `java.util.List.isEmpty` | parameter | no | -
33   | `org.apache.pdfbox.cos.COSArray.size` | `java.util.List.size` | field | no | -
34   | `org.apache.pdfbox.cos.COSDictionary.size` | `java.util.Map.size` | field | yes | P
35   | `org.apache.pdfbox.cos.COSDocument.getObjectFromPool` | `org.apache.pdfbox.cos.COSObjectKey.getNumber` | parameter | yes | P
36   | `org.apache.pdfbox.cos.COSDocument.getObjectFromPool` | `org.apache.pdfbox.cos.COSObjectKey.getGeneration` | parameter | yes | P
37   | `org.apache.pdfbox.cos.COSFloat.floatValue` | `java.math.BigDecimal.floatValue` | field | no | -
38   | `org.apache.pdfbox.cos.COSFloat.equals` | `java.math.BigDecimal.floatValue` | field | no | -
39   | `org.apache.pdfbox.cos.COSName.writePDF` | `java.io.OutputStream.write(int)` | parameter | yes | P
40   | `org.apache.pdfbox.cos.COSOutputStream.write` | `org.apache.pdfbox.io.RandomAccessWrite.write(int)` | field | yes | P
41   | `org.apache.pdfbox.cos.COSOutputStream.close` | `java.util.List.size` | field | no | -
42   | `org.apache.pdfbox.cos.COSOutputStream.close` | `java.io.Closeable.close` | field | yes | P
43   | `org.apache.pdfbox.cos.COSStream.createRawOutputStream` | `org.apache.pdfbox.io.RandomAccessRead.length` | field | no | -
44   | `org.apache.pdfbox.cos.COSStream.close` | `java.io.Closeable.close` | field | yes | P
45   | `org.apache.pdfbox.cos.COSStream.createOutputStream` | `org.apache.pdfbox.io.RandomAccessRead.length` | field | no | -
46   | `org.apache.pdfbox.filter.DCTFilter.decode` | `org.apache.pdfbox.filter.DecodeOptions.getSubsamplingX` | parameter | yes | F
47   | `org.apache.pdfbox.filter.DCTFilter.decode` | `org.apache.pdfbox.filter.DecodeOptions.getSubsamplingY` | parameter | yes | F
48   | `org.apache.pdfbox.filter.DCTFilter.decode` | `org.apache.pdfbox.filter.DecodeOptions.getSubsamplingOffsetX` | parameter | yes | F
49   | `org.apache.pdfbox.filter.DCTFilter.decode` | `org.apache.pdfbox.filter.DecodeOptions.getSubsamplingOffsetY` | parameter | yes | F
50   | `org.apache.pdfbox.filter.DCTFilter.decode` | `org.apache.pdfbox.filter.DecodeOptions.setFilterSubsampled(boolean)` | parameter | yes | F
51   | `org.apache.pdfbox.io.RandomAccessBufferedFileInputStream.seek` | `java.io.RandomAccessFile.seek(long)` | field | no | -
52   | `org.apache.pdfbox.io.RandomAccessBufferedFileInputStream.close` | `java.io.RandomAccessFile.close` | field | no | -
53   | `org.apache.pdfbox.io.RandomAccessBufferedFileInputStream.close` | `java.util.Map.clear` | field | no | -
54   | `org.apache.pdfbox.io.RandomAccessInputStream.read([byte[],int,int)` | `org.apache.pdfbox.io.RandomAccessRead.isEOF` | field | yes | F
55   | `org.apache.pdfbox.io.RandomAccessInputStream.read([byte[],int,int)` | `org.apache.pdfbox.io.RandomAccessRead.getPosition` | field | no | -
56   | `org.apache.pdfbox.io.RandomAccessInputStream.read` | `org.apache.pdfbox.io.RandomAccessRead.isEOF` | field | yes | F, co: 1P
57   | `org.apache.pdfbox.io.RandomAccessInputStream.read` | `org.apache.pdfbox.io.RandomAccessRead.read` | field | yes | P
58   | `org.apache.pdfbox.io.RandomAccessInputStream.read` | `org.apache.pdfbox.io.RandomAccessRead.getPosition` | field | no | -
59   | `org.apache.pdfbox.io.RandomAccessInputStream.available` | `org.apache.pdfbox.io.RandomAccessRead.length` | field | yes | 3P, 5F, co: 4P
60   | `org.apache.pdfbox.io.RandomAccessInputStream.available` | `org.apache.pdfbox.io.RandomAccessRead.getPosition` | field | yes | F, co: 4P
61   | `org.apache.pdfbox.io.RandomAccessOutputStream.write` | `org.apache.pdfbox.io.RandomAccessWrite.write(int)` | field | yes | P
62   | `org.apache.pdfbox.io.ScratchFile.close` | `java.io.RandomAccessFile.close` | field | no | -
63   | `org.apache.pdfbox.io.ScratchFile.close` | `java.io.File.delete` | field | no | -
64   | `org.apache.pdfbox.io.ScratchFile.close` | `java.io.File.exists` | field | no | -
65   | `org.apache.pdfbox.io.ScratchFile.close` | `java.util.BitSet.clear` | field | no | -
66   | `org.apache.pdfbox.multipdf.Overlay.close` | `org.apache.pdfbox.pdmodel.PDDocument.close` | field | yes | 5P, 2F
67   | `org.apache.pdfbox.multipdf.Overlay.close` | `java.util.Set.clear` | field | no | -
68   | `org.apache.pdfbox.multipdf.Overlay.close` | `java.util.Map.clear` | field | no | -
69   | `org.apache.pdfbox.multipdf.PDFMergerUtility.appendDocument` | `org.apache.pdfbox.pdmodel.PDDocument.getVersion` | parameter | yes | F (NPE)
70   | `org.apache.pdfbox.multipdf.PDFMergerUtility.appendDocument` | `org.apache.pdfbox.pdmodel.PDDocument.setVersion(float)` | parameter | no | -
71   | `org.apache.pdfbox.multipdf.PDFMergerUtility.appendDocument` | `org.apache.pdfbox.pdmodel.PDDocument.getNumberOfPages` | parameter | no | -
72   | `org.apache.pdfbox.pdfparser.InputStreamSource.read` | `java.io.PushbackInputStream.read` | field | no | -
73   | `org.apache.pdfbox.pdfparser.InputStreamSource.peek` | `java.io.PushbackInputStream.read` | field | no | -
74   | `org.apache.pdfbox.pdfparser.InputStreamSource.peek` | `java.io.PushbackInputStream.unread(int)` | field | no | -
75   | `org.apache.pdfbox.pdfparser.RandomAccessSource.isEOF` | `org.apache.pdfbox.io.RandomAccessRead.isEOF` | field | yes | P
76   | `org.apache.pdfbox.pdfparser.RandomAccessSource.read` | `org.apache.pdfbox.io.RandomAccessRead.read` | field | yes | P
77   | `org.apache.pdfbox.pdfparser.RandomAccessSource.peek` | `org.apache.pdfbox.io.RandomAccessRead.peek` | field | yes | P
78   | `org.apache.pdfbox.pdfparser.RandomAccessSource.unread` | `org.apache.pdfbox.io.RandomAccessRead.rewind(int)` | field | yes | P
79   | `org.apache.pdfbox.pdfparser.RandomAccessSource.getPosition` | `org.apache.pdfbox.io.RandomAccessRead.getPosition` | field | yes | P
80   | `org.apache.pdfbox.pdfparser.RandomAccessSource.unread(byte[],int,int)` | `org.apache.pdfbox.io.RandomAccessRead.rewind(int)` | field | no | -
81   | `org.apache.pdfbox.pdfparser.XrefTrailerResolver.setXRef` | `org.apache.pdfbox.cos.COSObjectKey.getNumber` | parameter | no | -
82   | `org.apache.pdfbox.pdfparser.XrefTrailerResolver.setStartxref` | `java.util.Map.size` | field | no | -
83   | `org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject` | `org.apache.pdfbox.cos.COSObjectKey.getNumber` | field | yes | F
84   | `org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject` | `org.apache.pdfbox.cos.COSObjectKey.getGeneration` | field | yes | F
85   | `org.apache.pdfbox.pdfwriter.COSWriter.visitFromString` | `org.apache.pdfbox.cos.COSObjectKey.getNumber` | field | yes | 1P, co: 1P
86   | `org.apache.pdfbox.pdfwriter.COSWriter.visitFromString` | `org.apache.pdfbox.cos.COSObjectKey.getGeneration` | field | yes | 1P, co: 1P
87   | `org.apache.pdfbox.pdfwriter.COSWriter.visitFromStream` | `org.apache.pdfbox.cos.COSObjectKey.getNumber` | field | yes | 1P, co: 1P
88   | `org.apache.pdfbox.pdfwriter.COSWriter.visitFromStream` | `org.apache.pdfbox.cos.COSObjectKey.getGeneration` | field | yes | 1P, co: 1P
89   | `org.apache.pdfbox.pdfwriter.COSWriter.visitFromDocument` | `org.apache.pdfbox.cos.COSDocument.isXRefStream` | parameter | yes | F
90   | `org.apache.pdfbox.pdfwriter.COSWriter.write` | `org.apache.pdfbox.pdmodel.PDDocument.isAllSecurityToBeRemoved` | parameter | yes | F
91   | `org.apache.pdfbox.pdfwriter.COSWriter.close` | `java.io.OutputStream.close` | field | yes | 1P, co: 1P
92   | `org.apache.pdfbox.pdmodel.PDDocument.isEncrypted` | `org.apache.pdfbox.cos.COSDocument.isEncrypted` | field | yes | P
93   | `org.apache.pdfbox.pdmodel.PDDocument.save` | `org.apache.pdfbox.cos.COSDocument.isClosed` | field | yes | F
94   | `org.apache.pdfbox.pdmodel.PDDocument.save` | `java.util.Set.clear` | field | no | -
95   | `org.apache.pdfbox.pdmodel.PDDocument.close` | `org.apache.pdfbox.cos.COSDocument.isClosed` | field | yes | P, co: F
96   | `org.apache.pdfbox.pdmodel.PDDocument.importPage` | `org.apache.pdfbox.pdmodel.PDPage.getRotation` | parameter | yes | F
97   | `org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm` | `org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup.apply` | parameter | yes | P
98   | `org.apache.pdfbox.pdmodel.PDPageContentStream.setFont` | `java.util.Vector.isEmpty` | field | no | -
99   | `org.apache.pdfbox.pdmodel.PDPageContentStream.setFont` | `java.util.Vector.size` | field | no | -
100  | `org.apache.pdfbox.pdmodel.PDPageContentStream.setFont` | `org.apache.pdfbox.pdmodel.font.PDFont.willBeSubset` | parameter | yes | P
101  | `org.apache.pdfbox.pdmodel.PDPageContentStream.close` | `java.io.OutputStream.close` | field | yes | P
102  | `org.apache.pdfbox.pdmodel.common.COSArrayList.size` | `java.util.List.size` | field | no | -
103  | `org.apache.pdfbox.pdmodel.common.COSArrayList.isEmpty` | `java.util.List.isEmpty` | field | no | -
104  | `org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.prepareForDecryption` | `org.apache.pdfbox.pdmodel.encryption.PDEncryption.getVersion` | parameter | yes | F
105  | `org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.prepareForDecryption` | `org.apache.pdfbox.pdmodel.encryption.PDEncryption.isEncryptMetaData` | parameter | yes | F
106  | `org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.prepareForDecryption` | `org.apache.pdfbox.pdmodel.encryption.PDEncryption.getPermissions` | parameter | yes | F
107  | `org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.prepareForDecryption` | `org.apache.pdfbox.pdmodel.encryption.PDEncryption.getRevision` | parameter | yes | F
108  | `org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.prepareForDecryption` | `org.apache.pdfbox.pdmodel.encryption.PDEncryption.getLength` | parameter | yes | F
109  | `org.apache.pdfbox.pdmodel.font.PDFont.toUnicode` | `org.apache.fontbox.cmap.CMap.hasUnicodeMappings` | field | no | -
110  | `org.apache.pdfbox.pdmodel.font.PDFont.getSpaceWidth` | `org.apache.fontbox.cmap.CMap.getSpaceMapping` | field | no | -
111  | `org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode` | `org.apache.commons.logging.Log.isWarnEnabled` | field | no | -
112  | `org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.readCode` | `java.io.InputStream.read` | parameter | no | -
113  | `org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID` | `org.apache.fontbox.ttf.CmapSubtable.getGlyphId(int)` | field | yes | F
114  | `org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getWidthFromFont` | `org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth(int)` | field | yes | co: 1P
115  | `org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getWidthFromFont` | `org.apache.fontbox.ttf.TrueTypeFont.getUnitsPerEm` | field | yes | co: 1P
116  | `org.apache.pdfbox.pdmodel.graphics.color.PDColor.getComponents` | `org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace.getNumberOfComponents` | field | yes | P
117  | `org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB.toRGBImage` | `java.awt.image.Raster.getWidth` | parameter | yes | F
118  | `org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB.toRGBImage` | `java.awt.image.Raster.getHeight` | parameter | yes | F
119  | `org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.copyIntoGraphicsState` | `org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState.setLineWidth(float)` | parameter | no | -
120  | `org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.copyIntoGraphicsState` | `org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState.setLineCap(int)` | parameter | no | -
121  | `org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.copyIntoGraphicsState` | `org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState.setLineJoin(int)` | parameter | no | -
122  | `org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.copyIntoGraphicsState` | `org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState.setMiterLimit(float)` | parameter | no | -
123  | `org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.copyIntoGraphicsState` | `org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState.setOverprintMode(double)` | parameter | yes | P
124  | `org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.copyIntoGraphicsState` | `org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState.setOverprint(boolean)` | parameter | yes | P
125  | `org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.copyIntoGraphicsState` | `org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState.setNonStrokingOverprint(boolean)` | parameter | yes | P
126  | `org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.copyIntoGraphicsState` | `org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState.setFlatness(double)` | parameter | no | -
127  | `org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.copyIntoGraphicsState` | `org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState.setSmoothness(double)` | parameter | yes | P
128  | `org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.copyIntoGraphicsState` | `org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState.setStrokeAdjustment(boolean)` | parameter | yes | P
129  | `org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.copyIntoGraphicsState` | `org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState.setAlphaConstant(double)` | parameter | no | -
130  | `org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.copyIntoGraphicsState` | `org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState.setNonStrokeAlphaConstant(double)` | parameter | no | -
131  | `org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.copyIntoGraphicsState` | `org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState.setAlphaSource(boolean)` | parameter | no | -
132  | `org.apache.pdfbox.rendering.PDFRenderer.renderImage` | `org.apache.pdfbox.rendering.ImageType.toBufferedImageType` | parameter | yes | P, co: F
133  | `org.apache.pdfbox.rendering.PageDrawer.appendRectangle` | `java.awt.geom.Path2D$Float.moveTo(float,float)` | field | yes | P
134  | `org.apache.pdfbox.rendering.PageDrawer.appendRectangle` | `java.awt.geom.Path2D$Float.lineTo(float,float)` | field | yes | P
135  | `org.apache.pdfbox.rendering.PageDrawer.appendRectangle` | `java.awt.geom.Path2D.closePath` | field | yes | P
136  | `org.apache.pdfbox.rendering.PageDrawer.appendRectangle` | `java.awt.geom.Point2D.getX` | parameter | yes | P
137  | `org.apache.pdfbox.rendering.PageDrawer.appendRectangle` | `java.awt.geom.Point2D.getY` | parameter | yes | P
138  | `org.apache.pdfbox.rendering.PageDrawer.fillPath` | `java.awt.geom.Path2D.setWindingRule(int)` | field | yes | F
139  | `org.apache.pdfbox.rendering.PageDrawer.fillPath` | `java.awt.geom.Path2D.reset` | field | yes | F
140  | `org.apache.pdfbox.rendering.PageDrawer.moveTo` | `java.awt.geom.Path2D$Float.moveTo(float,float)` | field | yes | P
141  | `org.apache.pdfbox.rendering.PageDrawer.closePath` | `java.awt.geom.Path2D.closePath` | field | yes | P
142  | `org.apache.pdfbox.rendering.PageDrawer.strokePath` | `java.awt.geom.Path2D.reset` | field | yes | F
143  | `org.apache.pdfbox.rendering.PageDrawer.drawImage` | `org.apache.pdfbox.pdmodel.graphics.image.PDImage.getInterpolate` | parameter | yes | F
144  | `org.apache.pdfbox.rendering.PageDrawer.drawImage` | `org.apache.pdfbox.pdmodel.graphics.image.PDImage.isStencil` | parameter | yes | F
145  | `org.apache.pdfbox.rendering.PageDrawer.drawPage` | `java.awt.Graphics2D.translate(double,double)` | field | yes | F
146  | `org.apache.pdfbox.rendering.PageDrawer.drawPage` | `java.awt.Graphics2D.scale(double,double)` | field | yes | F
147  | `org.apache.pdfbox.rendering.PageDrawer.drawPage` | `org.apache.pdfbox.pdmodel.common.PDRectangle.getHeight` | field | yes | F
148  | `org.apache.pdfbox.rendering.PageDrawer.drawPage` | `java.awt.Graphics2D.translate(double,double)` | parameter | yes | F
149  | `org.apache.pdfbox.rendering.PageDrawer.drawPage` | `org.apache.pdfbox.pdmodel.common.PDRectangle.getLowerLeftX` | parameter | yes | F
150  | `org.apache.pdfbox.rendering.PageDrawer.drawPage` | `org.apache.pdfbox.pdmodel.common.PDRectangle.getLowerLeftY` | parameter | yes | F
151  | `org.apache.pdfbox.rendering.PageDrawer.endPath` | `java.awt.geom.Path2D.setWindingRule(int)` | field | yes | F
152  | `org.apache.pdfbox.rendering.PageDrawer.endPath` | `java.awt.geom.Path2D.reset` | field | yes | F
153  | `org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID` | `org.apache.pdfbox.pdmodel.font.PDFont.isStandard14` | field | no | -
154  | `org.apache.pdfbox.rendering.TTFGlyph2D.getPathForGID` | `org.apache.pdfbox.pdmodel.font.PDFontLike.isEmbedded` | field | no | -
155  | `org.apache.pdfbox.text.LegacyPDFStreamEngine.processPage` | `org.apache.pdfbox.pdmodel.common.PDRectangle.getLowerLeftX` | field | yes | ??
156  | `org.apache.pdfbox.text.LegacyPDFStreamEngine.processPage` | `org.apache.pdfbox.pdmodel.common.PDRectangle.getLowerLeftY` | field | yes | ??
157  | `org.apache.pdfbox.text.LegacyPDFStreamEngine.processPage` | `org.apache.pdfbox.pdmodel.PDPage.getRotation` | field | yes | F
158  | `org.apache.pdfbox.text.PDFTextStripper.processPage` | `java.util.List.size` | field | no | -
159  | `org.apache.pdfbox.text.PDFTextStripper.processPage` | `java.util.ArrayList.size` | field | no | -
160  | `org.apache.pdfbox.text.PDFTextStripper.processPage` | `java.util.ArrayList.ensureCapacity(int)` | field | no | -
161  | `org.apache.pdfbox.text.PDFTextStripper.processPage` | `java.util.Map.clear` | field | no | -
162  | `org.apache.pdfbox.text.TextPosition.getDir` | `org.apache.pdfbox.util.Matrix.getScaleY` | field | yes | P
163  | `org.apache.pdfbox.text.TextPosition.getDir` | `org.apache.pdfbox.util.Matrix.getShearY` | field | yes | P
164  | `org.apache.pdfbox.text.TextPosition.getDir` | `org.apache.pdfbox.util.Matrix.getShearX` | field | yes | P
165  | `org.apache.pdfbox.text.TextPosition.getDir` | `org.apache.pdfbox.util.Matrix.getScaleX` | field | yes | P
166  | `org.apache.pdfbox.text.TextPositionComparator.compare` | `org.apache.pdfbox.text.TextPosition.getDir` | parameter | yes | P, co: F
167  | `org.apache.pdfbox.text.TextPositionComparator.compare` | `org.apache.pdfbox.text.TextPosition.getXDirAdj` | parameter | yes | P, co: F
168  | `org.apache.pdfbox.text.TextPositionComparator.compare` | `org.apache.pdfbox.text.TextPosition.getYDirAdj` | parameter | yes | P, co: F
169  | `org.apache.pdfbox.text.TextPositionComparator.compare` | `org.apache.pdfbox.text.TextPosition.getHeightDir` | parameter | yes | P, co: F
170  | `org.apache.pdfbox.tools.TextToPDF.createPDFFromText` | `org.apache.pdfbox.pdmodel.common.PDRectangle.getHeight` | field | yes | ??
171  | `org.apache.pdfbox.tools.TextToPDF.createPDFFromText` | `org.apache.pdfbox.pdmodel.common.PDRectangle.getWidth` | field | yes | ??
172  | `org.apache.pdfbox.tools.TextToPDF.createPDFFromText` | `org.apache.pdfbox.pdmodel.PDDocument.close` | parameter | no | -
173  | `org.apache.pdfbox.util.SmallMap.putAll` | `java.util.Map.size` | parameter | yes | P
174  | `org.apache.pdfbox.tools.ExtractImages$ImageGraphicsEngine.drawImage` | `org.apache.pdfbox.pdmodel.graphics.image.PDImage.isStencil` | parameter | yes | F (FNFE)
