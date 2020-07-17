package org.apache.fontbox.cmap;

import com.thoughtworks.xstream.XStream;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TestCodespaceRange2 {
    static XStream xStream = new XStream();
    static String xStreamReceiving = "" +
            "<org.apache.fontbox.cmap.CodespaceRange>\n" +
            "  <start>\n" +
            "    <int>0</int>\n" +
            "    <int>0</int>\n" +
            "  </start>\n" +
            "  <end>\n" +
            "    <int>255</int>\n" +
            "    <int>255</int>\n" +
            "  </end>\n" +
            "  <codeLength>2</codeLength>\n" +
            "</org.apache.fontbox.cmap.CodespaceRange>";
    static String xStreamParams1 = "" +
            "<object-array>\n" +
            "  <byte-array>ACs=</byte-array>\n" +
            "  <int>2</int>\n" +
            "</object-array>";
    static String xStreamParams2 = "" +
            "<object-array>\n" +
            "  <byte-array>AEg=</byte-array>\n" +
            "  <int>2</int>\n" +
            "</object-array>";
    static String xStreamParams3 = "" +
            "<object-array>\n" +
            "  <byte-array>AAM=</byte-array>\n" +
            "  <int>2</int>\n" +
            "</object-array>";
    static String xStreamReturned = "<boolean>true<boolean>";

    @Test
    public void testFullMatchWithParam1() {
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(xStreamReceiving);
        Object[] paramObjects = (Object[]) xStream.fromXML(xStreamParams1);
        byte[] byteArrayParam1 = (byte[]) paramObjects[0];
        System.out.println(Arrays.toString(byteArrayParam1));
        int intParam = (Integer) paramObjects[1];
        System.out.println(intParam);
        boolean returnedObject = (Boolean) xStream.fromXML(xStreamReturned);
        System.out.println(returnedObject);
        assertEquals(returnedObject, receivingObject.isFullMatch(byteArrayParam1, intParam));
        // assertTrue(receivingObject.isFullMatch(byteArrayParam1, intParam));
    }

    @Test
    public void testFullMatchWithParam2() {
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(xStreamReceiving);
        Object[] paramObjects = (Object[]) xStream.fromXML(xStreamParams2);
        byte[] byteArrayParam2 = (byte[]) paramObjects[0];
        System.out.println(Arrays.toString(byteArrayParam2));
        int intParam = (Integer) paramObjects[1];
        System.out.println(intParam);
        boolean returnedObject = (Boolean) xStream.fromXML(xStreamReturned);
        System.out.println(returnedObject);
        assertEquals(returnedObject, receivingObject.isFullMatch(byteArrayParam2, intParam));
        // assertTrue(receivingObject.isFullMatch(byteArrayParam2, intParam));
    }

    @Test
    public void testFullMatchWithParam3() {
        CodespaceRange receivingObject = (CodespaceRange) xStream.fromXML(xStreamReceiving);
        Object[] paramObjects = (Object[]) xStream.fromXML(xStreamParams3);
        byte[] byteArrayParam3 = (byte[]) paramObjects[0];
        System.out.println(Arrays.toString(byteArrayParam3));
        int intParam = (Integer) paramObjects[1];
        System.out.println(intParam);
        boolean returnedObject = (Boolean) xStream.fromXML(xStreamReturned);
        System.out.println(returnedObject);
        assertEquals(returnedObject, receivingObject.isFullMatch(byteArrayParam3, intParam));
        // assertTrue(receivingObject.isFullMatch(byteArrayParam2, intParam));
    }
}
