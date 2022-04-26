package org.apache.pdfbox.pdmodel;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class TestPDPageContentStreamPanktiGen {
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
    public void test_setFont_PO_dd0969ff8fff4782997914ec56931ded() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDPageContentStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPageContentStream.setFont1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPageContentStream.setFont1-params.xml");
        org.apache.pdfbox.pdmodel.font.PDFont paramObject1 = (org.apache.pdfbox.pdmodel.font.PDFont) paramObjects[0];
        float paramObject2 = (Float) paramObjects[1];
        PDFont mockPDFont = Mockito.mock(PDFont.class);
        Mockito.when(mockPDFont.willBeSubset()).thenReturn(false);
        // Act
        receivingObject.setFont(mockPDFont, paramObject2);
        // Assert
        Mockito.verify(mockPDFont, Mockito.atLeastOnce()).willBeSubset();
    }

    @Test
    public void test_setFont_CO_dd0969ff8fff4782997914ec56931ded() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDPageContentStream receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPageContentStream.setFont1-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDPageContentStream.setFont1-params.xml");
        org.apache.pdfbox.pdmodel.font.PDFont paramObject1 = (org.apache.pdfbox.pdmodel.font.PDFont) paramObjects[0];
        float paramObject2 = (Float) paramObjects[1];
        PDFont mockPDFont = Mockito.mock(PDFont.class);
        Mockito.when(mockPDFont.willBeSubset()).thenReturn(false);
        // Act
        receivingObject.setFont(mockPDFont, paramObject2);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDFont);
        orderVerifier.verify(mockPDFont, Mockito.times(1)).willBeSubset();
    }
}