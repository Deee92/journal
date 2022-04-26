package org.apache.pdfbox.pdmodel.graphics.form;
import com.thoughtworks.xstream.XStream;

import java.awt.geom.AffineTransform;
import java.io.File;
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
public class TestPDFormXObjectPanktiGen {
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
    public void test_setMatrix_PO_a0918f170d6d4d2899a1fa8fb35dc79a() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject.setMatrix1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <java.awt.geom.AffineTransform serialization=\"custom\">" +
        "    <java.awt.geom.AffineTransform>" +
        "      <default>" +
        "        <m00>1.0</m00>" +
        "        <m01>0.0</m01>" +
        "        <m02>0.0</m02>" +
        "        <m10>0.0</m10>" +
        "        <m11>1.0</m11>" +
        "        <m12>0.0</m12>" +
        "      </default>" +
        "    </java.awt.geom.AffineTransform>" +
        "  </java.awt.geom.AffineTransform>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        java.awt.geom.AffineTransform paramObject1 = (java.awt.geom.AffineTransform) paramObjects[0];
        AffineTransform mockAffineTransform = Mockito.mock(AffineTransform.class);
        // Act
        receivingObject.setMatrix(mockAffineTransform);
        // Assert
        Mockito.verify(mockAffineTransform, Mockito.atLeastOnce()).getMatrix((double[]) any());
    }

    @Test
    public void test_setMatrix_CO_a0918f170d6d4d2899a1fa8fb35dc79a() throws Exception {
        // Arrange
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject receivingObject = deserializeObjectFromFile("org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject.setMatrix1-receiving.xml");
        String paramsObjectStr = 
        "<object-array>" +
        "  <java.awt.geom.AffineTransform serialization=\"custom\">" +
        "    <java.awt.geom.AffineTransform>" +
        "      <default>" +
        "        <m00>1.0</m00>" +
        "        <m01>0.0</m01>" +
        "        <m02>0.0</m02>" +
        "        <m10>0.0</m10>" +
        "        <m11>1.0</m11>" +
        "        <m12>0.0</m12>" +
        "      </default>" +
        "    </java.awt.geom.AffineTransform>" +
        "  </java.awt.geom.AffineTransform>" +
        "</object-array>";
        Object[] paramObjects = deserializeObjectFromString(paramsObjectStr);
        java.awt.geom.AffineTransform paramObject1 = (java.awt.geom.AffineTransform) paramObjects[0];
        AffineTransform mockAffineTransform = Mockito.mock(AffineTransform.class);
        // Act
        receivingObject.setMatrix(mockAffineTransform);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockAffineTransform);
        orderVerifier.verify(mockAffineTransform, Mockito.times(1)).getMatrix((double[]) any());
    }
}