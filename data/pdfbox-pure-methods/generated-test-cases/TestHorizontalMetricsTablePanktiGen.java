package org.apache.fontbox.ttf;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestHorizontalMetricsTablePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetLeftSideBearing1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("ttf/org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing1.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>147</int>";
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>76</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetLeftSideBearing2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("ttf/org.apache.fontbox.ttf.HorizontalMetricsTable.getLeftSideBearing2.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>92</int>";
            org.apache.fontbox.ttf.HorizontalMetricsTable receivingObject = (org.apache.fontbox.ttf.HorizontalMetricsTable) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>54</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getLeftSideBearing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}