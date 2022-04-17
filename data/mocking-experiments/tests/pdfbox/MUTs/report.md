| method-path | m-loc | invocation | field/param | primitive-params | primitive-return | n-loc | non-static | mockable |
|---|---|---|---|---|---|---|---|---|
| org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.getFontSetting() | 4 | dict.getDictionaryObject(COSName.FONT) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.action.PDURIDictionary.setBase(java.lang.String) | 1 | this.getCOSObject().setString("Base", base) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.action.PDURIDictionary.setBase(java.lang.String) | 1 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.schema.XMPMediaManagementSchema.setManageToProperty(org.apache.xmpbox.type.URIType) | 1 | addProperty(tt) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFAnnotation.getBorderEffect() | 2 | ((COSDictionary) (annot.getDictionaryObject(COSName.BE))) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink.getPreviousURI() | 3 | getCOSObject().getDictionaryObject("PA") | !C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink.getPreviousURI() | 3 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.getBorderEffect() | 2 | ((COSDictionary) (getCOSObject().getDictionaryObject(COSName.BE))) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.getBorderEffect() | 2 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle.getBorderEffect() | 2 | ((COSDictionary) (getCOSObject().getDictionaryObject(COSName.BE))) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle.getBorderEffect() | 2 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry.getSubDictionary() | 5 | isSubDictionary() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry.getSubDictionary() | 5 | dict.keySet() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry.getSubDictionary() | 5 | dict.getDictionaryObject(name) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry.getSubDictionary() | 5 | map.put(name, new PDAppearanceStream(((COSStream) (value)))) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.getSmoothnessTolerance() | 1 | getFloatItem(COSName.SM) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.xmpbox.schema.XMPMediaManagementSchema.setRenditionClassProperty(org.apache.xmpbox.type.RenditionClassType) | 1 | addProperty(tt) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.common.function.PDFunctionType0.setBitsPerSample(int) | 1 | getCOSObject().setInt(COSName.BITS_PER_SAMPLE, bps) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.common.function.PDFunctionType0.setBitsPerSample(int) | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.schema.DublinCoreSchema.getRightsLanguages() | 1 | getUnqualifiedLanguagePropertyLanguagesValue(RIGHTS) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.xmpbox.schema.XMPMediaManagementSchema.setInstanceID(java.lang.String) | 2 | ((URIType) (instanciateSimple(INSTANCEID, value))) | !C1 | !C2 | !C3 | 2 | C5 | false |
| org.apache.xmpbox.schema.XMPMediaManagementSchema.setInstanceID(java.lang.String) | 2 | setInstanceIDProperty(tt) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.xmpbox.type.ResourceEventType.setInstanceID(java.lang.String) | 1 | addSimpleProperty(INSTANCE_ID, value) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.xmpbox.type.ResourceRefType.setInstanceID(java.lang.String) | 1 | addSimpleProperty(INSTANCE_ID, value) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.xmpbox.type.ComplexPropertyContainer.containsProperty(org.apache.xmpbox.type.AbstractField) | 4 | getAllProperties().iterator() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.xmpbox.type.ComplexPropertyContainer.containsProperty(org.apache.xmpbox.type.AbstractField) | 4 | getAllProperties() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.type.ComplexPropertyContainer.containsProperty(org.apache.xmpbox.type.AbstractField) | 4 | it.hasNext() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.xmpbox.type.ComplexPropertyContainer.containsProperty(org.apache.xmpbox.type.AbstractField) | 4 | it.next() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.xmpbox.type.ComplexPropertyContainer.containsProperty(org.apache.xmpbox.type.AbstractField) | 4 | isSameProperty(tmp, property) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.xmpbox.schema.PhotoshopSchema.addDocumentAncestors(java.lang.String) | 1 | addQualifiedBagValue(DOCUMENT_ANCESTORS, text) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm.getFieldIterator() | 1 | new PDFieldTree(this).iterator() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDFontDescriptor.setLeading(float) | 1 | dic.setFloat(COSName.LEADING, leading) | C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.PDAbstractContentStream.setLeading(float) | 2 | writeOperand(leading) | !C1 | C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.PDAbstractContentStream.setLeading(float) | 2 | writeOperator(OperatorName.SET_TEXT_LEADING) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPageContentStream.setLeading(float) | 2 | writeOperand(leading) | !C1 | C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPageContentStream.setLeading(float) | 2 | writeOperator(OperatorName.SET_TEXT_LEADING) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.cos.COSDictionary.setBoolean(java.lang.String,boolean) | 1 | setItem(COSName.getPDFName(key), COSBoolean.getBoolean(value)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.cos.COSDictionary.setBoolean(java.lang.String,boolean) | 1 | COSName.getPDFName(key) | !C1 | !C2 | !C3 | 3 | !C5 | false |
| org.apache.pdfbox.cos.COSDictionary.setBoolean(java.lang.String,boolean) | 1 | COSBoolean.getBoolean(value) | !C1 | C2 | !C3 | 1 | !C5 | false |
| org.apache.pdfbox.cos.COSDictionary.setBoolean(org.apache.pdfbox.cos.COSName,boolean) | 1 | setItem(key, COSBoolean.getBoolean(value)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.cos.COSDictionary.setBoolean(org.apache.pdfbox.cos.COSName,boolean) | 1 | COSBoolean.getBoolean(value) | !C1 | C2 | !C3 | 1 | !C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.isPushButton() | 1 | getCOSObject().getFlag(COSName.FF, FLAG_PUSHBUTTON) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.isPushButton() | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.schema.XMPSchema.getAbstractProperty(java.lang.String) | 2 | getContainer().getAllProperties() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.schema.XMPSchema.getAbstractProperty(java.lang.String) | 2 | getContainer() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.schema.XMPSchema.getAbstractProperty(java.lang.String) | 2 | child.getPropertyName().equals(qualifiedName) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.xmpbox.schema.XMPSchema.getAbstractProperty(java.lang.String) | 2 | child.getPropertyName() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.text.TextPosition.getXDirAdj() | 1 | getXRot(getDir()) | !C1 | C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.text.TextPosition.getXDirAdj() | 1 | getDir() | !C1 | C2 | C3 | 2 | C5 | false |
| org.apache.fontbox.ttf.GlyfCompositeDescript.resolve() | 8 | LOG.error("Circular reference in GlyfCompositeDesc") | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.fontbox.ttf.GlyfCompositeDescript.resolve() | 8 | comp.setFirstIndex(firstIndex) | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.GlyfCompositeDescript.resolve() | 8 | comp.setFirstContour(firstContour) | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.GlyfCompositeDescript.resolve() | 8 | descriptions.get(comp.getGlyphIndex()) | C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.ttf.GlyfCompositeDescript.resolve() | 8 | comp.getGlyphIndex() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.GlyfCompositeDescript.resolve() | 8 | desc.resolve() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.fontbox.ttf.GlyfCompositeDescript.resolve() | 8 | desc.getPointCount() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.fontbox.ttf.GlyfCompositeDescript.resolve() | 8 | desc.getContourCount() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict.getMinimumRevision() | 1 | dictionary.getLong(COSName.V) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.reFocus() | 6 | searchField.requestFocus() | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.reFocus() | 6 | searchField.getText() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.reFocus() | 6 | searchField.setText(searchKey) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.reFocus() | 6 | searchField.setSelectionStart(0) | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.reFocus() | 6 | searchField.setSelectionEnd(searchField.getText().length()) | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.reFocus() | 6 | searchField.getText().length() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.reFocus() | 6 | searchField.getText() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.reFocus() | 6 | closeAction.setEnabled(true) | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.xmpbox.type.TypeMapping.isDefinedType(java.lang.String) | 1 | this.definedStructuredMappings.containsKey(name) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.xmpbox.type.ComplexPropertyContainer.removePropertiesByName(java.lang.String) | 4 | properties.isEmpty() | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.xmpbox.type.ComplexPropertyContainer.removePropertiesByName(java.lang.String) | 4 | getPropertiesByLocalName(localName) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.xmpbox.type.ComplexPropertyContainer.removePropertiesByName(java.lang.String) | 4 | properties.remove(field) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getRangeForComponent(int) | 3 | ((COSArray) (stream.getCOSObject().getDictionaryObject(COSName.RANGE))) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getRangeForComponent(int) | 3 | stream.getCOSObject() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getRangeForComponent(int) | 3 | rangeArray.size() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getRangeForComponent(int) | 3 | getNumberOfComponents() | !C1 | C2 | C3 | 2 | C5 | false |
| org.apache.xmpbox.schema.XMPSchema.addQualifiedBagValue(java.lang.String,java.lang.String) | 1 | internalAddBagValue(simpleName, bagValue) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDType3Font.getCharProcs() | 2 | dict.getCOSDictionary(COSName.CHAR_PROCS) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.text.PDFTextStripperByArea.extractRegions(org.apache.pdfbox.pdmodel.PDPage) | 2 | setStartPage(getCurrentPageNo()) | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.text.PDFTextStripperByArea.extractRegions(org.apache.pdfbox.pdmodel.PDPage) | 2 | getCurrentPageNo() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.text.PDFTextStripperByArea.extractRegions(org.apache.pdfbox.pdmodel.PDPage) | 2 | setEndPage(getCurrentPageNo()) | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.text.PDFTextStripperByArea.extractRegions(org.apache.pdfbox.pdmodel.PDPage) | 2 | getCurrentPageNo() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.text.PDFTextStripperByArea.extractRegions(org.apache.pdfbox.pdmodel.PDPage) | 2 | regionCharactersByArticle.add(new ArrayList<TextPosition>()) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.text.PDFTextStripperByArea.extractRegions(org.apache.pdfbox.pdmodel.PDPage) | 2 | regionCharacterList.put(regionName, regionCharactersByArticle) | C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.text.PDFTextStripperByArea.extractRegions(org.apache.pdfbox.pdmodel.PDPage) | 2 | regionText.put(regionName, new StringWriter()) | C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.text.PDFTextStripperByArea.extractRegions(org.apache.pdfbox.pdmodel.PDPage) | 2 | page.hasContents() | C1 | C2 | C3 | 3 | C5 | true |
| org.apache.pdfbox.text.PDFTextStripperByArea.extractRegions(org.apache.pdfbox.pdmodel.PDPage) | 2 | processPage(page) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.xmpbox.type.TypeMapping.instanciateStructuredType(org.apache.xmpbox.type.Types,java.lang.String) | 1 | type.getImplementingClass().asSubclass(AbstractStructuredType.class) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.xmpbox.type.TypeMapping.instanciateStructuredType(org.apache.xmpbox.type.Types,java.lang.String) | 1 | type.getImplementingClass() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.type.TypeMapping.instanciateStructuredType(org.apache.xmpbox.type.Types,java.lang.String) | 1 | propertyTypeClass.getDeclaredConstructor(XMPMetadata.class) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.xmpbox.type.TypeMapping.instanciateStructuredType(org.apache.xmpbox.type.Types,java.lang.String) | 1 | construct.newInstance(metadata) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.xmpbox.type.TypeMapping.instanciateStructuredType(org.apache.xmpbox.type.Types,java.lang.String) | 1 | tmp.setPropertyName(propertyName) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.examples.rendering.CustomGraphicsStreamEngine.fillPath(int) | 1 | System.out.println("fillPath") | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdfparser.PDFParser.getPDDocument() | 3 | getDocument() | !C1 | C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.pdfparser.PDFParser.getPDDocument() | 3 | getAccessPermission() | !C1 | C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.pdfparser.PDFParser.getPDDocument() | 3 | doc.setEncryptionDictionary(getEncryption()) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdfparser.PDFParser.getPDDocument() | 3 | getEncryption() | !C1 | C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.preflight.parser.PreflightParser.getPDDocument() | 2 | preflightDocument.setResult(validationResult) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | graphics.setComposite(getGraphicsState().getNonStrokingJavaComposite()) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | getGraphicsState().getNonStrokingJavaComposite() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | getGraphicsState() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | graphics.setPaint(getNonStrokingPaint()) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | getNonStrokingPaint() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | setClip() | !C1 | C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | linePath.setWindingRule(windingRule) | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | linePath.getBounds2D() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | isRectangular(linePath) | !C1 | !C2 | C3 | 8 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | bounds.getWidth() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | bounds.getHeight() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | graphics.getPaint() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | area.intersect(new Area(graphics.getClip())) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | graphics.getClip() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | intersectShadingBBox(getGraphicsState().getNonStrokingColor(), area) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | getGraphicsState().getNonStrokingColor() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | getGraphicsState() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | isContentRendered() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | graphics.fill(shape) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | linePath.reset() | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.rendering.PageDrawer.fillPath(int) | 12 | setRenderingHints() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.tools.ExtractImages$ImageGraphicsEngine.fillPath(int) | 1 | processColor(getGraphicsState().getNonStrokingColor()) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.tools.ExtractImages$ImageGraphicsEngine.fillPath(int) | 1 | getGraphicsState().getNonStrokingColor() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.tools.ExtractImages$ImageGraphicsEngine.fillPath(int) | 1 | getGraphicsState() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | textMatrix.getScaleY() | C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | textMatrix.getShearY() | C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | textMatrix.getShearX() | C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | textMatrix.getScaleX() | C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | Math.abs(b) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | Math.abs(c) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | Math.abs(b) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | Math.abs(d) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | Math.abs(c) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | Math.abs(a) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | Math.abs(a) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | Math.abs(c) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | Math.abs(d) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | Math.abs(a) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | Math.abs(d) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.text.TextPosition.getDir() | 2 | Math.abs(b) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.setAttribute(java.lang.String,org.apache.pdfbox.cos.COSBase) | 3 | this.getAttributeValue(attrName) | !C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.setAttribute(java.lang.String,org.apache.pdfbox.cos.COSBase) | 3 | this.getCOSObject().setItem(COSName.getPDFName(attrName), attrValue) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.setAttribute(java.lang.String,org.apache.pdfbox.cos.COSBase) | 3 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.setAttribute(java.lang.String,org.apache.pdfbox.cos.COSBase) | 3 | COSName.getPDFName(attrName) | !C1 | !C2 | !C3 | 3 | !C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.setAttribute(java.lang.String,org.apache.pdfbox.cos.COSBase) | 3 | this.potentiallyNotifyChanged(old, attrValue) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.xmpbox.type.AbstractField.setAttribute(org.apache.xmpbox.type.Attribute) | 2 | attributes.containsKey(value.getName()) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.xmpbox.type.AbstractField.setAttribute(org.apache.xmpbox.type.Attribute) | 2 | value.getName() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.type.AbstractField.setAttribute(org.apache.xmpbox.type.Attribute) | 2 | attributes.remove(value.getName()) | C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.xmpbox.type.AbstractField.setAttribute(org.apache.xmpbox.type.Attribute) | 2 | value.getName() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.type.AbstractField.setAttribute(org.apache.xmpbox.type.Attribute) | 2 | attributes.put(value.getName(), value) | C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.xmpbox.type.AbstractField.setAttribute(org.apache.xmpbox.type.Attribute) | 2 | value.getName() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement.getElementIdentifier() | 1 | this.getCOSObject().getString(COSName.ID) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement.getElementIdentifier() | 1 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDFontDescriptor.setStemV(float) | 1 | dic.setFloat(COSName.STEM_V, stemV) | C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.util.Matrix.multiply(org.apache.pdfbox.util.Matrix) | 1 | multiply(other, new Matrix()) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions.setVisualSignature(java.io.File) | 1 | initFromRandomAccessRead(new RandomAccessBufferedFileInputStream(file)) | !C1 | !C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions.setVisualSignature(java.io.InputStream) | 1 | initFromRandomAccessRead(new RandomAccessBuffer(is)) | !C1 | !C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions.setVisualSignature(org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties) | 1 | setVisualSignature(visSignatureProperties.getVisibleSignature()) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions.setVisualSignature(org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties) | 1 | visSignatureProperties.getVisibleSignature() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDFontDescriptor.setStemH(float) | 1 | dic.setFloat(COSName.STEM_H, stemH) | C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocumentInformation.getCreator() | 1 | info.getString(COSName.CREATOR) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDRectangle.getLowerLeftX() | 1 | ((COSNumber) (rectArray.get(0))).floatValue() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDRectangle.getLowerLeftX() | 1 | ((COSNumber) (rectArray.get(0))) | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDRectangle.getLowerLeftY() | 1 | ((COSNumber) (rectArray.get(1))).floatValue() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDRectangle.getLowerLeftY() | 1 | ((COSNumber) (rectArray.get(1))) | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDListBox.getTopIndex() | 1 | getCOSObject().getInt(COSName.TI, 0) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDListBox.getTopIndex() | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFPage.getTemplates() | 4 | ((COSArray) (page.getDictionaryObject(COSName.TEMPLATES))) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFPage.getTemplates() | 4 | array.size() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFPage.getTemplates() | 4 | array.size() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFPage.getTemplates() | 4 | objects.add(new FDFTemplate(((COSDictionary) (array.getObject(i))))) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFPage.getTemplates() | 4 | ((COSDictionary) (array.getObject(i))) | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead.setThread(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThread) | 1 | bead.setItem("T", thread) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.xmpbox.schema.XMPBasicSchema.setCreateDate(java.util.Calendar) | 2 | ((DateType) (instanciateSimple(CREATEDATE, date))) | !C1 | !C2 | !C3 | 2 | C5 | false |
| org.apache.xmpbox.schema.XMPBasicSchema.setCreateDate(java.util.Calendar) | 2 | setCreateDateProperty(tt) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference.setFileSpecification(org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) | 1 | ref.setItem(COSName.F, fs) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.PDAbstractContentStream.setHorizontalScaling(float) | 2 | writeOperand(scale) | !C1 | C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.PDAbstractContentStream.setHorizontalScaling(float) | 2 | writeOperator(OperatorName.SET_TEXT_HORIZONTAL_SCALING) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPageContentStream.setHorizontalScaling(float) | 2 | writeOperand(scale) | !C1 | C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPageContentStream.setHorizontalScaling(float) | 2 | writeOperator(OperatorName.SET_TEXT_HORIZONTAL_SCALING) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFDocument.save(java.io.File) | 1 | save(new FileOutputStream(fileName)) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFDocument.save(java.lang.String) | 1 | save(new FileOutputStream(fileName)) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFDocument.save(java.io.OutputStream) | 2 | writer.write(this) | !C1 | !C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFDocument.save(java.io.OutputStream) | 2 | writer.close() | !C1 | C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFDocument.save(java.io.OutputStream) | 2 | writer.close() | !C1 | C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocument.save(java.lang.String) | 1 | save(new File(fileName)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocument.save(java.io.File) | 1 | save(new BufferedOutputStream(new FileOutputStream(file))) | !C1 | !C2 | C3 | 5 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocument.save(java.io.OutputStream) | 5 | document.isClosed() | C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocument.save(java.io.OutputStream) | 5 | font.subset() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocument.save(java.io.OutputStream) | 5 | fontsToSubset.clear() | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.pdmodel.PDDocument.save(java.io.OutputStream) | 5 | writer.write(this) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocument.save(java.io.OutputStream) | 5 | writer.close() | !C1 | C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.debugger.ui.RecentFiles.removeFile(java.lang.String) | 1 | filePaths.contains(path) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.debugger.ui.RecentFiles.removeFile(java.lang.String) | 1 | filePaths.remove(path) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocumentCatalog.getPageMode() | 2 | root.getNameAsString(COSName.PAGE_MODE) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocumentCatalog.getPageMode() | 2 | PageMode.fromString(mode) | !C1 | !C2 | !C3 | 2 | !C5 | false |
| org.apache.xmpbox.schema.DublinCoreSchema.addRelation(java.lang.String) | 1 | addQualifiedBagValue(RELATION, text) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueCertificate.setURLRequired(boolean) | 1 | dictionary.setFlag(COSName.FF, FLAG_URL, flag) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType0.codeToGID(int) | 2 | codeToCID(code) | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType0.codeToGID(int) | 2 | cidFont.getCharset().getGIDForCID(cid) | !C1 | C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType0.codeToGID(int) | 2 | cidFont.getCharset() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID(int) | 1 | LOG.warn("Using non-embedded GIDs in font " + getName()) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID(int) | 1 | getName() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID(int) | 1 | codeToCID(code) | !C1 | C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID(int) | 1 | parent.toUnicode(code) | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID(int) | 1 | noMapping.contains(code) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID(int) | 1 | noMapping.add(code) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID(int) | 1 | LOG.warn((("Failed to find a character mapping for " + code) + " in ") + getName()) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID(int) | 1 | getName() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID(int) | 1 | codeToCID(code) | !C1 | C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID(int) | 1 | unicode.length() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID(int) | 1 | LOG.warn("Trying to map multi-byte character using 'cmap', result will be poor") | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID(int) | 1 | cmap.getGlyphId(unicode.codePointAt(0)) | C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID(int) | 1 | unicode.codePointAt(0) | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID(int) | 1 | codeToCID(code) | !C1 | C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDFontType2.codeToGID(int) | 1 | ttf.getNumberOfGlyphs() | C1 | C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | extractCmapTable() | !C1 | C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | isSymbolic() | !C1 | C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | encoding.getName(code) | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | ".notdef".equals(name) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | GlyphList.getAdobeGlyphList().toUnicode(name) | !C1 | !C2 | !C3 | 6 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | GlyphList.getAdobeGlyphList() | !C1 | C2 | !C3 | 1 | !C5 | false |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | unicode.codePointAt(0) | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | cmapWinUnicode.getGlyphId(uni) | C1 | C2 | C3 | 2 | C5 | true |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | INVERTED_MACOS_ROMAN.get(name) | C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | cmapMacRoman.getGlyphId(macCode) | C1 | C2 | C3 | 2 | C5 | true |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | ttf.nameToGID(name) | C1 | !C2 | C3 | 5 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | encoding.getName(code) | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | ".notdef".equals(name) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | GlyphList.getAdobeGlyphList().toUnicode(name) | !C1 | !C2 | !C3 | 6 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | GlyphList.getAdobeGlyphList() | !C1 | C2 | !C3 | 1 | !C5 | false |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | unicode.codePointAt(0) | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | cmapWinUnicode.getGlyphId(uni) | C1 | C2 | C3 | 2 | C5 | true |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | cmapWinUnicode.getGlyphId(code) | C1 | C2 | C3 | 2 | C5 | true |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | cmapWinSymbol.getGlyphId(code) | C1 | C2 | C3 | 2 | C5 | true |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | cmapWinSymbol.getGlyphId(code + START_RANGE_F000) | C1 | C2 | C3 | 2 | C5 | true |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | cmapWinSymbol.getGlyphId(code + START_RANGE_F100) | C1 | C2 | C3 | 2 | C5 | true |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | cmapWinSymbol.getGlyphId(code + START_RANGE_F200) | C1 | C2 | C3 | 2 | C5 | true |
| org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID(int) | 4 | cmapMacRoman.getGlyphId(code) | C1 | C2 | C3 | 2 | C5 | true |
| org.apache.pdfbox.pdmodel.font.PDType0Font.codeToGID(int) | 1 | descendantFont.codeToGID(code) | C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.debugger.treestatus.TreeStatus.getPathForString(java.lang.String) | 1 | generatePath(statusString) | !C1 | !C2 | !C3 | 6 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocumentCatalog.getThreads() | 5 | ((COSArray) (root.getDictionaryObject(COSName.THREADS))) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocumentCatalog.getThreads() | 5 | root.setItem(COSName.THREADS, array) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocumentCatalog.getThreads() | 5 | array.size() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocumentCatalog.getThreads() | 5 | pdObjects.add(new PDThread(((COSDictionary) (array.getObject(i))))) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocumentCatalog.getThreads() | 5 | ((COSDictionary) (array.getObject(i))) | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDStream.setDecodedStreamLength(int) | 1 | this.stream.setInt(COSName.DL, decodedStreamLength) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFAnnotation.getOpacity() | 1 | annot.getFloat(COSName.CA, 1.0F) | C1 | !C2 | C3 | 4 | C5 | false |
| org.apache.xmpbox.schema.XMPRightsManagementSchema.getMarkedProperty() | 1 | ((BooleanType) (getProperty(MARKED))) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.setPaddings(float[]) | 1 | this.setArrayOfNumber(PADDING, paddings) | !C1 | !C2 | C3 | 6 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.AccessPermission.setCanExtractContent(boolean) | 1 | setPermissionBit(EXTRACT_BIT, allowExtraction) | !C1 | C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFAnnotation.setRectangle(org.apache.pdfbox.pdmodel.common.PDRectangle) | 1 | annot.setItem(COSName.RECT, rectangle) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation.setRectangle(org.apache.pdfbox.pdmodel.common.PDRectangle) | 1 | dictionary.setItem(COSName.RECT, rectangle.getCOSArray()) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation.setRectangle(org.apache.pdfbox.pdmodel.common.PDRectangle) | 1 | rectangle.getCOSArray() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead.setRectangle(org.apache.pdfbox.pdmodel.common.PDRectangle) | 1 | bead.setItem(COSName.R, rect) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.PublicKeyProtectionPolicy.getRecipientsIterator() | 1 | recipients.iterator() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary.getNormalAppearance() | 3 | dictionary.getDictionaryObject(COSName.N) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDFontDescriptor.getFontStretch() | 4 | ((COSName) (dic.getDictionaryObject(COSName.FONT_STRETCH))) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDFontDescriptor.getFontStretch() | 4 | name.getName() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.TrueTypeFont.getUnitsPerEm() | 2 | getHeader() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.TrueTypeFont.getUnitsPerEm() | 2 | header.getUnitsPerEm() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.PDEncryption.getRecipientsLength() | 2 | ((COSArray) (dictionary.getItem(COSName.RECIPIENTS))) | C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.PDEncryption.getRecipientsLength() | 2 | array.size() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocumentCatalog.setDocumentOutline(org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline) | 1 | root.setItem(COSName.OUTLINES, outlines) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary.getDecimalSeparator() | 1 | this.getCOSObject().getString("RD", ".") | !C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary.getDecimalSeparator() | 1 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.schema.XMPSchema.getDatePropertyValueAsSimple(java.lang.String) | 1 | this.getDatePropertyValue(simpleName) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.util.List) | 2 | values.isEmpty() | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.util.List) | 2 | isMultiSelect() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.util.List) | 2 | getOptions().containsAll(values) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.util.List) | 2 | getOptions() | !C1 | C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.util.List) | 2 | getCOSObject().setItem(COSName.V, COSArrayList.convertStringListToCOSStringCOSArray(values)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.util.List) | 2 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.util.List) | 2 | COSArrayList.convertStringListToCOSStringCOSArray(values) | !C1 | !C2 | !C3 | 3 | !C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.util.List) | 2 | updateSelectedOptionsIndex(values) | !C1 | !C2 | C3 | 5 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.util.List) | 2 | getCOSObject().removeItem(COSName.V) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.util.List) | 2 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.util.List) | 2 | getCOSObject().removeItem(COSName.I) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.util.List) | 2 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.util.List) | 2 | applyChange() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.cos.COSString.setValue(byte[]) | 1 | value.clone() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.xmpbox.type.RealType.setValue(java.lang.Object) | 1 | Float.valueOf(((String) (value))) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.pdfbox.util.SmallMap$SmallMapEntry.setValue(java.lang.Object) | 4 | getValue() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty.setValue(org.apache.pdfbox.cos.COSBase) | 2 | this.potentiallyNotifyChanged(this.getValue(), value) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty.setValue(org.apache.pdfbox.cos.COSBase) | 2 | this.getValue() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty.setValue(org.apache.pdfbox.cos.COSBase) | 2 | this.getCOSObject().setItem(COSName.V, value) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty.setValue(org.apache.pdfbox.cos.COSBase) | 2 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFField.setValue(java.lang.Object) | 3 | COSArrayList.convertStringListToCOSStringCOSArray(((List<String>) (value))) | !C1 | !C2 | !C3 | 3 | !C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFField.setValue(java.lang.Object) | 3 | ((COSObjectable) (value)).getCOSObject() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFField.setValue(java.lang.Object) | 3 | field.setItem(COSName.V, cos) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.xmpbox.type.BooleanType.setValue(java.lang.Object) | 1 | value.toString().trim().toUpperCase() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.xmpbox.type.BooleanType.setValue(java.lang.Object) | 1 | value.toString().trim() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.xmpbox.type.BooleanType.setValue(java.lang.Object) | 1 | value.toString() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.xmpbox.type.BooleanType.setValue(java.lang.Object) | 1 | "TRUE".equals(s) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.xmpbox.type.BooleanType.setValue(java.lang.Object) | 1 | "FALSE".equals(s) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFField.setValue(org.apache.pdfbox.cos.COSBase) | 1 | field.setItem(COSName.V, value) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDTextField.setValue(java.lang.String) | 2 | getCOSObject().setString(COSName.V, value) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDTextField.setValue(java.lang.String) | 2 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDTextField.setValue(java.lang.String) | 2 | applyChange() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.xmpbox.type.IntegerType.setValue(java.lang.Object) | 1 | Integer.parseInt(((String) (value))) | !C1 | !C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField.setValue(java.lang.String) | 1 | getCOSObject().setString(COSName.V, value) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField.setValue(java.lang.String) | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(java.lang.String) | 4 | checkValue(value) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(java.lang.String) | 4 | getExportValues().size() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(java.lang.String) | 4 | getExportValues() | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(java.lang.String) | 4 | updateByOption(value) | !C1 | !C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(java.lang.String) | 4 | updateByValue(value) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(java.lang.String) | 4 | applyChange() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField.setValue(org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature) | 2 | getCOSObject().setItem(COSName.V, value) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField.setValue(org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature) | 2 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField.setValue(org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature) | 2 | applyChange() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.xmpbox.type.DateType.setValue(java.lang.Object) | 1 | isGoodType(value) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.xmpbox.type.DateType.setValue(java.lang.Object) | 1 | value.getClass() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.xmpbox.type.DateType.setValue(java.lang.Object) | 1 | setValueFromString(((String) (value))) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.xmpbox.type.DateType.setValue(java.lang.Object) | 1 | setValueFromCalendar(((Calendar) (value))) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField.setValue(org.apache.pdfbox.cos.COSBase) | 1 | getCOSObject().setItem(COSName.V, object) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField.setValue(org.apache.pdfbox.cos.COSBase) | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(int) | 3 | getExportValues().isEmpty() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(int) | 3 | getExportValues() | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(int) | 3 | getExportValues().size() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(int) | 3 | getExportValues() | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(int) | 3 | getFullyQualifiedName() | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(int) | 3 | getExportValues().size() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(int) | 3 | getExportValues() | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(int) | 3 | updateByValue(String.valueOf(index)) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(int) | 3 | String.valueOf(index) | !C1 | C2 | !C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.setValue(int) | 3 | applyChange() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.lang.String) | 3 | getCOSObject().setString(COSName.V, value) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.lang.String) | 3 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.lang.String) | 3 | setSelectedOptionsIndex(null) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.setValue(java.lang.String) | 3 | applyChange() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.GroupGraphics.drawLine(int,int,int,int) | 2 | groupG2D.drawLine(x1, y1, x2, y2) | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.rendering.GroupGraphics.drawLine(int,int,int,int) | 2 | alphaG2D.drawLine(x1, y1, x2, y2) | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.xmpbox.schema.XMPMediaManagementSchema.setRenditionClass(java.lang.String) | 2 | ((RenditionClassType) (instanciateSimple(RENDITIONCLASS, value))) | !C1 | !C2 | !C3 | 2 | C5 | false |
| org.apache.xmpbox.schema.XMPMediaManagementSchema.setRenditionClass(java.lang.String) | 2 | setRenditionClassProperty(tt) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.xmpbox.type.ResourceRefType.setRenditionClass(java.lang.String) | 1 | addSimpleProperty(RENDITION_CLASS, value) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.fontbox.cff.CFFFont.getFontBBox() | 2 | ((List<Number>) (topDict.get("FontBBox"))) | C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.ttf.TrueTypeFont.getFontBBox() | 7 | getHeader() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.TrueTypeFont.getFontBBox() | 7 | headerTable.getXMin() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.TrueTypeFont.getFontBBox() | 7 | headerTable.getXMax() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.TrueTypeFont.getFontBBox() | 7 | headerTable.getYMin() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.TrueTypeFont.getFontBBox() | 7 | headerTable.getYMax() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.TrueTypeFont.getFontBBox() | 7 | getUnitsPerEm() | !C1 | C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDType3Font.getFontBBox() | 4 | dict.getDictionaryObject(COSName.FONT_BBOX) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead.getThread() | 4 | ((COSDictionary) (bead.getDictionaryObject("T"))) | C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent.getBBox() | 4 | ((COSArray) (this.getProperties().getDictionaryObject(COSName.BBOX))) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent.getBBox() | 4 | this.getProperties() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.getBBox() | 3 | ((COSArray) (this.getCOSObject().getDictionaryObject(BBOX))) | !C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.getBBox() | 3 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDType3CharProc.getBBox() | 1 | font.getFontBBox() | C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject.getBBox() | 4 | ((COSArray) (getCOSObject().getDictionaryObject(COSName.BBOX))) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject.getBBox() | 4 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern.getBBox() | 4 | getCOSObject().getDictionaryObject(COSName.BBOX) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern.getBBox() | 4 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.PDShading.getBBox() | 2 | ((COSArray) (dictionary.getDictionaryObject(COSName.BBOX))) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary.getBBox() | 3 | this.getCOSObject().getDictionaryObject(COSName.BBOX) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary.getBBox() | 3 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPage.getBBox() | 1 | getCropBox() | !C1 | C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.prepress.PDBoxStyle.getLineDashPattern() | 7 | ((COSArray) (dictionary.getDictionaryObject(COSName.D))) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.prepress.PDBoxStyle.getLineDashPattern() | 7 | d.add(COSInteger.THREE) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.prepress.PDBoxStyle.getLineDashPattern() | 7 | dictionary.setItem(COSName.D, d) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.prepress.PDBoxStyle.getLineDashPattern() | 7 | lineArray.add(d) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.getLineDashPattern() | 4 | dict.getDictionaryObject(COSName.D) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.getLineDashPattern() | 4 | ((COSArray) (dp)).size() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.getLineDashPattern() | 4 | ((COSArray) (dp)).getObject(0) | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.getLineDashPattern() | 4 | ((COSArray) (dp)).getObject(1) | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.getLineDashPattern() | 4 | ((COSNumber) (phase)).intValue() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.fitWindow() | 1 | prefs.getBoolean(COSName.FIT_WINDOW, false) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdfwriter.COSWriter.visitFromName(org.apache.pdfbox.cos.COSName) | 2 | obj.writePDF(getStandardOutput()) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdfwriter.COSWriter.visitFromName(org.apache.pdfbox.cos.COSName) | 2 | getStandardOutput() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference.getMCID() | 1 | this.getCOSObject().getInt(COSName.MCID) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference.getMCID() | 1 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent.getMCID() | 1 | this.getProperties() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent.getMCID() | 1 | this.getProperties().getInt(COSName.MCID) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent.getMCID() | 1 | this.getProperties() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.debugger.ui.PDFTreeModel.isLeaf(java.lang.Object) | 1 | isLeaf(((MapEntry) (node)).getValue()) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.debugger.ui.PDFTreeModel.isLeaf(java.lang.Object) | 1 | ((MapEntry) (node)).getValue() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.debugger.ui.PDFTreeModel.isLeaf(java.lang.Object) | 1 | isLeaf(((ArrayEntry) (node)).getValue()) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.debugger.ui.PDFTreeModel.isLeaf(java.lang.Object) | 1 | ((ArrayEntry) (node)).getValue() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.cos.COSArray.toFloatArray() | 3 | size() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.cos.COSArray.toFloatArray() | 3 | size() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.cos.COSArray.toFloatArray() | 3 | getObject(i) | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.cos.COSArray.toFloatArray() | 3 | ((COSNumber) (base)).floatValue() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.contentstream.PDFStreamEngine.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 1 | processTransparencyGroup(form) | !C1 | !C2 | C3 | 16 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | isHiddenOCG(form.getOptionalContent()) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | form.getOptionalContent() | C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | isContentRendered() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | getGraphicsState().getCurrentTransformationMatrix() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | getGraphicsState() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | group.getImage() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | graphics.setComposite(getGraphicsState().getNonStrokingJavaComposite()) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | getGraphicsState().getNonStrokingJavaComposite() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | getGraphicsState() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | setClip() | !C1 | C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | group.getBBox() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | graphics.getTransform() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | Math.abs(m.getScalingFactorX()) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | m.getScalingFactorX() | !C1 | C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | Math.abs(m.getScalingFactorY()) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | m.getScalingFactorY() | !C1 | C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | transform.scale(1.0 / xScale, 1.0 / yScale) | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | graphics.setTransform(transform) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | bbox.getLowerLeftX() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | pageSize.getLowerLeftX() | C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | pageSize.getUpperRightY() | C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | bbox.getUpperRightY() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | graphics.translate(0, image.getHeight()) | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | image.getHeight() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | graphics.scale(1, -1) | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | graphics.translate(x * xScale, y * yScale) | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | getGraphicsState().getSoftMask() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | getGraphicsState() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | image.getWidth() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | image.getHeight() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | applySoftMaskToPaint(awtPaint, softMask) | !C1 | !C2 | !C3 | 12 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | graphics.setPaint(awtPaint) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | isContentRendered() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | graphics.fill(new Rectangle2D.Float(0, 0, bbox.getWidth() * xScale, bbox.getHeight() * yScale)) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | bbox.getWidth() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | bbox.getHeight() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | isContentRendered() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | graphics.drawImage(image, null, null) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | LOG.error("Exception drawing image, see JDK-6689349, " + "try rendering into a BufferedImage instead", ie) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.rendering.PageDrawer.showTransparencyGroup(org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup) | 21 | graphics.setTransform(savedTransform) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFAnnotation.isLocked() | 1 | annot.getFlag(COSName.F, FLAG_LOCKED) | C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation.isLocked() | 1 | getCOSObject().getFlag(COSName.F, FLAG_LOCKED) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation.isLocked() | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.schema.XMPBasicSchema.setModifierDate(java.util.Calendar) | 2 | ((DateType) (instanciateSimple(MODIFIER_DATE, date))) | !C1 | !C2 | !C3 | 2 | C5 | false |
| org.apache.xmpbox.schema.XMPBasicSchema.setModifierDate(java.util.Calendar) | 2 | setModifierDateProperty(tt) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.debugger.hexviewer.HexPane.addHexChangeListeners(org.apache.pdfbox.debugger.hexviewer.HexChangeListener) | 1 | hexChangeListeners.add(listener) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFField.setSetWidgetFieldFlags(java.lang.Integer) | 3 | COSInteger.get(ff) | !C1 | C2 | !C3 | 2 | !C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFField.setSetWidgetFieldFlags(java.lang.Integer) | 3 | field.setItem(COSName.SET_F, value) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFField.setSetWidgetFieldFlags(int) | 1 | field.setInt(COSName.SET_F, ff) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.setPlacement(java.lang.String) | 1 | this.setName(PLACEMENT, placement) | !C1 | !C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField.getFieldType() | 1 | getCOSObject().getNameAsString(COSName.FT) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField.getFieldType() | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDTerminalField.getFieldType() | 3 | getCOSObject().getNameAsString(COSName.FT) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDTerminalField.getFieldType() | 3 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDTerminalField.getFieldType() | 3 | getParent() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDTerminalField.getFieldType() | 3 | getParent().getFieldType() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDTerminalField.getFieldType() | 3 | getParent() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.schema.XMPRightsManagementSchema.getWebStatementProperty() | 1 | ((TextType) (getProperty(WEBSTATEMENT))) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.debugger.PDFDebugger$3.importData(javax.swing.TransferHandler$TransferSupport) | 2 | transferSupport.getTransferable() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.debugger.PDFDebugger$3.importData(javax.swing.TransferHandler$TransferSupport) | 2 | ((List<File>) (transferable.getTransferData(DataFlavor.javaFileListFlavor))) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.debugger.PDFDebugger$3.importData(javax.swing.TransferHandler$TransferSupport) | 2 | readPDFFile(files.get(0), "") | !C1 | !C2 | C3 | 11 | C5 | false |
| org.apache.pdfbox.debugger.PDFDebugger$3.importData(javax.swing.TransferHandler$TransferSupport) | 2 | files.get(0) | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.debugger.PDFDebugger$3.importData(javax.swing.TransferHandler$TransferSupport) | 2 | new ErrorDialog(e).setVisible(true) | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.xmpbox.schema.DublinCoreSchema.setFormat(java.lang.String) | 1 | addProperty(createTextType(FORMAT, mimeType)) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.xmpbox.schema.DublinCoreSchema.setFormat(java.lang.String) | 1 | createTextType(FORMAT, mimeType) | !C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.type.ThumbnailType.setFormat(java.lang.String) | 1 | addSimpleProperty(FORMAT, format) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueCertificate.addOID(byte[]) | 4 | dictionary.getCOSArray(COSName.OID) | C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueCertificate.addOID(byte[]) | 4 | array.add(new COSString(oid)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueCertificate.addOID(byte[]) | 4 | dictionary.setItem(COSName.OID, array) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement.getParent() | 3 | this.getCOSObject().getDictionaryObject(COSName.P) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement.getParent() | 3 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement.getParent() | 3 | PDStructureNode.create(((COSDictionary) (base))) | !C1 | !C2 | !C3 | 4 | !C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup.getParent() | 3 | ((PDAnnotationMarkup) (PDAnnotation.createAnnotation(getCOSObject().getDictionaryObject(COSName.PARENT, COSName.P)))) | !C1 | !C2 | !C3 | 3 | !C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup.getParent() | 3 | getCOSObject().getDictionaryObject(COSName.PARENT, COSName.P) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup.getParent() | 3 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThread.setThreadInfo(org.apache.pdfbox.pdmodel.PDDocumentInformation) | 1 | thread.setItem("I", info) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference.setReferencedObject(org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) | 1 | this.getCOSObject().setItem(COSName.OBJ, annotation) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference.setReferencedObject(org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) | 1 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference.setReferencedObject(org.apache.pdfbox.pdmodel.graphics.PDXObject) | 1 | this.getCOSObject().setItem(COSName.OBJ, xobject) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference.setReferencedObject(org.apache.pdfbox.pdmodel.graphics.PDXObject) | 1 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDStream.setMetadata(org.apache.pdfbox.pdmodel.common.PDMetadata) | 1 | stream.setItem(COSName.METADATA, meta) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.setMetadata(org.apache.pdfbox.cos.COSStream) | 1 | stream.getCOSObject().setItem(COSName.METADATA, metadata) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.setMetadata(org.apache.pdfbox.cos.COSStream) | 1 | stream.getCOSObject() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.setMetadata(org.apache.pdfbox.pdmodel.common.PDMetadata) | 1 | getCOSObject().setItem(COSName.METADATA, meta) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.setMetadata(org.apache.pdfbox.pdmodel.common.PDMetadata) | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocumentCatalog.setMetadata(org.apache.pdfbox.pdmodel.common.PDMetadata) | 1 | root.setItem(COSName.METADATA, meta) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPage.setMetadata(org.apache.pdfbox.pdmodel.common.PDMetadata) | 1 | page.setItem(COSName.METADATA, meta) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.computeEncryptedKey(byte[],byte[],byte[],byte[],byte[],int,byte[],int,int,boolean,boolean) | 1 | computeEncryptedKeyRev56(password, isOwnerPassword, o, u, oe, ue, encRevision) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.computeEncryptedKey(byte[],byte[],byte[],byte[],byte[],int,byte[],int,int,boolean,boolean) | 1 | computeEncryptedKeyRev234(password, o, permissions, id, encryptMetadata, keyLengthInBytes, encRevision) | !C1 | !C2 | !C3 | 15 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.SecurityHandler.decrypt(org.apache.pdfbox.cos.COSBase,long,long) | 2 | objects.contains(obj) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.SecurityHandler.decrypt(org.apache.pdfbox.cos.COSBase,long,long) | 2 | objects.add(obj) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.SecurityHandler.decrypt(org.apache.pdfbox.cos.COSBase,long,long) | 2 | decryptString(((COSString) (obj)), objNum, genNum) | !C1 | !C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.SecurityHandler.decrypt(org.apache.pdfbox.cos.COSBase,long,long) | 2 | objects.contains(obj) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.SecurityHandler.decrypt(org.apache.pdfbox.cos.COSBase,long,long) | 2 | objects.add(obj) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.SecurityHandler.decrypt(org.apache.pdfbox.cos.COSBase,long,long) | 2 | decryptStream(((COSStream) (obj)), objNum, genNum) | !C1 | !C2 | C3 | 10 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.SecurityHandler.decrypt(org.apache.pdfbox.cos.COSBase,long,long) | 2 | decryptDictionary(((COSDictionary) (obj)), objNum, genNum) | !C1 | !C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.SecurityHandler.decrypt(org.apache.pdfbox.cos.COSBase,long,long) | 2 | decryptArray(((COSArray) (obj)), objNum, genNum) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.setGlyphOrientationVertical(java.lang.String) | 1 | this.setName(GLYPH_ORIENTATION_VERTICAL, glyphOrientationVertical) | !C1 | !C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN.getNumberOfComponents() | 1 | getColorantNames().size() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN.getNumberOfComponents() | 1 | getColorantNames() | !C1 | C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getNumberOfComponents() | 2 | stream.getCOSObject().getInt(COSName.N) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getNumberOfComponents() | 2 | stream.getCOSObject() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getNumberOfComponents() | 2 | iccProfile.getNumComponents() | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.getNumberOfComponents() | 2 | LOG.warn(((("Using " + numIccComponents) + " components from ICC profile info instead of ") + numberOfComponents) + " components from /N entry") | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDJPXColorSpace.getNumberOfComponents() | 1 | awtColorSpace.getNumComponents() | C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern.getContents() | 3 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern.getContents() | 3 | ((COSStream) (getCOSObject())).createInputStream() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern.getContents() | 3 | ((COSStream) (getCOSObject())) | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFAnnotation.getContents() | 1 | annot.getString(COSName.CONTENTS) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDType3CharProc.getContents() | 1 | charStream.createInputStream() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject.getContents() | 1 | getCOSObject().createInputStream() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject.getContents() | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation.getContents() | 1 | dictionary.getString(COSName.CONTENTS) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.getContents() | 3 | dictionary.getDictionaryObject(COSName.CONTENTS) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.getContents() | 3 | ((COSString) (base)).getBytes() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.getContents(java.io.InputStream) | 4 | getByteRange() | !C1 | C2 | !C3 | 5 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.getContents(java.io.InputStream) | 4 | getConvertedContents(new COSFilterInputStream(pdfFile, new int[]{ begin, len })) | !C1 | !C2 | !C3 | 6 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.getContents(byte[]) | 4 | getByteRange() | !C1 | C2 | !C3 | 5 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.getContents(byte[]) | 4 | getConvertedContents(new ByteArrayInputStream(pdfFile, begin, len)) | !C1 | !C2 | !C3 | 6 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPage.getContents() | 3 | page.getDictionaryObject(COSName.CONTENTS) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPage.getContents() | 3 | ((COSStream) (base)).createInputStream() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPage.getContents() | 3 | ((COSArray) (base)).size() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPage.getContents() | 3 | streams.size() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPage.getContents() | 3 | streams.getObject(i) | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPage.getContents() | 3 | inputStreams.add(stream.createInputStream()) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPage.getContents() | 3 | stream.createInputStream() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPage.getContents() | 3 | inputStreams.add(new ByteArrayInputStream(delimiter)) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPage.getContents() | 3 | Collections.enumeration(inputStreams) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.setFlatnessTolerance(java.lang.Float) | 1 | setFloatItem(COSName.FL, flatness) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.ShadedTriangle.calcColor(java.awt.geom.Point2D) | 4 | ((int) (Math.round(p.getX()))) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.ShadedTriangle.calcColor(java.awt.geom.Point2D) | 4 | p.getX() | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.pdmodel.graphics.shading.ShadedTriangle.calcColor(java.awt.geom.Point2D) | 4 | ((int) (Math.round(p.getY()))) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.ShadedTriangle.calcColor(java.awt.geom.Point2D) | 4 | p.getY() | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.pdmodel.graphics.shading.ShadedTriangle.calcColor(java.awt.geom.Point2D) | 4 | line.calcColor(tp) | C1 | !C2 | !C3 | 5 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.ShadedTriangle.calcColor(java.awt.geom.Point2D) | 4 | getArea(p, corner[1], corner[2]) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.ShadedTriangle.calcColor(java.awt.geom.Point2D) | 4 | getArea(p, corner[2], corner[0]) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.ShadedTriangle.calcColor(java.awt.geom.Point2D) | 4 | getArea(p, corner[0], corner[1]) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDField.setAlternateFieldName(java.lang.String) | 1 | dictionary.setString(COSName.TU, alternateFieldName) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.preflight.process.reflect.ExtGStateValidationProcess.extractExtGStateDictionaries(org.apache.pdfbox.preflight.PreflightContext,org.apache.pdfbox.cos.COSDictionary) | 5 | context.getDocument().getDocument() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.preflight.process.reflect.ExtGStateValidationProcess.extractExtGStateDictionaries(org.apache.pdfbox.preflight.PreflightContext,org.apache.pdfbox.cos.COSDictionary) | 5 | context.getDocument() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.preflight.process.reflect.ExtGStateValidationProcess.extractExtGStateDictionaries(org.apache.pdfbox.preflight.PreflightContext,org.apache.pdfbox.cos.COSDictionary) | 5 | COSUtils.getAsDictionary(egsEntry, cosDocument) | !C1 | !C2 | !C3 | 1 | !C5 | false |
| org.apache.pdfbox.preflight.process.reflect.ExtGStateValidationProcess.extractExtGStateDictionaries(org.apache.pdfbox.preflight.PreflightContext,org.apache.pdfbox.cos.COSDictionary) | 5 | extGStates.keySet() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.preflight.process.reflect.ExtGStateValidationProcess.extractExtGStateDictionaries(org.apache.pdfbox.preflight.PreflightContext,org.apache.pdfbox.cos.COSDictionary) | 5 | extGStates.getItem(key) | !C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.preflight.process.reflect.ExtGStateValidationProcess.extractExtGStateDictionaries(org.apache.pdfbox.preflight.PreflightContext,org.apache.pdfbox.cos.COSDictionary) | 5 | COSUtils.getAsDictionary(gsBase, cosDocument) | !C1 | !C2 | !C3 | 1 | !C5 | false |
| org.apache.pdfbox.preflight.process.reflect.ExtGStateValidationProcess.extractExtGStateDictionaries(org.apache.pdfbox.preflight.PreflightContext,org.apache.pdfbox.cos.COSDictionary) | 5 | listOfExtGState.add(gsDict) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.fontbox.cff.DataInput.readUnsignedByte() | 3 | read() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.TTFDataStream.readUnsignedByte() | 3 | read() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.setReplyType(java.lang.String) | 1 | getCOSObject().setName("RT", rt) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.setReplyType(java.lang.String) | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent.addText(org.apache.pdfbox.text.TextPosition) | 1 | this.getContents().add(text) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDMarkedContent.addText(org.apache.pdfbox.text.TextPosition) | 1 | this.getContents() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.preflight.font.util.PreflightType3Stream.showType3Character(org.apache.pdfbox.pdmodel.font.PDType3CharProc) | 1 | processChildStream(charProc, new PDPage()) | !C1 | !C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.getValue() | 2 | getInheritableAttribute(COSName.V) | !C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.getValue() | 2 | ((COSName) (value)).getName() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.getValue() | 2 | getExportValues() | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.getValue() | 2 | exportValues.isEmpty() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.getValue() | 2 | Integer.parseInt(stringValue, 10) | !C1 | !C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.getValue() | 2 | exportValues.size() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDButton.getValue() | 2 | exportValues.get(idx) | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField.getValue() | 1 | getCOSObject().getDictionaryObject(COSName.V) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDNonTerminalField.getValue() | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFField.getValue() | 2 | field.getDictionaryObject(COSName.V) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFField.getValue() | 2 | ((COSName) (value)).getName() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFField.getValue() | 2 | COSArrayList.convertCOSStringCOSArrayToList(((COSArray) (value))) | !C1 | !C2 | !C3 | 3 | !C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFField.getValue() | 2 | ((COSString) (value)).getString() | !C1 | C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFField.getValue() | 2 | ((COSStream) (value)).toTextString() | !C1 | C2 | !C3 | 5 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField.getValue() | 3 | getCOSObject().getDictionaryObject(COSName.V) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField.getValue() | 3 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDChoice.getValue() | 1 | getValueFor(COSName.V) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNameTreeNode.getValue(java.lang.String) | 4 | getNames() | !C1 | C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNameTreeNode.getValue(java.lang.String) | 4 | names.get(name) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNameTreeNode.getValue(java.lang.String) | 4 | getKids() | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNameTreeNode.getValue(java.lang.String) | 4 | kids.size() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNameTreeNode.getValue(java.lang.String) | 4 | kids.get(i) | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNameTreeNode.getValue(java.lang.String) | 4 | childNode.getUpperLimit() | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNameTreeNode.getValue(java.lang.String) | 4 | childNode.getLowerLimit() | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNameTreeNode.getValue(java.lang.String) | 4 | upperLimit.compareTo(lowerLimit) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNameTreeNode.getValue(java.lang.String) | 4 | lowerLimit.compareTo(name) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNameTreeNode.getValue(java.lang.String) | 4 | upperLimit.compareTo(name) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNameTreeNode.getValue(java.lang.String) | 4 | childNode.getValue(name) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNameTreeNode.getValue(java.lang.String) | 4 | LOG.warn("NameTreeNode does not have \"names\" nor \"kids\" objects.") | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDTextField.getValue() | 1 | getStringOrStream(getInheritableAttribute(COSName.V)) | !C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDTextField.getValue() | 1 | getInheritableAttribute(COSName.V) | !C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNumberTreeNode.getValue(java.lang.Integer) | 6 | getNumbers() | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNumberTreeNode.getValue(java.lang.Integer) | 6 | numbers.get(index) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNumberTreeNode.getValue(java.lang.Integer) | 6 | getKids() | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNumberTreeNode.getValue(java.lang.Integer) | 6 | kids.size() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNumberTreeNode.getValue(java.lang.Integer) | 6 | kids.get(i) | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNumberTreeNode.getValue(java.lang.Integer) | 6 | childNode.getLowerLimit().compareTo(index) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNumberTreeNode.getValue(java.lang.Integer) | 6 | childNode.getLowerLimit() | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNumberTreeNode.getValue(java.lang.Integer) | 6 | childNode.getUpperLimit().compareTo(index) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNumberTreeNode.getValue(java.lang.Integer) | 6 | childNode.getUpperLimit() | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNumberTreeNode.getValue(java.lang.Integer) | 6 | childNode.getValue(index) | !C1 | !C2 | !C3 | 6 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNumberTreeNode.getValue(java.lang.Integer) | 6 | LOG.warn("NumberTreeNode does not have \"nums\" nor \"kids\" objects.") | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty.getValue() | 1 | this.getCOSObject().getDictionaryObject(COSName.V) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty.getValue() | 1 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.hideToolbar() | 1 | prefs.getBoolean(COSName.HIDE_TOOLBAR, false) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.getOptionalContentGroups() | 4 | getOCGs() | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.getOptionalContentGroups() | 4 | coll.add(new PDOptionalContentGroup(toDictionary(base))) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.getOptionalContentGroups() | 4 | toDictionary(base) | !C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.prepress.PDBoxStyle.getGuidelineColor() | 3 | ((COSArray) (dictionary.getDictionaryObject(COSName.C))) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.prepress.PDBoxStyle.getGuidelineColor() | 3 | colorValues.add(COSInteger.ZERO) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.prepress.PDBoxStyle.getGuidelineColor() | 3 | colorValues.add(COSInteger.ZERO) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.prepress.PDBoxStyle.getGuidelineColor() | 3 | colorValues.add(COSInteger.ZERO) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.prepress.PDBoxStyle.getGuidelineColor() | 3 | dictionary.setItem(COSName.C, colorValues) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.prepress.PDBoxStyle.getGuidelineColor() | 3 | colorValues.toFloatArray() | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot.getRoleMap() | 3 | this.getCOSObject().getDictionaryObject(COSName.ROLE_MAP) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot.getRoleMap() | 3 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot.getRoleMap() | 3 | COSDictionaryMap.convertBasicTypesToMap(((COSDictionary) (rm))) | !C1 | !C2 | !C3 | 3 | !C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot.getRoleMap() | 3 | LOG.error(e, e) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.hasGroup(java.lang.String) | 3 | getGroupNames() | !C1 | C2 | !C3 | 6 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.hasGroup(java.lang.String) | 3 | layer.equals(groupName) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPageTree.getCount() | 1 | root.getInt(COSName.COUNT, 0) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdfwriter.COSWriter.visitFromBoolean(org.apache.pdfbox.cos.COSBoolean) | 2 | obj.writePDF(getStandardOutput()) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdfwriter.COSWriter.visitFromBoolean(org.apache.pdfbox.cos.COSBoolean) | 2 | getStandardOutput() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.type.AbstractComplexProperty.addProperty(org.apache.xmpbox.type.AbstractField) | 2 | container.removePropertiesByName(obj.getPropertyName()) | C1 | !C2 | C3 | 4 | C5 | false |
| org.apache.xmpbox.type.AbstractComplexProperty.addProperty(org.apache.xmpbox.type.AbstractField) | 2 | obj.getPropertyName() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.type.AbstractComplexProperty.addProperty(org.apache.xmpbox.type.AbstractField) | 2 | container.addProperty(obj) | C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.xmpbox.type.ComplexPropertyContainer.addProperty(org.apache.xmpbox.type.AbstractField) | 2 | removeProperty(obj) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.xmpbox.type.ComplexPropertyContainer.addProperty(org.apache.xmpbox.type.AbstractField) | 2 | properties.add(obj) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.xmpbox.type.DefinedStructuredType.addProperty(java.lang.String,org.apache.xmpbox.type.PropertyType) | 1 | definedProperties.put(name, type) | C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDFontDescriptor.setItalic(boolean) | 1 | setFlagBit(FLAG_ITALIC, flag) | !C1 | C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem.setItalic(boolean) | 1 | getCOSObject().setFlag(COSName.F, ITALIC_FLAG, italic) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem.setItalic(boolean) | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.PublicKeyProtectionPolicy.removeRecipient(org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient) | 1 | recipients.remove(recipient) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdfwriter.COSWriter.writeExternalSignature(byte[]) | 8 | Hex.getBytes(cmsSignature) | !C1 | !C2 | !C3 | 3 | !C5 | false |
| org.apache.pdfbox.pdfwriter.COSWriter.writeExternalSignature(byte[]) | 8 | incrementalInput.length() | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.pdfwriter.COSWriter.writeExternalSignature(byte[]) | 8 | System.arraycopy(signatureBytes, 0, incrementPart, incPartSigOffset + 1, signatureBytes.length) | !C1 | !C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdfwriter.COSWriter.writeExternalSignature(byte[]) | 8 | IOUtils.copy(new RandomAccessInputStream(incrementalInput), incrementalOutput) | !C1 | !C2 | C3 | 5 | !C5 | false |
| org.apache.pdfbox.pdfwriter.COSWriter.writeExternalSignature(byte[]) | 8 | incrementalOutput.write(incrementPart) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.xmpbox.type.AbstractComplexProperty.getArrayProperty(java.lang.String) | 3 | container.getPropertiesByLocalName(fieldName) | C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.xmpbox.type.AbstractComplexProperty.getArrayProperty(java.lang.String) | 3 | ((ArrayProperty) (list.get(0))) | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm.isAppendOnly() | 1 | dictionary.getFlag(COSName.SIG_FLAGS, FLAG_APPEND_ONLY) | C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDNameTreeNode.setParent(org.apache.pdfbox.pdmodel.common.PDNameTreeNode) | 2 | calculateLimits() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement.setParent(org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode) | 1 | this.getCOSObject().setItem(COSName.P, structureNode) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement.setParent(org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode) | 1 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup.setParent(org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup) | 1 | getCOSObject().setItem(COSName.PARENT, annot.getCOSObject()) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup.setParent(org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup) | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup.setParent(org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup) | 1 | annot.getCOSObject() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget.setParent(org.apache.pdfbox.pdmodel.interactive.form.PDTerminalField) | 2 | this.getCOSObject().equals(field.getCOSObject()) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget.setParent(org.apache.pdfbox.pdmodel.interactive.form.PDTerminalField) | 2 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget.setParent(org.apache.pdfbox.pdmodel.interactive.form.PDTerminalField) | 2 | field.getCOSObject() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget.setParent(org.apache.pdfbox.pdmodel.interactive.form.PDTerminalField) | 2 | this.getCOSObject().setItem(COSName.PARENT, field) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget.setParent(org.apache.pdfbox.pdmodel.interactive.form.PDTerminalField) | 2 | this.getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.setAlternateName(java.lang.String) | 1 | this.setString(DESC, alternateName) | !C1 | !C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.AxialShadingContext.getColorModel() | 1 | super.getColorModel() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.TriangleBasedShadingContext.getColorModel() | 1 | super.getColorModel() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFOptionElement.setOption(java.lang.String) | 1 | option.set(0, new COSString(opt)) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDField.setMappingName(java.lang.String) | 1 | dictionary.setString(COSName.TM, mappingName) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.xmpbox.schema.XMPSchema.getUnqualifiedTextProperty(java.lang.String) | 3 | getAbstractProperty(name) | !C1 | !C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.debugger.ui.DocumentEntry.getPageCount() | 1 | doc.getPages().getCount() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.debugger.ui.DocumentEntry.getPageCount() | 1 | doc.getPages() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFDictionary.setAnnotations(java.util.List) | 1 | fdf.setItem(COSName.ANNOTS, COSArrayList.converterToCOSArray(annots)) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFDictionary.setAnnotations(java.util.List) | 1 | COSArrayList.converterToCOSArray(annots) | !C1 | !C2 | !C3 | 3 | !C5 | false |
| org.apache.pdfbox.pdmodel.PDPage.setAnnotations(java.util.List) | 1 | page.setItem(COSName.ANNOTS, COSArrayList.converterToCOSArray(annotations)) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.PDPage.setAnnotations(java.util.List) | 1 | COSArrayList.converterToCOSArray(annotations) | !C1 | !C2 | !C3 | 3 | !C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFJavaScript.getDoc() | 5 | ((COSArray) (dictionary.getDictionaryObject(COSName.DOC))) | C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFJavaScript.getDoc() | 5 | array.size() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFJavaScript.getDoc() | 5 | PDActionFactory.createAction(((COSDictionary) (array.getObject(i)))) | !C1 | !C2 | !C3 | 3 | !C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFJavaScript.getDoc() | 5 | ((COSDictionary) (array.getObject(i))) | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFOptionElement.getOption() | 1 | ((COSString) (option.getObject(0))).getString() | !C1 | C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFOptionElement.getOption() | 1 | ((COSString) (option.getObject(0))) | C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.xmpbox.schema.DublinCoreSchema.addTitle(java.lang.String,java.lang.String) | 1 | setTitle(lang, value) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.TrueTypeFont.getGsub() | 1 | ((GlyphSubstitutionTable) (getTable(GlyphSubstitutionTable.TAG))) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.xmpbox.schema.XMPRightsManagementSchema.getCertificateProperty() | 1 | ((TextType) (getProperty(CERTIFICATE))) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.font.FontMapperImpl.getProvider() | 2 | setProvider(DefaultFontProvider.INSTANCE) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDStream.getDecodeParms() | 1 | internalGetDecodeParams(COSName.DECODE_PARMS, COSName.DP) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.xmpbox.schema.DublinCoreSchema.getFormat() | 2 | ((TextType) (getProperty(FORMAT))) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.xmpbox.schema.DublinCoreSchema.getFormat() | 2 | tt.getStringValue() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.type.ThumbnailType.getFormat() | 3 | getFirstEquivalentProperty(FORMAT, ChoiceType.class) | !C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.type.ThumbnailType.getFormat() | 3 | ((TextType) (absProp)).getStringValue() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN.setColorantNames(java.util.List) | 2 | COSArrayList.convertStringListToCOSNameCOSArray(names) | !C1 | !C2 | !C3 | 3 | !C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN.setColorantNames(java.util.List) | 2 | array.set(COLORANT_NAMES, namesArray) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.xmpbox.type.ResourceRefType.getMaskMarkers() | 2 | ((TextType) (getFirstEquivalentProperty(MASK_MARKERS, ChoiceType.class))) | !C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.type.ResourceRefType.getMaskMarkers() | 2 | absProp.getStringValue() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.setStrokingAlphaConstant(java.lang.Float) | 1 | setFloatItem(COSName.CA, alpha) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.layout.PlainTextFormatter.format() | 1 | textContent.getParagraphs().isEmpty() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.layout.PlainTextFormatter.format() | 1 | textContent.getParagraphs() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.layout.PlainTextFormatter.format() | 1 | textContent.getParagraphs() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.layout.PlainTextFormatter.format() | 1 | paragraph.getLines(appearanceStyle.getFont(), appearanceStyle.getFontSize(), width) | !C1 | !C2 | !C3 | 12 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.layout.PlainTextFormatter.format() | 1 | appearanceStyle.getFont() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.layout.PlainTextFormatter.format() | 1 | appearanceStyle.getFontSize() | C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.layout.PlainTextFormatter.format() | 1 | processLines(lines, isFirstParagraph) | !C1 | !C2 | C3 | 6 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.layout.PlainTextFormatter.format() | 1 | appearanceStyle.getFont().getStringWidth(paragraph.getText()) | !C1 | !C2 | C3 | 5 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.layout.PlainTextFormatter.format() | 1 | appearanceStyle.getFont() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.layout.PlainTextFormatter.format() | 1 | paragraph.getText() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.layout.PlainTextFormatter.format() | 1 | appearanceStyle.getFontSize() | C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.layout.PlainTextFormatter.format() | 1 | contents.newLineAtOffset(horizontalOffset + startOffset, verticalOffset) | C1 | C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.layout.PlainTextFormatter.format() | 1 | contents.showText(paragraph.getText()) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.layout.PlainTextFormatter.format() | 1 | paragraph.getText() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PlainTextFormatter.format() | 1 | textContent.getParagraphs().isEmpty() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PlainTextFormatter.format() | 1 | textContent.getParagraphs() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PlainTextFormatter.format() | 1 | textContent.getParagraphs() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PlainTextFormatter.format() | 1 | paragraph.getLines(appearanceStyle.getFont(), appearanceStyle.getFontSize(), width) | !C1 | !C2 | !C3 | 12 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PlainTextFormatter.format() | 1 | appearanceStyle.getFont() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PlainTextFormatter.format() | 1 | appearanceStyle.getFontSize() | C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PlainTextFormatter.format() | 1 | processLines(lines, isFirstParagraph) | !C1 | !C2 | C3 | 6 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PlainTextFormatter.format() | 1 | appearanceStyle.getFont().getStringWidth(paragraph.getText()) | !C1 | !C2 | C3 | 5 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PlainTextFormatter.format() | 1 | appearanceStyle.getFont() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PlainTextFormatter.format() | 1 | paragraph.getText() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PlainTextFormatter.format() | 1 | appearanceStyle.getFontSize() | C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PlainTextFormatter.format() | 1 | contents.newLineAtOffset(horizontalOffset + startOffset, verticalOffset) | C1 | C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PlainTextFormatter.format() | 1 | contents.showText(paragraph.getText()) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PlainTextFormatter.format() | 1 | paragraph.getText() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem.setTextColor(org.apache.pdfbox.pdmodel.graphics.color.PDColor) | 1 | getCOSObject().setItem(COSName.C, textColor.toCOSArray()) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem.setTextColor(org.apache.pdfbox.pdmodel.graphics.color.PDColor) | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem.setTextColor(org.apache.pdfbox.pdmodel.graphics.color.PDColor) | 1 | textColor.toCOSArray() | C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem.setTextColor(java.awt.Color) | 5 | array.add(new COSFloat(textColor.getRed() / 255.0F)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem.setTextColor(java.awt.Color) | 5 | textColor.getRed() | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem.setTextColor(java.awt.Color) | 5 | array.add(new COSFloat(textColor.getGreen() / 255.0F)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem.setTextColor(java.awt.Color) | 5 | textColor.getGreen() | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem.setTextColor(java.awt.Color) | 5 | array.add(new COSFloat(textColor.getBlue() / 255.0F)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem.setTextColor(java.awt.Color) | 5 | textColor.getBlue() | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem.setTextColor(java.awt.Color) | 5 | getCOSObject().setItem(COSName.C, array) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem.setTextColor(java.awt.Color) | 5 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.encryption.PDEncryption.setUserKey(byte[]) | 1 | dictionary.setItem(COSName.U, new COSString(u)) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.xmpbox.type.JobType.getUrl() | 1 | getPropertyValueAsString(URL) | !C1 | !C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.cos.COSDictionary.setLong(java.lang.String,long) | 1 | setLong(COSName.getPDFName(key), value) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.cos.COSDictionary.setLong(java.lang.String,long) | 1 | COSName.getPDFName(key) | !C1 | !C2 | !C3 | 3 | !C5 | false |
| org.apache.pdfbox.cos.COSDictionary.setLong(org.apache.pdfbox.cos.COSName,long) | 2 | COSInteger.get(value) | !C1 | C2 | !C3 | 2 | !C5 | false |
| org.apache.pdfbox.cos.COSDictionary.setLong(org.apache.pdfbox.cos.COSName,long) | 2 | setItem(key, intVal) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.removeMenuListeners(org.apache.pdfbox.debugger.PDFDebugger) | 4 | frame.getFindMenu().setEnabled(false) | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.removeMenuListeners(org.apache.pdfbox.debugger.PDFDebugger) | 4 | frame.getFindMenu() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.removeMenuListeners(org.apache.pdfbox.debugger.PDFDebugger) | 4 | frame.getFindMenuItem().removeActionListener(findAction) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.removeMenuListeners(org.apache.pdfbox.debugger.PDFDebugger) | 4 | frame.getFindMenuItem() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.removeMenuListeners(org.apache.pdfbox.debugger.PDFDebugger) | 4 | frame.getFindNextMenuItem().removeActionListener(nextAction) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.removeMenuListeners(org.apache.pdfbox.debugger.PDFDebugger) | 4 | frame.getFindNextMenuItem() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.removeMenuListeners(org.apache.pdfbox.debugger.PDFDebugger) | 4 | frame.getFindPreviousMenuItem().removeActionListener(previousAction) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.debugger.ui.textsearcher.SearchPanel.removeMenuListeners(org.apache.pdfbox.debugger.PDFDebugger) | 4 | frame.getFindPreviousMenuItem() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.debugger.ui.textsearcher.Searcher.removeMenuListeners(org.apache.pdfbox.debugger.PDFDebugger) | 1 | searchPanel.removeMenuListeners(frame) | C1 | !C2 | C3 | 4 | C5 | false |
| org.apache.xmpbox.schema.PhotoshopSchema.getColorModeProperty() | 1 | ((IntegerType) (getProperty(COLOR_MODE))) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.setLineHeightNormal() | 1 | this.setName(LINE_HEIGHT, LINE_HEIGHT_NORMAL) | !C1 | !C2 | C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.centerWindow() | 1 | prefs.getBoolean(COSName.CENTER_WINDOW, false) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDFontDescriptor.isAllCap() | 1 | isFlagBitOn(FLAG_ALL_CAP) | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocument.getSignatureFields() | 4 | getDocumentCatalog().getAcroForm(null) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocument.getSignatureFields() | 4 | getDocumentCatalog() | !C1 | C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocument.getSignatureFields() | 4 | acroForm.getFieldTree() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocument.getSignatureFields() | 4 | fields.add(((PDSignatureField) (field))) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification.getEmbeddedFile() | 3 | getObjectFromEFDictionary(COSName.F) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle.getInteriorColor() | 4 | ((COSArray) (annot.getDictionaryObject(COSName.IC))) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle.getInteriorColor() | 4 | array.toFloatArray() | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine.getInteriorColor() | 4 | ((COSArray) (annot.getDictionaryObject(COSName.IC))) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine.getInteriorColor() | 4 | array.toFloatArray() | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon.getInteriorColor() | 4 | ((COSArray) (annot.getDictionaryObject(COSName.IC))) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon.getInteriorColor() | 4 | array.toFloatArray() | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline.getInteriorColor() | 4 | ((COSArray) (annot.getDictionaryObject(COSName.IC))) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline.getInteriorColor() | 4 | array.toFloatArray() | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare.getInteriorColor() | 4 | ((COSArray) (annot.getDictionaryObject(COSName.IC))) | !C1 | !C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare.getInteriorColor() | 4 | array.toFloatArray() | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine.getInteriorColor() | 1 | getColor(COSName.IC) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.getInteriorColor() | 1 | getColor(COSName.IC) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle.getInteriorColor() | 1 | getColor(COSName.IC) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.action.PDActionSound.setSynchronous(boolean) | 1 | action.setBoolean(COSName.SYNCHRONOUS, synchronous) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.preflight.font.container.Type0Container.getAllErrors() | 2 | this.errorBuffer.addAll(this.delegateFontContainer.getAllErrors()) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.preflight.font.container.Type0Container.getAllErrors() | 2 | this.delegateFontContainer.getAllErrors() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.setRectDifferences(float) | 1 | setRectDifferences(difference, difference, difference, difference) | !C1 | C2 | C3 | 6 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.setRectDifferences(float,float,float,float) | 6 | margins.add(new COSFloat(differenceLeft)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.setRectDifferences(float,float,float,float) | 6 | margins.add(new COSFloat(differenceTop)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.setRectDifferences(float,float,float,float) | 6 | margins.add(new COSFloat(differenceRight)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.setRectDifferences(float,float,float,float) | 6 | margins.add(new COSFloat(differenceBottom)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.setRectDifferences(float,float,float,float) | 6 | getCOSObject().setItem(COSName.RD, margins) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.setRectDifferences(float,float,float,float) | 6 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle.setRectDifferences(float) | 1 | setRectDifferences(difference, difference, difference, difference) | !C1 | C2 | C3 | 6 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle.setRectDifferences(float,float,float,float) | 6 | margins.add(new COSFloat(differenceLeft)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle.setRectDifferences(float,float,float,float) | 6 | margins.add(new COSFloat(differenceTop)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle.setRectDifferences(float,float,float,float) | 6 | margins.add(new COSFloat(differenceRight)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle.setRectDifferences(float,float,float,float) | 6 | margins.add(new COSFloat(differenceBottom)) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle.setRectDifferences(float,float,float,float) | 6 | getCOSObject().setItem(COSName.RD, margins) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle.setRectDifferences(float,float,float,float) | 6 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification.setEmbeddedFile(org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile) | 3 | getEFDictionary() | !C1 | C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification.setEmbeddedFile(org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile) | 3 | fs.setItem(COSName.EF, ef) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification.setEmbeddedFile(org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile) | 3 | ef.setItem(COSName.F, file) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDFontDescriptor.isSmallCap() | 1 | isFlagBitOn(FLAG_SMALL_CAP) | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.xmpbox.schema.XMPMediaManagementSchema.getVersionIDProperty() | 1 | ((TextType) (getProperty(VERSIONID))) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.cos.COSStream.createOutputStream() | 1 | createOutputStream(null) | !C1 | !C2 | !C3 | 9 | C5 | false |
| org.apache.pdfbox.cos.COSStream.createOutputStream(org.apache.pdfbox.cos.COSBase) | 9 | checkClosed() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.cos.COSStream.createOutputStream(org.apache.pdfbox.cos.COSBase) | 9 | setItem(COSName.FILTER, filters) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.cos.COSStream.createOutputStream(org.apache.pdfbox.cos.COSBase) | 9 | IOUtils.closeQuietly(randomAccess) | !C1 | !C2 | C3 | 1 | !C5 | false |
| org.apache.pdfbox.cos.COSStream.createOutputStream(org.apache.pdfbox.cos.COSBase) | 9 | scratchFile.createBuffer() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.cos.COSStream.createOutputStream(org.apache.pdfbox.cos.COSBase) | 9 | getFilterList() | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.cos.COSStream.createOutputStream(org.apache.pdfbox.cos.COSBase) | 9 | super($anonymous0) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.cos.COSStream.createOutputStream(org.apache.pdfbox.cos.COSBase) | 9 | this.out.write(b, off, len) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.cos.COSStream.createOutputStream(org.apache.pdfbox.cos.COSBase) | 9 | super.close() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.cos.COSStream.createOutputStream(org.apache.pdfbox.cos.COSBase) | 9 | setInt(COSName.LENGTH, ((int) (randomAccess.length()))) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.cos.COSStream.createOutputStream(org.apache.pdfbox.cos.COSBase) | 9 | ((int) (randomAccess.length())) | C1 | C2 | C3 | 0 | C5 | true |
| org.apache.pdfbox.pdmodel.common.PDStream.createOutputStream() | 1 | stream.createOutputStream() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDStream.createOutputStream(org.apache.pdfbox.cos.COSName) | 1 | stream.createOutputStream(filter) | C1 | !C2 | !C3 | 9 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocumentNameDictionary.setDests(org.apache.pdfbox.pdmodel.PDDestinationNameTreeNode) | 2 | nameDictionary.setItem(COSName.DESTS, dests) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocumentNameDictionary.setDests(org.apache.pdfbox.pdmodel.PDDestinationNameTreeNode) | 2 | catalog.getCOSObject().setItem(COSName.DESTS, ((COSObjectable) (null))) | !C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.PDDocumentNameDictionary.setDests(org.apache.pdfbox.pdmodel.PDDestinationNameTreeNode) | 2 | catalog.getCOSObject() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.action.PDTargetDirectory.setRelationship(org.apache.pdfbox.cos.COSName) | 2 | COSName.P.equals(relationship) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.action.PDTargetDirectory.setRelationship(org.apache.pdfbox.cos.COSName) | 2 | COSName.C.equals(relationship) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.action.PDTargetDirectory.setRelationship(org.apache.pdfbox.cos.COSName) | 2 | relationship.getName() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.action.PDTargetDirectory.setRelationship(org.apache.pdfbox.cos.COSName) | 2 | dict.setItem(COSName.R, relationship) | C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.contentstream.PDFStreamEngine.getGraphicsState() | 1 | graphicsStack.peek() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.xmpbox.schema.PhotoshopSchema.getInstructionsProperty() | 1 | ((TextType) (getProperty(INSTRUCTIONS))) | !C1 | !C2 | !C3 | 3 | C5 | false |
| org.apache.fontbox.ttf.GlyphSubstitutionTable$1.compare(org.apache.fontbox.ttf.GlyphSubstitutionTable$FeatureRecord,org.apache.fontbox.ttf.GlyphSubstitutionTable$FeatureRecord) | 3 | enabledFeatures.indexOf(o1.featureTag) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.fontbox.ttf.GlyphSubstitutionTable$1.compare(org.apache.fontbox.ttf.GlyphSubstitutionTable$FeatureRecord,org.apache.fontbox.ttf.GlyphSubstitutionTable$FeatureRecord) | 3 | enabledFeatures.indexOf(o2.featureTag) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.FieldUtils$KeyValueKeyComparator.compare(org.apache.pdfbox.pdmodel.interactive.form.FieldUtils$KeyValue,org.apache.pdfbox.pdmodel.interactive.form.FieldUtils$KeyValue) | 1 | o1.key.compareTo(o2.key) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.FieldUtils$KeyValueValueComparator.compare(org.apache.pdfbox.pdmodel.interactive.form.FieldUtils$KeyValue,org.apache.pdfbox.pdmodel.interactive.form.FieldUtils$KeyValue) | 1 | o1.value.compareTo(o2.value) | !C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.text.TextPositionComparator.compare(org.apache.pdfbox.text.TextPosition,org.apache.pdfbox.text.TextPosition) | 10 | Float.compare(pos1.getDir(), pos2.getDir()) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.text.TextPositionComparator.compare(org.apache.pdfbox.text.TextPosition,org.apache.pdfbox.text.TextPosition) | 10 | pos1.getDir() | C1 | C2 | C3 | 2 | C5 | true |
| org.apache.pdfbox.text.TextPositionComparator.compare(org.apache.pdfbox.text.TextPosition,org.apache.pdfbox.text.TextPosition) | 10 | pos2.getDir() | C1 | C2 | C3 | 2 | C5 | true |
| org.apache.pdfbox.text.TextPositionComparator.compare(org.apache.pdfbox.text.TextPosition,org.apache.pdfbox.text.TextPosition) | 10 | pos1.getXDirAdj() | C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.text.TextPositionComparator.compare(org.apache.pdfbox.text.TextPosition,org.apache.pdfbox.text.TextPosition) | 10 | pos2.getXDirAdj() | C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.text.TextPositionComparator.compare(org.apache.pdfbox.text.TextPosition,org.apache.pdfbox.text.TextPosition) | 10 | pos1.getYDirAdj() | C1 | C2 | C3 | 2 | C5 | true |
| org.apache.pdfbox.text.TextPositionComparator.compare(org.apache.pdfbox.text.TextPosition,org.apache.pdfbox.text.TextPosition) | 10 | pos2.getYDirAdj() | C1 | C2 | C3 | 2 | C5 | true |
| org.apache.pdfbox.text.TextPositionComparator.compare(org.apache.pdfbox.text.TextPosition,org.apache.pdfbox.text.TextPosition) | 10 | pos1.getHeightDir() | C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.text.TextPositionComparator.compare(org.apache.pdfbox.text.TextPosition,org.apache.pdfbox.text.TextPosition) | 10 | pos2.getHeightDir() | C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.text.TextPositionComparator.compare(org.apache.pdfbox.text.TextPosition,org.apache.pdfbox.text.TextPosition) | 10 | Math.abs(pos1YBottom - pos2YBottom) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.text.TextPositionComparator.compare(org.apache.pdfbox.text.TextPosition,org.apache.pdfbox.text.TextPosition) | 10 | Float.compare(x1, x2) | !C1 | C2 | C3 | 0 | !C5 | false |
| org.apache.pdfbox.util.QuickSort$1.compare(java.lang.Comparable,java.lang.Comparable) | 1 | object1.compareTo(object2) | C1 | !C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject.getContentStream() | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern.getContentStream() | 1 | ((COSStream) (getCOSObject())) | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern.setYStep(float) | 1 | getCOSObject().setFloat(COSName.Y_STEP, yStep) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern.setYStep(float) | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary.setDownAppearance(org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry) | 1 | dictionary.setItem(COSName.D, entry) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary.setDownAppearance(org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream) | 1 | dictionary.setItem(COSName.D, ap) | C1 | !C2 | C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue.isSubFilterRequired() | 1 | getCOSObject().getFlag(COSName.FF, FLAG_SUBFILTER) | !C1 | !C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue.isSubFilterRequired() | 1 | getCOSObject() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.xmpbox.type.TypeMapping.addNewNameSpace(java.lang.String,java.lang.String) | 2 | schemaMap.put(ns, new XMPSchemaFactory(ns, XMPSchema.class, mapping)) | C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.cff.CFFParser$CFFBuiltInEncoding$Supplement.toString() | 1 | getClass().getName() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.cff.CFFParser$CFFBuiltInEncoding$Supplement.toString() | 1 | getClass() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.cff.CFFOperator$Key.toString() | 1 | Arrays.toString(getValue()) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.fontbox.cff.CFFOperator$Key.toString() | 1 | getValue() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.fontbox.cff.CFFFont.toString() | 1 | getClass().getSimpleName() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.cff.CFFFont.toString() | 1 | getClass() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.cff.CFFFont.toString() | 1 | Arrays.deepToString(charStrings) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.font.PDPanoseClassification.toString() | 1 | getFamilyKind() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDPanoseClassification.toString() | 1 | getSerifStyle() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDPanoseClassification.toString() | 1 | getWeight() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDPanoseClassification.toString() | 1 | getProportion() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDPanoseClassification.toString() | 1 | getContrast() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDPanoseClassification.toString() | 1 | getStrokeVariation() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDPanoseClassification.toString() | 1 | getArmStyle() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDPanoseClassification.toString() | 1 | getLetterform() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDPanoseClassification.toString() | 1 | getMidline() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDPanoseClassification.toString() | 1 | getXHeight() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDParentTreeValue.toString() | 1 | obj.toString() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDColor.toString() | 1 | Arrays.toString(components) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.xmpbox.type.AbstractSimpleProperty.toString() | 1 | this.getClass().getSimpleName() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.xmpbox.type.AbstractSimpleProperty.toString() | 1 | this.getClass() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.xmpbox.type.AbstractSimpleProperty.toString() | 1 | getStringValue() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.toString() | 1 | getName() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDICCBased.toString() | 1 | getNumberOfComponents() | !C1 | C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDField.toString() | 1 | getFullyQualifiedName() | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDField.toString() | 1 | getClass().getSimpleName() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDField.toString() | 1 | getClass() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.interactive.form.PDField.toString() | 1 | getInheritableAttribute(COSName.V) | !C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.fontbox.cff.CFFOperator.toString() | 1 | getName() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.GlyphSubstitutionTable$ScriptRecord.toString() | 1 | String.format("ScriptRecord[scriptTag=%s]", scriptTag) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.fontbox.ttf.GlyphSubstitutionTable$CoverageTableFormat2.toString() | 1 | String.format("CoverageTableFormat2[coverageFormat=%d]", coverageFormat) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.pdfbox.cos.COSBoolean.toString() | 1 | String.valueOf(value) | !C1 | C2 | !C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.common.function.PDFunctionType2.toString() | 1 | getC0() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.common.function.PDFunctionType2.toString() | 1 | getC1() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.common.function.PDFunctionType2.toString() | 1 | getN() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.CubicBezierCurve.toString() | 3 | sb.length() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.CubicBezierCurve.toString() | 3 | sb.append(' ') | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.CubicBezierCurve.toString() | 3 | sb.append(p) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.cff.CFFParser.toString() | 1 | getClass().getSimpleName() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.cff.CFFParser.toString() | 1 | getClass() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.ttf.GlyphSubstitutionTable$FeatureRecord.toString() | 1 | String.format("FeatureRecord[featureTag=%s]", featureTag) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.common.COSDictionaryMap.toString() | 1 | actuals.toString() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject.toString() | 1 | super.toString() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject.toString() | 1 | this.getOwnerUserProperties() | !C1 | C2 | !C3 | 4 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup.toString() | 1 | super.toString() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup.toString() | 1 | getName() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDType0Font.toString() | 3 | getDescendantFont() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDType0Font.toString() | 3 | getDescendantFont().getClass().getSimpleName() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDType0Font.toString() | 3 | getDescendantFont().getClass() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDType0Font.toString() | 3 | getDescendantFont() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDType0Font.toString() | 3 | getClass().getSimpleName() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDType0Font.toString() | 3 | getClass() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDType0Font.toString() | 3 | getBaseFont() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.Vertex.toString() | 3 | sb.length() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.Vertex.toString() | 3 | sb.append(' ') | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.Vertex.toString() | 3 | sb.append(String.format("%3.2f", f)) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.shading.Vertex.toString() | 3 | String.format("%3.2f", f) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.common.PDRange.toString() | 1 | getMin() | !C1 | C2 | C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.common.PDRange.toString() | 1 | getMax() | !C1 | C2 | C3 | 2 | C5 | false |
| org.apache.fontbox.cff.CharStringCommand.toString() | 4 | TYPE2_VOCABULARY.get(getKey()) | C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.cff.CharStringCommand.toString() | 4 | getKey() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.fontbox.cff.CharStringCommand.toString() | 4 | TYPE1_VOCABULARY.get(getKey()) | C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.cff.CharStringCommand.toString() | 4 | getKey() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.fontbox.cff.CharStringCommand.toString() | 4 | getKey().toString() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.fontbox.cff.CharStringCommand.toString() | 4 | getKey() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.fontbox.cff.CharStringCommand$Key.toString() | 1 | Arrays.toString(getValue()) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.fontbox.cff.CharStringCommand$Key.toString() | 1 | getValue() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.toString() | 5 | new StringBuilder().append(super.toString()) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.toString() | 5 | super.toString() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.toString() | 5 | this.isSpecified(ROLE) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.toString() | 5 | sb.append(", Role=").append(this.getRole()) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.toString() | 5 | sb.append(", Role=") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.toString() | 5 | this.getRole() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.toString() | 5 | this.isSpecified(CHECKED) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.toString() | 5 | sb.append(", Checked=").append(this.getCheckedState()) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.toString() | 5 | sb.append(", Checked=") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.toString() | 5 | this.getCheckedState() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.toString() | 5 | this.isSpecified(DESC) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.toString() | 5 | sb.append(", Desc=").append(this.getAlternateName()) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.toString() | 5 | sb.append(", Desc=") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.toString() | 5 | this.getAlternateName() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.toString() | 5 | sb.toString() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.toString() | 3 | new StringBuilder().append(super.toString()) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.toString() | 3 | super.toString() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.toString() | 3 | this.isSpecified(LIST_NUMBERING) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.toString() | 3 | sb.append(", ListNumbering=").append(this.getListNumbering()) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.toString() | 3 | sb.append(", ListNumbering=") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.toString() | 3 | this.getListNumbering() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.toString() | 3 | sb.toString() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.debugger.ui.MapEntry.toString() | 2 | key.getName() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.GlyphSubstitutionTable$CoverageTableFormat1.toString() | 1 | String.format("CoverageTableFormat1[coverageFormat=%d,glyphArray=%s]", coverageFormat, Arrays.toString(glyphArray)) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.fontbox.ttf.GlyphSubstitutionTable$CoverageTableFormat1.toString() | 1 | Arrays.toString(glyphArray) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.fontbox.ttf.TrueTypeFont.toString() | 1 | getNaming() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.TrueTypeFont.toString() | 1 | getNaming().getPostScriptName() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.TrueTypeFont.toString() | 1 | getNaming() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.TrueTypeFont.toString() | 1 | e.getMessage() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.CIDSystemInfo.toString() | 1 | getRegistry() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.CIDSystemInfo.toString() | 1 | getOrdering() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.CIDSystemInfo.toString() | 1 | getSupplement() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.common.COSArrayList.toString() | 1 | array.toString() | C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.fontbox.type1.Type1Font.toString() | 1 | getClass().getName() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.type1.Type1Font.toString() | 1 | getClass() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.util.BoundingBox.toString() | 1 | getLowerLeftX() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.util.BoundingBox.toString() | 1 | getLowerLeftY() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.util.BoundingBox.toString() | 1 | getUpperRightX() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.util.BoundingBox.toString() | 1 | getUpperRightY() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo.toString() | 1 | getRegistry() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo.toString() | 1 | getOrdering() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.font.PDCIDSystemInfo.toString() | 1 | getSupplement() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.CmapSubtable.toString() | 1 | getPlatformId() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.CmapSubtable.toString() | 1 | getPlatformEncodingId() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.ttf.GlyphSubstitutionTable$ScriptTable.toString() | 1 | String.format("ScriptTable[hasDefault=%s,langSysRecordsCount=%d]", defaultLangSysTable != null, langSysTables.size()) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.fontbox.ttf.GlyphSubstitutionTable$ScriptTable.toString() | 1 | langSysTables.size() | C1 | C2 | C3 | 0 | C5 | false |
| org.apache.fontbox.ttf.GlyphSubstitutionTable$FeatureTable.toString() | 1 | String.format("FeatureTable[lookupListIndiciesCount=%d]", lookupListIndices.length) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.common.function.PDFunction.toString() | 1 | getFunctionType() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.fontbox.ttf.GlyphSubstitutionTable$LangSysTable.toString() | 1 | String.format("LangSysTable[requiredFeatureIndex=%d]", requiredFeatureIndex) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.font.FontInfo.toString() | 1 | getPostScriptName() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.FontInfo.toString() | 1 | getFormat() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.FontInfo.toString() | 1 | Integer.toHexString(getMacStyle()) | !C1 | C2 | !C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.font.FontInfo.toString() | 1 | getMacStyle() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.FontInfo.toString() | 1 | Integer.toHexString(getFamilyClass()) | !C1 | C2 | !C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.font.FontInfo.toString() | 1 | getFamilyClass() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.font.FontInfo.toString() | 1 | getCIDSystemInfo() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.cos.COSString.toString() | 1 | getString() | !C1 | C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.toString() | 4 | new StringBuilder().append(super.toString()).append(", attributes={") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.toString() | 4 | new StringBuilder().append(super.toString()) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.toString() | 4 | super.toString() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.toString() | 4 | this.getAttributeNames().iterator() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.toString() | 4 | this.getAttributeNames() | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.toString() | 4 | it.hasNext() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.toString() | 4 | it.next() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.toString() | 4 | sb.append(name).append('=').append(this.getAttributeValue(name)) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.toString() | 4 | sb.append(name).append('=') | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.toString() | 4 | sb.append(name) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.toString() | 4 | this.getAttributeValue(name) | !C1 | !C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.toString() | 4 | it.hasNext() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.toString() | 4 | sb.append(", ") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.toString() | 4 | sb.append('}').toString() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject.toString() | 4 | sb.append('}') | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.text.TextPosition.toString() | 1 | getUnicode() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDAttributeObject.toString() | 1 | this.getOwner() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.io.MemoryUsageSetting.toString() | 1 | isStorageRestricted() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.io.MemoryUsageSetting.toString() | 1 | isMainMemoryRestricted() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.io.MemoryUsageSetting.toString() | 1 | isStorageRestricted() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess.toString() | 4 | sb.append(getColorSpace()) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess.toString() | 4 | getColorSpace() | !C1 | C2 | !C3 | 3 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess.toString() | 4 | getComponents() | !C1 | C2 | !C3 | 5 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess.toString() | 4 | sb.append(" \"") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess.toString() | 4 | sb.append(component) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess.toString() | 4 | sb.append('\"') | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess.toString() | 4 | sb.append("ERROR") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess.toString() | 4 | sb.append('}') | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess.toString() | 4 | sb.toString() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDCIEBasedColorSpace.toString() | 1 | getName() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDIndexed.toString() | 1 | getHival() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.fontbox.cff.Type1CharString.toString() | 1 | type1Sequence.toString().replace("\|", "\n").replace(",", " ") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.cff.Type1CharString.toString() | 1 | type1Sequence.toString().replace("\|", "\n") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.cff.Type1CharString.toString() | 1 | type1Sequence.toString() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.fontbox.ttf.GlyphSubstitutionTable$LookupTypeSingleSubstFormat1.toString() | 1 | String.format("LookupTypeSingleSubstFormat1[substFormat=%d,deltaGlyphID=%d]", substFormat, deltaGlyphID) | !C1 | !C2 | !C3 | 0 | !C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDSeparation.toString() | 1 | getName() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDSeparation.toString() | 1 | getColorantName() | !C1 | C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDSeparation.toString() | 1 | alternateColorSpace.getName() | C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions.toString() | 3 | this.getObjects().size() | !C1 | C2 | C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions.toString() | 3 | this.getObjects() | !C1 | C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions.toString() | 3 | sb.append("; ") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions.toString() | 3 | sb.append("object=").append(this.getObjects().get(i)).append(", revisionNumber=").append(this.getRevisionNumber(i)) | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions.toString() | 3 | sb.append("object=").append(this.getObjects().get(i)).append(", revisionNumber=") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions.toString() | 3 | sb.append("object=").append(this.getObjects().get(i)) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions.toString() | 3 | sb.append("object=") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions.toString() | 3 | this.getObjects().get(i) | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions.toString() | 3 | this.getObjects() | !C1 | C2 | !C3 | 2 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions.toString() | 3 | this.getRevisionNumber(i) | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.Revisions.toString() | 3 | sb.toString() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.graphics.color.PDDeviceColorSpace.toString() | 1 | getName() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.cos.COSDictionary.toString() | 1 | getDictionaryString(this, new ArrayList<COSBase>()) | !C1 | !C2 | !C3 | 7 | !C5 | false |
| org.apache.pdfbox.cos.COSDictionary.toString() | 1 | e.getMessage() | !C1 | C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference.toString() | 1 | this.getMCID() | !C1 | C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | new StringBuilder().append(super.toString()) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | super.toString() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | this.isSpecified(PLACEMENT) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | sb.append(", Placement=").append(this.getPlacement()) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | sb.append(", Placement=") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | this.getPlacement() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | this.isSpecified(WRITING_MODE) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | sb.append(", WritingMode=").append(this.getWritingMode()) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | sb.append(", WritingMode=") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | this.getWritingMode() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | this.isSpecified(BACKGROUND_COLOR) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | sb.append(", BackgroundColor=").append(this.getBackgroundColor()) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | sb.append(", BackgroundColor=") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | this.getBackgroundColor() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | this.isSpecified(BORDER_COLOR) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | sb.append(", BorderColor=").append(this.getBorderColors()) | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | sb.append(", BorderColor=") | !C1 | !C2 | !C3 | 0 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | this.getBorderColors() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | this.isSpecified(BORDER_STYLE) | !C1 | !C2 | C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | this.getBorderStyle() | !C1 | C2 | !C3 | 1 | C5 | false |
| org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.toString() | 34 | sb.append(", BorderStyle=") | !C1 | !C2 | !C3 | 0 | C5 | false |
