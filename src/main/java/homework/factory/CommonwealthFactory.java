package homework.factory;

import homework.factory.cars.*;

public class CommonwealthFactory implements Factory {

    SteeringWheelPosition position = SteeringWheelPosition.RIGHT;


    public Car buildFord(FordType type) {
        switch(type) {
            case CMAX:
                return new Ford("2018","1.8","Diesel", position);
            case FOCUS:
                return new Ford("2018","1.6", "Gas", position);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }

    public Car buildBMW(BmwType type) {
        switch (type) {
            case X5:
                return new BMW("2018","1.8","Diesel", position);
            case E60:
                return new BMW("2018","1.6", "Gas", position);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }
}