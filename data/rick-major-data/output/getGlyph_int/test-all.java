package org.apache.fontbox.ttf;

import com.thoughtworks.xstream.XStream;
import converters.FileCleanableConverter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;

import static org.mockito.ArgumentMatchers.anyLong;

@ExtendWith(MockitoExtension.class)
public class TestGlyphTableRickGen {
    static XStream xStream = new XStream();

    private <T> T deserializeObjectFromString(String serializedObjectString) {
        return (T) xStream.fromXML(serializedObjectString);
    }

    private <T> T deserializeObjectFromFile(String serializedObjectFilePath) throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File serializedObjectFile = new File(classLoader.getResource(serializedObjectFilePath).getFile());
        Scanner scanner = new Scanner(serializedObjectFile);
        String serializedObjectString = scanner.useDelimiter("\\A").next();
        return (T) xStream.fromXML(serializedObjectString);
    }

    private TTFDataStream insertPrivateMockField_data_InGlyphTable(GlyphTable receivingObject) throws Exception {
        TTFDataStream mockTTFDataStream = Mockito.mock(TTFDataStream.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("data");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockTTFDataStream);
        return mockTTFDataStream;
    }

    @BeforeAll
    public static void setxStream() {
        xStream.registerConverter(new FileCleanableConverter());
    }

    @Test
    @DisplayName("getGlyph-3 with parameter oracle, mocking [org.apache.fontbox.ttf.TTFDataStream.getCurrentPosition(), org.apache.fontbox.ttf.TTFDataStream.seek(long)]")
    public void test_getGlyph_PO_f1ad458c63af422282ef8345ea2f5269() throws Exception {
        // Arrange
        GlyphTable receivingObject = deserializeObjectFromFile("org.apache.fontbox.ttf.GlyphTable.getGlyph3-receiving.xml");
        TTFDataStream mockTTFDataStream = insertPrivateMockField_data_InGlyphTable(receivingObject);
        Mockito.when(mockTTFDataStream.getCurrentPosition()).thenReturn(220L);
        // Act
        receivingObject.getGlyph(41);
        // Assert
        Mockito.verify(mockTTFDataStream, Mockito.atLeastOnce()).getCurrentPosition();
        Mockito.verify(mockTTFDataStream, Mockito.atLeastOnce()).seek(19806L);
        Mockito.verify(mockTTFDataStream, Mockito.atLeastOnce()).seek(220L);
    }

    @Test
    @DisplayName("getGlyph-3 with call oracle, mocking [org.apache.fontbox.ttf.TTFDataStream.getCurrentPosition(), org.apache.fontbox.ttf.TTFDataStream.seek(long)]")
    public void test_getGlyph_CO_f1ad458c63af422282ef8345ea2f5269() throws Exception {
        // Arrange
        GlyphTable receivingObject = deserializeObjectFromFile("org.apache.fontbox.ttf.GlyphTable.getGlyph3-receiving.xml");
        TTFDataStream mockTTFDataStream = insertPrivateMockField_data_InGlyphTable(receivingObject);
        Mockito.when(mockTTFDataStream.getCurrentPosition()).thenReturn(220L);
        // Act
        receivingObject.getGlyph(41);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockTTFDataStream, mockTTFDataStream, mockTTFDataStream);
        orderVerifier.verify(mockTTFDataStream, Mockito.times(1)).getCurrentPosition();
        orderVerifier.verify(mockTTFDataStream, Mockito.times(2)).seek(anyLong());
    }
}