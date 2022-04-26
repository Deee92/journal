package org.apache.pdfbox.pdmodel.font;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.Set;

import converters.FileCleanableConverter;
import org.apache.pdfbox.pdmodel.font.encoding.Encoding;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
public class TestPDSimpleFontPanktiGen {
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

    private Set insertPrivateMockField_noUnicode_InPDTrueTypeFont(PDTrueTypeFont receivingObject) throws Exception {
        Set mockSet = Mockito.mock(Set.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("noUnicode");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockSet);
        return mockSet;
    }

    private Encoding insertMockField_encoding_InPDTrueTypeFont(PDTrueTypeFont receivingObject) {
        Encoding mockEncoding = Mockito.mock(Encoding.class);
        receivingObject.encoding = mockEncoding;
        return mockEncoding;
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_toUnicode_int_org_apache_pdfbox_pdmodel_font_encoding_GlyphList_OO_ba5ee17e4c9e43be898262db48ee7b60() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int,org.apache.pdfbox.pdmodel.font.encoding.GlyphList1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int,org.apache.pdfbox.pdmodel.font.encoding.GlyphList1-params.xml");
        int paramObject1 = (Integer) paramObjects[0];
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList paramObject2 = (org.apache.pdfbox.pdmodel.font.encoding.GlyphList) paramObjects[1];
        Set mockSet = insertPrivateMockField_noUnicode_InPDTrueTypeFont(receivingObject);
        Encoding mockEncoding = insertMockField_encoding_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        Mockito.when(mockEncoding.getName(32)).thenReturn("space");
        // Act
        java.lang.String actual = receivingObject.toUnicode(paramObject1, paramObject2);
        // Assert
        Assertions.assertEquals(" ", actual);
    }

    @Test
    public void test_toUnicode_int_org_apache_pdfbox_pdmodel_font_encoding_GlyphList_PO_ba5ee17e4c9e43be898262db48ee7b60() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int,org.apache.pdfbox.pdmodel.font.encoding.GlyphList1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int,org.apache.pdfbox.pdmodel.font.encoding.GlyphList1-params.xml");
        int paramObject1 = (Integer) paramObjects[0];
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList paramObject2 = (org.apache.pdfbox.pdmodel.font.encoding.GlyphList) paramObjects[1];
        Set mockSet = insertPrivateMockField_noUnicode_InPDTrueTypeFont(receivingObject);
        Encoding mockEncoding = insertMockField_encoding_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        Mockito.when(mockEncoding.getName(32)).thenReturn("space");
        // Act
        receivingObject.toUnicode(paramObject1, paramObject2);
        // Assert
        Mockito.verify(mockSet, Mockito.atLeastOnce()).add(any(java.lang.Object.class));
        Mockito.verify(mockEncoding, Mockito.atLeastOnce()).getName(32);
    }

    @Test
    public void test_toUnicode_int_org_apache_pdfbox_pdmodel_font_encoding_GlyphList_CO_ba5ee17e4c9e43be898262db48ee7b60() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDTrueTypeFont receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int,org.apache.pdfbox.pdmodel.font.encoding.GlyphList1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDSimpleFont.toUnicode_int,org.apache.pdfbox.pdmodel.font.encoding.GlyphList1-params.xml");
        int paramObject1 = (Integer) paramObjects[0];
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList paramObject2 = (org.apache.pdfbox.pdmodel.font.encoding.GlyphList) paramObjects[1];
        Set mockSet = insertPrivateMockField_noUnicode_InPDTrueTypeFont(receivingObject);
        Encoding mockEncoding = insertMockField_encoding_InPDTrueTypeFont(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        Mockito.when(mockEncoding.getName(32)).thenReturn("space");
        // Act
        receivingObject.toUnicode(paramObject1, paramObject2);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockSet, mockEncoding);
        orderVerifier.verify(mockSet, Mockito.times(5)).add((java.lang.Object) any());
        orderVerifier.verify(mockEncoding, Mockito.times(1)).getName(anyInt());
    }
}