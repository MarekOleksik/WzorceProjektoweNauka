package co.devfoundry.dekorator;

public class RoadDecorator extends TerrainDecorator {
    public RoadDecorator(Terrain terrain) {
        super(terrain);
    }
    public int fuelCost(){
        return terrain.fuelCost() - 10;
    }
    public String getDescription(){
        return terrain.getDescription() + "przez który przebiega droga";
    }

}
