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
package org.apache.pdfbox.pdmodel.font;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * A test for correctly parsing TTF files.
 */
public class TestProzeGen_CmapSubtable_getGlyphId_int_testPostTable {
    /**
     * Test the post table parser.
     *
     * @throws IOException
     * 		if an error occurs.
     */
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.MethodSource("provideProzeArguments")
    public void testPostTable(int param0) throws IOException {
        java.io.InputStream input = PDFont.class.getResourceAsStream("/org/apache/pdfbox/resources/ttf/LiberationSans-Regular.ttf");
        assertNotNull(input);
        org.apache.fontbox.ttf.TTFParser parser = new org.apache.fontbox.ttf.TTFParser();
        org.apache.fontbox.ttf.TrueTypeFont font = parser.parse(input);
        org.apache.fontbox.ttf.CmapTable cmapTable = font.getCmap();
        assertNotNull(cmapTable);
        org.apache.fontbox.ttf.CmapSubtable[] cmaps = cmapTable.getCmaps();
        assertNotNull(cmaps);
        org.apache.fontbox.ttf.CmapSubtable cmap = null;
        for (org.apache.fontbox.ttf.CmapSubtable e : cmaps) {
            if ((e.getPlatformId() == org.apache.fontbox.ttf.NameRecord.PLATFORM_WINDOWS) && (e.getPlatformEncodingId() == org.apache.fontbox.ttf.NameRecord.ENCODING_WINDOWS_UNICODE_BMP)) {
                cmap = e;
                break;
            }
        }
        assertNotNull(cmap);
        org.apache.fontbox.ttf.PostScriptTable post = font.getPostScript();
        assertNotNull(post);
        String[] glyphNames = font.getPostScript().getGlyphNames();
        assertNotNull(glyphNames);
        // test a WGL4 (Macintosh standard) name
        int gid = cmap.getGlyphId(param0);// TRADE MARK SIGN

        assertEquals("trademark", glyphNames[gid]);
        // test an additional name
        gid = cmap.getGlyphId(param0);// EURO SIGN

        assertEquals("Euro", glyphNames[gid]);
    }

    private static java.util.stream.Stream<org.junit.jupiter.params.provider.Arguments> provideProzeArguments() {
        return java.util.stream.Stream.of(
        org.junit.jupiter.params.provider.Arguments.of(100),
        org.junit.jupiter.params.provider.Arguments.of(101),
        org.junit.jupiter.params.provider.Arguments.of(102),
        org.junit.jupiter.params.provider.Arguments.of(103),
        org.junit.jupiter.params.provider.Arguments.of(104),
        org.junit.jupiter.params.provider.Arguments.of(105),
        org.junit.jupiter.params.provider.Arguments.of(106),
        org.junit.jupiter.params.provider.Arguments.of(107),
        org.junit.jupiter.params.provider.Arguments.of(108),
        org.junit.jupiter.params.provider.Arguments.of(109),
        org.junit.jupiter.params.provider.Arguments.of(110),
        org.junit.jupiter.params.provider.Arguments.of(111),
        org.junit.jupiter.params.provider.Arguments.of(112),
        org.junit.jupiter.params.provider.Arguments.of(113),
        org.junit.jupiter.params.provider.Arguments.of(114),
        org.junit.jupiter.params.provider.Arguments.of(115),
        org.junit.jupiter.params.provider.Arguments.of(116),
        org.junit.jupiter.params.provider.Arguments.of(117),
        org.junit.jupiter.params.provider.Arguments.of(118),
        org.junit.jupiter.params.provider.Arguments.of(119),
        org.junit.jupiter.params.provider.Arguments.of(120),
        org.junit.jupiter.params.provider.Arguments.of(121),
        org.junit.jupiter.params.provider.Arguments.of(122),
        org.junit.jupiter.params.provider.Arguments.of(32),
        org.junit.jupiter.params.provider.Arguments.of(33),
        org.junit.jupiter.params.provider.Arguments.of(39),
        org.junit.jupiter.params.provider.Arguments.of(40),
        org.junit.jupiter.params.provider.Arguments.of(41),
        org.junit.jupiter.params.provider.Arguments.of(44),
        org.junit.jupiter.params.provider.Arguments.of(45),
        org.junit.jupiter.params.provider.Arguments.of(46),
        org.junit.jupiter.params.provider.Arguments.of(47),
        org.junit.jupiter.params.provider.Arguments.of(48),
        org.junit.jupiter.params.provider.Arguments.of(49),
        org.junit.jupiter.params.provider.Arguments.of(50),
        org.junit.jupiter.params.provider.Arguments.of(51),
        org.junit.jupiter.params.provider.Arguments.of(52),
        org.junit.jupiter.params.provider.Arguments.of(53),
        org.junit.jupiter.params.provider.Arguments.of(54),
        org.junit.jupiter.params.provider.Arguments.of(55),
        org.junit.jupiter.params.provider.Arguments.of(58),
        org.junit.jupiter.params.provider.Arguments.of(59),
        org.junit.jupiter.params.provider.Arguments.of(63),
        org.junit.jupiter.params.provider.Arguments.of(65),
        org.junit.jupiter.params.provider.Arguments.of(66),
        org.junit.jupiter.params.provider.Arguments.of(67),
        org.junit.jupiter.params.provider.Arguments.of(68),
        org.junit.jupiter.params.provider.Arguments.of(69),
        org.junit.jupiter.params.provider.Arguments.of(70),
        org.junit.jupiter.params.provider.Arguments.of(71),
        org.junit.jupiter.params.provider.Arguments.of(72),
        org.junit.jupiter.params.provider.Arguments.of(73),
        org.junit.jupiter.params.provider.Arguments.of(74),
        org.junit.jupiter.params.provider.Arguments.of(75),
        org.junit.jupiter.params.provider.Arguments.of(76),
        org.junit.jupiter.params.provider.Arguments.of(77),
        org.junit.jupiter.params.provider.Arguments.of(78),
        org.junit.jupiter.params.provider.Arguments.of(79),
        org.junit.jupiter.params.provider.Arguments.of(80),
        org.junit.jupiter.params.provider.Arguments.of(81),
        org.junit.jupiter.params.provider.Arguments.of(82),
        org.junit.jupiter.params.provider.Arguments.of(8217),
        org.junit.jupiter.params.provider.Arguments.of(8220),
        org.junit.jupiter.params.provider.Arguments.of(8221),
        org.junit.jupiter.params.provider.Arguments.of(83),
        org.junit.jupiter.params.provider.Arguments.of(8364),
        org.junit.jupiter.params.provider.Arguments.of(84),
        org.junit.jupiter.params.provider.Arguments.of(8482),
        org.junit.jupiter.params.provider.Arguments.of(85),
        org.junit.jupiter.params.provider.Arguments.of(87),
        org.junit.jupiter.params.provider.Arguments.of(88),
        org.junit.jupiter.params.provider.Arguments.of(89),
        org.junit.jupiter.params.provider.Arguments.of(90),
        org.junit.jupiter.params.provider.Arguments.of(97),
        org.junit.jupiter.params.provider.Arguments.of(98),
        org.junit.jupiter.params.provider.Arguments.of(99)
        );
    }
}