package org.apache.pdfbox.filter;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.OutputStream;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class TestDCTFilterPanktiGen {
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
    public void test_decode_java_io_InputStream_java_io_OutputStream_org_apache_pdfbox_cos_COSDictionary_int_org_apache_pdfbox_filter_DecodeOptions_PO_38204f2ba8644bf0a73efc3c7748fc70() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.filter.DCTFilter/>";
        org.apache.pdfbox.filter.DCTFilter receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.filter.DCTFilter.decode_java.io.InputStream,java.io.OutputStream,org.apache.pdfbox.cos.COSDictionary,int,org.apache.pdfbox.filter.DecodeOptions1-params.xml");
        java.io.InputStream paramObject1 = (java.io.InputStream) paramObjects[0];
        java.io.OutputStream paramObject2 = (java.io.OutputStream) paramObjects[1];
        org.apache.pdfbox.cos.COSDictionary paramObject3 = (org.apache.pdfbox.cos.COSDictionary) paramObjects[2];
        int paramObject4 = (Integer) paramObjects[3];
        org.apache.pdfbox.filter.DecodeOptions paramObject5 = (org.apache.pdfbox.filter.DecodeOptions) paramObjects[4];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.decode(paramObject1, mockOutputStream, paramObject3, paramObject4, paramObject5);
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write((byte[]) any());
    }

    @Test
    public void test_decode_java_io_InputStream_java_io_OutputStream_org_apache_pdfbox_cos_COSDictionary_int_org_apache_pdfbox_filter_DecodeOptions_CO_38204f2ba8644bf0a73efc3c7748fc70() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.filter.DCTFilter/>";
        org.apache.pdfbox.filter.DCTFilter receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.filter.DCTFilter.decode_java.io.InputStream,java.io.OutputStream,org.apache.pdfbox.cos.COSDictionary,int,org.apache.pdfbox.filter.DecodeOptions1-params.xml");
        java.io.InputStream paramObject1 = (java.io.InputStream) paramObjects[0];
        java.io.OutputStream paramObject2 = (java.io.OutputStream) paramObjects[1];
        org.apache.pdfbox.cos.COSDictionary paramObject3 = (org.apache.pdfbox.cos.COSDictionary) paramObjects[2];
        int paramObject4 = (Integer) paramObjects[3];
        org.apache.pdfbox.filter.DecodeOptions paramObject5 = (org.apache.pdfbox.filter.DecodeOptions) paramObjects[4];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.decode(paramObject1, mockOutputStream, paramObject3, paramObject4, paramObject5);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(1)).write((byte[]) any());
    }

    @Test
    public void test_decode_java_io_InputStream_java_io_OutputStream_org_apache_pdfbox_cos_COSDictionary_int_org_apache_pdfbox_filter_DecodeOptions_PO_64bc95d9a3a444808cdc784d495c1c28() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.filter.DCTFilter/>";
        org.apache.pdfbox.filter.DCTFilter receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.filter.DCTFilter.decode_java.io.InputStream,java.io.OutputStream,org.apache.pdfbox.cos.COSDictionary,int,org.apache.pdfbox.filter.DecodeOptions2-params.xml");
        java.io.InputStream paramObject1 = (java.io.InputStream) paramObjects[0];
        java.io.OutputStream paramObject2 = (java.io.OutputStream) paramObjects[1];
        org.apache.pdfbox.cos.COSDictionary paramObject3 = (org.apache.pdfbox.cos.COSDictionary) paramObjects[2];
        int paramObject4 = (Integer) paramObjects[3];
        org.apache.pdfbox.filter.DecodeOptions paramObject5 = (org.apache.pdfbox.filter.DecodeOptions) paramObjects[4];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.decode(paramObject1, mockOutputStream, paramObject3, paramObject4, paramObject5);
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write((byte[]) any());
    }

    @Test
    public void test_decode_java_io_InputStream_java_io_OutputStream_org_apache_pdfbox_cos_COSDictionary_int_org_apache_pdfbox_filter_DecodeOptions_CO_64bc95d9a3a444808cdc784d495c1c28() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.filter.DCTFilter/>";
        org.apache.pdfbox.filter.DCTFilter receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.filter.DCTFilter.decode_java.io.InputStream,java.io.OutputStream,org.apache.pdfbox.cos.COSDictionary,int,org.apache.pdfbox.filter.DecodeOptions2-params.xml");
        java.io.InputStream paramObject1 = (java.io.InputStream) paramObjects[0];
        java.io.OutputStream paramObject2 = (java.io.OutputStream) paramObjects[1];
        org.apache.pdfbox.cos.COSDictionary paramObject3 = (org.apache.pdfbox.cos.COSDictionary) paramObjects[2];
        int paramObject4 = (Integer) paramObjects[3];
        org.apache.pdfbox.filter.DecodeOptions paramObject5 = (org.apache.pdfbox.filter.DecodeOptions) paramObjects[4];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.decode(paramObject1, mockOutputStream, paramObject3, paramObject4, paramObject5);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(1)).write((byte[]) any());
    }
}