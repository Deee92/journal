package org.apache.pdfbox.io;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.*;

@ExtendWith(MockitoExtension.class)
public class TestRandomAccessInputStreamPanktiGen {
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

    private RandomAccessRead insertPrivateMockField_input_InRandomAccessInputStream(RandomAccessInputStream receivingObject) throws Exception {
        RandomAccessRead mockRandomAccessRead = Mockito.mock(RandomAccessRead.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("input");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockRandomAccessRead);
        return mockRandomAccessRead;
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_read_byte_arr_int_int_OO_41fc135f66a3455ea1cdfe63fb10551d() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int1-params.xml");
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        int paramObject3 = (Integer) paramObjects[2];
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read((byte[]) any(), eq(0), eq(4096))).thenReturn(2725);
        // Act
        int actual = receivingObject.read(paramObject1, paramObject2, paramObject3);
        // Assert
        Assertions.assertEquals(2725, actual);
    }

    @Test
    public void test_read_byte_arr_int_int_PO_41fc135f66a3455ea1cdfe63fb10551d() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int1-params.xml");
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        int paramObject3 = (Integer) paramObjects[2];
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read((byte[]) any(), eq(0), eq(4096))).thenReturn(2725);
        // Act
        receivingObject.read(paramObject1, paramObject2, paramObject3);
        // Assert
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).isEOF();
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).read((byte[]) any(), eq(0), eq(4096));
    }

    @Test
    public void test_read_byte_arr_int_int_CO_41fc135f66a3455ea1cdfe63fb10551d() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int1-params.xml");
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        int paramObject3 = (Integer) paramObjects[2];
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read((byte[]) any(), eq(0), eq(4096))).thenReturn(2725);
        // Act
        receivingObject.read(paramObject1, paramObject2, paramObject3);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockRandomAccessRead, mockRandomAccessRead);
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).isEOF();
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).read((byte[]) any(), anyInt(), anyInt());
    }

    @Test
    public void test_read_byte_arr_int_int_OO_dad4e453b208464aa95798bf964b5a01() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int2-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int2-params.xml");
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        int paramObject3 = (Integer) paramObjects[2];
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read((byte[]) any(), eq(0), eq(2129))).thenReturn(2129);
        // Act
        int actual = receivingObject.read(paramObject1, paramObject2, paramObject3);
        // Assert
        Assertions.assertEquals(2129, actual);
    }

    @Test
    public void test_read_byte_arr_int_int_PO_dad4e453b208464aa95798bf964b5a01() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int2-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int2-params.xml");
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        int paramObject3 = (Integer) paramObjects[2];
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read((byte[]) any(), eq(0), eq(2129))).thenReturn(2129);
        // Act
        receivingObject.read(paramObject1, paramObject2, paramObject3);
        // Assert
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).isEOF();
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).read((byte[]) any(), eq(0), eq(2129));
    }

    @Test
    public void test_read_byte_arr_int_int_CO_dad4e453b208464aa95798bf964b5a01() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int2-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int2-params.xml");
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        int paramObject3 = (Integer) paramObjects[2];
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read((byte[]) any(), eq(0), eq(2129))).thenReturn(2129);
        // Act
        receivingObject.read(paramObject1, paramObject2, paramObject3);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockRandomAccessRead, mockRandomAccessRead);
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).isEOF();
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).read((byte[]) any(), anyInt(), anyInt());
    }

    @Test
    public void test_read_byte_arr_int_int_OO_2d0bf328ab1b4a4a8f0d9406c59cfc09() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int3-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <byte-array>AAAAAAAAAAAAAA==</byte-array>" +
        "  <int>0</int>" +
        "  <int>10</int>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        int paramObject3 = (Integer) paramObjects[2];
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read((byte[]) any(), eq(0), eq(10))).thenReturn(10);
        // Act
        int actual = receivingObject.read(paramObject1, paramObject2, paramObject3);
        // Assert
        Assertions.assertEquals(10, actual);
    }

    @Test
    public void test_read_byte_arr_int_int_PO_2d0bf328ab1b4a4a8f0d9406c59cfc09() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int3-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <byte-array>AAAAAAAAAAAAAA==</byte-array>" +
        "  <int>0</int>" +
        "  <int>10</int>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        int paramObject3 = (Integer) paramObjects[2];
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read((byte[]) any(), eq(0), eq(10))).thenReturn(10);
        // Act
        receivingObject.read(paramObject1, paramObject2, paramObject3);
        // Assert
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).isEOF();
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).read((byte[]) any(), eq(0), eq(10));
    }

    @Test
    public void test_read_byte_arr_int_int_CO_2d0bf328ab1b4a4a8f0d9406c59cfc09() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int3-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <byte-array>AAAAAAAAAAAAAA==</byte-array>" +
        "  <int>0</int>" +
        "  <int>10</int>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        int paramObject3 = (Integer) paramObjects[2];
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read((byte[]) any(), eq(0), eq(10))).thenReturn(10);
        // Act
        receivingObject.read(paramObject1, paramObject2, paramObject3);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockRandomAccessRead, mockRandomAccessRead);
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).isEOF();
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).read((byte[]) any(), anyInt(), anyInt());
    }

    @Test
    public void test_read_byte_arr_int_int_OO_cb5fa173794c4f35a56785feabcd43ce() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int4-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int4-params.xml");
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        int paramObject3 = (Integer) paramObjects[2];
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read((byte[]) any(), eq(0), eq(2048))).thenReturn(2048);
        // Act
        int actual = receivingObject.read(paramObject1, paramObject2, paramObject3);
        // Assert
        Assertions.assertEquals(2048, actual);
    }

    @Test
    public void test_read_byte_arr_int_int_PO_cb5fa173794c4f35a56785feabcd43ce() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int4-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int4-params.xml");
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        int paramObject3 = (Integer) paramObjects[2];
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read((byte[]) any(), eq(0), eq(2048))).thenReturn(2048);
        // Act
        receivingObject.read(paramObject1, paramObject2, paramObject3);
        // Assert
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).isEOF();
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).read((byte[]) any(), eq(0), eq(2048));
    }

    @Test
    public void test_read_byte_arr_int_int_CO_cb5fa173794c4f35a56785feabcd43ce() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int4-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int4-params.xml");
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        int paramObject3 = (Integer) paramObjects[2];
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read((byte[]) any(), eq(0), eq(2048))).thenReturn(2048);
        // Act
        receivingObject.read(paramObject1, paramObject2, paramObject3);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockRandomAccessRead, mockRandomAccessRead);
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).isEOF();
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).read((byte[]) any(), anyInt(), anyInt());
    }

    @Test
    public void test_read_byte_arr_int_int_OO_d63da35e07284fdf83f081f725cbe7ac() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int5-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int5-params.xml");
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        int paramObject3 = (Integer) paramObjects[2];
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read((byte[]) any(), eq(0), eq(4096))).thenReturn(3349);
        // Act
        int actual = receivingObject.read(paramObject1, paramObject2, paramObject3);
        // Assert
        Assertions.assertEquals(3349, actual);
    }

    @Test
    public void test_read_byte_arr_int_int_PO_d63da35e07284fdf83f081f725cbe7ac() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int5-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int5-params.xml");
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        int paramObject3 = (Integer) paramObjects[2];
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read((byte[]) any(), eq(0), eq(4096))).thenReturn(3349);
        // Act
        receivingObject.read(paramObject1, paramObject2, paramObject3);
        // Assert
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).isEOF();
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).read((byte[]) any(), eq(0), eq(4096));
    }

    @Test
    public void test_read_byte_arr_int_int_CO_d63da35e07284fdf83f081f725cbe7ac() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int5-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read_byte_arr_,int,int5-params.xml");
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        int paramObject3 = (Integer) paramObjects[2];
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read((byte[]) any(), eq(0), eq(4096))).thenReturn(3349);
        // Act
        receivingObject.read(paramObject1, paramObject2, paramObject3);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockRandomAccessRead, mockRandomAccessRead);
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).isEOF();
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).read((byte[]) any(), anyInt(), anyInt());
    }

    @Test
    public void test_read_OO_19a2103ddbb043d88644dbad85d55f50() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read1-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read()).thenReturn(72);
        // Act
        int actual = receivingObject.read();
        // Assert
        Assertions.assertEquals(72, actual);
    }

    @Test
    public void test_read_PO_19a2103ddbb043d88644dbad85d55f50() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read1-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read()).thenReturn(72);
        // Act
        receivingObject.read();
        // Assert
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).isEOF();
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).read();
    }

    @Test
    public void test_read_CO_19a2103ddbb043d88644dbad85d55f50() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read1-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read()).thenReturn(72);
        // Act
        receivingObject.read();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockRandomAccessRead, mockRandomAccessRead);
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).isEOF();
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).read();
    }

    @Test
    public void test_read_OO_2edfe623ba4d4281a0824b0f8332ee2e() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read2-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read()).thenReturn(72);
        // Act
        int actual = receivingObject.read();
        // Assert
        Assertions.assertEquals(72, actual);
    }

    @Test
    public void test_read_PO_2edfe623ba4d4281a0824b0f8332ee2e() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read2-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read()).thenReturn(72);
        // Act
        receivingObject.read();
        // Assert
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).isEOF();
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).read();
    }

    @Test
    public void test_read_CO_2edfe623ba4d4281a0824b0f8332ee2e() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read2-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read()).thenReturn(72);
        // Act
        receivingObject.read();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockRandomAccessRead, mockRandomAccessRead);
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).isEOF();
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).read();
    }

    @Test
    public void test_read_OO_c2a837e1526848019dfe6a452e440db1() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read3-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read()).thenReturn(72);
        // Act
        int actual = receivingObject.read();
        // Assert
        Assertions.assertEquals(72, actual);
    }

    @Test
    public void test_read_PO_c2a837e1526848019dfe6a452e440db1() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read3-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read()).thenReturn(72);
        // Act
        receivingObject.read();
        // Assert
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).isEOF();
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).read();
    }

    @Test
    public void test_read_CO_c2a837e1526848019dfe6a452e440db1() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.read3-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.isEOF()).thenReturn(false);
        Mockito.when(mockRandomAccessRead.read()).thenReturn(72);
        // Act
        receivingObject.read();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockRandomAccessRead, mockRandomAccessRead);
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).isEOF();
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).read();
    }

    @Test
    public void test_available_OO_c0dd7d8564754c22bc97a903d10fefc6() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.available1-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.length()).thenReturn(3598L);
        Mockito.when(mockRandomAccessRead.getPosition()).thenReturn(2050L);
        // Act
        int actual = receivingObject.available();
        // Assert
        Assertions.assertEquals(1548, actual);
    }

    @Test
    public void test_available_PO_c0dd7d8564754c22bc97a903d10fefc6() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.available1-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.length()).thenReturn(3598L);
        Mockito.when(mockRandomAccessRead.getPosition()).thenReturn(2050L);
        // Act
        receivingObject.available();
        // Assert
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).length();
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).getPosition();
    }

    @Test
    public void test_available_CO_c0dd7d8564754c22bc97a903d10fefc6() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.available1-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.length()).thenReturn(3598L);
        Mockito.when(mockRandomAccessRead.getPosition()).thenReturn(2050L);
        // Act
        receivingObject.available();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockRandomAccessRead, mockRandomAccessRead);
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).length();
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).getPosition();
    }

    @Test
    public void test_available_OO_b710c1e143274ada9d59dbba073f1bdf() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.available2-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.length()).thenReturn(2772L);
        Mockito.when(mockRandomAccessRead.getPosition()).thenReturn(2050L);
        // Act
        int actual = receivingObject.available();
        // Assert
        Assertions.assertEquals(722, actual);
    }

    @Test
    public void test_available_PO_b710c1e143274ada9d59dbba073f1bdf() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.available2-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.length()).thenReturn(2772L);
        Mockito.when(mockRandomAccessRead.getPosition()).thenReturn(2050L);
        // Act
        receivingObject.available();
        // Assert
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).length();
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).getPosition();
    }

    @Test
    public void test_available_CO_b710c1e143274ada9d59dbba073f1bdf() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.available2-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.length()).thenReturn(2772L);
        Mockito.when(mockRandomAccessRead.getPosition()).thenReturn(2050L);
        // Act
        receivingObject.available();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockRandomAccessRead, mockRandomAccessRead);
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).length();
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).getPosition();
    }

    @Test
    public void test_available_OO_81572be44113413a8bdae2842d862a43() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.available3-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.length()).thenReturn(2129L);
        Mockito.when(mockRandomAccessRead.getPosition()).thenReturn(0L);
        // Act
        int actual = receivingObject.available();
        // Assert
        Assertions.assertEquals(2129, actual);
    }

    @Test
    public void test_available_PO_81572be44113413a8bdae2842d862a43() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.available3-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.length()).thenReturn(2129L);
        Mockito.when(mockRandomAccessRead.getPosition()).thenReturn(0L);
        // Act
        receivingObject.available();
        // Assert
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).length();
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).getPosition();
    }

    @Test
    public void test_available_CO_81572be44113413a8bdae2842d862a43() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.available3-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.length()).thenReturn(2129L);
        Mockito.when(mockRandomAccessRead.getPosition()).thenReturn(0L);
        // Act
        receivingObject.available();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockRandomAccessRead, mockRandomAccessRead);
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).length();
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).getPosition();
    }

    @Test
    public void test_available_OO_4fe7f8dce6494585848e572a40126e7c() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.available4-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.length()).thenReturn(21934L);
        Mockito.when(mockRandomAccessRead.getPosition()).thenReturn(2050L);
        // Act
        int actual = receivingObject.available();
        // Assert
        Assertions.assertEquals(19884, actual);
    }

    @Test
    public void test_available_PO_4fe7f8dce6494585848e572a40126e7c() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.available4-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.length()).thenReturn(21934L);
        Mockito.when(mockRandomAccessRead.getPosition()).thenReturn(2050L);
        // Act
        receivingObject.available();
        // Assert
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).length();
        Mockito.verify(mockRandomAccessRead, Mockito.atLeastOnce()).getPosition();
    }

    @Test
    public void test_available_CO_4fe7f8dce6494585848e572a40126e7c() throws Exception {
        // Arrange
        org.apache.pdfbox.io.RandomAccessInputStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.io.RandomAccessInputStream.available4-receiving.xml");
        RandomAccessRead mockRandomAccessRead = insertPrivateMockField_input_InRandomAccessInputStream(receivingObject);
        Mockito.when(mockRandomAccessRead.length()).thenReturn(21934L);
        Mockito.when(mockRandomAccessRead.getPosition()).thenReturn(2050L);
        // Act
        receivingObject.available();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockRandomAccessRead, mockRandomAccessRead);
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).length();
        orderVerifier.verify(mockRandomAccessRead, Mockito.times(1)).getPosition();
    }
}