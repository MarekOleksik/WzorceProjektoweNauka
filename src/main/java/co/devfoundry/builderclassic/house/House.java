package co.devfoundry.builderclassic.house;

public class House {
    private String walls;
    private String floors;
    private String rooms;
    private  String roof;
    private  String window;
    private  String doors;
    private  String garage;

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", floors='" + floors + '\'' +
                ", rooms='" + rooms + '\'' +
                ", roof='" + roof + '\'' +
                ", window='" + window + '\'' +
                ", doors='" + doors + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }


}
