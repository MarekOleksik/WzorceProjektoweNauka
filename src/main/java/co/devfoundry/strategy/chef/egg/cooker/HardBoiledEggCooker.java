package co.devfoundry.strategy.chef.egg.cooker;

public class HardBoiledEggCooker implements EggCooker {
    @Override
    public void eggCook() {
        System.out.println("Gotuję jajka na twardo");
    }
}
