package co.devfoundry.builder.house;

public class House {
    private String walls;
    private String floors;
    private String rooms;
    private String roof;
    private String window;
    private String doors;
    private String garage;

    private House(HouseBuilder houseBuilder) {
        this.walls = houseBuilder.walls;
        this.floors = houseBuilder.floors;
        this.rooms = houseBuilder.rooms;
        this.roof = houseBuilder.roof;
        this.window = houseBuilder.window;
        this.doors = houseBuilder.doors;
        this.garage = houseBuilder.garage;
    }


    public String getWalls() {
        return walls;
    }


    public String getFloors() {
        return floors;
    }


    public String getRooms() {
        return rooms;
    }

    public String getRoof() {
        return roof;
    }


    public String getWindow() {
        return window;
    }


    public String getDoors() {
        return doors;
    }


    public String getGarage() {
        return garage;
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

    public static class HouseBuilder {
        private String walls;
        private String floors;
        private String rooms;
        private String roof;
        private String window;
        private String doors;
        private String garage;

        public HouseBuilder buildWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder buildFloors(String floors) {
            this.floors = floors;
            return this;
        }

        public HouseBuilder buildRooms(String rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder buildRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder buildWindow(String window) {
            this.window = window;
            return this;
        }

        public HouseBuilder buildDoors(String doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder buildGarage(String garage) {
            this.garage = garage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
