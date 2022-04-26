package org.apache.pdfbox.pdmodel;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.apache.pdfbox.cos.COSDictionary;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class TestPDPagePanktiGen {
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

    private COSDictionary insertPrivateMockField_page_InPDPage(PDPage receivingObject) throws Exception {
        COSDictionary mockCOSDictionary = Mockito.mock(COSDictionary.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("page");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockCOSDictionary);
        return mockCOSDictionary;
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_setResources_PO_b80c356ef49643f6b611de8ceaec1128() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDPage receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setResources1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setResources1-params.xml");
        org.apache.pdfbox.pdmodel.PDResources paramObject1 = (org.apache.pdfbox.pdmodel.PDResources) paramObjects[0];
        COSDictionary mockCOSDictionary = insertPrivateMockField_page_InPDPage(receivingObject);
        // Act
        receivingObject.setResources(paramObject1);
        // Assert
        Mockito.verify(mockCOSDictionary, Mockito.atLeastOnce()).setItem(any(org.apache.pdfbox.cos.COSName.class),   any(org.apache.pdfbox.pdmodel.common.COSObjectable.class));
    }

    @Test
    public void test_setResources_CO_b80c356ef49643f6b611de8ceaec1128() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDPage receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setResources1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setResources1-params.xml");
        org.apache.pdfbox.pdmodel.PDResources paramObject1 = (org.apache.pdfbox.pdmodel.PDResources) paramObjects[0];
        COSDictionary mockCOSDictionary = insertPrivateMockField_page_InPDPage(receivingObject);
        // Act
        receivingObject.setResources(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSDictionary);
        orderVerifier.verify(mockCOSDictionary, Mockito.times(1)).setItem((org.apache.pdfbox.cos.COSName) any(), (org.apache.pdfbox.pdmodel.common.COSObjectable) any());
    }

    @Test
    public void test_setResources_PO_5d582e9d156a4b3d84faebb923acb667() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDPage receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setResources2-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.pdmodel.PDResources>" +
        "    <resources>" +
        "      <direct>false</direct>" +
        "      <needToBeUpdated>false</needToBeUpdated>" +
        "      <items class=\"org.apache.pdfbox.util.SmallMap\"/>" +
        "    </resources>" +
        "    <directFontCache/>" +
        "  </org.apache.pdfbox.pdmodel.PDResources>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.pdmodel.PDResources paramObject1 = (org.apache.pdfbox.pdmodel.PDResources) paramObjects[0];
        COSDictionary mockCOSDictionary = insertPrivateMockField_page_InPDPage(receivingObject);
        // Act
        receivingObject.setResources(paramObject1);
        // Assert
        Mockito.verify(mockCOSDictionary, Mockito.atLeastOnce()).setItem(any(org.apache.pdfbox.cos.COSName.class),   any(org.apache.pdfbox.pdmodel.common.COSObjectable.class));
    }

    @Test
    public void test_setResources_CO_5d582e9d156a4b3d84faebb923acb667() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDPage receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setResources2-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <org.apache.pdfbox.pdmodel.PDResources>" +
        "    <resources>" +
        "      <direct>false</direct>" +
        "      <needToBeUpdated>false</needToBeUpdated>" +
        "      <items class=\"org.apache.pdfbox.util.SmallMap\"/>" +
        "    </resources>" +
        "    <directFontCache/>" +
        "  </org.apache.pdfbox.pdmodel.PDResources>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        org.apache.pdfbox.pdmodel.PDResources paramObject1 = (org.apache.pdfbox.pdmodel.PDResources) paramObjects[0];
        COSDictionary mockCOSDictionary = insertPrivateMockField_page_InPDPage(receivingObject);
        // Act
        receivingObject.setResources(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSDictionary);
        orderVerifier.verify(mockCOSDictionary, Mockito.times(1)).setItem((org.apache.pdfbox.cos.COSName) any(), (org.apache.pdfbox.pdmodel.common.COSObjectable) any());
    }

    @Test
    public void test_setResources_PO_6181bef75c6d4583846970271bda38c2() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDPage receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setResources3-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setResources3-params.xml");
        org.apache.pdfbox.pdmodel.PDResources paramObject1 = (org.apache.pdfbox.pdmodel.PDResources) paramObjects[0];
        COSDictionary mockCOSDictionary = insertPrivateMockField_page_InPDPage(receivingObject);
        // Act
        receivingObject.setResources(paramObject1);
        // Assert
        Mockito.verify(mockCOSDictionary, Mockito.atLeastOnce()).setItem(any(org.apache.pdfbox.cos.COSName.class),   any(org.apache.pdfbox.pdmodel.common.COSObjectable.class));
    }

    @Test
    public void test_setResources_CO_6181bef75c6d4583846970271bda38c2() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDPage receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setResources3-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setResources3-params.xml");
        org.apache.pdfbox.pdmodel.PDResources paramObject1 = (org.apache.pdfbox.pdmodel.PDResources) paramObjects[0];
        COSDictionary mockCOSDictionary = insertPrivateMockField_page_InPDPage(receivingObject);
        // Act
        receivingObject.setResources(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSDictionary);
        orderVerifier.verify(mockCOSDictionary, Mockito.times(1)).setItem((org.apache.pdfbox.cos.COSName) any(), (org.apache.pdfbox.pdmodel.common.COSObjectable) any());
    }

    @Test
    public void test_setMediaBox_PO_837c264619a242039017fcb679d88ada() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDPage receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setMediaBox1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setMediaBox1-params.xml");
        org.apache.pdfbox.pdmodel.common.PDRectangle paramObject1 = (org.apache.pdfbox.pdmodel.common.PDRectangle) paramObjects[0];
        COSDictionary mockCOSDictionary = insertPrivateMockField_page_InPDPage(receivingObject);
        // Act
        receivingObject.setMediaBox(paramObject1);
        // Assert
        Mockito.verify(mockCOSDictionary, Mockito.atLeastOnce()).setItem(any(org.apache.pdfbox.cos.COSName.class),   any(org.apache.pdfbox.pdmodel.common.COSObjectable.class));
    }

    @Test
    public void test_setMediaBox_CO_837c264619a242039017fcb679d88ada() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDPage receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setMediaBox1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setMediaBox1-params.xml");
        org.apache.pdfbox.pdmodel.common.PDRectangle paramObject1 = (org.apache.pdfbox.pdmodel.common.PDRectangle) paramObjects[0];
        COSDictionary mockCOSDictionary = insertPrivateMockField_page_InPDPage(receivingObject);
        // Act
        receivingObject.setMediaBox(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSDictionary);
        orderVerifier.verify(mockCOSDictionary, Mockito.times(1)).setItem((org.apache.pdfbox.cos.COSName) any(), (org.apache.pdfbox.pdmodel.common.COSObjectable) any());
    }

    @Test
    public void test_setMediaBox_PO_8999932925d344a28f05f2574005cbe5() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDPage receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setMediaBox2-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setMediaBox2-params.xml");
        org.apache.pdfbox.pdmodel.common.PDRectangle paramObject1 = (org.apache.pdfbox.pdmodel.common.PDRectangle) paramObjects[0];
        COSDictionary mockCOSDictionary = insertPrivateMockField_page_InPDPage(receivingObject);
        // Act
        receivingObject.setMediaBox(paramObject1);
        // Assert
        Mockito.verify(mockCOSDictionary, Mockito.atLeastOnce()).setItem(any(org.apache.pdfbox.cos.COSName.class),   any(org.apache.pdfbox.pdmodel.common.COSObjectable.class));
    }

    @Test
    public void test_setMediaBox_CO_8999932925d344a28f05f2574005cbe5() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDPage receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setMediaBox2-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPage.setMediaBox2-params.xml");
        org.apache.pdfbox.pdmodel.common.PDRectangle paramObject1 = (org.apache.pdfbox.pdmodel.common.PDRectangle) paramObjects[0];
        COSDictionary mockCOSDictionary = insertPrivateMockField_page_InPDPage(receivingObject);
        // Act
        receivingObject.setMediaBox(paramObject1);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSDictionary);
        orderVerifier.verify(mockCOSDictionary, Mockito.times(1)).setItem((org.apache.pdfbox.cos.COSName) any(), (org.apache.pdfbox.pdmodel.common.COSObjectable) any());
    }
}