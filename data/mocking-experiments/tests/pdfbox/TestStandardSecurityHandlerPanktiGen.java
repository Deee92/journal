package org.apache.pdfbox.pdmodel.encryption;
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
public class TestStandardSecurityHandlerPanktiGen {
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
    public void test_prepareForDecryption_PO_c16807deba6b41f9afe5a9e5682de5ac() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler>" +
        "  <keyLength>40</keyLength>" +
        "  <rc4>" +
        "    <salt>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "    </salt>" +
        "    <b>0</b>" +
        "    <c>0</c>" +
        "  </rc4>" +
        "  <decryptMetadata>false</decryptMetadata>" +
        "  <objects class=\"java.util.Collections$SetFromMap\" serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <java.util.Collections_-SetFromMap>" +
        "      <default>" +
        "        <m class=\"java.util.IdentityHashMap\" serialization=\"custom\">" +
        "          <unserializable-parents/>" +
        "          <java.util.IdentityHashMap>" +
        "            <default>" +
        "              <size>0</size>" +
        "            </default>" +
        "            <int>0</int>" +
        "          </java.util.IdentityHashMap>" +
        "        </m>" +
        "      </default>" +
        "    </java.util.Collections_-SetFromMap>" +
        "  </objects>" +
        "  <useAES>false</useAES>" +
        "</org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler>";
        org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.prepareForDecryption1-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.apache.pdfbox.pdmodel.encryption.PDEncryption paramObject1 = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) paramObjects[0];
        org.apache.pdfbox.cos.COSArray paramObject2 = (org.apache.pdfbox.cos.COSArray) paramObjects[1];
        org.apache.pdfbox.pdmodel.encryption.DecryptionMaterial paramObject3 = (org.apache.pdfbox.pdmodel.encryption.DecryptionMaterial) paramObjects[2];
        PDEncryption mockPDEncryption = Mockito.mock(PDEncryption.class);
        Mockito.when(mockPDEncryption.isEncryptMetaData()).thenReturn(true);
        // Act
        receivingObject.prepareForDecryption(mockPDEncryption, paramObject2, paramObject3);
        // Assert
        Mockito.verify(mockPDEncryption, Mockito.atLeastOnce()).isEncryptMetaData();
    }

    @Test
    public void test_prepareForDecryption_CO_c16807deba6b41f9afe5a9e5682de5ac() throws Exception {
        // Arrange
        ClassLoader classLoader = getClass().getClassLoader();
        String receivingObjectStr = 
        "<org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler>" +
        "  <keyLength>40</keyLength>" +
        "  <rc4>" +
        "    <salt>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "    </salt>" +
        "    <b>0</b>" +
        "    <c>0</c>" +
        "  </rc4>" +
        "  <decryptMetadata>false</decryptMetadata>" +
        "  <objects class=\"java.util.Collections$SetFromMap\" serialization=\"custom\">" +
        "    <unserializable-parents/>" +
        "    <java.util.Collections_-SetFromMap>" +
        "      <default>" +
        "        <m class=\"java.util.IdentityHashMap\" serialization=\"custom\">" +
        "          <unserializable-parents/>" +
        "          <java.util.IdentityHashMap>" +
        "            <default>" +
        "              <size>0</size>" +
        "            </default>" +
        "            <int>0</int>" +
        "          </java.util.IdentityHashMap>" +
        "        </m>" +
        "      </default>" +
        "    </java.util.Collections_-SetFromMap>" +
        "  </objects>" +
        "  <useAES>false</useAES>" +
        "</org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler>";
        org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler receivingObject = deserializeObject(receivingObjectStr);
        File fileParams = new File(classLoader.getResource("org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.prepareForDecryption1-params.xml").getFile());
        Object[] paramObjects = deserializeObject(fileParams);
        org.apache.pdfbox.pdmodel.encryption.PDEncryption paramObject1 = (org.apache.pdfbox.pdmodel.encryption.PDEncryption) paramObjects[0];
        org.apache.pdfbox.cos.COSArray paramObject2 = (org.apache.pdfbox.cos.COSArray) paramObjects[1];
        org.apache.pdfbox.pdmodel.encryption.DecryptionMaterial paramObject3 = (org.apache.pdfbox.pdmodel.encryption.DecryptionMaterial) paramObjects[2];
        PDEncryption mockPDEncryption = Mockito.mock(PDEncryption.class);
        Mockito.when(mockPDEncryption.isEncryptMetaData()).thenReturn(true);
        // Act
        receivingObject.prepareForDecryption(mockPDEncryption, paramObject2, paramObject3);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockPDEncryption);
        orderVerifier.verify(mockPDEncryption, Mockito.times(2)).isEncryptMetaData();
    }
}