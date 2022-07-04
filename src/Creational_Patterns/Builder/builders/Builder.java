package Creational_Patterns.Builder.builders;

public interface Builder {
    void setCarType(String type);
    void setSeats(int seats);
    void setEngine(String engine);
    void setTransmission(String transmission);
    void setTripComputer(String tripComputer);
    void setGPSNavigator(String gpsNavigator);
}
