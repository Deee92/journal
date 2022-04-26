package org.apache.pdfbox.contentstream;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.apache.pdfbox.contentstream.operator.OperatorProcessor;
import org.apache.pdfbox.pdmodel.PDPage;
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
    public void test_addOperator_PO_b2a768536d9a4041a805d696e857360e() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.addOperator1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.contentstream.operator.graphics.CloseFillNonZeroAndStrokePath/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.contentstream.operator.OperatorProcessor paramObject1 = (org.apache.pdfbox.contentstream.operator.OperatorProcessor) paramObjects[0];
        OperatorProcessor mockOperatorProcessor = Mockito.mock(OperatorProcessor.class);
        Mockito.when(mockOperatorProcessor.getName()).thenReturn("b");
        // Act
        receivingObject.addOperator(mockOperatorProcessor);
        // Assert
        Mockito.verify(mockOperatorProcessor, Mockito.atLeastOnce()).getName();
    }

    @Test
    public void test_addOperator_CO_b2a768536d9a4041a805d696e857360e() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.addOperator1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.contentstream.operator.graphics.CloseFillNonZeroAndStrokePath/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.contentstream.operator.OperatorProcessor paramObject1 = (org.apache.pdfbox.contentstream.operator.OperatorProcessor) paramObjects[0];
        OperatorProcessor mockOperatorProcessor = Mockito.mock(OperatorProcessor.class);
        Mockito.when(mockOperatorProcessor.getName()).thenReturn("b");
        // Act
        receivingObject.addOperator(mockOperatorProcessor);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOperatorProcessor);
        orderVerifier.verify(mockOperatorProcessor, Mockito.times(1)).getName();
    }

    @Test
    public void test_addOperator_PO_a304b55ef6944c1f935e99c5bf05aed5() throws Exception {
        // Arrange
        org.apache.pdfbox.text.PDFTextStripper receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.addOperator2-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.contentstream.operator.text.BeginText/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.contentstream.operator.OperatorProcessor paramObject1 = (org.apache.pdfbox.contentstream.operator.OperatorProcessor) paramObjects[0];
        OperatorProcessor mockOperatorProcessor = Mockito.mock(OperatorProcessor.class);
        Mockito.when(mockOperatorProcessor.getName()).thenReturn("BT");
        // Act
        receivingObject.addOperator(mockOperatorProcessor);
        // Assert
        Mockito.verify(mockOperatorProcessor, Mockito.atLeastOnce()).getName();
    }

    @Test
    public void test_addOperator_CO_a304b55ef6944c1f935e99c5bf05aed5() throws Exception {
        // Arrange
        org.apache.pdfbox.text.PDFTextStripper receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.addOperator2-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.contentstream.operator.text.BeginText/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.contentstream.operator.OperatorProcessor paramObject1 = (org.apache.pdfbox.contentstream.operator.OperatorProcessor) paramObjects[0];
        OperatorProcessor mockOperatorProcessor = Mockito.mock(OperatorProcessor.class);
        Mockito.when(mockOperatorProcessor.getName()).thenReturn("BT");
        // Act
        receivingObject.addOperator(mockOperatorProcessor);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOperatorProcessor);
        orderVerifier.verify(mockOperatorProcessor, Mockito.times(1)).getName();
    }

    @Test
    public void test_addOperator_PO_c885309fb6d14662b815c359eda6a8a1() throws Exception {
        // Arrange
        PDFStreamEngine receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.addOperator3-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.contentstream.operator.graphics.CloseFillNonZeroAndStrokePath/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.contentstream.operator.OperatorProcessor paramObject1 = (org.apache.pdfbox.contentstream.operator.OperatorProcessor) paramObjects[0];
        OperatorProcessor mockOperatorProcessor = Mockito.mock(OperatorProcessor.class);
        Mockito.when(mockOperatorProcessor.getName()).thenReturn("b");
        // Act
        receivingObject.addOperator(mockOperatorProcessor);
        // Assert
        Mockito.verify(mockOperatorProcessor, Mockito.atLeastOnce()).getName();
    }

    @Test
    public void test_addOperator_CO_c885309fb6d14662b815c359eda6a8a1() throws Exception {
        // Arrange
        PDFStreamEngine receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.addOperator3-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.contentstream.operator.graphics.CloseFillNonZeroAndStrokePath/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.contentstream.operator.OperatorProcessor paramObject1 = (org.apache.pdfbox.contentstream.operator.OperatorProcessor) paramObjects[0];
        OperatorProcessor mockOperatorProcessor = Mockito.mock(OperatorProcessor.class);
        Mockito.when(mockOperatorProcessor.getName()).thenReturn("b");
        // Act
        receivingObject.addOperator(mockOperatorProcessor);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOperatorProcessor);
        orderVerifier.verify(mockOperatorProcessor, Mockito.times(1)).getName();
    }

    @Test
    public void test_processPage_PO_aa234ed5d1df4f1c8d043f869ab4a621() throws Exception {
        // Arrange
        org.apache.pdfbox.text.PDFTextStripper receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage2-receiving.xml");
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
    public void test_processPage_CO_aa234ed5d1df4f1c8d043f869ab4a621() throws Exception {
        // Arrange
        org.apache.pdfbox.text.PDFTextStripper receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage2-receiving.xml");
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
    public void test_processPage_PO_a462e1d4d6ec42c2b751c560c5dc7d78() throws Exception {
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
    public void test_processPage_CO_a462e1d4d6ec42c2b751c560c5dc7d78() throws Exception {
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

    @Test
    public void test_processPage_PO_3d6b25481b6b439a8fd59d7eb0cad0e8() throws Exception {
        // Arrange
        PDFStreamEngine receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage4-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage4-params.xml");
        org.apache.pdfbox.pdmodel.PDPage paramObject1 = (org.apache.pdfbox.pdmodel.PDPage) paramObjects[0];
        PDPage mockPDPage = Mockito.mock(PDPage.class);
        Mockito.when(mockPDPage.hasContents()).thenReturn(true);
        // Act
        receivingObject.processPage(mockPDPage);
        // Assert
        Mockito.verify(mockPDPage, Mockito.atLeastOnce()).hasContents();
    }

    @Test
    public void test_processPage_CO_3d6b25481b6b439a8fd59d7eb0cad0e8() throws Exception {
        // Arrange
        PDFStreamEngine receivingObject = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage4-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.contentstream.PDFStreamEngine.processPage4-params.xml");
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