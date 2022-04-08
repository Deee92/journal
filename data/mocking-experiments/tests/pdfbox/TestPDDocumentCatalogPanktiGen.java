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
    public void test_getAcroForm_org_apache_pdfbox_pdmodel_fixup_PDDocumentFixup_PO_5945e8535fff4962863ca09307fe4baf() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup2-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup2-params.xml");
        org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup paramObject1 = (org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup) paramObjects[0];
        PDDocumentFixup mockPDDocumentFixup = Mockito.mock(PDDocumentFixup.class);
        // Act
        receivingObject.getAcroForm(mockPDDocumentFixup);
        // Assert
        Mockito.verify(mockPDDocumentFixup, Mockito.atLeastOnce()).apply();
    }

    @Test
    public void test_getAcroForm_org_apache_pdfbox_pdmodel_fixup_PDDocumentFixup_CO_5945e8535fff4962863ca09307fe4baf() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup2-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup2-params.xml");
        org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup paramObject1 = (org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup) paramObjects[0];
        PDDocumentFixup mockPDDocumentFixup = Mockito.mock(PDDocumentFixup.class);
        // Act
        receivingObject.getAcroForm(mockPDDocumentFixup);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDDocumentFixup);
        orderVerifier.verify(mockPDDocumentFixup, Mockito.times(1)).apply();
    }

    @Test
    public void test_getAcroForm_org_apache_pdfbox_pdmodel_fixup_PDDocumentFixup_PO_b48a8302cc714d429329dcf2a1e97684() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup3-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup3-params.xml");
        org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup paramObject1 = (org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup) paramObjects[0];
        PDDocumentFixup mockPDDocumentFixup = Mockito.mock(PDDocumentFixup.class);
        // Act
        receivingObject.getAcroForm(mockPDDocumentFixup);
        // Assert
        Mockito.verify(mockPDDocumentFixup, Mockito.atLeastOnce()).apply();
    }

    @Test
    public void test_getAcroForm_org_apache_pdfbox_pdmodel_fixup_PDDocumentFixup_CO_b48a8302cc714d429329dcf2a1e97684() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.PDDocumentCatalog receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup3-receiving.xml");
        Object[] paramObjects = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.PDDocumentCatalog.getAcroForm_org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup3-params.xml");
        org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup paramObject1 = (org.apache.pdfbox.pdmodel.fixup.PDDocumentFixup) paramObjects[0];
        PDDocumentFixup mockPDDocumentFixup = Mockito.mock(PDDocumentFixup.class);
        // Act
        receivingObject.getAcroForm(mockPDDocumentFixup);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDDocumentFixup);
        orderVerifier.verify(mockPDDocumentFixup, Mockito.times(1)).apply();
    }
}