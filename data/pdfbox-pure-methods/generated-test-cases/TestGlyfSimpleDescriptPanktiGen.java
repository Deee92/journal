package org.apache.fontbox.ttf;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
public class TestGlyfSimpleDescriptPanktiGen {
    static XStream xStream = new XStream();

    @Test
    public void testGetEndPtOfContours55() {
    String receivingXML = "<org.apache.fontbox.ttf.GlyfSimpleDescript><instructions><int>64</int><int>46</int><int>56</int><int>19</int><int>72</int><int>19</int><int>2</int><int>18</int><int>52</int><int>3</int><int>57</int><int>13</int><int>57</int><int>19</int><int>52</int><int>27</int><int>68</int><int>3</int><int>73</int><int>13</int><int>73</int><int>19</int><int>68</int><int>27</int><int>249</int><int>27</int><int>9</int><int>86</int><int>6</int><int>86</int><int>10</int><int>89</int><int>18</int><int>86</int><int>22</int><int>86</int><int>24</int><int>89</int><int>28</int><int>246</int><int>7</int><int>249</int><int>27</int><int>8</int><int>1</int><int>0</int><int>6</int><int>26</int><int>184</int><int>2</int><int>116</int><int>178</int><int>5</int><int>7</int><int>20</int><int>184</int><int>2</int><int>116</int><int>64</int><int>22</int><int>11</int><int>11</int><int>16</int><int>15</int><int>14</int><int>23</int><int>33</int><int>8</int><int>26</int><int>112</int><int>30</int><int>1</int><int>30</int><int>17</int><int>41</int><int>14</int><int>14</int><int>15</int><int>38</int><int>16</int><int>16</int><int>1</int><int>184</int><int>1</int><int>41</int><int>64</int><int>11</int><int>112</int><int>0</int><int>128</int><int>0</int><int>2</int><int>0</int><int>25</int><int>29</int><int>63</int><int>65</int><int>24</int><int>43</int><int>78</int><int>16</int><int>244</int><int>113</int><int>77</int><int>237</int><int>60</int><int>16</int><int>253</int><int>60</int><int>16</int><int>228</int><int>78</int><int>16</int><int>113</int><int>246</int><int>77</int><int>237</int><int>0</int><int>63</int><int>60</int><int>63</int><int>237</int><int>63</int><int>237</int><int>63</int><int>60</int><int>49</int><int>48</int><int>1</int><int>93</int><int>0</int><int>93</int><int>1</int><int>67</int><int>88</int><int>64</int><int>13</int><int>102</int><int>6</int><int>102</int><int>10</int><int>105</int><int>18</int><int>102</int><int>22</int><int>102</int><int>24</int><int>105</int><int>28</int><int>6</int><int>93</int><int>89</int><int>0</int><int>93</int></instructions><contourCount>2</contourCount><endPtsOfContours><int>16</int><int>28</int></endPtsOfContours><flags>EyEVNjYzMgAREAAjIiYnESEBFBYzMjY1NCYjIgY=</flags><xCoordinates><short>139</short><short>401</short><short>401</short><short>452</short><short>626</short><short>732</short><short>917</short><short>1175</short><short>1175</short><short>1175</short><short>915</short><short>730</short><short>642</short><short>499</short><short>420</short><short>420</short><short>139</short><short>417</short><short>417</short><short>559</short><short>661</short><short>759</short><short>889</short><short>889</short><short>889</short><short>755</short><short>656</short><short>553</short><short>417</short></xCoordinates><yCoordinates><short>1062</short><short>1062</short><short>906</short><short>986</short><short>1086</short><short>1086</short><short>1086</short><short>796</short><short>537</short><short>271</short><short>-24</short><short>-24</short><short>-24</short><short>46</short><short>131</short><short>-404</short><short>-404</short><short>549</short><short>370</short><short>199</short><short>199</short><short>199</short><short>356</short><short>535</short><short>702</short><short>864</short><short>864</short><short>864</short><short>705</short></yCoordinates><pointCount>29</pointCount></org.apache.fontbox.ttf.GlyfSimpleDescript>";
    String returnedXML = "<int>16</int>";
    org.apache.fontbox.ttf.GlyfSimpleDescript receivingObject = (org.apache.fontbox.ttf.GlyfSimpleDescript) xStream.fromXML(receivingXML);
    int returnedObject = (Integer) xStream.fromXML(returnedXML);
    String paramsXML = "<object-array><int>0</int></object-array>";
    Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
    int paramObject1 = (Integer) paramObjects[0];
    Assert.assertEquals(returnedObject, receivingObject.getEndPtOfContours(paramObject1));
}

    @Test
    public void testGetEndPtOfContours56() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("ttf/org.apache.fontbox.ttf.GlyfSimpleDescript.getEndPtOfContours56.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<int>42</int>";
            org.apache.fontbox.ttf.GlyfSimpleDescript receivingObject = (org.apache.fontbox.ttf.GlyfSimpleDescript) xStream.fromXML(receivingXML);
            int returnedObject = (Integer) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>0</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getEndPtOfContours(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetFlags3() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("ttf/org.apache.fontbox.ttf.GlyfSimpleDescript.getFlags3.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<byte>39</byte>";
            org.apache.fontbox.ttf.GlyfSimpleDescript receivingObject = (org.apache.fontbox.ttf.GlyfSimpleDescript) xStream.fromXML(receivingXML);
            byte returnedObject = (Byte) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>10</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getFlags(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetFlags4() {
        String receivingXML = "<org.apache.fontbox.ttf.GlyfSimpleDescript><instructions><int>181</int><int>10</int><int>3</int><int>0</int><int>7</int><int>171</int><int>6</int><int>184</int><int>1</int><int>80</int><int>64</int><int>38</int><int>1</int><int>3</int><int>60</int><int>2</int><int>2</int><int>1</int><int>10</int><int>1</int><int>60</int><int>0</int><int>10</int><int>2</int><int>3</int><int>1</int><int>3</int><int>60</int><int>0</int><int>6</int><int>56</int><int>7</int><int>58</int><int>79</int><int>0</int><int>95</int><int>0</int><int>111</int><int>0</int><int>127</int><int>0</int><int>160</int><int>0</int><int>5</int><int>0</int><int>160</int><int>11</int><int>161</int><int>152</int><int>24</int><int>43</int><int>16</int><int>244</int><int>93</int><int>244</int><int>228</int><int>16</int><int>237</int><int>60</int><int>16</int><int>60</int><int>0</int><int>63</int><int>237</int><int>60</int><int>16</int><int>60</int><int>16</int><int>237</int><int>16</int><int>253</int><int>237</int><int>1</int><int>17</int><int>18</int><int>57</int><int>49</int><int>48</int></instructions><contourCount>1</contourCount><endPtsOfContours><int>10</int></endPtsOfContours><flags>MzUzFRQGByc2Njc=</flags><xCoordinates><short>182</short><short>182</short><short>387</short><short>387</short><short>387</short><short>307</short><short>220</short><short>170</short><short>227</short><short>281</short><short>284</short></xCoordinates><yCoordinates><short>0</short><short>205</short><short>205</short><short>0</short><short>-113</short><short>-252</short><short>-290</short><short>-213</short><short>-188</short><short>-91</short><short>0</short></yCoordinates><pointCount>11</pointCount></org.apache.fontbox.ttf.GlyfSimpleDescript>";
        String returnedXML = "<byte>39</byte>";
        org.apache.fontbox.ttf.GlyfSimpleDescript receivingObject = (org.apache.fontbox.ttf.GlyfSimpleDescript) xStream.fromXML(receivingXML);
        byte returnedObject = (Byte) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><int>7</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.getFlags(paramObject1));
    }

    @Test
    public void testGetXCoordinate417() {
        String receivingXML = "<org.apache.fontbox.ttf.GlyfSimpleDescript><instructions><int>64</int><int>165</int><int>12</int><int>16</int><int>45</int><int>16</int><int>61</int><int>16</int><int>75</int><int>16</int><int>4</int><int>63</int><int>32</int><int>176</int><int>32</int><int>2</int><int>31</int><int>32</int><int>41</int><int>12</int><int>35</int><int>29</int><int>50</int><int>21</int><int>50</int><int>29</int><int>66</int><int>29</int><int>112</int><int>32</int><int>144</int><int>32</int><int>8</int><int>58</int><int>23</int><int>58</int><int>27</int><int>74</int><int>23</int><int>74</int><int>27</int><int>89</int><int>8</int><int>91</int><int>12</int><int>92</int><int>23</int><int>92</int><int>27</int><int>106</int><int>8</int><int>107</int><int>12</int><int>105</int><int>16</int><int>109</int><int>23</int><int>107</int><int>27</int><int>192</int><int>32</int><int>211</int><int>20</int><int>221</int><int>24</int><int>221</int><int>26</int><int>211</int><int>30</int><int>228</int><int>20</int><int>228</int><int>30</int><int>224</int><int>32</int><int>255</int><int>32</int><int>22</int><int>35</int><int>4</int><int>43</int><int>16</int><int>43</int><int>21</int><int>53</int><int>4</int><int>58</int><int>16</int><int>70</int><int>4</int><int>74</int><int>16</int><int>90</int><int>16</int><int>229</int><int>11</int><int>235</int><int>29</int><int>254</int><int>16</int><int>11</int><int>17</int><int>14</int><int>3</int><int>22</int><int>28</int><int>28</int><int>6</int><int>7</int><int>1</int><int>6</int><int>22</int><int>28</int><int>14</int><int>11</int><int>0</int><int>14</int><int>25</int><int>36</int><int>208</int><int>10</int><int>1</int><int>16</int><int>10</int><int>64</int><int>10</int><int>96</int><int>10</int><int>128</int><int>10</int><int>4</int><int>10</int><int>116</int><int>1</int><int>19</int><int>51</int><int>2</int><int>51</int><int>18</int><int>37</int><int>0</int><int>0</int><int>192</int><int>1</int><int>1</int><int>144</int><int>1</int><int>160</int><int>1</int><int>176</int><int>1</int><int>240</int><int>1</int><int>4</int><int>31</int><int>1</int><int>63</int><int>1</int><int>79</int><int>1</int><int>3</int><int>1</int><int>25</int><int>31</int><int>71</int><int>55</int><int>24</int><int>1</int><int>43</int><int>78</int><int>16</int><int>244</int><int>93</int><int>113</int><int>114</int><int>60</int><int>77</int><int>16</int><int>253</int><int>244</int><int>228</int><int>16</int><int>253</int><int>93</int><int>113</int><int>237</int><int>0</int><int>63</int><int>63</int><int>237</int><int>63</int><int>63</int><int>237</int><int>17</int><int>57</int><int>18</int><int>57</int><int>49</int><int>48</int><int>0</int><int>93</int><int>1</int><int>93</int><int>113</int><int>114</int><int>0</int><int>113</int></instructions><contourCount>2</contourCount><endPtsOfContours><int>18</int><int>30</int></endPtsOfContours><flags>ExEzFTY2MzIWFhUUAgYjIiYnEQMUFjMyNjU0JiMiBg==</flags><xCoordinates><short>135</short><short>135</short><short>299</short><short>299</short><short>357</short><short>503</short><short>607</short><short>743</short><short>951</short><short>1057</short><short>1057</short><short>1057</short><short>940</short><short>717</short><short>594</short><short>504</short><short>361</short><short>315</short><short>315</short><short>298</short><short>298</short><short>464</short><short>582</short><short>702</short><short>873</short><short>873</short><short>873</short><short>706</short><short>590</short><short>475</short><short>298</short></xCoordinates><yCoordinates><short>-407</short><short>1062</short><short>1062</short><short>924</short><short>1005</short><short>1086</short><short>1086</short><short>1086</short><short>946</short><short>691</short><short>539</short><short>376</short><short>115</short><short>-24</short><short>-24</short><short>-24</short><short>52</short><short>110</short><short>-407</short><short>525</short><short>320</short><short>124</short><short>124</short><short>124</short><short>327</short><short>540</short><short>743</short><short>945</short><short>945</short><short>945</short><short>730</short></yCoordinates><pointCount>31</pointCount></org.apache.fontbox.ttf.GlyfSimpleDescript>";
        String returnedXML = "<short>1057</short>";
        org.apache.fontbox.ttf.GlyfSimpleDescript receivingObject = (org.apache.fontbox.ttf.GlyfSimpleDescript) xStream.fromXML(receivingXML);
        short returnedObject = (Short) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><int>9</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.getXCoordinate(paramObject1));
    }

    @Test
    public void testGetXCoordinate420() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("ttf/org.apache.fontbox.ttf.GlyfSimpleDescript.getXCoordinate420.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<short>717</short>";
            org.apache.fontbox.ttf.GlyfSimpleDescript receivingObject = (org.apache.fontbox.ttf.GlyfSimpleDescript) xStream.fromXML(receivingXML);
            short returnedObject = (Short) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>11</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getXCoordinate(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }

    @Test
    public void testGetYCoordinate1132() {
        String receivingXML = "<org.apache.fontbox.ttf.GlyfSimpleDescript><instructions><int>64</int><int>156</int><int>99</int><int>3</int><int>99</int><int>4</int><int>115</int><int>3</int><int>116</int><int>4</int><int>4</int><int>37</int><int>39</int><int>53</int><int>3</int><int>57</int><int>28</int><int>67</int><int>3</int><int>73</int><int>7</int><int>76</int><int>29</int><int>69</int><int>31</int><int>68</int><int>36</int><int>70</int><int>39</int><int>83</int><int>3</int><int>89</int><int>7</int><int>92</int><int>29</int><int>87</int><int>40</int><int>137</int><int>19</int><int>14</int><int>40</int><int>13</int><int>38</int><int>36</int><int>2</int><int>36</int><int>3</int><int>39</int><int>37</int><int>54</int><int>15</int><int>52</int><int>35</int><int>68</int><int>37</int><int>69</int><int>47</int><int>90</int><int>32</int><int>86</int><int>35</int><int>85</int><int>37</int><int>108</int><int>11</int><int>106</int><int>13</int><int>107</int><int>14</int><int>102</int><int>20</int><int>101</int><int>24</int><int>121</int><int>11</int><int>122</int><int>13</int><int>122</int><int>15</int><int>125</int><int>16</int><int>117</int><int>36</int><int>115</int><int>37</int><int>134</int><int>3</int><int>138</int><int>11</int><int>137</int><int>13</int><int>138</int><int>15</int><int>141</int><int>16</int><int>133</int><int>36</int><int>131</int><int>37</int><int>146</int><int>13</int><int>150</int><int>15</int><int>150</int><int>21</int><int>30</int><int>37</int><int>36</int><int>14</int><int>13</int><int>11</int><int>5</int><int>33</int><int>28</int><int>29</int><int>30</int><int>27</int><int>8</int><int>7</int><int>6</int><int>4</int><int>3</int><int>2</int><int>6</int><int>1</int><int>37</int><int>36</int><int>34</int><int>14</int><int>13</int><int>11</int><int>6</int><int>5</int><int>30</int><int>27</int><int>45</int><int>143</int><int>26</int><int>1</int><int>26</int><int>237</int><int>22</int><int>0</int><int>45</int><int>16</int><int>1</int><int>32</int><int>1</int><int>80</int><int>1</int><int>96</int><int>1</int><int>112</int><int>1</int><int>144</int><int>1</int><int>6</int><int>1</int><int>184</int><int>1</int><int>176</int><int>64</int><int>37</int><int>45</int><int>30</int><int>30</int><int>22</int><int>3</int><int>5</int><int>30</int><int>45</int><int>9</int><int>27</int><int>38</int><int>26</int><int>74</int><int>9</int><int>38</int><int>0</int><int>41</int><int>1</int><int>41</int><int>26</int><int>50</int><int>33</int><int>38</int><int>18</int><int>1</int><int>38</int><int>18</int><int>84</int><int>32</int><int>0</int><int>1</int><int>0</int><int>25</int><int>49</int><int>99</int><int>91</int><int>24</int><int>43</int><int>78</int><int>16</int><int>244</int><int>93</int><int>77</int><int>228</int><int>237</int><int>16</int><int>237</int><int>78</int><int>16</int><int>246</int><int>93</int><int>77</int><int>237</int><int>244</int><int>237</int><int>0</int><int>63</int><int>237</int><int>63</int><int>237</int><int>16</int><int>253</int><int>93</int><int>228</int><int>16</int><int>253</int><int>93</int><int>244</int><int>17</int><int>18</int><int>23</int><int>57</int><int>17</int><int>23</int><int>57</int><int>17</int><int>18</int><int>57</int><int>57</int><int>1</int><int>18</int><int>23</int><int>57</int><int>49</int><int>48</int><int>0</int><int>93</int><int>113</int><int>1</int><int>93</int><int>113</int></instructions><contourCount>1</contourCount><endPtsOfContours><int>48</int></endPtsOfContours><flags>EzceHh4zMjY2NTQmJyYkJyYmNTQ2NjMyFhYXByYmIyIGFRQXFgQXFhYVFAYGIyIkJg==</flags><xCoordinates><short>92</short><short>275</short><short>288</short><short>383</short><short>583</short><short>708</short><short>819</short><short>989</short><short>1072</short><short>1072</short><short>1072</short><short>992</short><short>900</short><short>841</short><short>437</short><short>356</short><short>251</short><short>148</short><short>148</short><short>148</short><short>274</short><short>516</short><short>664</short><short>827</short><short>1076</short><short>1210</short><short>1215</short><short>1029</short><short>1014</short><short>841</short><short>672</short><short>496</short><short>335</short><short>335</short><short>335</short><short>392</short><short>448</short><short>921</short><short>1009</short><short>1137</short><short>1259</short><short>1259</short><short>1259</short><short>1125</short><short>874</short><short>717</short><short>518</short><short>249</short><short>96</short></xCoordinates><yCoordinates><short>471</short><short>487</short><short>377</short><short>236</short><short>149</short><short>149</short><short>149</short><short>215</short><short>330</short><short>398</short><short>467</short><short>570</short><short>605</short><short>628</short><short>725</short><short>768</short><short>823</short><short>986</short><short>1087</short><short>1198</short><short>1391</short><short>1491</short><short>1491</short><short>1491</short><short>1386</short><short>1182</short><short>1053</short><short>1039</short><short>1178</short><short>1320</short><short>1320</short><short>1320</short><short>1191</short><short>1100</short><short>1021</short><short>970</short><short>919</short><short>812</short><short>772</short><short>713</short><short>532</short><short>414</short><short>297</short><short>90</short><short>-25</short><short>-25</short><short>-25</short><short>91</short><short>324</short></yCoordinates><pointCount>49</pointCount></org.apache.fontbox.ttf.GlyfSimpleDescript>";
        String returnedXML = "<short>471</short>";
        org.apache.fontbox.ttf.GlyfSimpleDescript receivingObject = (org.apache.fontbox.ttf.GlyfSimpleDescript) xStream.fromXML(receivingXML);
        short returnedObject = (Short) xStream.fromXML(returnedXML);
        String paramsXML = "<object-array><int>0</int></object-array>";
        Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
        int paramObject1 = (Integer) paramObjects[0];
        Assert.assertEquals(returnedObject, receivingObject.getYCoordinate(paramObject1));
    }

    @Test
    public void testGetYCoordinate1133() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("ttf/org.apache.fontbox.ttf.GlyfSimpleDescript.getYCoordinate1133.txt").getFile());
            Scanner scanner = new Scanner(file);
            String receivingXML = scanner.useDelimiter("\\A").next();
            String returnedXML = "<short>756</short>";
            org.apache.fontbox.ttf.GlyfSimpleDescript receivingObject = (org.apache.fontbox.ttf.GlyfSimpleDescript) xStream.fromXML(receivingXML);
            short returnedObject = (Short) xStream.fromXML(returnedXML);
            String paramsXML = "<object-array><int>23</int></object-array>";
            Object[] paramObjects = (Object[]) xStream.fromXML(paramsXML);
            int paramObject1 = (Integer) paramObjects[0];
            Assert.assertEquals(returnedObject, receivingObject.getYCoordinate(paramObject1));
        } catch (Exception e) {
            Assert.fail();
            e.printStackTrace();
        }
    }
}
