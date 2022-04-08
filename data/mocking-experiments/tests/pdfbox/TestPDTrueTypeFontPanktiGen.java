package org.apache.pdfbox.pdmodel.font;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.apache.fontbox.ttf.CmapSubtable;
import org.apache.fontbox.ttf.TrueTypeFont;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
public class TestPDTrueTypeFontPanktiGen {
    static XStream xStream = new XStream();

    private <T> T deserializeObjectFromString(String serializedObjectString) {
        return (T) xStream.fromXML(serializedObjectString);
    }

    private <T> T deserializeObjectFromFile(String serializedObjectFilePath) throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File serializedObjectFile = new File(classLoader.getResource(serializedObjectFilePath).getFile());
        Scanner scanner = new Scanner(serializedObjectFile);
        String serializedObjectString = scanner.useDelimiter("\\A").next();
        return (T) xStream.fromXML(serializedObjectString);
    }

    private CmapSubtable insertPrivateMockField_cmapWinUnicode_InPDTrueTypeFont(PDTrueTypeFont receivingObject) throws Exception {
        CmapSubtable mockCmapSubtable = Mockito.mock(CmapSubtable.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("cmapWinUnicode");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockCmapSubtable);
        return mockCmapSubtable;
    }

    private CmapSubtable insertPrivateMockField_cmapMacRoman_InPDTrueTypeFont(PDTrueTypeFont receivingObject) throws Exception {
        CmapSubtable mockCmapSubtable = Mockito.mock(CmapSubtable.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("cmapMacRoman");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockCmapSubtable);
        return mockCmapSubtable;
    }

    private CmapSubtable insertPrivateMockField_cmapWinSymbol_InPDTrueTypeFont(PDTrueTypeFont receivingObject) throws Exception {
        CmapSubtable mockCmapSubtable = Mockito.mock(CmapSubtable.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("cmapWinSymbol");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockCmapSubtable);
        return mockCmapSubtable;
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_codeToGID_OO_2e80f59359054f5cbc394c5160704cde() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID1-receiving.xml");
        CmapSubtable mockCmapSubtable1 = insertPrivateMockField_cmapWinUnicode_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable2 = insertPrivateMockField_cmapMacRoman_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable3 = insertPrivateMockField_cmapWinSymbol_InPDTrueTypeFont(receivingObject);
        Mockito.lenient().when(mockCmapSubtable1.getGlyphId(32)).thenReturn(0);
        Mockito.lenient().when(mockCmapSubtable2.getGlyphId(32)).thenReturn(0);
        Mockito.lenient().when(mockCmapSubtable3.getGlyphId(32)).thenReturn(0);
        // Act
        int expectedObject = receivingObject.codeToGID(32);
        // Assert
        Assertions.assertEquals(0, expectedObject);
    }

    @Test
    public void test_codeToGID_PO_2e80f59359054f5cbc394c5160704cde() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID1-receiving.xml");
        CmapSubtable mockCmapSubtable1 = insertPrivateMockField_cmapWinUnicode_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable2 = insertPrivateMockField_cmapMacRoman_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable3 = insertPrivateMockField_cmapWinSymbol_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockCmapSubtable1.getGlyphId(32)).thenReturn(0);
        Mockito.when(mockCmapSubtable2.getGlyphId(32)).thenReturn(0);
        Mockito.when(mockCmapSubtable3.getGlyphId(32)).thenReturn(0);
        // Act
        receivingObject.codeToGID(32);
        // Assert
        Mockito.verify(mockCmapSubtable1, Mockito.atLeastOnce()).getGlyphId(32);
        Mockito.verify(mockCmapSubtable2, Mockito.atLeastOnce()).getGlyphId(32);
        Mockito.verify(mockCmapSubtable3, Mockito.atLeastOnce()).getGlyphId(32);
    }

    @Test
    public void test_codeToGID_CO_2e80f59359054f5cbc394c5160704cde() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID1-receiving.xml");
        CmapSubtable mockCmapSubtable1 = insertPrivateMockField_cmapWinUnicode_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable2 = insertPrivateMockField_cmapMacRoman_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable3 = insertPrivateMockField_cmapWinSymbol_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockCmapSubtable1.getGlyphId(32)).thenReturn(0);
        Mockito.when(mockCmapSubtable2.getGlyphId(32)).thenReturn(0);
        Mockito.when(mockCmapSubtable3.getGlyphId(32)).thenReturn(0);
        // Act
        receivingObject.codeToGID(32);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCmapSubtable1, mockCmapSubtable2, mockCmapSubtable3);
        orderVerifier.verify(mockCmapSubtable1, Mockito.times(2)).getGlyphId(anyInt());
        orderVerifier.verify(mockCmapSubtable2, Mockito.times(2)).getGlyphId(anyInt());
        orderVerifier.verify(mockCmapSubtable3, Mockito.times(2)).getGlyphId(anyInt());
    }

    @Test
    public void test_codeToGID_OO_a5b2c5e0465742b48b9a4e0cc069b45f() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID2-receiving.xml");
        CmapSubtable mockCmapSubtable1 = insertPrivateMockField_cmapWinUnicode_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable2 = insertPrivateMockField_cmapMacRoman_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable3 = insertPrivateMockField_cmapWinSymbol_InPDTrueTypeFont(receivingObject);
        Mockito.lenient().when(mockCmapSubtable1.getGlyphId(32)).thenReturn(3);
        Mockito.lenient().when(mockCmapSubtable2.getGlyphId(32)).thenReturn(3);
        Mockito.lenient().when(mockCmapSubtable3.getGlyphId(32)).thenReturn(3);
        // Act
        int expectedObject = receivingObject.codeToGID(32);
        // Assert
        Assertions.assertEquals(3, expectedObject);
    }

    @Test
    public void test_codeToGID_PO_a5b2c5e0465742b48b9a4e0cc069b45f() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID2-receiving.xml");
        CmapSubtable mockCmapSubtable1 = insertPrivateMockField_cmapWinUnicode_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable2 = insertPrivateMockField_cmapMacRoman_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable3 = insertPrivateMockField_cmapWinSymbol_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockCmapSubtable1.getGlyphId(32)).thenReturn(3);
        Mockito.when(mockCmapSubtable2.getGlyphId(32)).thenReturn(3);
        Mockito.when(mockCmapSubtable3.getGlyphId(32)).thenReturn(3);
        // Act
        receivingObject.codeToGID(32);
        // Assert
        Mockito.verify(mockCmapSubtable1, Mockito.atLeastOnce()).getGlyphId(32);
        Mockito.verify(mockCmapSubtable2, Mockito.atLeastOnce()).getGlyphId(32);
        Mockito.verify(mockCmapSubtable3, Mockito.atLeastOnce()).getGlyphId(32);
    }

    @Test
    public void test_codeToGID_CO_a5b2c5e0465742b48b9a4e0cc069b45f() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID2-receiving.xml");
        CmapSubtable mockCmapSubtable1 = insertPrivateMockField_cmapWinUnicode_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable2 = insertPrivateMockField_cmapMacRoman_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable3 = insertPrivateMockField_cmapWinSymbol_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockCmapSubtable1.getGlyphId(32)).thenReturn(3);
        Mockito.when(mockCmapSubtable2.getGlyphId(32)).thenReturn(3);
        Mockito.when(mockCmapSubtable3.getGlyphId(32)).thenReturn(3);
        // Act
        receivingObject.codeToGID(32);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCmapSubtable1, mockCmapSubtable2, mockCmapSubtable3);
        orderVerifier.verify(mockCmapSubtable1, Mockito.times(1)).getGlyphId(anyInt());
        orderVerifier.verify(mockCmapSubtable2, Mockito.times(1)).getGlyphId(anyInt());
        orderVerifier.verify(mockCmapSubtable3, Mockito.times(1)).getGlyphId(anyInt());
    }

    private TrueTypeFont insertPrivateMockField_ttf_InPDTrueTypeFont(PDTrueTypeFont receivingObject) throws Exception {
        TrueTypeFont mockTrueTypeFont = Mockito.mock(TrueTypeFont.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("ttf");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockTrueTypeFont);
        return mockTrueTypeFont;
    }

    @Test
    public void test_getWidthFromFont_OO_5c84d35fbacf4ed18c9875b92c51437b() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getWidthFromFont1-receiving.xml");
        TrueTypeFont mockTrueTypeFont = insertPrivateMockField_ttf_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockTrueTypeFont.getAdvanceWidth(0)).thenReturn(1536);
        Mockito.when(mockTrueTypeFont.getUnitsPerEm()).thenReturn(2048);
        // Act
        float expectedObject = receivingObject.getWidthFromFont(32);
        // Assert
        Assertions.assertEquals(750.0, expectedObject);
    }

    @Test
    public void test_getWidthFromFont_PO_5c84d35fbacf4ed18c9875b92c51437b() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getWidthFromFont1-receiving.xml");
        TrueTypeFont mockTrueTypeFont = insertPrivateMockField_ttf_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockTrueTypeFont.getAdvanceWidth(0)).thenReturn(1536);
        Mockito.when(mockTrueTypeFont.getUnitsPerEm()).thenReturn(2048);
        // Act
        receivingObject.getWidthFromFont(32);
        // Assert
        Mockito.verify(mockTrueTypeFont, Mockito.atLeastOnce()).getAdvanceWidth(0);
        Mockito.verify(mockTrueTypeFont, Mockito.atLeastOnce()).getUnitsPerEm();
    }

    @Test
    public void test_getWidthFromFont_CO_5c84d35fbacf4ed18c9875b92c51437b() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getWidthFromFont1-receiving.xml");
        TrueTypeFont mockTrueTypeFont = insertPrivateMockField_ttf_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockTrueTypeFont.getAdvanceWidth(0)).thenReturn(1536);
        Mockito.when(mockTrueTypeFont.getUnitsPerEm()).thenReturn(2048);
        // Act
        receivingObject.getWidthFromFont(32);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockTrueTypeFont, mockTrueTypeFont);
        orderVerifier.verify(mockTrueTypeFont, Mockito.times(1)).getAdvanceWidth(anyInt());
        orderVerifier.verify(mockTrueTypeFont, Mockito.times(1)).getUnitsPerEm();
    }
}