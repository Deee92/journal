package org.apache.pdfbox.rendering;
import com.thoughtworks.xstream.XStream;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.apache.pdfbox.pdmodel.graphics.image.PDImage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.*;

@ExtendWith(MockitoExtension.class)
public class TestPageDrawerPanktiGen {
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

    private GeneralPath insertPrivateMockField_linePath_InPageDrawer(PageDrawer receivingObject) throws Exception {
        GeneralPath mockPath2DFloat = Mockito.mock(GeneralPath.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("linePath");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockPath2DFloat);
        return mockPath2DFloat;
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_appendRectangle_PO_6bd03d3fa48f42f39725389569c401cd() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.appendRectangle1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <java.awt.geom.Point2D_-Float>" +
        "    <x>45.0</x>" +
        "    <y>62.28</y>" +
        "  </java.awt.geom.Point2D_-Float>" +
        "  <java.awt.geom.Point2D_-Float>" +
        "    <x>567.0</x>" +
        "    <y>62.28</y>" +
        "  </java.awt.geom.Point2D_-Float>" +
        "  <java.awt.geom.Point2D_-Float>" +
        "    <x>567.0</x>" +
        "    <y>161.28</y>" +
        "  </java.awt.geom.Point2D_-Float>" +
        "  <java.awt.geom.Point2D_-Float>" +
        "    <x>45.0</x>" +
        "    <y>161.28</y>" +
        "  </java.awt.geom.Point2D_-Float>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        java.awt.geom.Point2D paramObject1 = (java.awt.geom.Point2D) paramObjects[0];
        java.awt.geom.Point2D paramObject2 = (java.awt.geom.Point2D) paramObjects[1];
        java.awt.geom.Point2D paramObject3 = (java.awt.geom.Point2D) paramObjects[2];
        java.awt.geom.Point2D paramObject4 = (java.awt.geom.Point2D) paramObjects[3];
        Point2D mockPoint2D = Mockito.mock(Point2D.class);
        Path2D.Float mockPath2DFloat = insertPrivateMockField_linePath_InPageDrawer(receivingObject);
        Path2D mockPath2D = insertPrivateMockField_linePath_InPageDrawer(receivingObject);
        Mockito.when(mockPoint2D.getX()).thenReturn(45.0);
        Mockito.when(mockPoint2D.getY()).thenReturn(62.279998779296875);
        Mockito.when(mockPoint2D.getX()).thenReturn(567.0);
        Mockito.when(mockPoint2D.getY()).thenReturn(161.27999877929688);
        // Act
        receivingObject.appendRectangle(mockPoint2D, paramObject2, paramObject3, paramObject4);
        // Assert
        Mockito.verify(mockPoint2D, Mockito.atLeastOnce()).getX();
        Mockito.verify(mockPoint2D, Mockito.atLeastOnce()).getY();
        Mockito.verify(mockPath2DFloat, Mockito.atLeastOnce()).moveTo(45.0F, 62.28F);
        Mockito.verify(mockPath2DFloat, Mockito.atLeastOnce()).lineTo(567.0F, 62.28F);
        Mockito.verify(mockPath2DFloat, Mockito.atLeastOnce()).lineTo(567.0F, 161.28F);
        Mockito.verify(mockPath2DFloat, Mockito.atLeastOnce()).lineTo(45.0F, 161.28F);
        Mockito.verify(mockPath2D, Mockito.atLeastOnce()).closePath();
    }

    @Test
    public void test_appendRectangle_CO_6bd03d3fa48f42f39725389569c401cd() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.appendRectangle1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <java.awt.geom.Point2D_-Float>" +
        "    <x>45.0</x>" +
        "    <y>62.28</y>" +
        "  </java.awt.geom.Point2D_-Float>" +
        "  <java.awt.geom.Point2D_-Float>" +
        "    <x>567.0</x>" +
        "    <y>62.28</y>" +
        "  </java.awt.geom.Point2D_-Float>" +
        "  <java.awt.geom.Point2D_-Float>" +
        "    <x>567.0</x>" +
        "    <y>161.28</y>" +
        "  </java.awt.geom.Point2D_-Float>" +
        "  <java.awt.geom.Point2D_-Float>" +
        "    <x>45.0</x>" +
        "    <y>161.28</y>" +
        "  </java.awt.geom.Point2D_-Float>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        java.awt.geom.Point2D paramObject1 = (java.awt.geom.Point2D) paramObjects[0];
        java.awt.geom.Point2D paramObject2 = (java.awt.geom.Point2D) paramObjects[1];
        java.awt.geom.Point2D paramObject3 = (java.awt.geom.Point2D) paramObjects[2];
        java.awt.geom.Point2D paramObject4 = (java.awt.geom.Point2D) paramObjects[3];
        Point2D mockPoint2D = Mockito.mock(Point2D.class);
        Path2D.Float mockPath2DFloat = insertPrivateMockField_linePath_InPageDrawer(receivingObject);
        Path2D mockPath2D = insertPrivateMockField_linePath_InPageDrawer(receivingObject);
        Mockito.when(mockPoint2D.getX()).thenReturn(45.0);
        Mockito.when(mockPoint2D.getY()).thenReturn(62.279998779296875);
        Mockito.when(mockPoint2D.getX()).thenReturn(567.0);
        Mockito.when(mockPoint2D.getY()).thenReturn(161.27999877929688);
        // Act
        receivingObject.appendRectangle(mockPoint2D, paramObject2, paramObject3, paramObject4);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPoint2D, mockPoint2D, mockPath2DFloat, mockPath2DFloat, mockPath2DFloat, mockPath2DFloat, mockPath2D);
        orderVerifier.verify(mockPoint2D, Mockito.times(1)).getX();
        orderVerifier.verify(mockPoint2D, Mockito.times(1)).getY();
        orderVerifier.verify(mockPath2DFloat, Mockito.times(1)).moveTo(anyFloat(), anyFloat());
        orderVerifier.verify(mockPoint2D, Mockito.times(1)).getX();
        orderVerifier.verify(mockPoint2D, Mockito.times(1)).getY();
        orderVerifier.verify(mockPath2DFloat, Mockito.times(1)).lineTo(anyFloat(), anyFloat());
        orderVerifier.verify(mockPoint2D, Mockito.times(1)).getX();
        orderVerifier.verify(mockPoint2D, Mockito.times(1)).getY();
        orderVerifier.verify(mockPath2DFloat, Mockito.times(1)).lineTo(anyFloat(), anyFloat());
        orderVerifier.verify(mockPoint2D, Mockito.times(1)).getX();
        orderVerifier.verify(mockPath2DFloat, Mockito.times(1)).lineTo(anyFloat(), anyFloat());
        orderVerifier.verify(mockPoint2D, Mockito.times(1)).getY();
        orderVerifier.verify(mockPath2D, Mockito.times(1)).closePath();
    }

    @Test
    public void test_fillPath_PO_6ae43eae52224019b09113778e9bafe3() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.fillPath1-receiving.xml");
        Path2D mockPath2D = insertPrivateMockField_linePath_InPageDrawer(receivingObject);
        // Act
        receivingObject.fillPath(1);
        // Assert
        Mockito.verify(mockPath2D, Mockito.atLeastOnce()).setWindingRule(1);
        Mockito.verify(mockPath2D, Mockito.atLeastOnce()).reset();
    }

    @Test
    public void test_fillPath_CO_6ae43eae52224019b09113778e9bafe3() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.fillPath1-receiving.xml");
        Path2D mockPath2D = insertPrivateMockField_linePath_InPageDrawer(receivingObject);
        // Act
        receivingObject.fillPath(1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPath2D, mockPath2D);
        orderVerifier.verify(mockPath2D, Mockito.times(1)).setWindingRule(anyInt());
        orderVerifier.verify(mockPath2D, Mockito.times(1)).reset();
    }

    @Test
    public void test_strokePath_PO_d2a207e490fa4f04a06f5ded02b71152() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.strokePath1-receiving.xml");
        Path2D mockPath2D = insertPrivateMockField_linePath_InPageDrawer(receivingObject);
        // Act
        receivingObject.strokePath();
        // Assert
        Mockito.verify(mockPath2D, Mockito.atLeastOnce()).reset();
    }

    @Test
    public void test_strokePath_CO_d2a207e490fa4f04a06f5ded02b71152() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.strokePath1-receiving.xml");
        Path2D mockPath2D = insertPrivateMockField_linePath_InPageDrawer(receivingObject);
        // Act
        receivingObject.strokePath();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPath2D);
        orderVerifier.verify(mockPath2D, Mockito.times(1)).reset();
    }

    @Test
    public void test_drawImage_PO_61791bad67ef482fa22ce0726a9ef0ba() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.drawImage1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.drawImage1-params.xml");
        org.apache.pdfbox.pdmodel.graphics.image.PDImage paramObject1 = (org.apache.pdfbox.pdmodel.graphics.image.PDImage) paramObjects[0];
        PDImage mockPDImage = Mockito.mock(PDImage.class);
        Mockito.when(mockPDImage.getInterpolate()).thenReturn(false);
        Mockito.when(mockPDImage.isStencil()).thenReturn(false);
        // Act
        receivingObject.drawImage(mockPDImage);
        // Assert
        Mockito.verify(mockPDImage, Mockito.atLeastOnce()).getInterpolate();
        Mockito.verify(mockPDImage, Mockito.atLeastOnce()).isStencil();
    }

    @Test
    public void test_drawImage_CO_61791bad67ef482fa22ce0726a9ef0ba() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.drawImage1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.drawImage1-params.xml");
        org.apache.pdfbox.pdmodel.graphics.image.PDImage paramObject1 = (org.apache.pdfbox.pdmodel.graphics.image.PDImage) paramObjects[0];
        PDImage mockPDImage = Mockito.mock(PDImage.class);
        Mockito.when(mockPDImage.getInterpolate()).thenReturn(false);
        Mockito.when(mockPDImage.isStencil()).thenReturn(false);
        // Act
        receivingObject.drawImage(mockPDImage);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDImage, mockPDImage);
        orderVerifier.verify(mockPDImage, Mockito.times(1)).getInterpolate();
        orderVerifier.verify(mockPDImage, Mockito.times(3)).isStencil();
        orderVerifier.verify(mockPDImage, Mockito.times(1)).getInterpolate();
    }

    private Graphics2D insertPrivateMockField_graphics_InPageDrawer(PageDrawer receivingObject) throws Exception {
        Graphics2D mockGraphics2D = Mockito.mock(Graphics2D.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("graphics");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockGraphics2D);
        return mockGraphics2D;
    }

    @Test
    @Disabled
    public void test_drawPage_PO_93f79e1b2eb744f680224a2784cb34e9() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.drawPage1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.drawPage1-params.xml");
        java.awt.Graphics paramObject1 = (java.awt.Graphics) paramObjects[0];
        org.apache.pdfbox.pdmodel.common.PDRectangle paramObject2 = (org.apache.pdfbox.pdmodel.common.PDRectangle) paramObjects[1];
        Graphics2D mockGraphics2D = insertPrivateMockField_graphics_InPageDrawer(receivingObject);
        // Act
        receivingObject.drawPage(paramObject1, paramObject2);
        // Assert
        Mockito.verify(mockGraphics2D, Mockito.atLeastOnce()).translate(0.0, 792.0);
        Mockito.verify(mockGraphics2D, Mockito.atLeastOnce()).scale(1.0, -1.0);
        Mockito.verify(mockGraphics2D, Mockito.atLeastOnce()).translate(-0.0, -0.0);
    }

    @Test
    @Disabled
    public void test_drawPage_CO_93f79e1b2eb744f680224a2784cb34e9() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.drawPage1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.drawPage1-params.xml");
        java.awt.Graphics paramObject1 = (java.awt.Graphics) paramObjects[0];
        org.apache.pdfbox.pdmodel.common.PDRectangle paramObject2 = (org.apache.pdfbox.pdmodel.common.PDRectangle) paramObjects[1];
        Graphics2D mockGraphics2D = insertPrivateMockField_graphics_InPageDrawer(receivingObject);
        // Act
        receivingObject.drawPage(paramObject1, paramObject2);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockGraphics2D, mockGraphics2D, mockGraphics2D);
        orderVerifier.verify(mockGraphics2D, Mockito.times(1)).translate(anyDouble(), anyDouble());
        orderVerifier.verify(mockGraphics2D, Mockito.times(1)).scale(anyDouble(), anyDouble());
        orderVerifier.verify(mockGraphics2D, Mockito.times(1)).translate(anyDouble(), anyDouble());
    }

    @Test
    public void test_endPath_PO_6b5f48be344f4a14b45238dad690a991() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.endPath1-receiving.xml");
        Path2D mockPath2D = insertPrivateMockField_linePath_InPageDrawer(receivingObject);
        // Act
        receivingObject.endPath();
        // Assert
        Mockito.verify(mockPath2D, Mockito.atLeastOnce()).setWindingRule(1);
        Mockito.verify(mockPath2D, Mockito.atLeastOnce()).reset();
    }

    @Test
    public void test_endPath_CO_6b5f48be344f4a14b45238dad690a991() throws Exception {
        // Arrange
        org.apache.pdfbox.rendering.PageDrawer receivingObject = deserializeObjectFromFile("org.apache.pdfbox.rendering.PageDrawer.endPath1-receiving.xml");
        Path2D mockPath2D = insertPrivateMockField_linePath_InPageDrawer(receivingObject);
        // Act
        receivingObject.endPath();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPath2D, mockPath2D);
        orderVerifier.verify(mockPath2D, Mockito.times(1)).setWindingRule(anyInt());
        orderVerifier.verify(mockPath2D, Mockito.times(1)).reset();
    }
}