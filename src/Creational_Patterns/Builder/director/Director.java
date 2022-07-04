package Creational_Patterns.Builder.director;

import Creational_Patterns.Builder.builders.Builder;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType("Sports Car");
        builder.setSeats(2);
        builder.setEngine("Big engine");
        builder.setTransmission("Semi Automatic");
        builder.setTripComputer("Trip Computer 9000");
        builder.setGPSNavigator("GPS device 1");
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType("City Car");
        builder.setSeats(2);
        builder.setEngine("Small engine");
        builder.setTransmission("Automatic");
        builder.setTripComputer("Trip Computer 123");
        builder.setGPSNavigator("GPS device 2");
    }

    public void constructSUV(Builder builder) {
        builder.setCarType("SUV");
        builder.setSeats(4);
        builder.setEngine("Medium engine");
        builder.setTransmission("Manual");
        builder.setGPSNavigator("GPS device 3");
    }
}
