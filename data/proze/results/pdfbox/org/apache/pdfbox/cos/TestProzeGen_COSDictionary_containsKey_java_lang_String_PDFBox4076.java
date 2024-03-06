/* Copyright 2018 The Apache Software Foundation.

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
package org.apache.pdfbox.cos;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProzeGen_COSDictionary_containsKey_java_lang_String_PDFBox4076 {
    /**
     * PDFBOX-4076: Check that characters outside of US_ASCII are not replaced with "?".
     *
     * @throws IOException
     */
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.MethodSource("provideProzeArguments")
    public void PDFBox4076(String param0) throws IOException {
        String special = "中国你好!";
        org.apache.pdfbox.pdmodel.PDDocument document = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.PDPage page = new org.apache.pdfbox.pdmodel.PDPage();
        document.addPage(page);
        document.getDocumentCatalog().getCOSObject().setString(COSName.getPDFName(special), special);
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        document.save(baos);
        document.close();
        document = org.apache.pdfbox.pdmodel.PDDocument.load(baos.toByteArray());
        COSDictionary catalogDict = document.getDocumentCatalog().getCOSObject();
        assertTrue(catalogDict.containsKey(param0));
        assertEquals(special, catalogDict.getString(special));
        document.close();
    }

    private static java.util.stream.Stream<org.junit.jupiter.params.provider.Arguments> provideProzeArguments() {
        return java.util.stream.Stream.of(
        org.junit.jupiter.params.provider.Arguments.of("OL14"),
        org.junit.jupiter.params.provider.Arguments.of("OL2"),
        org.junit.jupiter.params.provider.Arguments.of("OL3"),
        org.junit.jupiter.params.provider.Arguments.of("OL5"),
        org.junit.jupiter.params.provider.Arguments.of("OL6"),
        org.junit.jupiter.params.provider.Arguments.of("OL7"),
        org.junit.jupiter.params.provider.Arguments.of("中国你好!")
        );
    }
}