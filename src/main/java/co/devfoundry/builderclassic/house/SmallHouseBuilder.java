package co.devfoundry.builderclassic.house;

public class SmallHouseBuilder implements HouseBuilder {
    private House house;

    public SmallHouseBuilder() {
        this.house = new House();
    }

    public void buildWalls() {
        this.house.setWalls("small walls");
    }

    public void buildFloors() {
        this.house.setFloors(("small floors"));
    }

    public void buildRooms() {
        this.house.setRooms("small rooms");
    }

    public void buildRoof() {
        this.house.setRoof("small roof");
    }

    public void buildWindow() {
        this.house.setWindow("small window");
    }

    public void buildDoors() {
        this.house.setDoors("small doors");
    }

    public void buildGarage() {
        this.house.setGarage("small garage");
    }

    public House getHouse() {
        return house;
    }
}
