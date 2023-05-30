package com.graphhopper.application;

import com.thoughtworks.xstream.XStream;
import io.dropwizard.setup.Bootstrap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.File;
import java.util.Scanner;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class TestGraphHopperApplicationRickGen {
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

    @Test
    @DisplayName("initialize-1 with parameter oracle, mocking [io.dropwizard.setup.Bootstrap.addBundle(io.dropwizard.ConfiguredBundle), io.dropwizard.setup.Bootstrap.addCommand(io.dropwizard.cli.ConfiguredCommand)]")
    public void test_initialize_PO_e54ebbf5c4894eedb51c4c2ca1d4e535() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<com.graphhopper.application.GraphHopperApplication/>";
        GraphHopperApplication receivingObject = deserializeObjectFromString(receivingObjectStr);
        Bootstrap mockBootstrap = Mockito.mock(Bootstrap.class);
        // Act
        receivingObject.initialize(mockBootstrap);
        // Assert
        Mockito.verify(mockBootstrap, Mockito.atLeastOnce()).addBundle(any(io.dropwizard.ConfiguredBundle.class));
        Mockito.verify(mockBootstrap, Mockito.atLeastOnce()).addCommand(any(io.dropwizard.cli.ConfiguredCommand.class));
    }

    @Test
    @DisplayName("initialize-1 with call oracle, mocking [io.dropwizard.setup.Bootstrap.addBundle(io.dropwizard.ConfiguredBundle), io.dropwizard.setup.Bootstrap.addCommand(io.dropwizard.cli.ConfiguredCommand)]")
    public void test_initialize_CO_e54ebbf5c4894eedb51c4c2ca1d4e535() throws Exception {
        // Arrange
        String receivingObjectStr = 
        "<com.graphhopper.application.GraphHopperApplication/>";
        GraphHopperApplication receivingObject = deserializeObjectFromString(receivingObjectStr);
        Bootstrap mockBootstrap = Mockito.mock(Bootstrap.class);
        // Act
        receivingObject.initialize(mockBootstrap);
        // Assert
        InOrder orderVerifier = Mockito.inOrder(mockBootstrap, mockBootstrap);
        orderVerifier.verify(mockBootstrap, Mockito.times(2)).addBundle((io.dropwizard.ConfiguredBundle) any());
        orderVerifier.verify(mockBootstrap, Mockito.times(2)).addCommand((io.dropwizard.cli.ConfiguredCommand) any());
        orderVerifier.verify(mockBootstrap, Mockito.times(2)).addBundle((io.dropwizard.ConfiguredBundle) any());
    }
}