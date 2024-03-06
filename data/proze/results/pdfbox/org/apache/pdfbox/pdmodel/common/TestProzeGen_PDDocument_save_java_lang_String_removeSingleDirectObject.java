/* Copyright 2015 The Apache Software Foundation.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package org.apache.pdfbox.pdmodel.common;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject {
    // next two entries are to be used for comparison with
    // COSArrayList behaviour in order to ensure that the
    // intended object is now at the correct position.
    // Will also be used for Collection/Array based setting
    // and comparison
    static java.util.List<org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation> tbcAnnotationsList;

    static org.apache.pdfbox.cos.COSBase[] tbcAnnotationsArray;

    // next entries are to be used within COSArrayList
    static java.util.List<org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation> annotationsList;

    static org.apache.pdfbox.cos.COSArray annotationsArray;

    // to be used when testing retrieving filtered items as can be done with
    // {@link PDPage.getAnnotations(AnnotationFilter annotationFilter)}
    static org.apache.pdfbox.pdmodel.PDPage pdPage;

    private static final java.io.File OUT_DIR = new java.io.File("target/test-output/pdmodel/common");

    /* Create three new different annotations and add them to the Java List/Array as
    well as PDFBox List/Array implementations.
     */
    @BeforeAll
    public static void setUp() throws Exception {
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.annotationsList = new java.util.ArrayList<org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation>();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup txtMark = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup.SUB_TYPE_HIGHLIGHT);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink txtLink = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle aCircle = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle(org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle.SUB_TYPE_CIRCLE);
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.annotationsList.add(txtMark);
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.annotationsList.add(txtLink);
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.annotationsList.add(aCircle);
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.annotationsList.add(txtLink);
        assertEquals(4, TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.annotationsList.size());
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.tbcAnnotationsList = new java.util.ArrayList<org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation>();
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.tbcAnnotationsList.add(txtMark);
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.tbcAnnotationsList.add(txtLink);
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.tbcAnnotationsList.add(aCircle);
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.tbcAnnotationsList.add(txtLink);
        assertEquals(4, TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.tbcAnnotationsList.size());
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.annotationsArray = new org.apache.pdfbox.cos.COSArray();
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.annotationsArray.add(txtMark);
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.annotationsArray.add(txtLink);
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.annotationsArray.add(aCircle);
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.annotationsArray.add(txtLink);
        assertEquals(4, TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.annotationsArray.size());
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.tbcAnnotationsArray = new org.apache.pdfbox.cos.COSBase[4];
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.tbcAnnotationsArray[0] = txtMark.getCOSObject();
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.tbcAnnotationsArray[1] = txtLink.getCOSObject();
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.tbcAnnotationsArray[2] = aCircle.getCOSObject();
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.tbcAnnotationsArray[3] = txtLink.getCOSObject();
        assertEquals(4, TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.tbcAnnotationsArray.length);
        // add the annotations to the page
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.pdPage = new org.apache.pdfbox.pdmodel.PDPage();
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.pdPage.setAnnotations(TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.annotationsList);
        // create test output directory
        TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.OUT_DIR.mkdirs();
    }

    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.MethodSource("provideProzeArguments")
    public void removeSingleDirectObject(String param0) throws java.io.IOException {
        // generate test file
        org.apache.pdfbox.pdmodel.PDDocument pdf = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.PDPage page = new org.apache.pdfbox.pdmodel.PDPage();
        pdf.addPage(page);
        java.util.ArrayList<org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation> pageAnnots = new java.util.ArrayList<org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation>();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup txtMark = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup.SUB_TYPE_HIGHLIGHT);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink txtLink = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink();
        // enforce the COSDictionaries to be written directly into the COSArray
        txtMark.getCOSObject().getCOSObject().setDirect(true);
        txtLink.getCOSObject().getCOSObject().setDirect(true);
        pageAnnots.add(txtMark);
        pageAnnots.add(txtMark);
        pageAnnots.add(txtMark);
        pageAnnots.add(txtLink);
        assertEquals(4, pageAnnots.size(), "There shall be 4 annotations generated");
        page.setAnnotations(pageAnnots);
        pdf.save(param0);
        pdf.close();
        pdf = org.apache.pdfbox.pdmodel.PDDocument.load(new java.io.File(TestProzeGen_PDDocument_save_java_lang_String_removeSingleDirectObject.OUT_DIR + "/removeSingleDirectObjectTest.pdf"));
        page = pdf.getPage(0);
        COSArrayList<org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation> annotations = ((COSArrayList<org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation>) (page.getAnnotations()));
        assertEquals(4, annotations.size(), "There shall be 4 annotations retrieved");
        assertEquals(4, annotations.getCOSArray().size(), "The size of the internal COSArray shall be 4");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation toBeRemoved = annotations.get(0);
        annotations.remove(toBeRemoved);
        assertEquals(3, annotations.size(), "There shall be 3 annotations left");
        assertEquals(3, annotations.getCOSArray().size(), "The size of the internal COSArray shall be 3");
        pdf.close();
    }

    private static java.util.stream.Stream<org.junit.jupiter.params.provider.Arguments> provideProzeArguments() {
        return java.util.stream.Stream.of(
        org.junit.jupiter.params.provider.Arguments.of("./000752-decoded.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000752-from-txt.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000752-locked.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000752-merged.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000752-overlaid.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000752-unlocked.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000753-decoded.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000753-from-txt.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000753-locked.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000753-merged.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000753-overlaid.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000753-unlocked.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000810-decoded.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000810-from-txt.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000810-locked.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000810-overlaid.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000810-unlocked.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000817-decoded.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000817-from-txt.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000817-locked.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000817-merged.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000817-overlaid.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000817-unlocked.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("target/test-output/pdmodel/common/removeIndirectObjectTest.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("target/test-output/pdmodel/common/removeSingleDirectObjectTest.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("target/test-output/pdmodel/common/removeSingleIndirectObjectTest.pdf")
        );
    }
}