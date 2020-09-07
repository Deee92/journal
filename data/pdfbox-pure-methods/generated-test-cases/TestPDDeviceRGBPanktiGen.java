package org.apache.pdfbox.pdmodel.graphics.color;
import com.thoughtworks.xstream.XStream;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
public class TestPDDeviceRGBPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testToRGB1() {
        String receivingXML = "<org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB><initialColor><components><float>0.0</float><float>0.0</float><float>0.0</float></components><colorSpace class=\"org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB\" reference=\"../..\"/></initialColor><awtColorSpace class=\"java.awt.color.ICC_ColorSpace\" serialization=\"custom\"><java.awt.color.ColorSpace><default><numComponents>3</numComponents><type>5</type></default></java.awt.color.ColorSpace><java.awt.color.ICC__ColorSpace><default><needScaleInit>false</needScaleInit><diffMinMax><float>1.0</float><float>1.0</float><float>1.0</float></diffMinMax><invDiffMinMax><float>65535.0</float><float>65535.0</float><float>65535.0</float></invDiffMinMax><maxVal><float>1.0</float><float>1.0</float><float>1.0</float></maxVal><minVal><float>0.0</float><float>0.0</float><float>0.0</float></minVal><thisProfile class=\"java.awt.color.ICC_ProfileRGB\" serialization=\"custom\"><java.awt.color.ICC__Profile><default><iccProfileSerializedDataVersion>1</iccProfileSerializedDataVersion></default><string>CS_sRGB</string><null/></java.awt.color.ICC__Profile></thisProfile></default></java.awt.color.ICC__ColorSpace></awtColorSpace></org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB>";
        String returnedXML = "<float-array><float>1.0</float><float>1.0</float><float>1.0</float></float-array>";
        PDDeviceRGB receivingObject = (PDDeviceRGB) xStream.fromXML(receivingXML);
        float[] returnedObject = (float[]) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><float-array><float>1.0</float><float>1.0</float><float>1.0</float></float-array></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        float[] paramObject1 = (float[]) paramObjects[0];
        Assert.assertTrue(Arrays.equals(returnedObject, receivingObject.toRGB(paramObject1)));
    }
}