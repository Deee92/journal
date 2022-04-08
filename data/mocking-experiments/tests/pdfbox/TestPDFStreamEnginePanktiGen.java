package org.apache.pdfbox.contentstream;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class TestPDFStreamEnginePanktiGen {
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
    public void test_processPage_PO_dee429269330425e8cbd97b82873a675() throws Exception {
        // Arrange
        org.apache.pdfbox.text.PDFTextStripper receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage1-params.xml");
        org.apache.pdfbox.pdmodel.PDPage paramObject1 = (org.apache.pdfbox.pdmodel.PDPage) paramObjects[0];
        PDPage mockPDPage = Mockito.mock(PDPage.class);
        Mockito.when(mockPDPage.hasContents()).thenReturn(true);
        // Act
        receivingObject.processPage(mockPDPage);
        // Assert
        Mockito.verify(mockPDPage, Mockito.atLeastOnce()).hasContents();
    }

    @Test
    public void test_processPage_CO_dee429269330425e8cbd97b82873a675() throws Exception {
        // Arrange
        org.apache.pdfbox.text.PDFTextStripper receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage1-params.xml");
        org.apache.pdfbox.pdmodel.PDPage paramObject1 = (org.apache.pdfbox.pdmodel.PDPage) paramObjects[0];
        PDPage mockPDPage = Mockito.mock(PDPage.class);
        Mockito.when(mockPDPage.hasContents()).thenReturn(true);
        // Act
        receivingObject.processPage(mockPDPage);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDPage);
        orderVerifier.verify(mockPDPage, Mockito.times(1)).hasContents();
    }

    @Test
    public void test_processPage_PO_3c8eda53742448f2a8a094dbaa85e47f() throws Exception {
        // Arrange
        PDFStreamEngine receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage2-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage2-params.xml");
        org.apache.pdfbox.pdmodel.PDPage paramObject1 = (org.apache.pdfbox.pdmodel.PDPage) paramObjects[0];
        PDPage mockPDPage = Mockito.mock(PDPage.class);
        Mockito.when(mockPDPage.hasContents()).thenReturn(true);
        // Act
        receivingObject.processPage(mockPDPage);
        // Assert
        Mockito.verify(mockPDPage, Mockito.atLeastOnce()).hasContents();
    }

    @Test
    public void test_processPage_CO_3c8eda53742448f2a8a094dbaa85e47f() throws Exception {
        // Arrange
        PDFStreamEngine receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage2-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage2-params.xml");
        org.apache.pdfbox.pdmodel.PDPage paramObject1 = (org.apache.pdfbox.pdmodel.PDPage) paramObjects[0];
        PDPage mockPDPage = Mockito.mock(PDPage.class);
        Mockito.when(mockPDPage.hasContents()).thenReturn(true);
        // Act
        receivingObject.processPage(mockPDPage);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDPage);
        orderVerifier.verify(mockPDPage, Mockito.times(1)).hasContents();
    }

    @Test
    public void test_processPage_PO_4392e0614b63407495a9dcf0a56fc134() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage3-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage3-params.xml");
        org.apache.pdfbox.pdmodel.PDPage paramObject1 = (org.apache.pdfbox.pdmodel.PDPage) paramObjects[0];
        PDPage mockPDPage = Mockito.mock(PDPage.class);
        Mockito.when(mockPDPage.hasContents()).thenReturn(true);
        // Act
        receivingObject.processPage(mockPDPage);
        // Assert
        Mockito.verify(mockPDPage, Mockito.atLeastOnce()).hasContents();
    }

    @Test
    public void test_processPage_CO_4392e0614b63407495a9dcf0a56fc134() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage3-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage3-params.xml");
        org.apache.pdfbox.pdmodel.PDPage paramObject1 = (org.apache.pdfbox.pdmodel.PDPage) paramObjects[0];
        PDPage mockPDPage = Mockito.mock(PDPage.class);
        Mockito.when(mockPDPage.hasContents()).thenReturn(true);
        // Act
        receivingObject.processPage(mockPDPage);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDPage);
        orderVerifier.verify(mockPDPage, Mockito.times(1)).hasContents();
    }
}