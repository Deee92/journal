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

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test merging different PDFs with AcroForms.
 */
public class TestProzeGen_setDestinationFileName_testJoinFieldsMerge_TextFieldsOnly_SameMerged {
    private static final java.io.File IN_DIR = new java.io.File("src/test/resources/org/apache/pdfbox/multipdf");

    private static final java.io.File OUT_DIR = new java.io.File("target/test-output/merge/");

    private static final java.io.File TARGET_PDF_DIR = new java.io.File("target/pdfs");

    @BeforeAll
    public static void setUp() {
        TestProzeGen_setDestinationFileName_testJoinFieldsMerge_TextFieldsOnly_SameMerged.OUT_DIR.mkdirs();
    }

    /* Test Join Field Merge for text fields only and same source documents */
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.MethodSource("provideProzeArguments")
    public void testJoinFieldsMerge_TextFieldsOnly_SameMerged(String param0) throws java.io.IOException {
        PDFMergerUtility merger = new PDFMergerUtility();
        java.io.File toBeMerged = new java.io.File(TestProzeGen_setDestinationFileName_testJoinFieldsMerge_TextFieldsOnly_SameMerged.IN_DIR, "AcroFormForMerge-TextFieldsOnly.pdf");
        java.io.File pdfOutput = new java.io.File(TestProzeGen_setDestinationFileName_testJoinFieldsMerge_TextFieldsOnly_SameMerged.OUT_DIR, "PDFBoxJoinFieldsMerge-TextFieldsOnly-SameMerged.pdf");
        merger.setDestinationFileName(param0);
        merger.addSource(toBeMerged);
        merger.addSource(toBeMerged);
        merger.setAcroFormMergeMode(PDFMergerUtility.AcroFormMergeMode.JOIN_FORM_FIELDS_MODE);
        merger.mergeDocuments(null);
        org.apache.pdfbox.pdmodel.PDDocument compliantDocument = null;
        org.apache.pdfbox.pdmodel.PDDocument toBeCompared = null;
        try {
            compliantDocument = org.apache.pdfbox.pdmodel.PDDocument.load(new java.io.File(TestProzeGen_setDestinationFileName_testJoinFieldsMerge_TextFieldsOnly_SameMerged.IN_DIR, "AcrobatMerge-TextFieldsOnly-SameMerged.pdf"));
            toBeCompared = org.apache.pdfbox.pdmodel.PDDocument.load(new java.io.File(TestProzeGen_setDestinationFileName_testJoinFieldsMerge_TextFieldsOnly_SameMerged.OUT_DIR, "PDFBoxJoinFieldsMerge-TextFieldsOnly-SameMerged.pdf"));
            org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm compliantAcroForm = compliantDocument.getDocumentCatalog().getAcroForm();
            org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm toBeComparedAcroForm = toBeCompared.getDocumentCatalog().getAcroForm();
            assertEquals(compliantAcroForm.getFields().size(), toBeComparedAcroForm.getFields().size(),
                    "There shall be the same number of root fields");
            for (org.apache.pdfbox.pdmodel.interactive.form.PDField compliantField : compliantAcroForm.getFieldTree()) {
                assertNotNull(toBeComparedAcroForm.getField(compliantField.getFullyQualifiedName()),
                        "There shall be a field with the same FQN");
                org.apache.pdfbox.pdmodel.interactive.form.PDField toBeComparedField = toBeComparedAcroForm.getField(compliantField.getFullyQualifiedName());
                compareFieldProperties(compliantField, toBeComparedField);
            }
            for (org.apache.pdfbox.pdmodel.interactive.form.PDField toBeComparedField : toBeComparedAcroForm.getFieldTree()) {
                assertNotNull(compliantAcroForm.getField(toBeComparedField.getFullyQualifiedName()),
                        "There shall be a field with the same FQN");
                org.apache.pdfbox.pdmodel.interactive.form.PDField compliantField = compliantAcroForm.getField(toBeComparedField.getFullyQualifiedName());
                compareFieldProperties(toBeComparedField, compliantField);
            }
        } finally {
            org.apache.pdfbox.io.IOUtils.closeQuietly(compliantDocument);
            org.apache.pdfbox.io.IOUtils.closeQuietly(toBeCompared);
        }
    }

    private void compareFieldProperties(org.apache.pdfbox.pdmodel.interactive.form.PDField sourceField, org.apache.pdfbox.pdmodel.interactive.form.PDField toBeComapredField) {
        // List of keys for comparison
        // Don't include too complex properties such as AP as this will fail the test because
        // of a stack overflow when
        final String[] keys = new String[]{ "FT", "T", "TU", "TM", "Ff", "V", "DV", "Opts", "TI", "I", "Rect", "DA" };
        org.apache.pdfbox.cos.COSDictionary sourceFieldCos = sourceField.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary toBeComparedCos = toBeComapredField.getCOSObject();
        for (String key : keys) {
            org.apache.pdfbox.cos.COSBase sourceBase = sourceFieldCos.getDictionaryObject(key);
            org.apache.pdfbox.cos.COSBase toBeComparedBase = toBeComparedCos.getDictionaryObject(key);
            if (sourceBase != null) {
                assertEquals(sourceBase.toString(), toBeComparedBase.toString(),
                        "The content of the field properties shall be the same");
            } else {
                assertNull(toBeComparedBase, "If the source property is null the compared property shall be null too");
            }
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