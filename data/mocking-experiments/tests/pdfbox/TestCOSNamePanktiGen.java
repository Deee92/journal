package org.apache.pdfbox.cos;
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

import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
public class TestCOSNamePanktiGen {
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
    public void test_writePDF_PO_96a6209c1df046cca2f473c313adabe6() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.cos.COSName>" +
        "  <direct>false</direct>" +
        "  <name>Type</name>" +
        "  <hashCode>2622298</hashCode>" +
        "</org.apache.pdfbox.cos.COSName>";
        org.apache.pdfbox.cos.COSName receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.cos.COSName.writePDF1-params.xml");
        java.io.OutputStream paramObject1 = (java.io.OutputStream) paramObjects[0];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.writePDF(mockOutputStream);
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(47);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(84);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(121);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(112);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(101);
    }

    @Test
    public void test_writePDF_CO_96a6209c1df046cca2f473c313adabe6() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.cos.COSName>" +
        "  <direct>false</direct>" +
        "  <name>Type</name>" +
        "  <hashCode>2622298</hashCode>" +
        "</org.apache.pdfbox.cos.COSName>";
        org.apache.pdfbox.cos.COSName receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.cos.COSName.writePDF1-params.xml");
        java.io.OutputStream paramObject1 = (java.io.OutputStream) paramObjects[0];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.writePDF(mockOutputStream);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(5)).write(anyInt());
    }

    @Test
    public void test_writePDF_PO_c4f2fa11bfca4ffb936492a8fc14ece7() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.cos.COSName>" +
        "  <direct>true</direct>" +
        "  <name>Pages</name>" +
        "  <hashCode>76873636</hashCode>" +
        "</org.apache.pdfbox.cos.COSName>";
        org.apache.pdfbox.cos.COSName receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.cos.COSName.writePDF2-params.xml");
        java.io.OutputStream paramObject1 = (java.io.OutputStream) paramObjects[0];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.writePDF(mockOutputStream);
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(47);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(80);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(97);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(103);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(101);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(115);
    }

    @Test
    public void test_writePDF_CO_c4f2fa11bfca4ffb936492a8fc14ece7() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.cos.COSName>" +
        "  <direct>true</direct>" +
        "  <name>Pages</name>" +
        "  <hashCode>76873636</hashCode>" +
        "</org.apache.pdfbox.cos.COSName>";
        org.apache.pdfbox.cos.COSName receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.cos.COSName.writePDF2-params.xml");
        java.io.OutputStream paramObject1 = (java.io.OutputStream) paramObjects[0];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.writePDF(mockOutputStream);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(6)).write(anyInt());
    }

    @Test
    public void test_writePDF_PO_72ff3bfc161848abbfd44a36fee9472f() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.cos.COSName>" +
        "  <direct>true</direct>" +
        "  <name>Pages</name>" +
        "  <hashCode>76873636</hashCode>" +
        "</org.apache.pdfbox.cos.COSName>";
        org.apache.pdfbox.cos.COSName receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.cos.COSName.writePDF3-params.xml");
        java.io.OutputStream paramObject1 = (java.io.OutputStream) paramObjects[0];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.writePDF(mockOutputStream);
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(47);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(80);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(97);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(103);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(101);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(115);
    }

    @Test
    public void test_writePDF_CO_72ff3bfc161848abbfd44a36fee9472f() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.cos.COSName>" +
        "  <direct>true</direct>" +
        "  <name>Pages</name>" +
        "  <hashCode>76873636</hashCode>" +
        "</org.apache.pdfbox.cos.COSName>";
        org.apache.pdfbox.cos.COSName receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.cos.COSName.writePDF3-params.xml");
        java.io.OutputStream paramObject1 = (java.io.OutputStream) paramObjects[0];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.writePDF(mockOutputStream);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(6)).write(anyInt());
    }

    @Test
    public void test_writePDF_PO_d6ddabb1243048d398aac0cc96d938e6() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.cos.COSName>" +
        "  <direct>false</direct>" +
        "  <name>Type</name>" +
        "  <hashCode>2622298</hashCode>" +
        "</org.apache.pdfbox.cos.COSName>";
        org.apache.pdfbox.cos.COSName receivingObject = deserializeObjectFromString(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.pdfwriter.COSStandardOutputStream>" +
        "    <out class=\"java.io.FileOutputStream\">" +
        "      <fd>" +
        "        <fd>19</fd>" +
        "        <handle>-1</handle>" +
        "        <parent class=\"java.io.FileOutputStream\" reference=\"../..\"/>" +
        "        <closed>false</closed>" +
        "        <append>false</append>" +
        "        <cleanup class=\"java.io.FileCleanable\"/>" +
        "      </fd>" +
        "      <path>./workload/000752-locked-1.pdf</path>" +
        "      <closeLock/>" +
        "      <closed>false</closed>" +
        "    </out>" +
        "    <closed>false</closed>" +
        "    <closeLock/>" +
        "    <position>26</position>" +
        "    <onNewLine>true</onNewLine>" +
        "  </org.apache.pdfbox.pdfwriter.COSStandardOutputStream>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        java.io.OutputStream paramObject1 = (java.io.OutputStream) paramObjects[0];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.writePDF(mockOutputStream);
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(47);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(84);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(121);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(112);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(101);
    }

    @Test
    public void test_writePDF_CO_d6ddabb1243048d398aac0cc96d938e6() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.cos.COSName>" +
        "  <direct>false</direct>" +
        "  <name>Type</name>" +
        "  <hashCode>2622298</hashCode>" +
        "</org.apache.pdfbox.cos.COSName>";
        org.apache.pdfbox.cos.COSName receivingObject = deserializeObjectFromString(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.pdfwriter.COSStandardOutputStream>" +
        "    <out class=\"java.io.FileOutputStream\">" +
        "      <fd>" +
        "        <fd>19</fd>" +
        "        <handle>-1</handle>" +
        "        <parent class=\"java.io.FileOutputStream\" reference=\"../..\"/>" +
        "        <closed>false</closed>" +
        "        <append>false</append>" +
        "        <cleanup class=\"java.io.FileCleanable\"/>" +
        "      </fd>" +
        "      <path>./workload/000752-locked-1.pdf</path>" +
        "      <closeLock/>" +
        "      <closed>false</closed>" +
        "    </out>" +
        "    <closed>false</closed>" +
        "    <closeLock/>" +
        "    <position>26</position>" +
        "    <onNewLine>true</onNewLine>" +
        "  </org.apache.pdfbox.pdfwriter.COSStandardOutputStream>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        java.io.OutputStream paramObject1 = (java.io.OutputStream) paramObjects[0];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.writePDF(mockOutputStream);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(5)).write(anyInt());
    }

    @Test
    public void test_writePDF_PO_2652345b4712437792fba3d47dd89bca() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.cos.COSName>" +
        "  <direct>true</direct>" +
        "  <name>Pages</name>" +
        "  <hashCode>76873636</hashCode>" +
        "</org.apache.pdfbox.cos.COSName>";
        org.apache.pdfbox.cos.COSName receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.cos.COSName.writePDF5-params.xml");
        java.io.OutputStream paramObject1 = (java.io.OutputStream) paramObjects[0];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.writePDF(mockOutputStream);
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(47);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(80);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(97);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(103);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(101);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(115);
    }

    @Test
    public void test_writePDF_CO_2652345b4712437792fba3d47dd89bca() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.cos.COSName>" +
        "  <direct>true</direct>" +
        "  <name>Pages</name>" +
        "  <hashCode>76873636</hashCode>" +
        "</org.apache.pdfbox.cos.COSName>";
        org.apache.pdfbox.cos.COSName receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.cos.COSName.writePDF5-params.xml");
        java.io.OutputStream paramObject1 = (java.io.OutputStream) paramObjects[0];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.writePDF(mockOutputStream);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(6)).write(anyInt());
    }

    @Test
    public void test_writePDF_PO_4c71f20d11ff40ef840f86906a550308() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.cos.COSName>" +
        "  <direct>true</direct>" +
        "  <name>Pages</name>" +
        "  <hashCode>76873636</hashCode>" +
        "</org.apache.pdfbox.cos.COSName>";
        org.apache.pdfbox.cos.COSName receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.cos.COSName.writePDF6-params.xml");
        java.io.OutputStream paramObject1 = (java.io.OutputStream) paramObjects[0];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.writePDF(mockOutputStream);
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(47);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(80);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(97);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(103);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(101);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(115);
    }

    @Test
    public void test_writePDF_CO_4c71f20d11ff40ef840f86906a550308() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.cos.COSName>" +
        "  <direct>true</direct>" +
        "  <name>Pages</name>" +
        "  <hashCode>76873636</hashCode>" +
        "</org.apache.pdfbox.cos.COSName>";
        org.apache.pdfbox.cos.COSName receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.cos.COSName.writePDF6-params.xml");
        java.io.OutputStream paramObject1 = (java.io.OutputStream) paramObjects[0];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.writePDF(mockOutputStream);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream, mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(6)).write(anyInt());
    }

    @Test
    public void test_writePDF_PO_151cd9cab2fd46d1b092b5550bf04fda() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.cos.COSName>" +
        "  <direct>false</direct>" +
        "  <name>F1</name>" +
        "  <hashCode>2219</hashCode>" +
        "</org.apache.pdfbox.cos.COSName>";
        org.apache.pdfbox.cos.COSName receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.cos.COSName.writePDF7-params.xml");
        java.io.OutputStream paramObject1 = (java.io.OutputStream) paramObjects[0];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.writePDF(mockOutputStream);
        // Assert
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(47);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(70);
        Mockito.verify(mockOutputStream, Mockito.atLeastOnce()).write(49);
    }

    @Test
    public void test_writePDF_CO_151cd9cab2fd46d1b092b5550bf04fda() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.cos.COSName>" +
        "  <direct>false</direct>" +
        "  <name>F1</name>" +
        "  <hashCode>2219</hashCode>" +
        "</org.apache.pdfbox.cos.COSName>";
        org.apache.pdfbox.cos.COSName receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.cos.COSName.writePDF7-params.xml");
        java.io.OutputStream paramObject1 = (java.io.OutputStream) paramObjects[0];
        OutputStream mockOutputStream = Mockito.mock(OutputStream.class);
        // Act
        receivingObject.writePDF(mockOutputStream);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockOutputStream, mockOutputStream, mockOutputStream);
        orderVerifier.verify(mockOutputStream, Mockito.times(3)).write(anyInt());
    }
}