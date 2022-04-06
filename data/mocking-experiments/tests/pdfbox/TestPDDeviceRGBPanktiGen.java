package org.apache.pdfbox.pdmodel.graphics.color;
import com.thoughtworks.xstream.XStream;

import java.awt.image.WritableRaster;
import java.io.File;
import java.util.Scanner;

import converters.FileCleanableConverter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class TestPDDeviceRGBPanktiGen {
    static XStream xStream = new XStream();

    private <T> T deserializeObject(String serializedObjectString) {
        return (T) xStream.fromXML(serializedObjectString);
    }

    private <T> T deserializeObject(File serializedObjectFile) throws Exception {
        Scanner scanner = new Scanner(serializedObjectFile);
        String serializedObjectString = scanner.useDelimiter("\\A").next();
        return (T) xStream.fromXML(serializedObjectString);
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    public void test_toRGBImage_PO_5c59283eb55c43d9bd377dfdd410a496() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB>" +
        "  <initialColor>" +
        "    <components>" +
        "      <float>0.0</float>" +
        "      <float>0.0</float>" +
        "      <float>0.0</float>" +
        "    </components>" +
        "    <colorSpace class=\"org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB\" reference=\"../..\"/>" +
        "  </initialColor>" +
        "</org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB>";
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB receivingObject = deserializeObject(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <sun.awt.image.ByteBandedRaster>" +
        "    <sampleModel class=\"java.awt.image.BandedSampleModel\">" +
        "      <width>1</width>" +
        "      <height>1</height>" +
        "      <numBands defined-in=\"java.awt.image.SampleModel\">3</numBands>" +
        "      <dataType>0</dataType>" +
        "      <bandOffsets>" +
        "        <int>0</int>" +
        "        <int>0</int>" +
        "        <int>0</int>" +
        "      </bandOffsets>" +
        "      <bankIndices>" +
        "        <int>0</int>" +
        "        <int>1</int>" +
        "        <int>2</int>" +
        "      </bankIndices>" +
        "      <numBands>3</numBands>" +
        "      <numBanks>3</numBanks>" +
        "      <scanlineStride>1</scanlineStride>" +
        "      <pixelStride>1</pixelStride>" +
        "    </sampleModel>" +
        "    <dataBuffer class=\"java.awt.image.DataBufferByte\">" +
        "      <dataType>0</dataType>" +
        "      <banks>3</banks>" +
        "      <offset>0</offset>" +
        "      <size>1</size>" +
        "      <offsets>" +
        "        <int>0</int>" +
        "        <int>0</int>" +
        "        <int>0</int>" +
        "      </offsets>" +
        "      <theTrackable>" +
        "        <theState>STABLE</theState>" +
        "        <numDynamicAgents>0</numDynamicAgents>" +
        "      </theTrackable>" +
        "      <data>AA==</data>" +
        "      <bankdata>" +
        "        <byte-array reference=\"../../data\"/>" +
        "        <byte-array>AA==</byte-array>" +
        "        <byte-array>AA==</byte-array>" +
        "      </bankdata>" +
        "    </dataBuffer>" +
        "    <minX>0</minX>" +
        "    <minY>0</minY>" +
        "    <width>1</width>" +
        "    <height>1</height>" +
        "    <sampleModelTranslateX>0</sampleModelTranslateX>" +
        "    <sampleModelTranslateY>0</sampleModelTranslateY>" +
        "    <numBands>3</numBands>" +
        "    <numDataElements>3</numDataElements>" +
        "    <theTrackable reference=\"../dataBuffer/theTrackable\"/>" +
        "    <dataOffsets>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "    </dataOffsets>" +
        "    <scanlineStride>1</scanlineStride>" +
        "    <data>" +
        "      <byte-array reference=\"../../dataBuffer/data\"/>" +
        "      <byte-array reference=\"../../dataBuffer/bankdata/byte-array[2]\"/>" +
        "      <byte-array reference=\"../../dataBuffer/bankdata/byte-array[3]\"/>" +
        "    </data>" +
        "    <maxX>1</maxX>" +
        "    <maxY>1</maxY>" +
        "  </sun.awt.image.ByteBandedRaster>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        java.awt.image.WritableRaster paramObject1 = (java.awt.image.WritableRaster) paramObjects[0];
        WritableRaster mockRaster = Mockito.mock(WritableRaster.class);
        Mockito.when(mockRaster.getWidth()).thenReturn(1);
        Mockito.when(mockRaster.getHeight()).thenReturn(1);
        // Act
        receivingObject.toRGBImage(mockRaster);
        // Assert
        Mockito.verify(mockRaster, Mockito.atLeastOnce()).getWidth();
        Mockito.verify(mockRaster, Mockito.atLeastOnce()).getHeight();
    }

    @Test
    public void test_toRGBImage_CO_5c59283eb55c43d9bd377dfdd410a496() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB>" +
        "  <initialColor>" +
        "    <components>" +
        "      <float>0.0</float>" +
        "      <float>0.0</float>" +
        "      <float>0.0</float>" +
        "    </components>" +
        "    <colorSpace class=\"org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB\" reference=\"../..\"/>" +
        "  </initialColor>" +
        "</org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB>";
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceRGB receivingObject = deserializeObject(receivingObjectStr);
        String paramsObjectStr = 
        "<object-array>" +
        "  <sun.awt.image.ByteBandedRaster>" +
        "    <sampleModel class=\"java.awt.image.BandedSampleModel\">" +
        "      <width>1</width>" +
        "      <height>1</height>" +
        "      <numBands defined-in=\"java.awt.image.SampleModel\">3</numBands>" +
        "      <dataType>0</dataType>" +
        "      <bandOffsets>" +
        "        <int>0</int>" +
        "        <int>0</int>" +
        "        <int>0</int>" +
        "      </bandOffsets>" +
        "      <bankIndices>" +
        "        <int>0</int>" +
        "        <int>1</int>" +
        "        <int>2</int>" +
        "      </bankIndices>" +
        "      <numBands>3</numBands>" +
        "      <numBanks>3</numBanks>" +
        "      <scanlineStride>1</scanlineStride>" +
        "      <pixelStride>1</pixelStride>" +
        "    </sampleModel>" +
        "    <dataBuffer class=\"java.awt.image.DataBufferByte\">" +
        "      <dataType>0</dataType>" +
        "      <banks>3</banks>" +
        "      <offset>0</offset>" +
        "      <size>1</size>" +
        "      <offsets>" +
        "        <int>0</int>" +
        "        <int>0</int>" +
        "        <int>0</int>" +
        "      </offsets>" +
        "      <theTrackable>" +
        "        <theState>STABLE</theState>" +
        "        <numDynamicAgents>0</numDynamicAgents>" +
        "      </theTrackable>" +
        "      <data>AA==</data>" +
        "      <bankdata>" +
        "        <byte-array reference=\"../../data\"/>" +
        "        <byte-array>AA==</byte-array>" +
        "        <byte-array>AA==</byte-array>" +
        "      </bankdata>" +
        "    </dataBuffer>" +
        "    <minX>0</minX>" +
        "    <minY>0</minY>" +
        "    <width>1</width>" +
        "    <height>1</height>" +
        "    <sampleModelTranslateX>0</sampleModelTranslateX>" +
        "    <sampleModelTranslateY>0</sampleModelTranslateY>" +
        "    <numBands>3</numBands>" +
        "    <numDataElements>3</numDataElements>" +
        "    <theTrackable reference=\"../dataBuffer/theTrackable\"/>" +
        "    <dataOffsets>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "      <int>0</int>" +
        "    </dataOffsets>" +
        "    <scanlineStride>1</scanlineStride>" +
        "    <data>" +
        "      <byte-array reference=\"../../dataBuffer/data\"/>" +
        "      <byte-array reference=\"../../dataBuffer/bankdata/byte-array[2]\"/>" +
        "      <byte-array reference=\"../../dataBuffer/bankdata/byte-array[3]\"/>" +
        "    </data>" +
        "    <maxX>1</maxX>" +
        "    <maxY>1</maxY>" +
        "  </sun.awt.image.ByteBandedRaster>" +
        "</object-array>";
        Object[] paramObjects = deserializeObject(paramsObjectStr);
        java.awt.image.WritableRaster paramObject1 = (java.awt.image.WritableRaster) paramObjects[0];
        WritableRaster mockRaster = Mockito.mock(WritableRaster.class);
        Mockito.when(mockRaster.getWidth()).thenReturn(1);
        Mockito.when(mockRaster.getHeight()).thenReturn(1);
        // Act
        receivingObject.toRGBImage(mockRaster);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockRaster, mockRaster);
        orderVerifier.verify(mockRaster).getWidth();
        orderVerifier.verify(mockRaster).getHeight();
        orderVerifier.verify(mockRaster).getWidth();
        orderVerifier.verify(mockRaster).getHeight();
    }
}