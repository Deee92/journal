package org.apache.pdfbox.contentstream.operator.graphics;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.List;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class TestDrawObjectPanktiGen {
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
    public void test_process_PO_4505e1ee58724049879563678ad948b1() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.contentstream.operator.graphics.DrawObject.process1-receiving.xml").getFile());
        org.apache.pdfbox.contentstream.operator.graphics.DrawObject receivingObject = deserializeObject(fileReceiving);
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.contentstream.operator.Operator>" +
        "    <theOperator>Do</theOperator>" +
        "  </org.apache.pdfbox.contentstream.operator.Operator>" +
        "  <list>" +
        "    <org.apache.pdfbox.cos.COSName>" +
        "      <direct>false</direct>" +
        "      <name>Im1</name>" +
        "      <hashCode>73581</hashCode>" +
        "    </org.apache.pdfbox.cos.COSName>" +
        "  </list>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.apache.pdfbox.contentstream.operator.Operator paramObject1 = (org.apache.pdfbox.contentstream.operator.Operator) paramObjects[0];
        java.util.List paramObject2 = (java.util.List) paramObjects[1];
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.isEmpty()).thenReturn(false);
        // Act
        receivingObject.process(paramObject1, mockList);
        // Assert
        Mockito.verify(mockList, Mockito.atLeastOnce()).isEmpty();
    }

    @Test
    public void test_process_CO_4505e1ee58724049879563678ad948b1() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.contentstream.operator.graphics.DrawObject.process1-receiving.xml").getFile());
        org.apache.pdfbox.contentstream.operator.graphics.DrawObject receivingObject = deserializeObject(fileReceiving);
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.contentstream.operator.Operator>" +
        "    <theOperator>Do</theOperator>" +
        "  </org.apache.pdfbox.contentstream.operator.Operator>" +
        "  <list>" +
        "    <org.apache.pdfbox.cos.COSName>" +
        "      <direct>false</direct>" +
        "      <name>Im1</name>" +
        "      <hashCode>73581</hashCode>" +
        "    </org.apache.pdfbox.cos.COSName>" +
        "  </list>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.apache.pdfbox.contentstream.operator.Operator paramObject1 = (org.apache.pdfbox.contentstream.operator.Operator) paramObjects[0];
        java.util.List paramObject2 = (java.util.List) paramObjects[1];
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.isEmpty()).thenReturn(false);
        // Act
        receivingObject.process(paramObject1, mockList);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockList);
        orderVerifier.verify(mockList).isEmpty();
    }

    @Test
    public void test_process_PO_eff5d75293454e758d5391be0a64a95b() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.contentstream.operator.graphics.DrawObject.process2-receiving.xml").getFile());
        org.apache.pdfbox.contentstream.operator.graphics.DrawObject receivingObject = deserializeObject(fileReceiving);
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.contentstream.operator.Operator>" +
        "    <theOperator>Do</theOperator>" +
        "  </org.apache.pdfbox.contentstream.operator.Operator>" +
        "  <list>" +
        "    <org.apache.pdfbox.cos.COSName>" +
        "      <direct>false</direct>" +
        "      <name>Im1</name>" +
        "      <hashCode>73581</hashCode>" +
        "    </org.apache.pdfbox.cos.COSName>" +
        "  </list>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.apache.pdfbox.contentstream.operator.Operator paramObject1 = (org.apache.pdfbox.contentstream.operator.Operator) paramObjects[0];
        java.util.List paramObject2 = (java.util.List) paramObjects[1];
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.isEmpty()).thenReturn(false);
        // Act
        receivingObject.process(paramObject1, mockList);
        // Assert
        Mockito.verify(mockList, Mockito.atLeastOnce()).isEmpty();
    }

    @Test
    public void test_process_CO_eff5d75293454e758d5391be0a64a95b() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.contentstream.operator.graphics.DrawObject.process2-receiving.xml").getFile());
        org.apache.pdfbox.contentstream.operator.graphics.DrawObject receivingObject = deserializeObject(fileReceiving);
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.contentstream.operator.Operator>" +
        "    <theOperator>Do</theOperator>" +
        "  </org.apache.pdfbox.contentstream.operator.Operator>" +
        "  <list>" +
        "    <org.apache.pdfbox.cos.COSName>" +
        "      <direct>false</direct>" +
        "      <name>Im1</name>" +
        "      <hashCode>73581</hashCode>" +
        "    </org.apache.pdfbox.cos.COSName>" +
        "  </list>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        org.apache.pdfbox.contentstream.operator.Operator paramObject1 = (org.apache.pdfbox.contentstream.operator.Operator) paramObjects[0];
        java.util.List paramObject2 = (java.util.List) paramObjects[1];
        List mockList = Mockito.mock(List.class);
        Mockito.when(mockList.isEmpty()).thenReturn(false);
        // Act
        receivingObject.process(paramObject1, mockList);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockList);
        orderVerifier.verify(mockList).isEmpty();
    }
}