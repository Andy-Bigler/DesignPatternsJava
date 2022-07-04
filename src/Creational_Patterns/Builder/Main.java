package Creational_Patterns.Builder;

import Creational_Patterns.Builder.builders.CarBuilder;
import Creational_Patterns.Builder.builders.CarManualBuilder;
import Creational_Patterns.Builder.cars.Car;
import Creational_Patterns.Builder.cars.Manual;
import Creational_Patterns.Builder.director.Director;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Director director = new Director();


        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);

        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
