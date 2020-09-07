package org.apache.pdfbox.pdmodel.graphics.color;
import com.thoughtworks.xstream.XStream;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
public class TestPDDeviceGrayPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testToRGB1() {
        String receivingXML = "<org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray><initialColor><components><float>0.0</float></components><colorSpace class=\"org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray\" reference=\"../..\"/></initialColor></org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray>";
        String returnedXML = "<float-array><float>0.0</float><float>0.0</float><float>0.0</float></float-array>";
        PDDeviceGray receivingObject = (PDDeviceGray) xStream.fromXML(receivingXML);
        float[] returnedObject = (float[]) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><float-array><float>0.0</float></float-array></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        float[] paramObject1 = (float[]) paramObjects[0];
        Assert.assertTrue(Arrays.equals(returnedObject, receivingObject.toRGB(paramObject1)));
    }
}