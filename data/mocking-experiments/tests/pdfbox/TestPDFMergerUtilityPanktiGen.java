package org.apache.pdfbox.multipdf;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class TestPDFMergerUtilityPanktiGen {
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
    public void test_appendDocument_PO_61e1416671fa443dab511aff7820ad75() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.apache.pdfbox.multipdf.PDFMergerUtility>" +
        "  <sources>" +
        "    <file>./workload/000752-locked-1.pdf</file>" +
        "    <file>./workload/000752-locked-2.pdf</file>" +
        "  </sources>" +
        "  <destinationFileName>./workload/000752-merged.pdf</destinationFileName>" +
        "  <ignoreAcroFormErrors>false</ignoreAcroFormErrors>" +
        "  <documentMergeMode>PDFBOX_LEGACY_MODE</documentMergeMode>" +
        "  <acroFormMergeMode>PDFBOX_LEGACY_MODE</acroFormMergeMode>" +
        "  <nextFieldNum>1</nextFieldNum>" +
        "</org.apache.pdfbox.multipdf.PDFMergerUtility>";
        org.apache.pdfbox.multipdf.PDFMergerUtility receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.multipdf.PDFMergerUtility.appendDocument1-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.apache.pdfbox.pdmodel.PDDocument paramObject1 = (org.apache.pdfbox.pdmodel.PDDocument) paramObjects[0];
        org.apache.pdfbox.pdmodel.PDDocument paramObject2 = (org.apache.pdfbox.pdmodel.PDDocument) paramObjects[1];
        PDDocument mockPDDocument = Mockito.mock(PDDocument.class);
        Mockito.when(mockPDDocument.getVersion()).thenReturn(1.4F);
        // Act
        receivingObject.appendDocument(mockPDDocument, paramObject2);
        // Assert
        Mockito.verify(mockPDDocument, Mockito.atLeastOnce()).getVersion();
    }

    @Test
    public void test_appendDocument_CO_61e1416671fa443dab511aff7820ad75() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.apache.pdfbox.multipdf.PDFMergerUtility>" +
        "  <sources>" +
        "    <file>./workload/000752-locked-1.pdf</file>" +
        "    <file>./workload/000752-locked-2.pdf</file>" +
        "  </sources>" +
        "  <destinationFileName>./workload/000752-merged.pdf</destinationFileName>" +
        "  <ignoreAcroFormErrors>false</ignoreAcroFormErrors>" +
        "  <documentMergeMode>PDFBOX_LEGACY_MODE</documentMergeMode>" +
        "  <acroFormMergeMode>PDFBOX_LEGACY_MODE</acroFormMergeMode>" +
        "  <nextFieldNum>1</nextFieldNum>" +
        "</org.apache.pdfbox.multipdf.PDFMergerUtility>";
        org.apache.pdfbox.multipdf.PDFMergerUtility receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.multipdf.PDFMergerUtility.appendDocument1-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.apache.pdfbox.pdmodel.PDDocument paramObject1 = (org.apache.pdfbox.pdmodel.PDDocument) paramObjects[0];
        org.apache.pdfbox.pdmodel.PDDocument paramObject2 = (org.apache.pdfbox.pdmodel.PDDocument) paramObjects[1];
        PDDocument mockPDDocument = Mockito.mock(PDDocument.class);
        Mockito.when(mockPDDocument.getVersion()).thenReturn(1.4F);
        // Act
        receivingObject.appendDocument(mockPDDocument, paramObject2);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDDocument);
        orderVerifier.verify(mockPDDocument, Mockito.times(2)).getVersion();
    }
}