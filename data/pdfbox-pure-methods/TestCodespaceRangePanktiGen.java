package org.apache.fontbox.cmap;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestCodespaceRangePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testIsFullMatch1() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        org.apache.fontbox.cmap.CodespaceRange receivingObject = (org.apache.fontbox.cmap.CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFU=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch2() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        org.apache.fontbox.cmap.CodespaceRange receivingObject = (org.apache.fontbox.cmap.CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AA8=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch3() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        org.apache.fontbox.cmap.CodespaceRange receivingObject = (org.apache.fontbox.cmap.CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ACo=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch4() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        org.apache.fontbox.cmap.CodespaceRange receivingObject = (org.apache.fontbox.cmap.CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AEg=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch5() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        org.apache.fontbox.cmap.CodespaceRange receivingObject = (org.apache.fontbox.cmap.CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFI=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch6() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        org.apache.fontbox.cmap.CodespaceRange receivingObject = (org.apache.fontbox.cmap.CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AEU=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch7() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        org.apache.fontbox.cmap.CodespaceRange receivingObject = (org.apache.fontbox.cmap.CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AAQ=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch8() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        org.apache.fontbox.cmap.CodespaceRange receivingObject = (org.apache.fontbox.cmap.CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AAM=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch9() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        org.apache.fontbox.cmap.CodespaceRange receivingObject = (org.apache.fontbox.cmap.CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFo=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch10() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        org.apache.fontbox.cmap.CodespaceRange receivingObject = (org.apache.fontbox.cmap.CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AEc=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch11() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        org.apache.fontbox.cmap.CodespaceRange receivingObject = (org.apache.fontbox.cmap.CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFw=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch12() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        org.apache.fontbox.cmap.CodespaceRange receivingObject = (org.apache.fontbox.cmap.CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ACs=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch13() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        org.apache.fontbox.cmap.CodespaceRange receivingObject = (org.apache.fontbox.cmap.CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AE8=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }
}