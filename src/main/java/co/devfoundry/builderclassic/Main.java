package co.devfoundry.builderclassic;

import co.devfoundry.builderclassic.house.BigHouseBuilder;
import co.devfoundry.builderclassic.house.House;
import co.devfoundry.builderclassic.house.HouseDirector;
import co.devfoundry.builderclassic.house.SmallHouseBuilder;

public class Main {
    public static void main(String[] args) {
        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();
        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        House smallHouse = smallHouseDirector.getHouse();
        House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }
}
