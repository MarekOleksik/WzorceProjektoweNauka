package co.devfoundry.dekorator;

public class SwampDecorator extends TerrainDecorator {
    public SwampDecorator(Terrain terrain) {
        super(terrain);
    }
    public int fuelCost(){
        return terrain.fuelCost()+15;
    }
}
