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
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ABg=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch2() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AEs=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch3() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFs=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch4() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AEw=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch5() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AEg=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch6() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AEo=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch7() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ABQ=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch8() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ACk=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch9() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AEY=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch10() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AAo=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch11() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFY=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch12() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFo=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch13() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFg=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch14() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ADc=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch15() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AE4=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch16() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AEc=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch17() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ACc=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch18() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ABw=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch19() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ACs=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch20() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AE8=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch21() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ABc=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch22() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AAw=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch23() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ADM=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch24() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFU=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch25() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFM=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch26() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFE=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch27() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFk=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch28() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AA8=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch29() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AEk=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch30() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFc=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch31() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFA=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch32() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ACw=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch33() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFI=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch34() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ADA=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch35() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ABA=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch36() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AEU=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch37() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AAs=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch38() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AAM=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch39() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ABE=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch40() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ABU=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch41() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ABM=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch42() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ADY=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch43() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>ACQ=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch44() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AEQ=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }

    @Test
    public void testIsFullMatch45() {
        String receivingXML = "<org.apache.fontbox.cmap.CodespaceRange><start><int>0</int><int>0</int></start><end><int>255</int><int>255</int></end><codeLength>2</codeLength></org.apache.fontbox.cmap.CodespaceRange>";
        String returnedXML = "<boolean>true</boolean>";
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(receivingXML);
        boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><byte-array>AFw=</byte-array><int>2</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        byte[] paramObject1 = (byte[]) paramObjects[0];
        int paramObject2 = (Integer) paramObjects[1];
        Assert.assertEquals(returnedObject, receivingObject.isFullMatch(paramObject1, paramObject2));
    }
}