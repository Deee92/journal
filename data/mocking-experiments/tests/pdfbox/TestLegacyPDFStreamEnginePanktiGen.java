package org.apache.pdfbox.text;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.apache.pdfbox.pdmodel.PDPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class TestLegacyPDFStreamEnginePanktiGen {
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
    public void test_processPage_PO_1613643e16f84812847e079b8b01725f() throws Exception {
        // Arrange
        org.apache.pdfbox.text.PDFTextStripper receivingObject = deserializeObjectFromFile("org.apache.pdfbox.text.LegacyPDFStreamEngine.processPage1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.text.LegacyPDFStreamEngine.processPage1-params.xml");
        org.apache.pdfbox.pdmodel.PDPage paramObject1 = (org.apache.pdfbox.pdmodel.PDPage) paramObjects[0];
        PDPage mockPDPage = Mockito.mock(PDPage.class);
        Mockito.when(mockPDPage.getRotation()).thenReturn(0);
        // Act
        receivingObject.processPage(mockPDPage);
        // Assert
        Mockito.verify(mockPDPage, Mockito.atLeastOnce()).getRotation();
    }

    @Test
    public void test_processPage_CO_1613643e16f84812847e079b8b01725f() throws Exception {
        // Arrange
        org.apache.pdfbox.text.PDFTextStripper receivingObject = deserializeObjectFromFile("org.apache.pdfbox.text.LegacyPDFStreamEngine.processPage1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.text.LegacyPDFStreamEngine.processPage1-params.xml");
        org.apache.pdfbox.pdmodel.PDPage paramObject1 = (org.apache.pdfbox.pdmodel.PDPage) paramObjects[0];
        PDPage mockPDPage = Mockito.mock(PDPage.class);
        Mockito.when(mockPDPage.getRotation()).thenReturn(0);
        // Act
        receivingObject.processPage(mockPDPage);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDPage);
        orderVerifier.verify(mockPDPage, Mockito.times(1)).getRotation();
    }
}