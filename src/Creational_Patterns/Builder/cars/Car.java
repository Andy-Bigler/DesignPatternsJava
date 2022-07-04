package Creational_Patterns.Builder.cars;

public class Car {
    private final String carType;
    private final int seats;
    private final String engine;
    private final String transmission;
    private final String tripComputer;
    private final String gpsNavigator;
    private double fuel = 0;

    public Car(String carType, int seats, String engine, String transmission, String tripComputer, String gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getTripComputer() {
        return tripComputer;
    }

    public String getGpsNavigator() {
        return gpsNavigator;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }
}
