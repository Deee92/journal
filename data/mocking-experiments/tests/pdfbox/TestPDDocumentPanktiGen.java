package org.apache.pdfbox.pdmodel;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class TestPDDocumentPanktiGen {
    static XStream xStream = new XStream();

    private <T> T deserializeObject(String serializedObjectString) {
        return (T) xStream.fromXML(serializedObjectString);
    }

    private <T> T deserializeObject(File serializedObjectFile) throws Exception {
        Scanner scanner = new Scanner(serializedObjectFile);
        String serializedObjectString = scanner.useDelimiter("\\A").next();
        return (T) xStream.fromXML(serializedObjectString);
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_importPage_PO_253aab2681c444ad8a693344e523cc64() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocument.importPage1-receiving.xml").getFile());
        org.apache.pdfbox.pdmodel.PDDocument receivingObject = deserializeObject(fileReceiving);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocument.importPage1-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.apache.pdfbox.pdmodel.PDPage paramObject1 = (org.apache.pdfbox.pdmodel.PDPage) paramObjects[0];
        PDPage mockPDPage = Mockito.mock(PDPage.class);
        Mockito.when(mockPDPage.getRotation()).thenReturn(0);
        // Act
        receivingObject.importPage(mockPDPage);
        // Assert
        Mockito.verify(mockPDPage, Mockito.atLeastOnce()).getRotation();
    }

    @Test
    public void test_importPage_CO_253aab2681c444ad8a693344e523cc64() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocument.importPage1-receiving.xml").getFile());
        org.apache.pdfbox.pdmodel.PDDocument receivingObject = deserializeObject(fileReceiving);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocument.importPage1-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.apache.pdfbox.pdmodel.PDPage paramObject1 = (org.apache.pdfbox.pdmodel.PDPage) paramObjects[0];
        PDPage mockPDPage = Mockito.mock(PDPage.class);
        Mockito.when(mockPDPage.getRotation()).thenReturn(0);
        // Act
        receivingObject.importPage(mockPDPage);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDPage);
        orderVerifier.verify(mockPDPage).getRotation();
    }
}