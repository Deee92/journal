package org.apache.pdfbox.multipdf;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.Set;

import converters.FileCleanableConverter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class TestOverlayPanktiGen {
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

    private Set insertPrivateMockField_openDocuments_InOverlay(Overlay receivingObject) throws Exception {
        Set mockSet = Mockito.mock(Set.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("openDocuments");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockSet);
        return mockSet;
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_overlay_PO_3e70a5c1b4e14f67a62fb1e0afdeb5b0() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.multipdf.Overlay>" +
        "  <openDocuments/>" +
        "  <specificPageOverlayPage/>" +
        "  <position>FOREGROUND</position>" +
        "  <inputFileName>./workload/000752.pdf</inputFileName>" +
        "  <defaultOverlayFilename>./workload/000142.pdf</defaultOverlayFilename>" +
        "  <numberOfOverlayPages>0</numberOfOverlayPages>" +
        "  <useAllOverlayPages>false</useAllOverlayPages>" +
        "</org.apache.pdfbox.multipdf.Overlay>";
        org.apache.pdfbox.multipdf.Overlay receivingObject = deserializeObjectFromString(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <map/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        java.util.Map paramObject1 = (java.util.Map) paramObjects[0];
        Set mockSet = insertPrivateMockField_openDocuments_InOverlay(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.overlay(paramObject1);
        // Assert
        Mockito.verify(mockSet, Mockito.atLeastOnce()).add(any(java.lang.Object.class));
    }

    @Test
    public void test_overlay_CO_3e70a5c1b4e14f67a62fb1e0afdeb5b0() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.multipdf.Overlay>" +
        "  <openDocuments/>" +
        "  <specificPageOverlayPage/>" +
        "  <position>FOREGROUND</position>" +
        "  <inputFileName>./workload/000752.pdf</inputFileName>" +
        "  <defaultOverlayFilename>./workload/000142.pdf</defaultOverlayFilename>" +
        "  <numberOfOverlayPages>0</numberOfOverlayPages>" +
        "  <useAllOverlayPages>false</useAllOverlayPages>" +
        "</org.apache.pdfbox.multipdf.Overlay>";
        org.apache.pdfbox.multipdf.Overlay receivingObject = deserializeObjectFromString(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <map/>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        java.util.Map paramObject1 = (java.util.Map) paramObjects[0];
        Set mockSet = insertPrivateMockField_openDocuments_InOverlay(receivingObject);
        Mockito.when(mockSet.add(any(java.lang.Object.class))).thenReturn(true);
        // Act
        receivingObject.overlay(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockSet);
        orderVerifier.verify(mockSet, Mockito.times(10)).add((java.lang.Object) any());
    }
}