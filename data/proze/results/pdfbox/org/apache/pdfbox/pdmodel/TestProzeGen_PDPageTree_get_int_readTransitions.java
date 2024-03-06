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
public class TestProzeGen_PDPageTree_get_int_readTransitions {
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.MethodSource("provideProzeArguments")
    public void readTransitions(int param0) throws java.io.IOException, java.net.URISyntaxException {
        PDDocument doc = PDDocument.load(new java.io.File(this.getClass().getResource("/org/apache/pdfbox/pdmodel/interactive/pagenavigation/transitions_test.pdf").toURI()));
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition firstTransition = doc.getPages().get(param0).getTransition();
        assertEquals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Glitter.name(), firstTransition.getStyle());
        assertEquals(2, firstTransition.getDuration(), 0);
        assertEquals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.TOP_LEFT_TO_BOTTOM_RIGHT.getCOSBase(), firstTransition.getDirection());
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