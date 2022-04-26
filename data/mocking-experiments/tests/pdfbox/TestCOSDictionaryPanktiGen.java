package org.apache.pdfbox.cos;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Map;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class TestCOSDictionaryPanktiGen {
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

    private Map insertMockField_items_InCOSDictionary(COSDictionary receivingObject) {
        Map mockMap = Mockito.mock(Map.class);
        receivingObject.items = mockMap;
        return mockMap;
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_containsValue_OO_13022effac414a179df18cef33653ada() throws Exception {
        // Arrange
        org.apache.pdfbox.cos.COSDictionary receivingObject = deserializeObjectFromFile("org.apache.pdfbox.cos.COSDictionary.containsValue1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.cos.COSDictionary.containsValue1-params.xml");
        java.lang.Object paramObject1 = (java.lang.Object) paramObjects[0];
        Map mockMap = insertMockField_items_InCOSDictionary(receivingObject);
        Mockito.when(mockMap.containsValue(any(java.lang.Object.class))).thenReturn(false);
        // Act
        boolean actual = receivingObject.containsValue(paramObject1);
        // Assert
        Assertions.assertEquals(false, actual);
    }

    @Test
    public void test_containsValue_PO_13022effac414a179df18cef33653ada() throws Exception {
        // Arrange
        org.apache.pdfbox.cos.COSDictionary receivingObject = deserializeObjectFromFile("org.apache.pdfbox.cos.COSDictionary.containsValue1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.cos.COSDictionary.containsValue1-params.xml");
        java.lang.Object paramObject1 = (java.lang.Object) paramObjects[0];
        Map mockMap = insertMockField_items_InCOSDictionary(receivingObject);
        Mockito.when(mockMap.containsValue(any(java.lang.Object.class))).thenReturn(false);
        // Act
        receivingObject.containsValue(paramObject1);
        // Assert
        Mockito.verify(mockMap, Mockito.atLeastOnce()).containsValue(any(java.lang.Object.class));
    }

    @Test
    public void test_containsValue_CO_13022effac414a179df18cef33653ada() throws Exception {
        // Arrange
        org.apache.pdfbox.cos.COSDictionary receivingObject = deserializeObjectFromFile("org.apache.pdfbox.cos.COSDictionary.containsValue1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.cos.COSDictionary.containsValue1-params.xml");
        java.lang.Object paramObject1 = (java.lang.Object) paramObjects[0];
        Map mockMap = insertMockField_items_InCOSDictionary(receivingObject);
        Mockito.when(mockMap.containsValue(any(java.lang.Object.class))).thenReturn(false);
        // Act
        receivingObject.containsValue(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockMap);
        orderVerifier.verify(mockMap, Mockito.times(1)).containsValue((java.lang.Object) any());
    }
}