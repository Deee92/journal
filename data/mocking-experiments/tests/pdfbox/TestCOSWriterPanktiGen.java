package org.apache.pdfbox.pdfwriter;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.Set;

import converters.FileCleanableConverter;
import org.apache.pdfbox.cos.COSName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

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

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_visitFromName_PO_282faab984924f248c959ad5998d9b0a() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.visitFromName1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>true</direct>" +
        "    <name>Pages</name>" +
        "    <hashCode>76873636</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        COSName mockCOSName = Mockito.mock(COSName.class);
        // Act
        receivingObject.visitFromName(mockCOSName);
        // Assert
        Mockito.verify(mockCOSName, Mockito.atLeastOnce()).writePDF(any(java.io.OutputStream.class));
    }

    @Test
    public void test_visitFromName_CO_282faab984924f248c959ad5998d9b0a() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.visitFromName1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>true</direct>" +
        "    <name>Pages</name>" +
        "    <hashCode>76873636</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        COSName mockCOSName = Mockito.mock(COSName.class);
        // Act
        receivingObject.visitFromName(mockCOSName);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSName);
        orderVerifier.verify(mockCOSName, Mockito.times(1)).writePDF((java.io.OutputStream) any());
    }

    @Test
    public void test_visitFromName_PO_58e03b3db34f44809ad10ede504fb11c() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.visitFromName2-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>true</direct>" +
        "    <name>Pages</name>" +
        "    <hashCode>76873636</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        COSName mockCOSName = Mockito.mock(COSName.class);
        // Act
        receivingObject.visitFromName(mockCOSName);
        // Assert
        Mockito.verify(mockCOSName, Mockito.atLeastOnce()).writePDF(any(java.io.OutputStream.class));
    }

    @Test
    public void test_visitFromName_CO_58e03b3db34f44809ad10ede504fb11c() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.visitFromName2-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>true</direct>" +
        "    <name>Pages</name>" +
        "    <hashCode>76873636</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        COSName mockCOSName = Mockito.mock(COSName.class);
        // Act
        receivingObject.visitFromName(mockCOSName);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSName);
        orderVerifier.verify(mockCOSName, Mockito.times(1)).writePDF((java.io.OutputStream) any());
    }

    @Test
    public void test_visitFromName_PO_b2fb8ff3159344e2ad3ae7190354acc3() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.visitFromName3-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>true</direct>" +
        "    <name>Pages</name>" +
        "    <hashCode>76873636</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        COSName mockCOSName = Mockito.mock(COSName.class);
        // Act
        receivingObject.visitFromName(mockCOSName);
        // Assert
        Mockito.verify(mockCOSName, Mockito.atLeastOnce()).writePDF(any(java.io.OutputStream.class));
    }

    @Test
    public void test_visitFromName_CO_b2fb8ff3159344e2ad3ae7190354acc3() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.visitFromName3-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>true</direct>" +
        "    <name>Pages</name>" +
        "    <hashCode>76873636</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        COSName mockCOSName = Mockito.mock(COSName.class);
        // Act
        receivingObject.visitFromName(mockCOSName);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSName);
        orderVerifier.verify(mockCOSName, Mockito.times(1)).writePDF((java.io.OutputStream) any());
    }

    @Test
    public void test_visitFromName_PO_ffd45b567a6b4ff3ba7e4021dbade211() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.visitFromName4-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>Type</name>" +
        "    <hashCode>2622298</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        COSName mockCOSName = Mockito.mock(COSName.class);
        // Act
        receivingObject.visitFromName(mockCOSName);
        // Assert
        Mockito.verify(mockCOSName, Mockito.atLeastOnce()).writePDF(any(java.io.OutputStream.class));
    }

    @Test
    public void test_visitFromName_CO_ffd45b567a6b4ff3ba7e4021dbade211() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.visitFromName4-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>Type</name>" +
        "    <hashCode>2622298</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        COSName mockCOSName = Mockito.mock(COSName.class);
        // Act
        receivingObject.visitFromName(mockCOSName);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSName);
        orderVerifier.verify(mockCOSName, Mockito.times(1)).writePDF((java.io.OutputStream) any());
    }

    @Test
    public void test_visitFromName_PO_77636a8a7d024305b018088501c989f8() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.visitFromName5-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>Type</name>" +
        "    <hashCode>2622298</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        COSName mockCOSName = Mockito.mock(COSName.class);
        // Act
        receivingObject.visitFromName(mockCOSName);
        // Assert
        Mockito.verify(mockCOSName, Mockito.atLeastOnce()).writePDF(any(java.io.OutputStream.class));
    }

    @Test
    public void test_visitFromName_CO_77636a8a7d024305b018088501c989f8() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.visitFromName5-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>Type</name>" +
        "    <hashCode>2622298</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        COSName mockCOSName = Mockito.mock(COSName.class);
        // Act
        receivingObject.visitFromName(mockCOSName);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSName);
        orderVerifier.verify(mockCOSName, Mockito.times(1)).writePDF((java.io.OutputStream) any());
    }

    @Test
    public void test_visitFromName_PO_8e772d18eebf4ff480053aab9fb5b988() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.visitFromName6-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>true</direct>" +
        "    <name>Pages</name>" +
        "    <hashCode>76873636</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        COSName mockCOSName = Mockito.mock(COSName.class);
        // Act
        receivingObject.visitFromName(mockCOSName);
        // Assert
        Mockito.verify(mockCOSName, Mockito.atLeastOnce()).writePDF(any(java.io.OutputStream.class));
    }

    @Test
    public void test_visitFromName_CO_8e772d18eebf4ff480053aab9fb5b988() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.visitFromName6-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>true</direct>" +
        "    <name>Pages</name>" +
        "    <hashCode>76873636</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        COSName mockCOSName = Mockito.mock(COSName.class);
        // Act
        receivingObject.visitFromName(mockCOSName);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSName);
        orderVerifier.verify(mockCOSName, Mockito.times(1)).writePDF((java.io.OutputStream) any());
    }

    @Test
    public void test_visitFromName_PO_883bafc33e104d1e82af27af0fd5f2fa() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.visitFromName7-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>Type</name>" +
        "    <hashCode>2622298</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        COSName mockCOSName = Mockito.mock(COSName.class);
        // Act
        receivingObject.visitFromName(mockCOSName);
        // Assert
        Mockito.verify(mockCOSName, Mockito.atLeastOnce()).writePDF(any(java.io.OutputStream.class));
    }

    @Test
    public void test_visitFromName_CO_883bafc33e104d1e82af27af0fd5f2fa() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.visitFromName7-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>Type</name>" +
        "    <hashCode>2622298</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        COSName mockCOSName = Mockito.mock(COSName.class);
        // Act
        receivingObject.visitFromName(mockCOSName);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSName);
        orderVerifier.verify(mockCOSName, Mockito.times(1)).writePDF((java.io.OutputStream) any());
    }

    private Set insertPrivateMockField_writtenObjects_InCOSWriter(COSWriter receivingObject) throws Exception {
        Set mockSet = Mockito.mock(Set.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("writtenObjects");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockSet);
        return mockSet;
    }

    @Test
    public void test_doWriteObject_PO_c7a2a9cc53364415ad4aea3f6a350d1f() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject1-params.xml");
        org.apache.pdfbox.cos.COSBase paramObject1 = (org.apache.pdfbox.cos.COSBase) paramObjects[0];
        Set mockSet = insertPrivateMockField_writtenObjects_InCOSWriter(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.doWriteObject(paramObject1);
        // Assert
        Mockito.verify(mockSet, Mockito.atLeastOnce()).add(any(java.lang.Object.class));
    }

    @Test
    public void test_doWriteObject_CO_c7a2a9cc53364415ad4aea3f6a350d1f() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject1-params.xml");
        org.apache.pdfbox.cos.COSBase paramObject1 = (org.apache.pdfbox.cos.COSBase) paramObjects[0];
        Set mockSet = insertPrivateMockField_writtenObjects_InCOSWriter(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.doWriteObject(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockSet);
        orderVerifier.verify(mockSet, Mockito.times(10)).add((java.lang.Object) any());
    }

    @Test
    public void test_doWriteObject_PO_01d7a84f228749379536df3e32cced6f() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject2-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject2-params.xml");
        org.apache.pdfbox.cos.COSBase paramObject1 = (org.apache.pdfbox.cos.COSBase) paramObjects[0];
        Set mockSet = insertPrivateMockField_writtenObjects_InCOSWriter(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.doWriteObject(paramObject1);
        // Assert
        Mockito.verify(mockSet, Mockito.atLeastOnce()).add(any(java.lang.Object.class));
    }

    @Test
    public void test_doWriteObject_CO_01d7a84f228749379536df3e32cced6f() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject2-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject2-params.xml");
        org.apache.pdfbox.cos.COSBase paramObject1 = (org.apache.pdfbox.cos.COSBase) paramObjects[0];
        Set mockSet = insertPrivateMockField_writtenObjects_InCOSWriter(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.doWriteObject(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockSet);
        orderVerifier.verify(mockSet, Mockito.times(1)).add((java.lang.Object) any());
    }

    @Test
    public void test_doWriteObject_PO_8a2a848e10904587b346e666bda0a939() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject3-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject3-params.xml");
        org.apache.pdfbox.cos.COSBase paramObject1 = (org.apache.pdfbox.cos.COSBase) paramObjects[0];
        Set mockSet = insertPrivateMockField_writtenObjects_InCOSWriter(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.doWriteObject(paramObject1);
        // Assert
        Mockito.verify(mockSet, Mockito.atLeastOnce()).add(any(java.lang.Object.class));
    }

    @Test
    public void test_doWriteObject_CO_8a2a848e10904587b346e666bda0a939() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject3-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject3-params.xml");
        org.apache.pdfbox.cos.COSBase paramObject1 = (org.apache.pdfbox.cos.COSBase) paramObjects[0];
        Set mockSet = insertPrivateMockField_writtenObjects_InCOSWriter(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.doWriteObject(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockSet);
        orderVerifier.verify(mockSet, Mockito.times(1)).add((java.lang.Object) any());
    }

    @Test
    public void test_doWriteObject_PO_1fda4008f1f74a30a056f35f93210d49() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject4-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject4-params.xml");
        org.apache.pdfbox.cos.COSBase paramObject1 = (org.apache.pdfbox.cos.COSBase) paramObjects[0];
        Set mockSet = insertPrivateMockField_writtenObjects_InCOSWriter(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.doWriteObject(paramObject1);
        // Assert
        Mockito.verify(mockSet, Mockito.atLeastOnce()).add(any(java.lang.Object.class));
    }

    @Test
    public void test_doWriteObject_CO_1fda4008f1f74a30a056f35f93210d49() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject4-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject4-params.xml");
        org.apache.pdfbox.cos.COSBase paramObject1 = (org.apache.pdfbox.cos.COSBase) paramObjects[0];
        Set mockSet = insertPrivateMockField_writtenObjects_InCOSWriter(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.doWriteObject(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockSet);
        orderVerifier.verify(mockSet, Mockito.times(1)).add((java.lang.Object) any());
    }

    @Test
    public void test_doWriteObject_PO_28c72d92928e4e75847429669c0f238e() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject5-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject5-params.xml");
        org.apache.pdfbox.cos.COSBase paramObject1 = (org.apache.pdfbox.cos.COSBase) paramObjects[0];
        Set mockSet = insertPrivateMockField_writtenObjects_InCOSWriter(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.doWriteObject(paramObject1);
        // Assert
        Mockito.verify(mockSet, Mockito.atLeastOnce()).add(any(java.lang.Object.class));
    }

    @Test
    public void test_doWriteObject_CO_28c72d92928e4e75847429669c0f238e() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject5-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject5-params.xml");
        org.apache.pdfbox.cos.COSBase paramObject1 = (org.apache.pdfbox.cos.COSBase) paramObjects[0];
        Set mockSet = insertPrivateMockField_writtenObjects_InCOSWriter(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.doWriteObject(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockSet);
        orderVerifier.verify(mockSet, Mockito.times(1)).add((java.lang.Object) any());
    }

    @Test
    public void test_doWriteObject_PO_5ec8ad0e7a0a4fb89266603a4fecaf33() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject6-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject6-params.xml");
        org.apache.pdfbox.cos.COSBase paramObject1 = (org.apache.pdfbox.cos.COSBase) paramObjects[0];
        Set mockSet = insertPrivateMockField_writtenObjects_InCOSWriter(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.doWriteObject(paramObject1);
        // Assert
        Mockito.verify(mockSet, Mockito.atLeastOnce()).add(any(java.lang.Object.class));
    }

    @Test
    public void test_doWriteObject_CO_5ec8ad0e7a0a4fb89266603a4fecaf33() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject6-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject6-params.xml");
        org.apache.pdfbox.cos.COSBase paramObject1 = (org.apache.pdfbox.cos.COSBase) paramObjects[0];
        Set mockSet = insertPrivateMockField_writtenObjects_InCOSWriter(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.doWriteObject(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockSet);
        orderVerifier.verify(mockSet, Mockito.times(1)).add((java.lang.Object) any());
    }

    @Test
    public void test_doWriteObject_PO_10f416cafee341bf8de53f95a33ce29e() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject7-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject7-params.xml");
        org.apache.pdfbox.cos.COSBase paramObject1 = (org.apache.pdfbox.cos.COSBase) paramObjects[0];
        Set mockSet = insertPrivateMockField_writtenObjects_InCOSWriter(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.doWriteObject(paramObject1);
        // Assert
        Mockito.verify(mockSet, Mockito.atLeastOnce()).add(any(java.lang.Object.class));
    }

    @Test
    public void test_doWriteObject_CO_10f416cafee341bf8de53f95a33ce29e() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject7-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.doWriteObject7-params.xml");
        org.apache.pdfbox.cos.COSBase paramObject1 = (org.apache.pdfbox.cos.COSBase) paramObjects[0];
        Set mockSet = insertPrivateMockField_writtenObjects_InCOSWriter(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.doWriteObject(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockSet);
        orderVerifier.verify(mockSet, Mockito.times(1)).add((java.lang.Object) any());
    }

    private OutputStream insertPrivateMockField_incrementalOutput_InCOSWriter(COSWriter receivingObject) throws Exception {
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("incrementalOutput");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockOutputStream);
        return mockOutputStream;
    }

    @Test
    public void test_close_PO_a43d8a4aeb76452f99e06315f4dd5a5d() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close1-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).close();
    }

    @Test
    public void test_close_CO_a43d8a4aeb76452f99e06315f4dd5a5d() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close1-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(1)).close();
    }

    @Test
    public void test_close_PO_421c323d2582468b813b40d8fdb671c0() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close2-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).close();
    }

    @Test
    public void test_close_CO_421c323d2582468b813b40d8fdb671c0() throws Exception {
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
    public void test_close_PO_2ed5aa6705294380a33750f1330ae5e8() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close3-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).close();
    }

    @Test
    public void test_close_CO_2ed5aa6705294380a33750f1330ae5e8() throws Exception {
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
    public void test_close_PO_4e0c1fa66c574cdd933e27585e150bf6() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close4-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).close();
    }

    @Test
    public void test_close_CO_4e0c1fa66c574cdd933e27585e150bf6() throws Exception {
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
    public void test_close_PO_721441292d754bc5a9b260b3c6177651() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close5-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).close();
    }

    @Test
    public void test_close_CO_721441292d754bc5a9b260b3c6177651() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close5-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(1)).close();
    }

    @Test
    public void test_close_PO_b67d28ae1236444ca05e64b49f747786() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close6-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).close();
    }

    @Test
    public void test_close_CO_b67d28ae1236444ca05e64b49f747786() throws Exception {
        // Arrange
        org.apache.pdfbox.pdfwriter.COSWriter receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdfwriter.COSWriter.close6-receiving.xml");
        OutputStream mockOutputStream = insertPrivateMockField_incrementalOutput_InCOSWriter(receivingObject);
        // Act
        receivingObject.close();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(10)).close();
    }
}