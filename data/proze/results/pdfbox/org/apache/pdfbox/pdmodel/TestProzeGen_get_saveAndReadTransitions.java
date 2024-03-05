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
package org.apache.pdfbox.pdmodel;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Andrea Vacondio
 */
public class TestProzeGen_get_saveAndReadTransitions {
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.MethodSource("provideProzeArguments")
    public void saveAndReadTransitions(int param0) throws java.io.IOException {
        // save
        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition transition = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Fly);
        transition.setDirection(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.NONE);
        transition.setFlyScale(0.5F);
        page.setTransition(transition, 2);
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        document.save(baos);
        document.close();
        // read
        PDDocument doc = PDDocument.load(baos.toByteArray());
        page = doc.getPages().get(param0);
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition loadedTransition = page.getTransition();
        assertEquals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Fly.name(), loadedTransition.getStyle());
        assertEquals(2, page.getCOSObject().getFloat(org.apache.pdfbox.cos.COSName.DUR), 0);
        assertEquals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.NONE.getCOSBase(), loadedTransition.getDirection());
        doc.close();
    }

    private static java.util.stream.Stream<org.junit.jupiter.params.provider.Arguments> provideProzeArguments() {
        return java.util.stream.Stream.of(
        org.junit.jupiter.params.provider.Arguments.of(0),
        org.junit.jupiter.params.provider.Arguments.of(1),
        org.junit.jupiter.params.provider.Arguments.of(2)
        );
    }
}