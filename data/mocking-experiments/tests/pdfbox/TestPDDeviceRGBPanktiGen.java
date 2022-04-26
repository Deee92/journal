package org.apache.pdfbox.pdmodel.graphics.color;
import com.thoughtworks.xstream.XStream;

import java.awt.image.WritableRaster;
import java.io.File;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class TestPDDeviceRGBPanktiGen {
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
    public void test_toRGBImage_PO_c4a605d936ef4eb7bf53eb4e2c1d20d2() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB>" +
        "  <initialColor>" +
        "    <components>" +
        "      <float>0.0</float>" +
        "      <float>0.0</float>" +
        "      <float>0.0</float>" +
        "    </components>" +
        "    <colorSpace class=\"org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB\" reference=\"../..\"/>" +
        "  </initialColor>" +
        "</org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB>";
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB.toRGBImage1-params.xml");
        java.awt.image.WritableRaster paramObject1 = (java.awt.image.WritableRaster) paramObjects[0];
        WritableRaster mockRaster = Mockito.mock(WritableRaster.class);
        Mockito.when(mockRaster.getWidth()).thenReturn(1);
        Mockito.when(mockRaster.getHeight()).thenReturn(1);
        // Act
        receivingObject.toRGBImage(mockRaster);
        // Assert
        Mockito.verify(mockRaster, Mockito.atLeastOnce()).getWidth();
        Mockito.verify(mockRaster, Mockito.atLeastOnce()).getHeight();
    }

    @Test
    public void test_toRGBImage_CO_c4a605d936ef4eb7bf53eb4e2c1d20d2() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB>" +
        "  <initialColor>" +
        "    <components>" +
        "      <float>0.0</float>" +
        "      <float>0.0</float>" +
        "      <float>0.0</float>" +
        "    </components>" +
        "    <colorSpace class=\"org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB\" reference=\"../..\"/>" +
        "  </initialColor>" +
        "</org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB>";
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB receivingObject = deserializeObjectFromString(receivingObjectStr);
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB.toRGBImage1-params.xml");
        java.awt.image.WritableRaster paramObject1 = (java.awt.image.WritableRaster) paramObjects[0];
        WritableRaster mockRaster = Mockito.mock(WritableRaster.class);
        Mockito.when(mockRaster.getWidth()).thenReturn(1);
        Mockito.when(mockRaster.getHeight()).thenReturn(1);
        // Act
        receivingObject.toRGBImage(mockRaster);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockRaster, mockRaster);
        orderVerifier.verify(mockRaster, Mockito.times(1)).getWidth();
        orderVerifier.verify(mockRaster, Mockito.times(1)).getHeight();
        orderVerifier.verify(mockRaster, Mockito.times(1)).getWidth();
        orderVerifier.verify(mockRaster, Mockito.times(1)).getHeight();
    }
}