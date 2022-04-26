package org.apache.pdfbox.pdmodel.graphics.state;
import com.thoughtworks.xstream.XStream;
import java.awt.geom.Area;
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

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class TestPDGraphicsStatePanktiGen {
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

    private Area insertPrivateMockField_clippingPath_InPDGraphicsState(PDGraphicsState receivingObject) throws Exception {
        Area mockArea = Mockito.mock(Area.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("clippingPath");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockArea);
        return mockArea;
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_intersectClippingPath_java_awt_geom_Area_PO_dfa0f601520c42b5b5ca71374d87ec08() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState.intersectClippingPath_java.awt.geom.Area1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <java.awt.geom.Area>" +
        "    <curves>" +
        "      <sun.awt.geom.Order0>" +
        "        <direction>1</direction>" +
        "        <x>0.0</x>" +
        "        <y>0.0</y>" +
        "      </sun.awt.geom.Order0>" +
        "      <sun.awt.geom.Order1>" +
        "        <direction>1</direction>" +
        "        <x0>0.0</x0>" +
        "        <y0>0.0</y0>" +
        "        <x1>0.0</x1>" +
        "        <y1>792.0</y1>" +
        "        <xmin>0.0</xmin>" +
        "        <xmax>0.0</xmax>" +
        "      </sun.awt.geom.Order1>" +
        "      <sun.awt.geom.Order1>" +
        "        <direction>-1</direction>" +
        "        <x0>612.0</x0>" +
        "        <y0>0.0</y0>" +
        "        <x1>612.0</x1>" +
        "        <y1>792.0</y1>" +
        "        <xmin>612.0</xmin>" +
        "        <xmax>612.0</xmax>" +
        "      </sun.awt.geom.Order1>" +
        "    </curves>" +
        "  </java.awt.geom.Area>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        java.awt.geom.Area paramObject1 = (java.awt.geom.Area) paramObjects[0];
        Area mockArea = insertPrivateMockField_clippingPath_InPDGraphicsState(receivingObject);
        // Act
        receivingObject.intersectClippingPath(paramObject1);
        // Assert
        Mockito.verify(mockArea, Mockito.atLeastOnce()).intersect(any(java.awt.geom.Area.class));
    }

    @Test
    public void test_intersectClippingPath_java_awt_geom_Area_CO_dfa0f601520c42b5b5ca71374d87ec08() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState.intersectClippingPath_java.awt.geom.Area1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <java.awt.geom.Area>" +
        "    <curves>" +
        "      <sun.awt.geom.Order0>" +
        "        <direction>1</direction>" +
        "        <x>0.0</x>" +
        "        <y>0.0</y>" +
        "      </sun.awt.geom.Order0>" +
        "      <sun.awt.geom.Order1>" +
        "        <direction>1</direction>" +
        "        <x0>0.0</x0>" +
        "        <y0>0.0</y0>" +
        "        <x1>0.0</x1>" +
        "        <y1>792.0</y1>" +
        "        <xmin>0.0</xmin>" +
        "        <xmax>0.0</xmax>" +
        "      </sun.awt.geom.Order1>" +
        "      <sun.awt.geom.Order1>" +
        "        <direction>-1</direction>" +
        "        <x0>612.0</x0>" +
        "        <y0>0.0</y0>" +
        "        <x1>612.0</x1>" +
        "        <y1>792.0</y1>" +
        "        <xmin>612.0</xmin>" +
        "        <xmax>612.0</xmax>" +
        "      </sun.awt.geom.Order1>" +
        "    </curves>" +
        "  </java.awt.geom.Area>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        java.awt.geom.Area paramObject1 = (java.awt.geom.Area) paramObjects[0];
        Area mockArea = insertPrivateMockField_clippingPath_InPDGraphicsState(receivingObject);
        // Act
        receivingObject.intersectClippingPath(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockArea);
        orderVerifier.verify(mockArea, Mockito.times(1)).intersect((java.awt.geom.Area) any());
    }
}