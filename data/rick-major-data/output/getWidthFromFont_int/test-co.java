package org.apache.pdfbox.pdmodel.font;

import com.thoughtworks.xstream.XStream;
import converters.FileCleanableConverter;
import org.apache.fontbox.ttf.TrueTypeFont;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;

import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
public class TestPDTrueTypeFontRickGen {
    static XStream xStream = new XStream();

    private <T> T deserializeObjectFromFile(String serializedObjectFilePath) throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File serializedObjectFile = new File(classLoader.getResource(serializedObjectFilePath).getFile());
        Scanner scanner = new Scanner(serializedObjectFile);
        String serializedObjectString = scanner.useDelimiter("\\A").next();
        return (T) xStream.fromXML(serializedObjectString);
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }


    private TrueTypeFont insertPrivateMockField_ttf_InPDTrueTypeFont(PDTrueTypeFont receivingObject) throws Exception {
        TrueTypeFont mockTrueTypeFont = Mockito.mock(TrueTypeFont.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("ttf");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockTrueTypeFont);
        return mockTrueTypeFont;
    }

    @Test
    @DisplayName("getWidthFromFont-1 with output oracle, mocking [org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth(int), org.apache.fontbox.ttf.TrueTypeFont.getUnitsPerEm()]")
    public void test_getWidthFromFont_OO_117429ea5b5c49138fef41471eaed9a3() throws Exception {
        // Arrange
        PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getWidthFromFont1-receiving.xml");
        TrueTypeFont mockTrueTypeFont = insertPrivateMockField_ttf_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockTrueTypeFont.getAdvanceWidth(0)).thenReturn(1536);
        Mockito.when(mockTrueTypeFont.getUnitsPerEm()).thenReturn(2048);
        // Act
        float actual = receivingObject.getWidthFromFont(32);
        // Assert
//         Assertions.assertEquals(750.0, actual);
    }

    @Test
    @DisplayName("getWidthFromFont-1 with parameter oracle, mocking [org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth(int), org.apache.fontbox.ttf.TrueTypeFont.getUnitsPerEm()]")
    public void test_getWidthFromFont_PO_117429ea5b5c49138fef41471eaed9a3() throws Exception {
        // Arrange
        PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getWidthFromFont1-receiving.xml");
        TrueTypeFont mockTrueTypeFont = insertPrivateMockField_ttf_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockTrueTypeFont.getAdvanceWidth(0)).thenReturn(1536);
        Mockito.when(mockTrueTypeFont.getUnitsPerEm()).thenReturn(2048);
        // Act
        receivingObject.getWidthFromFont(32);
        // Assert
//         Mockito.verify(mockTrueTypeFont, Mockito.atLeastOnce()).getAdvanceWidth(0);
//         Mockito.verify(mockTrueTypeFont, Mockito.atLeastOnce()).getUnitsPerEm();
    }

    @Test
    @DisplayName("getWidthFromFont-1 with call oracle, mocking [org.apache.fontbox.ttf.TrueTypeFont.getAdvanceWidth(int), org.apache.fontbox.ttf.TrueTypeFont.getUnitsPerEm()]")
    public void test_getWidthFromFont_CO_117429ea5b5c49138fef41471eaed9a3() throws Exception {
        // Arrange
        PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.getWidthFromFont1-receiving.xml");
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