package org.apache.pdfbox.multipdf;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.Set;

import converters.FileCleanableConverter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class TestPDFCloneUtilityPanktiGen {
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

    private Set insertPrivateMockField_clonedValues_InPDFCloneUtility(PDFCloneUtility receivingObject) throws Exception {
        Set mockSet = Mockito.mock(Set.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("clonedValues");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockSet);
        return mockSet;
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_cloneForNewDocument_PO_530cd57b91364baeae3ecc28795ecb60() throws Exception {
        // Arrange
        org.apache.pdfbox.multipdf.PDFCloneUtility receivingObject = deserializeObjectFromFile("org.apache.pdfbox.multipdf.PDFCloneUtility.cloneForNewDocument1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        java.lang.Object paramObject1 = (java.lang.Object) paramObjects[0];
        Set mockSet = insertPrivateMockField_clonedValues_InPDFCloneUtility(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.cloneForNewDocument(paramObject1);
        // Assert
        Mockito.verify(mockSet, Mockito.atLeastOnce()).add(any(java.lang.Object.class));
    }

    @Test
    public void test_cloneForNewDocument_CO_530cd57b91364baeae3ecc28795ecb60() throws Exception {
        // Arrange
        org.apache.pdfbox.multipdf.PDFCloneUtility receivingObject = deserializeObjectFromFile("org.apache.pdfbox.multipdf.PDFCloneUtility.cloneForNewDocument1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <null/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        java.lang.Object paramObject1 = (java.lang.Object) paramObjects[0];
        Set mockSet = insertPrivateMockField_clonedValues_InPDFCloneUtility(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.cloneForNewDocument(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockSet);
        orderVerifier.verify(mockSet, Mockito.times(4)).add((java.lang.Object) any());
    }
}