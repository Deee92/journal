package org.apache.pdfbox.pdmodel.font;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.apache.pdfbox.cos.COSDictionary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.*;

@ExtendWith(MockitoExtension.class)
public class TestPDFontDescriptorPanktiGen {
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

    private COSDictionary insertPrivateMockField_dic_InPDFontDescriptor(PDFontDescriptor receivingObject) throws Exception {
        COSDictionary mockCOSDictionary = Mockito.mock(COSDictionary.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("dic");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockCOSDictionary);
        return mockCOSDictionary;
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_getCapHeight_OO_3e87779a2368468baa51d52e5fcf3f99() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.getCapHeight1-receiving.xml");
        COSDictionary mockCOSDictionary = insertPrivateMockField_dic_InPDFontDescriptor(receivingObject);
        Mockito.when(mockCOSDictionary.getFloat(any(org.apache.pdfbox.cos.COSName.class), eq(0.0F))).thenReturn(718.0F);
        // Act
        float actual = receivingObject.getCapHeight();
        // Assert
        Assertions.assertEquals(718.0, actual);
    }

    @Test
    public void test_getCapHeight_PO_3e87779a2368468baa51d52e5fcf3f99() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.getCapHeight1-receiving.xml");
        COSDictionary mockCOSDictionary = insertPrivateMockField_dic_InPDFontDescriptor(receivingObject);
        Mockito.when(mockCOSDictionary.getFloat(any(org.apache.pdfbox.cos.COSName.class), eq(0.0F))).thenReturn(718.0F);
        // Act
        receivingObject.getCapHeight();
        // Assert
        Mockito.verify(mockCOSDictionary, Mockito.atLeastOnce()).getFloat(any(org.apache.pdfbox.cos.COSName.class), eq(0.0F));
    }

    @Test
    public void test_getCapHeight_CO_3e87779a2368468baa51d52e5fcf3f99() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.getCapHeight1-receiving.xml");
        COSDictionary mockCOSDictionary = insertPrivateMockField_dic_InPDFontDescriptor(receivingObject);
        Mockito.when(mockCOSDictionary.getFloat(any(org.apache.pdfbox.cos.COSName.class), eq(0.0F))).thenReturn(718.0F);
        // Act
        receivingObject.getCapHeight();
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSDictionary);
        orderVerifier.verify(mockCOSDictionary, Mockito.times(1)).getFloat((org.apache.pdfbox.cos.COSName) any(), anyFloat());
    }

    @Test
    public void test_setCapHeight_PO_91e09b7987c345e4b9201af8a3658411() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.setCapHeight1-receiving.xml");
        COSDictionary mockCOSDictionary = insertPrivateMockField_dic_InPDFontDescriptor(receivingObject);
        // Act
        receivingObject.setCapHeight(662.0F);
        // Assert
        Mockito.verify(mockCOSDictionary, Mockito.atLeastOnce()).setFloat(any(org.apache.pdfbox.cos.COSName.class), eq(662.0F));
    }

    @Test
    public void test_setCapHeight_CO_91e09b7987c345e4b9201af8a3658411() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.setCapHeight1-receiving.xml");
        COSDictionary mockCOSDictionary = insertPrivateMockField_dic_InPDFontDescriptor(receivingObject);
        // Act
        receivingObject.setCapHeight(662.0F);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSDictionary);
        orderVerifier.verify(mockCOSDictionary, Mockito.times(1)).setFloat((org.apache.pdfbox.cos.COSName) any(), anyFloat());
    }

    @Test
    public void test_setXHeight_PO_48f4a4eb45c04d3d8ee37a85909a06fa() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.setXHeight1-receiving.xml");
        COSDictionary mockCOSDictionary = insertPrivateMockField_dic_InPDFontDescriptor(receivingObject);
        // Act
        receivingObject.setXHeight(450.0F);
        // Assert
        Mockito.verify(mockCOSDictionary, Mockito.atLeastOnce()).setFloat(any(org.apache.pdfbox.cos.COSName.class), eq(450.0F));
    }

    @Test
    public void test_setXHeight_CO_48f4a4eb45c04d3d8ee37a85909a06fa() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.font.PDFontDescriptor.setXHeight1-receiving.xml");
        COSDictionary mockCOSDictionary = insertPrivateMockField_dic_InPDFontDescriptor(receivingObject);
        // Act
        receivingObject.setXHeight(450.0F);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockCOSDictionary);
        orderVerifier.verify(mockCOSDictionary, Mockito.times(1)).setFloat((org.apache.pdfbox.cos.COSName) any(), anyFloat());
    }
}