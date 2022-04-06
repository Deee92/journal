package org.apache.pdfbox.rendering;
import com.thoughtworks.xstream.XStream;
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
public class TestPDFRendererPanktiGen {
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
    public void test_renderImage_PO_2ada86993d8243028d415743da064f85() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.PDFRenderer.renderImage_int,float,org.apache.pdfbox.rendering.ImageType,org.apache.pdfbox.rendering.RenderDestination1-receiving.xml").getFile());
        org.apache.pdfbox.rendering.PDFRenderer receivingObject = deserializeObject(fileReceiving);
        String paramsObjectStr = 
        "<object-array>" +
        "  <int>0</int>" +
        "  <float>1.3333334</float>" +
        "  <org.apache.pdfbox.rendering.ImageType>RGB</org.apache.pdfbox.rendering.ImageType>" +
        "  <org.apache.pdfbox.rendering.RenderDestination>EXPORT</org.apache.pdfbox.rendering.RenderDestination>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        int paramObject1 = (Integer) paramObjects[0];
        float paramObject2 = (Float) paramObjects[1];
        org.apache.pdfbox.rendering.ImageType paramObject3 = (org.apache.pdfbox.rendering.ImageType) paramObjects[2];
        org.apache.pdfbox.rendering.RenderDestination paramObject4 = (org.apache.pdfbox.rendering.RenderDestination) paramObjects[3];
        ImageType mockImageType = Mockito.mock(ImageType.class);
        Mockito.when(mockImageType.toBufferedImageType()).thenReturn(1);
        // Act
        receivingObject.renderImage(paramObject1, paramObject2, mockImageType, paramObject4);
        // Assert
        Mockito.verify(mockImageType, Mockito.atLeastOnce()).toBufferedImageType();
    }

    @Test
    public void test_renderImage_CO_2ada86993d8243028d415743da064f85() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.rendering.PDFRenderer.renderImage_int,float,org.apache.pdfbox.rendering.ImageType,org.apache.pdfbox.rendering.RenderDestination1-receiving.xml").getFile());
        org.apache.pdfbox.rendering.PDFRenderer receivingObject = deserializeObject(fileReceiving);
        String paramsObjectStr = 
        "<object-array>" +
        "  <int>0</int>" +
        "  <float>1.3333334</float>" +
        "  <org.apache.pdfbox.rendering.ImageType>RGB</org.apache.pdfbox.rendering.ImageType>" +
        "  <org.apache.pdfbox.rendering.RenderDestination>EXPORT</org.apache.pdfbox.rendering.RenderDestination>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        int paramObject1 = (Integer) paramObjects[0];
        float paramObject2 = (Float) paramObjects[1];
        org.apache.pdfbox.rendering.ImageType paramObject3 = (org.apache.pdfbox.rendering.ImageType) paramObjects[2];
        org.apache.pdfbox.rendering.RenderDestination paramObject4 = (org.apache.pdfbox.rendering.RenderDestination) paramObjects[3];
        ImageType mockImageType = Mockito.mock(ImageType.class);
        Mockito.when(mockImageType.toBufferedImageType()).thenReturn(1);
        // Act
        receivingObject.renderImage(paramObject1, paramObject2, mockImageType, paramObject4);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockImageType);
        orderVerifier.verify(mockImageType, Mockito.times(2)).toBufferedImageType();
    }
}