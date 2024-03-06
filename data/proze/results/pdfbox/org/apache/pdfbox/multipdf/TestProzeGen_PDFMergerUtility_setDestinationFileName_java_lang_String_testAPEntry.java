/* Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements.  See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License.  You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package org.apache.pdfbox.multipdf;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Test merging different PDFs with AcroForms.
 */
public class TestProzeGen_PDFMergerUtility_setDestinationFileName_java_lang_String_testAPEntry {
    private static final java.io.File IN_DIR = new java.io.File("src/test/resources/org/apache/pdfbox/multipdf");

    private static final java.io.File OUT_DIR = new java.io.File("target/test-output/merge/");

    private static final java.io.File TARGET_PDF_DIR = new java.io.File("target/pdfs");

    @BeforeAll
    public static void setUp() {
        TestProzeGen_PDFMergerUtility_setDestinationFileName_java_lang_String_testAPEntry.OUT_DIR.mkdirs();
    }
    
    /* PDFBOX-1100 Ensure that after merging the PDFs there is an AP and V entry. */
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.MethodSource("provideProzeArguments")
    public void testAPEntry(String param0) throws java.io.IOException {
        java.io.InputStream is1 = null;
        java.io.InputStream is2 = null;
        // Merge the PDFs form PDFBOX-1100
        PDFMergerUtility merger = new PDFMergerUtility();
        try {
            java.io.File file1 = new java.io.File(TestProzeGen_PDFMergerUtility_setDestinationFileName_java_lang_String_testAPEntry.TARGET_PDF_DIR, "PDFBOX-1100-1.pdf");
            is1 = new java.io.FileInputStream(file1);
            java.io.File file2 = new java.io.File(TestProzeGen_PDFMergerUtility_setDestinationFileName_java_lang_String_testAPEntry.TARGET_PDF_DIR, "PDFBOX-1100-2.pdf");
            is2 = new java.io.FileInputStream(file2);
            java.io.File pdfOutput = new java.io.File(TestProzeGen_PDFMergerUtility_setDestinationFileName_java_lang_String_testAPEntry.OUT_DIR, "PDFBOX-1100.pdf");
            merger.setDestinationFileName(param0);
            merger.addSource(is1);
            merger.addSource(is2);
            merger.mergeDocuments(null);
            // Test merge result
            org.apache.pdfbox.pdmodel.PDDocument mergedPDF = org.apache.pdfbox.pdmodel.PDDocument.load(pdfOutput);
            assertEquals(2, mergedPDF.getNumberOfPages(),
                    "There shall be 2 pages");
            org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm acroForm = mergedPDF.getDocumentCatalog().getAcroForm();
            org.apache.pdfbox.pdmodel.interactive.form.PDField formField = acroForm.getField("Testfeld");
            assertNotNull(formField.getCOSObject().getDictionaryObject(org.apache.pdfbox.cos.COSName.AP),
                    "There shall be an /AP entry for the field");
            assertNotNull(formField.getCOSObject().getDictionaryObject(org.apache.pdfbox.cos.COSName.V),
                    "There shall be a /V entry for the field");
            formField = acroForm.getField("Testfeld2");
            assertNotNull(formField.getCOSObject().getDictionaryObject(org.apache.pdfbox.cos.COSName.AP),
                    "There shall be an /AP entry for the field");
            assertNotNull(formField.getCOSObject().getDictionaryObject(org.apache.pdfbox.cos.COSName.V),
                    "There shall be a /V entry for the field");
            mergedPDF.close();
        } finally {
            org.apache.pdfbox.io.IOUtils.closeQuietly(is1);
            org.apache.pdfbox.io.IOUtils.closeQuietly(is2);
        }
    }

    private static java.util.stream.Stream<org.junit.jupiter.params.provider.Arguments> provideProzeArguments() {
        return java.util.stream.Stream.of(
        org.junit.jupiter.params.provider.Arguments.of("./000752-merged.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000753-merged.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("./000817-merged.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("/home/dee/dev/forbi/pdfbox/pdfbox/target/test-output/merge/PDFBOX-1031.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("/home/dee/dev/forbi/pdfbox/pdfbox/target/test-output/merge/PDFBOX-1065.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("/home/dee/dev/forbi/pdfbox/pdfbox/target/test-output/merge/PDFBOX-1100.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("/home/dee/dev/forbi/pdfbox/pdfbox/target/test-output/merge/PDFBoxJoinFieldsMerge-TextFieldsOnly-SameMerged.pdf"),
        org.junit.jupiter.params.provider.Arguments.of("/home/dee/dev/forbi/pdfbox/pdfbox/target/test-output/merge/PDFBoxLegacyMerge-SameMerged.pdf")
        );
    }
}