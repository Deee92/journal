package org.apache.pdfbox.pdfwriter;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class TestCOSWriterPanktiGen {
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

    private OutputStream insertPrivateMockField_incrementalOutput_InCOSWriter(COSWriter receivingObject) throws Exception {
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("incrementalOutput");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockOutputStream);
        return mockOutputStream;
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_close_PO_7f96e65b0d3b4d8e8222d9b6aaa89a8d() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close2-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).close();
    }

    @Test
    public void test_close_CO_7f96e65b0d3b4d8e8222d9b6aaa89a8d() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close2-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(10)).close();
    }

    @Test
    public void test_close_PO_d44c36dab82545bca92347318a5a2857() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close3-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).close();
    }

    @Test
    public void test_close_CO_d44c36dab82545bca92347318a5a2857() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close3-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(10)).close();
    }

    @Test
    public void test_close_PO_4b48c59015e244078695ed6499d4de97() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close4-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).close();
    }

    @Test
    public void test_close_CO_4b48c59015e244078695ed6499d4de97() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close4-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(10)).close();
    }

    @Test
    public void test_close_PO_b0b216c146b04c3999fe1e4126322713() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close5-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).close();
    }

    @Test
    public void test_close_CO_b0b216c146b04c3999fe1e4126322713() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close5-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(10)).close();
    }

    @Test
    public void test_close_PO_967590ae0e04489590a0adeb69883190() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close6-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).close();
    }

    @Test
    public void test_close_CO_967590ae0e04489590a0adeb69883190() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close6-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(1)).close();
    }

    @Test
    public void test_close_PO_d9478134e19a484eb2aeeafcc77d0531() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close7-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).close();
    }

    @Test
    public void test_close_CO_d9478134e19a484eb2aeeafcc77d0531() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close7-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(10)).close();
    }
}