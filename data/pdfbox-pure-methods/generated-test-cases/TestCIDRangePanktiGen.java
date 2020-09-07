package org.apache.fontbox.cmap;
import com.thoughtworks.xstream.XStream;
import org.junit.Assert;
import org.junit.Test;
public class TestCIDRangePanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testMap1() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>41</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>)</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap2() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>80</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>P</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap3() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>44</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>,</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap4() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>87</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>W</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap5() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>16</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>&#x10;</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap6() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>75</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>K</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap7() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>78</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>N</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap8() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>39</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>'</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap9() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>28</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>&#x1c;</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap10() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>69</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>E</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap11() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>54</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>6</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap12() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>83</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>S</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap13() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>71</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>G</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap14() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>92</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>\\</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap15() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>15</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>&#xf;</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap16() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>17</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>&#x11;</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap17() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>88</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>X</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap18() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>43</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>+</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap19() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>10</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char></char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap20() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>76</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>L</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap21() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>36</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>$</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap22() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>73</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>I</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap23() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>82</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>R</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap24() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>81</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>Q</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap25() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>3</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>&#x3;</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap26() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>11</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>&#xb;</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap27() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>85</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>U</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap28() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>19</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>&#x13;</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap29() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>51</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>3</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap30() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>55</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>7</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap31() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>68</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>D</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap32() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>23</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>&#x17;</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap33() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>86</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>V</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap34() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>70</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>F</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap35() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>24</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>&#x18;</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap36() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>21</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>&#x15;</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap37() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>20</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>&#x14;</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap38() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>48</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>0</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap39() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>79</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>O</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap40() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>91</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>[</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap41() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>72</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>H</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap42() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>89</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>Y</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap43() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>90</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>Z</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap44() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>74</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>J</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }

    @Test
    public void testMap45() {
        String receivingXML = "<org.apache.fontbox.cmap.CIDRange><from/><to>&#xffff;</to><cid>0</cid></org.apache.fontbox.cmap.CIDRange>";
        String returnedXML = "<int>12</int>";
        CIDRange receivingObject = (CIDRange) xStream.fromXML(receivingXML);
        int returnedObject = (Integer) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><char>&#xc;</char></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        char paramObject1 = (Character) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.map(paramObject1));
    }
}