package org.apache.pdfbox.pdmodel;
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

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class TestPDResourcesPanktiGen {
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

    private ResourceCache insertPrivateMockField_cache_InPDResources(PDResources receivingObject) throws Exception {
        ResourceCache mockResourceCache = Mockito.mock(ResourceCache.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("cache");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockResourceCache);
        return mockResourceCache;
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_getExtGState_PO_1ba4dddf262f4f38a9f65af47434c0ea() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDResources receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDResources.getExtGState1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>GS1</name>" +
        "    <hashCode>70853</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        ResourceCache mockResourceCache = insertPrivateMockField_cache_InPDResources(receivingObject);
        // Act
        receivingObject.getExtGState(paramObject1);
        // Assert
        Mockito.verify(mockResourceCache, Mockito.atLeastOnce()).put(any(org.apache.pdfbox.cos.COSObject.class),   any(org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.class));
    }

    @Test
    public void test_getExtGState_CO_1ba4dddf262f4f38a9f65af47434c0ea() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDResources receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDResources.getExtGState1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>GS1</name>" +
        "    <hashCode>70853</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        ResourceCache mockResourceCache = insertPrivateMockField_cache_InPDResources(receivingObject);
        // Act
        receivingObject.getExtGState(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockResourceCache);
        orderVerifier.verify(mockResourceCache, Mockito.times(1)).put((org.apache.pdfbox.cos.COSObject) any(), (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) any());
    }

    @Test
    public void test_getExtGState_PO_cc801b6e8f9448c4a80ded10e33ce58c() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDResources receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDResources.getExtGState2-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>GS1</name>" +
        "    <hashCode>70853</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        ResourceCache mockResourceCache = insertPrivateMockField_cache_InPDResources(receivingObject);
        // Act
        receivingObject.getExtGState(paramObject1);
        // Assert
        Mockito.verify(mockResourceCache, Mockito.atLeastOnce()).put(any(org.apache.pdfbox.cos.COSObject.class),   any(org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState.class));
    }

    @Test
    public void test_getExtGState_CO_cc801b6e8f9448c4a80ded10e33ce58c() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDResources receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDResources.getExtGState2-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>GS1</name>" +
        "    <hashCode>70853</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        ResourceCache mockResourceCache = insertPrivateMockField_cache_InPDResources(receivingObject);
        // Act
        receivingObject.getExtGState(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockResourceCache);
        orderVerifier.verify(mockResourceCache, Mockito.times(1)).put((org.apache.pdfbox.cos.COSObject) any(), (org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState) any());
    }

    @Test
    public void test_getFont_PO_4adad312e78e4382a9d4591c2ea10c8a() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDResources receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDResources.getFont1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>TT2</name>" +
        "    <hashCode>83378</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        ResourceCache mockResourceCache = insertPrivateMockField_cache_InPDResources(receivingObject);
        // Act
        receivingObject.getFont(paramObject1);
        // Assert
        Mockito.verify(mockResourceCache, Mockito.atLeastOnce()).put(any(org.apache.pdfbox.cos.COSObject.class),   any(org.apache.pdfbox.pdmodel.font.PDFont.class));
    }

    @Test
    public void test_getFont_CO_4adad312e78e4382a9d4591c2ea10c8a() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDResources receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDResources.getFont1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>TT2</name>" +
        "    <hashCode>83378</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        ResourceCache mockResourceCache = insertPrivateMockField_cache_InPDResources(receivingObject);
        // Act
        receivingObject.getFont(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockResourceCache);
        orderVerifier.verify(mockResourceCache, Mockito.times(1)).put((org.apache.pdfbox.cos.COSObject) any(), (org.apache.pdfbox.pdmodel.font.PDFont) any());
    }

    @Test
    public void test_getFont_PO_995dd2e5cbc14a36a6d83fab2a375a37() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDResources receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDResources.getFont2-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>TT2</name>" +
        "    <hashCode>83378</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        ResourceCache mockResourceCache = insertPrivateMockField_cache_InPDResources(receivingObject);
        // Act
        receivingObject.getFont(paramObject1);
        // Assert
        Mockito.verify(mockResourceCache, Mockito.atLeastOnce()).put(any(org.apache.pdfbox.cos.COSObject.class),   any(org.apache.pdfbox.pdmodel.font.PDFont.class));
    }

    @Test
    public void test_getFont_CO_995dd2e5cbc14a36a6d83fab2a375a37() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDResources receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDResources.getFont2-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>TT2</name>" +
        "    <hashCode>83378</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        ResourceCache mockResourceCache = insertPrivateMockField_cache_InPDResources(receivingObject);
        // Act
        receivingObject.getFont(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockResourceCache);
        orderVerifier.verify(mockResourceCache, Mockito.times(1)).put((org.apache.pdfbox.cos.COSObject) any(), (org.apache.pdfbox.pdmodel.font.PDFont) any());
    }

    @Test
    public void test_getFont_PO_fb1fbb392b634b94857545c781b18e33() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDResources receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDResources.getFont3-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>TT2</name>" +
        "    <hashCode>83378</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        ResourceCache mockResourceCache = insertPrivateMockField_cache_InPDResources(receivingObject);
        // Act
        receivingObject.getFont(paramObject1);
        // Assert
        Mockito.verify(mockResourceCache, Mockito.atLeastOnce()).put(any(org.apache.pdfbox.cos.COSObject.class),   any(org.apache.pdfbox.pdmodel.font.PDFont.class));
    }

    @Test
    public void test_getFont_CO_fb1fbb392b634b94857545c781b18e33() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDResources receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDResources.getFont3-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>TT2</name>" +
        "    <hashCode>83378</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        ResourceCache mockResourceCache = insertPrivateMockField_cache_InPDResources(receivingObject);
        // Act
        receivingObject.getFont(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockResourceCache);
        orderVerifier.verify(mockResourceCache, Mockito.times(1)).put((org.apache.pdfbox.cos.COSObject) any(), (org.apache.pdfbox.pdmodel.font.PDFont) any());
    }

    @Test
    public void test_getXObject_PO_0b3ab2581e10445684aa4d40146d0f3c() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDResources receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDResources.getXObject1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>Im1</name>" +
        "    <hashCode>73581</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        ResourceCache mockResourceCache = insertPrivateMockField_cache_InPDResources(receivingObject);
        // Act
        receivingObject.getXObject(paramObject1);
        // Assert
        Mockito.verify(mockResourceCache, Mockito.atLeastOnce()).put(any(org.apache.pdfbox.cos.COSObject.class),   any(org.apache.pdfbox.pdmodel.graphics.PDXObject.class));
    }

    @Test
    public void test_getXObject_CO_0b3ab2581e10445684aa4d40146d0f3c() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDResources receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDResources.getXObject1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>Im1</name>" +
        "    <hashCode>73581</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        ResourceCache mockResourceCache = insertPrivateMockField_cache_InPDResources(receivingObject);
        // Act
        receivingObject.getXObject(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockResourceCache);
        orderVerifier.verify(mockResourceCache, Mockito.times(1)).put((org.apache.pdfbox.cos.COSObject) any(), (org.apache.pdfbox.pdmodel.graphics.PDXObject) any());
    }

    @Test
    public void test_getXObject_PO_9b32e321ca154dc882bda6cd7a677979() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDResources receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDResources.getXObject2-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>Im1</name>" +
        "    <hashCode>73581</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        ResourceCache mockResourceCache = insertPrivateMockField_cache_InPDResources(receivingObject);
        // Act
        receivingObject.getXObject(paramObject1);
        // Assert
        Mockito.verify(mockResourceCache, Mockito.atLeastOnce()).put(any(org.apache.pdfbox.cos.COSObject.class),   any(org.apache.pdfbox.pdmodel.graphics.PDXObject.class));
    }

    @Test
    public void test_getXObject_CO_9b32e321ca154dc882bda6cd7a677979() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDResources receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDResources.getXObject2-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.cos.COSName>" +
        "    <direct>false</direct>" +
        "    <name>Im1</name>" +
        "    <hashCode>73581</hashCode>" +
        "  </org.apache.pdfbox.cos.COSName>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.cos.COSName paramObject1 = (org.apache.pdfbox.cos.COSName) paramObjects[0];
        ResourceCache mockResourceCache = insertPrivateMockField_cache_InPDResources(receivingObject);
        // Act
        receivingObject.getXObject(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockResourceCache);
        orderVerifier.verify(mockResourceCache, Mockito.times(1)).put((org.apache.pdfbox.cos.COSObject) any(), (org.apache.pdfbox.pdmodel.graphics.PDXObject) any());
    }
}