package org.apache.pdfbox.text;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class TestTextPositionComparatorPanktiGen {
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

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_compare_OO_23f2468454624bcaa833970ea3095431() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.text.TextPositionComparator/>";
        org.apache.pdfbox.text.TextPositionComparator receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.text.TextPositionComparator.compare1-params.xml");
        org.apache.pdfbox.text.TextPosition paramObject1 = (org.apache.pdfbox.text.TextPosition) paramObjects[0];
        org.apache.pdfbox.text.TextPosition paramObject2 = (org.apache.pdfbox.text.TextPosition) paramObjects[1];
        TextPosition mockTextPosition = Mockito.mock(TextPosition.class);
        Mockito.when(mockTextPosition.getDir()).thenReturn(0.0F);
        Mockito.when(mockTextPosition.getYDirAdj()).thenReturn(50.93988F);
        Mockito.when(mockTextPosition.getYDirAdj()).thenReturn(520.8596F);
        // Act
        int expectedObject = receivingObject.compare(mockTextPosition, paramObject2);
        // Assert
        Assertions.assertEquals(-1, expectedObject);
    }

    @Test
    public void test_compare_PO_23f2468454624bcaa833970ea3095431() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.text.TextPositionComparator/>";
        org.apache.pdfbox.text.TextPositionComparator receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.text.TextPositionComparator.compare1-params.xml");
        org.apache.pdfbox.text.TextPosition paramObject1 = (org.apache.pdfbox.text.TextPosition) paramObjects[0];
        org.apache.pdfbox.text.TextPosition paramObject2 = (org.apache.pdfbox.text.TextPosition) paramObjects[1];
        TextPosition mockTextPosition = Mockito.mock(TextPosition.class);
        Mockito.when(mockTextPosition.getDir()).thenReturn(0.0F);
        Mockito.when(mockTextPosition.getYDirAdj()).thenReturn(50.93988F);
        Mockito.when(mockTextPosition.getYDirAdj()).thenReturn(520.8596F);
        // Act
        receivingObject.compare(mockTextPosition, paramObject2);
        // Assert
        Mockito.verify(mockTextPosition, Mockito.atLeastOnce()).getDir();
        Mockito.verify(mockTextPosition, Mockito.atLeastOnce()).getYDirAdj();
    }

    @Test
    public void test_compare_CO_23f2468454624bcaa833970ea3095431() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.text.TextPositionComparator/>";
        org.apache.pdfbox.text.TextPositionComparator receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.text.TextPositionComparator.compare1-params.xml");
        org.apache.pdfbox.text.TextPosition paramObject1 = (org.apache.pdfbox.text.TextPosition) paramObjects[0];
        org.apache.pdfbox.text.TextPosition paramObject2 = (org.apache.pdfbox.text.TextPosition) paramObjects[1];
        TextPosition mockTextPosition = Mockito.mock(TextPosition.class);
        Mockito.when(mockTextPosition.getDir()).thenReturn(0.0F);
        Mockito.when(mockTextPosition.getYDirAdj()).thenReturn(50.93988F);
        Mockito.when(mockTextPosition.getYDirAdj()).thenReturn(520.8596F);
        // Act
        receivingObject.compare(mockTextPosition, paramObject2);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockTextPosition, mockTextPosition);
        orderVerifier.verify(mockTextPosition, Mockito.times(4)).getDir();
        orderVerifier.verify(mockTextPosition, Mockito.times(1)).getYDirAdj();
        orderVerifier.verify(mockTextPosition, Mockito.times(2)).getDir();
        orderVerifier.verify(mockTextPosition, Mockito.times(1)).getYDirAdj();
    }
}