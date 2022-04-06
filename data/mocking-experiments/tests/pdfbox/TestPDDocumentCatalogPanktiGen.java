package org.apache.pdfbox.pdmodel;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class TestPDDocumentCatalogPanktiGen {
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
    public void test_getAcroForm_PO_5945e8535fff4962863ca09307fe4baf() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup2-receiving.xml").getFile());
        org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = deserializeObject(fileReceiving);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup2-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup paramObject1 = (org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup) paramObjects[0];
        PDDocumentFixup mockPDDocumentFixup = Mockito.mock(PDDocumentFixup.class);
        // Act
        receivingObject.getAcroForm(mockPDDocumentFixup);
        // Assert
        Mockito.verify(mockPDDocumentFixup, Mockito.atLeastOnce()).apply();
    }

    @Test
    public void test_getAcroForm_CO_5945e8535fff4962863ca09307fe4baf() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup2-receiving.xml").getFile());
        org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = deserializeObject(fileReceiving);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup2-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup paramObject1 = (org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup) paramObjects[0];
        PDDocumentFixup mockPDDocumentFixup = Mockito.mock(PDDocumentFixup.class);
        // Act
        receivingObject.getAcroForm(mockPDDocumentFixup);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDDocumentFixup);
        orderVerifier.verify(mockPDDocumentFixup).apply();
    }

    @Test
    public void test_getAcroForm_PO_b48a8302cc714d429329dcf2a1e97684() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup3-receiving.xml").getFile());
        org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = deserializeObject(fileReceiving);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup3-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup paramObject1 = (org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup) paramObjects[0];
        PDDocumentFixup mockPDDocumentFixup = Mockito.mock(PDDocumentFixup.class);
        // Act
        receivingObject.getAcroForm(mockPDDocumentFixup);
        // Assert
        Mockito.verify(mockPDDocumentFixup, Mockito.atLeastOnce()).apply();
    }

    @Test
    public void test_getAcroForm_CO_b48a8302cc714d429329dcf2a1e97684() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        File fileReceiving = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup3-receiving.xml").getFile());
        org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = deserializeObject(fileReceiving);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup3-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup paramObject1 = (org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup) paramObjects[0];
        PDDocumentFixup mockPDDocumentFixup = Mockito.mock(PDDocumentFixup.class);
        // Act
        receivingObject.getAcroForm(mockPDDocumentFixup);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDDocumentFixup);
        orderVerifier.verify(mockPDDocumentFixup).apply();
    }
}