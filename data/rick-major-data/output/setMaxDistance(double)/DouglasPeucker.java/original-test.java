package com.graphhopper.util;

import com.thoughtworks.xstream.XStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Scanner;

import static org.mockito.ArgumentMatchers.anyDouble;

@ExtendWith(MockitoExtension.class)
public class TestDouglasPeuckerRickGen {
    static XStream xStream = new XStream();

    private <T> T deserializeObjectFromFile(String serializedObjectFilePath) throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File serializedObjectFile = new File(classLoader.getResource(serializedObjectFilePath).getFile());
        Scanner scanner = new Scanner(serializedObjectFile);
        String serializedObjectString = scanner.useDelimiter("\\A").next();
        return (T) xStream.fromXML(serializedObjectString);
    }

    private DistanceCalc insertPrivateMockField_calc_InDouglasPeucker(DouglasPeucker receivingObject) throws Exception {
        DistanceCalc mockDistanceCalc = Mockito.mock(DistanceCalc.class);
        Field fieldToMock = receivingObject.getClass().getDeclaredField("calc");
        fieldToMock.setAccessible(true);
        fieldToMock.set(receivingObject, mockDistanceCalc);
        return mockDistanceCalc;
    }

    @Test
    @DisplayName("setMaxDistance-1 with parameter oracle, mocking [com.graphhopper.util.DistanceCalc.calcNormalizedDist(double)]")
    public void test_setMaxDistance_PO_a4b39cb5299f4c66a7bb90424b460f7d() throws Exception {
        // Arrange
        DouglasPeucker receivingObject = deserializeObjectFromFile("com.graphhopper.util.DouglasPeucker.setMaxDistance1-receiving.xml");
        DistanceCalc mockDistanceCalc = insertPrivateMockField_calc_InDouglasPeucker(receivingObject);
        Mockito.when(mockDistanceCalc.calcNormalizedDist(1.0)).thenReturn(2.4636827903947217E-14);
        // Act
        receivingObject.setMaxDistance(1.0);
        // Assert
        Mockito.verify(mockDistanceCalc, Mockito.atLeastOnce()).calcNormalizedDist(1.0);
    }

    @Test
    @DisplayName("setMaxDistance-1 with call oracle, mocking [com.graphhopper.util.DistanceCalc.calcNormalizedDist(double)]")
    public void test_setMaxDistance_CO_a4b39cb5299f4c66a7bb90424b460f7d() throws Exception {
        // Arrange
        DouglasPeucker receivingObject = deserializeObjectFromFile("com.graphhopper.util.DouglasPeucker.setMaxDistance1-receiving.xml");
        DistanceCalc mockDistanceCalc = insertPrivateMockField_calc_InDouglasPeucker(receivingObject);
        Mockito.when(mockDistanceCalc.calcNormalizedDist(1.0)).thenReturn(2.4636827903947217E-14);
        // Act
        receivingObject.setMaxDistance(1.0);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockDistanceCalc);
        orderVerifier.verify(mockDistanceCalc, Mockito.times(1)).calcNormalizedDist(anyDouble());
    }
}