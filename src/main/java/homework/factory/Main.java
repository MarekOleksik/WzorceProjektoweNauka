package homework.factory;

import homework.factory.cars.BmwType;
import homework.factory.cars.Car;
import homework.factory.cars.FordType;

public class Main {
    public static void main(String[] args) {
        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBMW(BmwType.E60);
        System.out.println(bmw.getSteeringWheelPosition());

        Car ford = continentalFactory.buildFord(FordType.CMAX);
        System.out.println(ford.getSteeringWheelPosition());
    }
}
