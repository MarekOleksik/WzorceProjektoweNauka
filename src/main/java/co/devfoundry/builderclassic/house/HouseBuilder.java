package co.devfoundry.builderclassic.house;

public interface HouseBuilder {

    void buildWalls();
    void buildFloors();
    void buildRooms();
    void buildRoof();
    void buildWindow();
    void buildDoors();
    void buildGarage();
    House getHouse();
}
