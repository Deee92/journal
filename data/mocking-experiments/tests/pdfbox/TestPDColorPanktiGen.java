package org.apache.pdfbox.pdmodel.graphics.color;
import com.thoughtworks.xstream.XStream;
import java.io.File;
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
public class TestPDColorPanktiGen {
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

    private PDColorSpace insertPrivateMockField_colorSpace_InPDColor(PDColor receivingObject) throws Exception {
        PDColorSpace mockPDColorSpace = Mockito.mock(PDColorSpace.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("colorSpace");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockPDColorSpace);
        return mockPDColorSpace;
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_getComponents_PO_e02b54c76bb240cd949aee27dd2a06e1() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.pdmodel.graphics.color.PDColor>" +
        "  <components>" +
        "    <float>0.0</float>" +
        "    <float>0.0</float>" +
        "    <float>1.0</float>" +
        "  </components>" +
        "  <colorSpace class=\"org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB\">" +
        "    <initialColor>" +
        "      <components>" +
        "        <float>0.0</float>" +
        "        <float>0.0</float>" +
        "        <float>0.0</float>" +
        "      </components>" +
        "      <colorSpace class=\"org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB\" reference=\"../..\"/>" +
        "    </initialColor>" +
        "  </colorSpace>" +
        "</org.apache.pdfbox.pdmodel.graphics.color.PDColor>";
        org.apache.pdfbox.pdmodel.graphics.color.PDColor receivingObject = deserializeObjectFromString(receivingObjectStr);
        PDColorSpace mockPDColorSpace = insertPrivateMockField_colorSpace_InPDColor(receivingObject);
        Mockito.when(mockPDColorSpace.getNumberOfComponents()).thenReturn(3);
        // Act
        receivingObject.getComponents();
        // Assert
        Mockito.verify(mockPDColorSpace, Mockito.atLeastOnce()).getNumberOfComponents();
    }

    @Test
    public void test_getComponents_CO_e02b54c76bb240cd949aee27dd2a06e1() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.pdmodel.graphics.color.PDColor>" +
        "  <components>" +
        "    <float>0.0</float>" +
        "    <float>0.0</float>" +
        "    <float>1.0</float>" +
        "  </components>" +
        "  <colorSpace class=\"org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB\">" +
        "    <initialColor>" +
        "      <components>" +
        "        <float>0.0</float>" +
        "        <float>0.0</float>" +
        "        <float>0.0</float>" +
        "      </components>" +
        "      <colorSpace class=\"org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB\" reference=\"../..\"/>" +
        "    </initialColor>" +
        "  </colorSpace>" +
        "</org.apache.pdfbox.pdmodel.graphics.color.PDColor>";
        org.apache.pdfbox.pdmodel.graphics.color.PDColor receivingObject = deserializeObjectFromString(receivingObjectStr);
        PDColorSpace mockPDColorSpace = insertPrivateMockField_colorSpace_InPDColor(receivingObject);
        Mockito.when(mockPDColorSpace.getNumberOfComponents()).thenReturn(3);
        // Act
        receivingObject.getComponents();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDColorSpace);
        orderVerifier.verify(mockPDColorSpace, Mockito.times(1)).getNumberOfComponents();
    }
}