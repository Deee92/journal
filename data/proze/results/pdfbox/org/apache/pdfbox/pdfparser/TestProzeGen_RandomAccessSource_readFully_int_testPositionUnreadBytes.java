/* Copyright 2014 The Apache Software Foundation.

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
package org.apache.pdfbox.pdfparser;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unittest for org.apache.pdfbox.pdfparser.RandomAccessSource
 */
public class TestProzeGen_RandomAccessSource_readFully_int_testPositionUnreadBytes {
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.MethodSource("provideProzeArguments")
    public void testPositionUnreadBytes(int param0) throws java.io.IOException {
        byte[] inputValues = new byte[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(inputValues);
        RandomAccessSource randomAccessSource = new RandomAccessSource(new org.apache.pdfbox.io.RandomAccessBuffer(bais));
        assertEquals(0, randomAccessSource.getPosition());
        randomAccessSource.read();
        randomAccessSource.read();
        byte[] readBytes = randomAccessSource.readFully(param0);
        assertEquals(8, randomAccessSource.getPosition());
        randomAccessSource.unread(readBytes);
        assertEquals(2, randomAccessSource.getPosition());
        randomAccessSource.read();
        assertEquals(3, randomAccessSource.getPosition());
        randomAccessSource.read(readBytes, 2, 4);
        assertEquals(7, randomAccessSource.getPosition());
        randomAccessSource.unread(readBytes, 2, 4);
        assertEquals(3, randomAccessSource.getPosition());
        randomAccessSource.close();
    }

    private static java.util.stream.Stream<org.junit.jupiter.params.provider.Arguments> provideProzeArguments() {
        return java.util.stream.Stream.of(
        org.junit.jupiter.params.provider.Arguments.of(4),
        org.junit.jupiter.params.provider.Arguments.of(5),
        org.junit.jupiter.params.provider.Arguments.of(6)
        );
    }
}