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
import static org.mockito.ArgumentMatchers.anyString;

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
    public void test_codeToGID_OO_324432cbaac2417e8547fd00323fa041() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID1-receiving.xml");
        CmapSubtable mockCmapSubtable = insertPrivateMockField_cmapWinUnicode_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable2 = insertPrivateMockField_cmapMacRoman_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable3 = insertPrivateMockField_cmapWinSymbol_InPDTrueTypeFont(receivingObject);
        TrueTypeFont mockTrueTypeFont = insertPrivateMockField_ttf_InPDTrueTypeFont(receivingObject);
        TrueTypeFont mockTrueTypeFont2 = insertPrivateMockField_ttf_InPDTrueTypeFont(receivingObject);
        TrueTypeFont mockTrueTypeFont3 = insertPrivateMockField_ttf_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockCmapSubtable.getGlyphId(32)).thenReturn(0);
        Mockito.when(mockTrueTypeFont.nameToGID("space")).thenReturn(0);
        // Act
        int actual = receivingObject.codeToGID(32);
        // Assert
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void test_codeToGID_PO_324432cbaac2417e8547fd00323fa041() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID1-receiving.xml");
        CmapSubtable mockCmapSubtable = insertPrivateMockField_cmapWinUnicode_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable2 = insertPrivateMockField_cmapMacRoman_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable3 = insertPrivateMockField_cmapWinSymbol_InPDTrueTypeFont(receivingObject);
        TrueTypeFont mockTrueTypeFont = insertPrivateMockField_ttf_InPDTrueTypeFont(receivingObject);
        TrueTypeFont mockTrueTypeFont2 = insertPrivateMockField_ttf_InPDTrueTypeFont(receivingObject);
        TrueTypeFont mockTrueTypeFont3 = insertPrivateMockField_ttf_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockCmapSubtable.getGlyphId(32)).thenReturn(0);
        Mockito.when(mockTrueTypeFont.nameToGID("space")).thenReturn(0);
        // Act
        receivingObject.codeToGID(32);
        // Assert
        Mockito.verify(mockCmapSubtable, Mockito.atLeastOnce()).getGlyphId(32);
        Mockito.verify(mockTrueTypeFont, Mockito.atLeastOnce()).nameToGID("space");
    }

    @Test
    public void test_codeToGID_CO_324432cbaac2417e8547fd00323fa041() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID1-receiving.xml");
        CmapSubtable mockCmapSubtable = insertPrivateMockField_cmapWinUnicode_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable2 = insertPrivateMockField_cmapMacRoman_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable3 = insertPrivateMockField_cmapWinSymbol_InPDTrueTypeFont(receivingObject);
        TrueTypeFont mockTrueTypeFont = insertPrivateMockField_ttf_InPDTrueTypeFont(receivingObject);
        TrueTypeFont mockTrueTypeFont2 = insertPrivateMockField_ttf_InPDTrueTypeFont(receivingObject);
        TrueTypeFont mockTrueTypeFont3 = insertPrivateMockField_ttf_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockCmapSubtable.getGlyphId(32)).thenReturn(0);
        Mockito.when(mockTrueTypeFont.nameToGID("space")).thenReturn(0);
        // Act
        receivingObject.codeToGID(32);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCmapSubtable, mockTrueTypeFont);
        orderVerifier.verify(mockCmapSubtable, Mockito.times(1)).getGlyphId(anyInt());
        orderVerifier.verify(mockTrueTypeFont, Mockito.times(1)).nameToGID(anyString());
    }

    @Test
    public void test_codeToGID_OO_c55d55008f374a3eaca735b55cb0b070() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID2-receiving.xml");
        CmapSubtable mockCmapSubtable = insertPrivateMockField_cmapWinUnicode_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable2 = insertPrivateMockField_cmapMacRoman_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable3 = insertPrivateMockField_cmapWinSymbol_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockCmapSubtable.getGlyphId(32)).thenReturn(3);
        // Act
        int actual = receivingObject.codeToGID(32);
        // Assert
        Assertions.assertEquals(3, actual);
    }

    @Test
    public void test_codeToGID_PO_c55d55008f374a3eaca735b55cb0b070() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID2-receiving.xml");
        CmapSubtable mockCmapSubtable = insertPrivateMockField_cmapWinUnicode_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable2 = insertPrivateMockField_cmapMacRoman_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable3 = insertPrivateMockField_cmapWinSymbol_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockCmapSubtable.getGlyphId(32)).thenReturn(3);
        // Act
        receivingObject.codeToGID(32);
        // Assert
        Mockito.verify(mockCmapSubtable, Mockito.atLeastOnce()).getGlyphId(32);
    }

    @Test
    public void test_codeToGID_CO_c55d55008f374a3eaca735b55cb0b070() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.codeToGID2-receiving.xml");
        CmapSubtable mockCmapSubtable = insertPrivateMockField_cmapWinUnicode_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable2 = insertPrivateMockField_cmapMacRoman_InPDTrueTypeFont(receivingObject);
        CmapSubtable mockCmapSubtable3 = insertPrivateMockField_cmapWinSymbol_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockCmapSubtable.getGlyphId(32)).thenReturn(3);
        // Act
        receivingObject.codeToGID(32);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCmapSubtable);
        orderVerifier.verify(mockCmapSubtable, Mockito.times(1)).getGlyphId(anyInt());
    }

    private TrueTypeFont insertPrivateMockField_ttf_InPDTrueTypeFont(PDTrueTypeFont receivingObject) throws Exception {
        TrueTypeFont mockTrueTypeFont = Mockito.mock(TrueTypeFont.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("ttf");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockTrueTypeFont);
        return mockTrueTypeFont;
    }

    @Test
    public void test_getWidthFromFont_OO_ec7d8ad8763744f18c910ad49dfa69dc() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getWidthFromFont1-receiving.xml");
        TrueTypeFont mockTrueTypeFont = insertPrivateMockField_ttf_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockTrueTypeFont.getAdvanceWidth(0)).thenReturn(1536);
        Mockito.when(mockTrueTypeFont.getUnitsPerEm()).thenReturn(2048);
        // Act
        float actual = receivingObject.getWidthFromFont(32);
        // Assert
        Assertions.assertEquals(750.0, actual);
    }

    @Test
    public void test_getWidthFromFont_PO_ec7d8ad8763744f18c910ad49dfa69dc() throws Exception {
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
    public void test_getWidthFromFont_CO_ec7d8ad8763744f18c910ad49dfa69dc() throws Exception {
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