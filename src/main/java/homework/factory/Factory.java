package homework.factory;

import homework.factory.cars.BmwType;
import homework.factory.cars.Car;
import homework.factory.cars.FordType;

public interface Factory {

    Car buildFord(FordType type);
    Car buildBMW(BmwType type);

}
