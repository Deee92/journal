package org.apache.pdfbox.pdfparser;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestBaseParserPanktiGen {
    static XStream xStream = new XStream();

    @Before
    public void setupXStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void testIsClosing1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing1.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>113</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing2.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>99</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing3.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing4.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>115</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing5.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing6.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>103</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing7.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>115</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing8.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>103</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing9.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>99</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing10.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing11.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing12.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>42</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing13.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>81</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing14.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>103</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing15.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>87</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing16.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>113</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing17.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>42</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing18.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing19.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>87</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing20.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing21.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing22.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>109</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing23.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing24.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing25.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing26.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing27.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing28.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>109</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing29.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing30() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing30.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>103</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing31() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing31.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>113</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing32() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing32.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>113</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing33() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing33.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>99</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing34() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing34.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>109</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsClosing35() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isClosing35.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFStreamParser receivingObject = (PDFStreamParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>81</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isClosing(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace1.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>true</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>10</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace2.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>51</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace3.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>true</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace4.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>60</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace5.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>true</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace6.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>true</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace7.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>47</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace8.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>true</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>10</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace9.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>true</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace10.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>true</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace11.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>48</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace12.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>54</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace13.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>true</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace14.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>47</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace15.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>50</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace16.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>47</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace17.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>115</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace18.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>111</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace19.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>true</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace20.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>47</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsWhitespace21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isWhitespace21.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>true</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>10</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isWhitespace(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName1() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName1.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>true</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>10</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName2() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName2.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>103</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName3.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName4() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName4.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>110</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName5() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName5.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>88</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName6() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName6.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>true</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName7() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName7.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>116</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName8() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName8.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName9() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName9.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>115</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName10() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName10.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>112</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName11() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName11.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName12() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName12.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>120</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName13() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName13.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>102</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName14() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName14.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>97</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName15() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName15.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>102</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName16() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName16.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>true</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName17() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName17.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>70</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName18() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName18.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>104</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName19() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName19.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>116</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName20() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName20.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>true</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>32</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName21() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName21.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>76</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName22() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName22.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName23() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName23.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>84</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName24() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName24.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>114</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName25() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName25.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>121</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName26() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName26.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>82</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName27() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName27.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>101</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName28() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName28.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>105</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testIsEndOfName29() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("org.apache.pdfbox.pdfparser.BaseParser.isEndOfName29.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<boolean>false</boolean>";
            PDFParser receivingObject = (PDFParser) xStream.fromXML(receivingXML);
            boolean returnedObject = (Boolean) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>116</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.isEndOfName(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}