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
public class TestProzeGen_setDestinationFileName_testAnnotsEntry {
    private static final java.io.File IN_DIR = new java.io.File("src/test/resources/org/apache/pdfbox/multipdf");

    private static final java.io.File OUT_DIR = new java.io.File("target/test-output/merge/");

    private static final java.io.File TARGET_PDF_DIR = new java.io.File("target/pdfs");

    @BeforeAll
    public static void setUp() {
        TestProzeGen_setDestinationFileName_testAnnotsEntry.OUT_DIR.mkdirs();
    }
    
    /* PDFBOX-1031 Ensure that after merging the PDFs there is an Annots entry per page. */
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.MethodSource("provideProzeArguments")
    public void testAnnotsEntry(String param0) throws java.io.IOException {
        java.io.InputStream s1 = null;
        java.io.InputStream s2 = null;
        // Merge the PDFs form PDFBOX-1031
        PDFMergerUtility merger = new PDFMergerUtility();
        try {
            java.io.File f1 = new java.io.File(TestProzeGen_setDestinationFileName_testAnnotsEntry.TARGET_PDF_DIR, "PDFBOX-1031-1.pdf");
            s1 = new java.io.FileInputStream(f1);
            java.io.File f2 = new java.io.File(TestProzeGen_setDestinationFileName_testAnnotsEntry.TARGET_PDF_DIR, "PDFBOX-1031-2.pdf");
            s2 = new java.io.FileInputStream(f2);
            java.io.File pdfOutput = new java.io.File(TestProzeGen_setDestinationFileName_testAnnotsEntry.OUT_DIR, "PDFBOX-1031.pdf");
            merger.setDestinationFileName(param0);
            merger.addSource(s1);
            merger.addSource(s2);
            merger.mergeDocuments(null);
            // Test merge result
            org.apache.pdfbox.pdmodel.PDDocument mergedPDF = org.apache.pdfbox.pdmodel.PDDocument.load(pdfOutput);
            assertEquals(2, mergedPDF.getNumberOfPages(),
                    "There shall be 2 pages");
            assertNotNull(mergedPDF.getPage(0).getCOSObject().getDictionaryObject(org.apache.pdfbox.cos.COSName.ANNOTS),
                    "There shall be an /Annots entry for the first page");
            assertEquals(1, mergedPDF.getPage(0).getAnnotations().size(),
                    "There shall be 1 annotation for the first page");
            assertNotNull(mergedPDF.getPage(1).getCOSObject().getDictionaryObject(org.apache.pdfbox.cos.COSName.ANNOTS),
                    "There shall be an /Annots entry for the second page");
            assertEquals(1, mergedPDF.getPage(0).getAnnotations().size(),
                    "There shall be 1 annotation for the second page");
            mergedPDF.close();
        } finally {
            org.apache.pdfbox.io.IOUtils.closeQuietly(s1);
            org.apache.pdfbox.io.IOUtils.closeQuietly(s2);
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