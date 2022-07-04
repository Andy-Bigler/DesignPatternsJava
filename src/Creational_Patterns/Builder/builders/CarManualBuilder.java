package Creational_Patterns.Builder.builders;

import Creational_Patterns.Builder.cars.Manual;

public class CarManualBuilder implements Builder {
    private String type;
    private int seats;
    private String engine;
    private String transmission;
    private String tripComputer;
    private String gpsNavigator;

    @Override
    public void setCarType(String type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(String gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
