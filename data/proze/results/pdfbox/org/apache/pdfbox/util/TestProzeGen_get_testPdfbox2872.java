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
package org.apache.pdfbox.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Neil McErlean
 * @author Tilman Hausherr
 */
public class TestProzeGen_get_testPdfbox2872 {
    /**
     * Test of PDFBOX-2872 bug
     */
    @org.junit.jupiter.params.ParameterizedTest
    @org.junit.jupiter.params.provider.MethodSource("provideProzeArguments")
    public void testPdfbox2872(int param0) {
        Matrix m = new Matrix(2, 4, 5, 8, 2, 0);
        org.apache.pdfbox.cos.COSArray toCOSArray = m.toCOSArray();
        assertEquals(new org.apache.pdfbox.cos.COSFloat(2), toCOSArray.get(param0));
        assertEquals(new org.apache.pdfbox.cos.COSFloat(4), toCOSArray.get(param0));
        assertEquals(new org.apache.pdfbox.cos.COSFloat(5), toCOSArray.get(param0));
        assertEquals(new org.apache.pdfbox.cos.COSFloat(8), toCOSArray.get(param0));
        assertEquals(new org.apache.pdfbox.cos.COSFloat(2), toCOSArray.get(param0));
        assertEquals(new org.apache.pdfbox.cos.COSFloat(0), toCOSArray.get(param0));
    }

    /**
     * This method asserts that the matrix values for the given {@link Matrix} object have the specified values.
     *
     * @param values
     * 		the expected values
     * @param m
     * 		the matrix to test
     */
    private void assertMatrixValuesEqualTo(float[] values, Matrix m) {
        float delta = 1.0E-5F;
        for (int i = 0; i < values.length; i++) {
            // Need to convert a (row, column) coordinate into a straight index.
            int row = ((int) (Math.floor(i / 3)));
            int column = i % 3;
            StringBuilder failureMsg = new StringBuilder();
            failureMsg.append("Incorrect value for matrix[").append(row).append(",").append(column).append("]");
            assertEquals(values[i], m.getValue(row, column), delta, failureMsg.toString());
        }
    }

    private static java.util.stream.Stream<org.junit.jupiter.params.provider.Arguments> provideProzeArguments() {
        return java.util.stream.Stream.of(
        org.junit.jupiter.params.provider.Arguments.of(0),
        org.junit.jupiter.params.provider.Arguments.of(1),
        org.junit.jupiter.params.provider.Arguments.of(10),
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
        org.junit.jupiter.params.provider.Arguments.of(11),
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
        org.junit.jupiter.params.provider.Arguments.of(12),
        org.junit.jupiter.params.provider.Arguments.of(120),
        org.junit.jupiter.params.provider.Arguments.of(121),
        org.junit.jupiter.params.provider.Arguments.of(122),
        org.junit.jupiter.params.provider.Arguments.of(123),
        org.junit.jupiter.params.provider.Arguments.of(124),
        org.junit.jupiter.params.provider.Arguments.of(125),
        org.junit.jupiter.params.provider.Arguments.of(126),
        org.junit.jupiter.params.provider.Arguments.of(127),
        org.junit.jupiter.params.provider.Arguments.of(128),
        org.junit.jupiter.params.provider.Arguments.of(129),
        org.junit.jupiter.params.provider.Arguments.of(13),
        org.junit.jupiter.params.provider.Arguments.of(130),
        org.junit.jupiter.params.provider.Arguments.of(131),
        org.junit.jupiter.params.provider.Arguments.of(132),
        org.junit.jupiter.params.provider.Arguments.of(133),
        org.junit.jupiter.params.provider.Arguments.of(134),
        org.junit.jupiter.params.provider.Arguments.of(135),
        org.junit.jupiter.params.provider.Arguments.of(136),
        org.junit.jupiter.params.provider.Arguments.of(137),
        org.junit.jupiter.params.provider.Arguments.of(138),
        org.junit.jupiter.params.provider.Arguments.of(139),
        org.junit.jupiter.params.provider.Arguments.of(14),
        org.junit.jupiter.params.provider.Arguments.of(140),
        org.junit.jupiter.params.provider.Arguments.of(141),
        org.junit.jupiter.params.provider.Arguments.of(142),
        org.junit.jupiter.params.provider.Arguments.of(143),
        org.junit.jupiter.params.provider.Arguments.of(144),
        org.junit.jupiter.params.provider.Arguments.of(145),
        org.junit.jupiter.params.provider.Arguments.of(146),
        org.junit.jupiter.params.provider.Arguments.of(147),
        org.junit.jupiter.params.provider.Arguments.of(148),
        org.junit.jupiter.params.provider.Arguments.of(149),
        org.junit.jupiter.params.provider.Arguments.of(15),
        org.junit.jupiter.params.provider.Arguments.of(150),
        org.junit.jupiter.params.provider.Arguments.of(151),
        org.junit.jupiter.params.provider.Arguments.of(152),
        org.junit.jupiter.params.provider.Arguments.of(153),
        org.junit.jupiter.params.provider.Arguments.of(154),
        org.junit.jupiter.params.provider.Arguments.of(155),
        org.junit.jupiter.params.provider.Arguments.of(156),
        org.junit.jupiter.params.provider.Arguments.of(157),
        org.junit.jupiter.params.provider.Arguments.of(158),
        org.junit.jupiter.params.provider.Arguments.of(159),
        org.junit.jupiter.params.provider.Arguments.of(16),
        org.junit.jupiter.params.provider.Arguments.of(160),
        org.junit.jupiter.params.provider.Arguments.of(161),
        org.junit.jupiter.params.provider.Arguments.of(162),
        org.junit.jupiter.params.provider.Arguments.of(163),
        org.junit.jupiter.params.provider.Arguments.of(164),
        org.junit.jupiter.params.provider.Arguments.of(165),
        org.junit.jupiter.params.provider.Arguments.of(166),
        org.junit.jupiter.params.provider.Arguments.of(167),
        org.junit.jupiter.params.provider.Arguments.of(168),
        org.junit.jupiter.params.provider.Arguments.of(169),
        org.junit.jupiter.params.provider.Arguments.of(17),
        org.junit.jupiter.params.provider.Arguments.of(170),
        org.junit.jupiter.params.provider.Arguments.of(171),
        org.junit.jupiter.params.provider.Arguments.of(172),
        org.junit.jupiter.params.provider.Arguments.of(173),
        org.junit.jupiter.params.provider.Arguments.of(174),
        org.junit.jupiter.params.provider.Arguments.of(175),
        org.junit.jupiter.params.provider.Arguments.of(176),
        org.junit.jupiter.params.provider.Arguments.of(177),
        org.junit.jupiter.params.provider.Arguments.of(178),
        org.junit.jupiter.params.provider.Arguments.of(179),
        org.junit.jupiter.params.provider.Arguments.of(18),
        org.junit.jupiter.params.provider.Arguments.of(180),
        org.junit.jupiter.params.provider.Arguments.of(181),
        org.junit.jupiter.params.provider.Arguments.of(182),
        org.junit.jupiter.params.provider.Arguments.of(183),
        org.junit.jupiter.params.provider.Arguments.of(184),
        org.junit.jupiter.params.provider.Arguments.of(185),
        org.junit.jupiter.params.provider.Arguments.of(186),
        org.junit.jupiter.params.provider.Arguments.of(187),
        org.junit.jupiter.params.provider.Arguments.of(188),
        org.junit.jupiter.params.provider.Arguments.of(189),
        org.junit.jupiter.params.provider.Arguments.of(19),
        org.junit.jupiter.params.provider.Arguments.of(190),
        org.junit.jupiter.params.provider.Arguments.of(191),
        org.junit.jupiter.params.provider.Arguments.of(192),
        org.junit.jupiter.params.provider.Arguments.of(193),
        org.junit.jupiter.params.provider.Arguments.of(194),
        org.junit.jupiter.params.provider.Arguments.of(195),
        org.junit.jupiter.params.provider.Arguments.of(196),
        org.junit.jupiter.params.provider.Arguments.of(197),
        org.junit.jupiter.params.provider.Arguments.of(198),
        org.junit.jupiter.params.provider.Arguments.of(199),
        org.junit.jupiter.params.provider.Arguments.of(2),
        org.junit.jupiter.params.provider.Arguments.of(20),
        org.junit.jupiter.params.provider.Arguments.of(200),
        org.junit.jupiter.params.provider.Arguments.of(201),
        org.junit.jupiter.params.provider.Arguments.of(202),
        org.junit.jupiter.params.provider.Arguments.of(203),
        org.junit.jupiter.params.provider.Arguments.of(204),
        org.junit.jupiter.params.provider.Arguments.of(205),
        org.junit.jupiter.params.provider.Arguments.of(206),
        org.junit.jupiter.params.provider.Arguments.of(207),
        org.junit.jupiter.params.provider.Arguments.of(208),
        org.junit.jupiter.params.provider.Arguments.of(209),
        org.junit.jupiter.params.provider.Arguments.of(21),
        org.junit.jupiter.params.provider.Arguments.of(210),
        org.junit.jupiter.params.provider.Arguments.of(211),
        org.junit.jupiter.params.provider.Arguments.of(212),
        org.junit.jupiter.params.provider.Arguments.of(213),
        org.junit.jupiter.params.provider.Arguments.of(214),
        org.junit.jupiter.params.provider.Arguments.of(215),
        org.junit.jupiter.params.provider.Arguments.of(216),
        org.junit.jupiter.params.provider.Arguments.of(217),
        org.junit.jupiter.params.provider.Arguments.of(218),
        org.junit.jupiter.params.provider.Arguments.of(219),
        org.junit.jupiter.params.provider.Arguments.of(22),
        org.junit.jupiter.params.provider.Arguments.of(220),
        org.junit.jupiter.params.provider.Arguments.of(221),
        org.junit.jupiter.params.provider.Arguments.of(222),
        org.junit.jupiter.params.provider.Arguments.of(223),
        org.junit.jupiter.params.provider.Arguments.of(224),
        org.junit.jupiter.params.provider.Arguments.of(225),
        org.junit.jupiter.params.provider.Arguments.of(226),
        org.junit.jupiter.params.provider.Arguments.of(227),
        org.junit.jupiter.params.provider.Arguments.of(228),
        org.junit.jupiter.params.provider.Arguments.of(229),
        org.junit.jupiter.params.provider.Arguments.of(23),
        org.junit.jupiter.params.provider.Arguments.of(230),
        org.junit.jupiter.params.provider.Arguments.of(231),
        org.junit.jupiter.params.provider.Arguments.of(232),
        org.junit.jupiter.params.provider.Arguments.of(233),
        org.junit.jupiter.params.provider.Arguments.of(234),
        org.junit.jupiter.params.provider.Arguments.of(235),
        org.junit.jupiter.params.provider.Arguments.of(236),
        org.junit.jupiter.params.provider.Arguments.of(237),
        org.junit.jupiter.params.provider.Arguments.of(238),
        org.junit.jupiter.params.provider.Arguments.of(239),
        org.junit.jupiter.params.provider.Arguments.of(24),
        org.junit.jupiter.params.provider.Arguments.of(240),
        org.junit.jupiter.params.provider.Arguments.of(241),
        org.junit.jupiter.params.provider.Arguments.of(242),
        org.junit.jupiter.params.provider.Arguments.of(243),
        org.junit.jupiter.params.provider.Arguments.of(244),
        org.junit.jupiter.params.provider.Arguments.of(245),
        org.junit.jupiter.params.provider.Arguments.of(246),
        org.junit.jupiter.params.provider.Arguments.of(247),
        org.junit.jupiter.params.provider.Arguments.of(248),
        org.junit.jupiter.params.provider.Arguments.of(249),
        org.junit.jupiter.params.provider.Arguments.of(25),
        org.junit.jupiter.params.provider.Arguments.of(250),
        org.junit.jupiter.params.provider.Arguments.of(251),
        org.junit.jupiter.params.provider.Arguments.of(252),
        org.junit.jupiter.params.provider.Arguments.of(253),
        org.junit.jupiter.params.provider.Arguments.of(254),
        org.junit.jupiter.params.provider.Arguments.of(255),
        org.junit.jupiter.params.provider.Arguments.of(26),
        org.junit.jupiter.params.provider.Arguments.of(27),
        org.junit.jupiter.params.provider.Arguments.of(28),
        org.junit.jupiter.params.provider.Arguments.of(29),
        org.junit.jupiter.params.provider.Arguments.of(3),
        org.junit.jupiter.params.provider.Arguments.of(30),
        org.junit.jupiter.params.provider.Arguments.of(31),
        org.junit.jupiter.params.provider.Arguments.of(32),
        org.junit.jupiter.params.provider.Arguments.of(33),
        org.junit.jupiter.params.provider.Arguments.of(34),
        org.junit.jupiter.params.provider.Arguments.of(35),
        org.junit.jupiter.params.provider.Arguments.of(36),
        org.junit.jupiter.params.provider.Arguments.of(37),
        org.junit.jupiter.params.provider.Arguments.of(38),
        org.junit.jupiter.params.provider.Arguments.of(39),
        org.junit.jupiter.params.provider.Arguments.of(4),
        org.junit.jupiter.params.provider.Arguments.of(40),
        org.junit.jupiter.params.provider.Arguments.of(41),
        org.junit.jupiter.params.provider.Arguments.of(42),
        org.junit.jupiter.params.provider.Arguments.of(43),
        org.junit.jupiter.params.provider.Arguments.of(44),
        org.junit.jupiter.params.provider.Arguments.of(45),
        org.junit.jupiter.params.provider.Arguments.of(46),
        org.junit.jupiter.params.provider.Arguments.of(47),
        org.junit.jupiter.params.provider.Arguments.of(48),
        org.junit.jupiter.params.provider.Arguments.of(49),
        org.junit.jupiter.params.provider.Arguments.of(5),
        org.junit.jupiter.params.provider.Arguments.of(50),
        org.junit.jupiter.params.provider.Arguments.of(51),
        org.junit.jupiter.params.provider.Arguments.of(52),
        org.junit.jupiter.params.provider.Arguments.of(53),
        org.junit.jupiter.params.provider.Arguments.of(54),
        org.junit.jupiter.params.provider.Arguments.of(55),
        org.junit.jupiter.params.provider.Arguments.of(56),
        org.junit.jupiter.params.provider.Arguments.of(57),
        org.junit.jupiter.params.provider.Arguments.of(58),
        org.junit.jupiter.params.provider.Arguments.of(59),
        org.junit.jupiter.params.provider.Arguments.of(6),
        org.junit.jupiter.params.provider.Arguments.of(60),
        org.junit.jupiter.params.provider.Arguments.of(61),
        org.junit.jupiter.params.provider.Arguments.of(62),
        org.junit.jupiter.params.provider.Arguments.of(63),
        org.junit.jupiter.params.provider.Arguments.of(64),
        org.junit.jupiter.params.provider.Arguments.of(65),
        org.junit.jupiter.params.provider.Arguments.of(66),
        org.junit.jupiter.params.provider.Arguments.of(67),
        org.junit.jupiter.params.provider.Arguments.of(68),
        org.junit.jupiter.params.provider.Arguments.of(69),
        org.junit.jupiter.params.provider.Arguments.of(7),
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
        org.junit.jupiter.params.provider.Arguments.of(8),
        org.junit.jupiter.params.provider.Arguments.of(80),
        org.junit.jupiter.params.provider.Arguments.of(81),
        org.junit.jupiter.params.provider.Arguments.of(82),
        org.junit.jupiter.params.provider.Arguments.of(83),
        org.junit.jupiter.params.provider.Arguments.of(84),
        org.junit.jupiter.params.provider.Arguments.of(85),
        org.junit.jupiter.params.provider.Arguments.of(86),
        org.junit.jupiter.params.provider.Arguments.of(87),
        org.junit.jupiter.params.provider.Arguments.of(88),
        org.junit.jupiter.params.provider.Arguments.of(89),
        org.junit.jupiter.params.provider.Arguments.of(9),
        org.junit.jupiter.params.provider.Arguments.of(90),
        org.junit.jupiter.params.provider.Arguments.of(91),
        org.junit.jupiter.params.provider.Arguments.of(92),
        org.junit.jupiter.params.provider.Arguments.of(93),
        org.junit.jupiter.params.provider.Arguments.of(94),
        org.junit.jupiter.params.provider.Arguments.of(95),
        org.junit.jupiter.params.provider.Arguments.of(96),
        org.junit.jupiter.params.provider.Arguments.of(97),
        org.junit.jupiter.params.provider.Arguments.of(98),
        org.junit.jupiter.params.provider.Arguments.of(99)
        );
    }
}