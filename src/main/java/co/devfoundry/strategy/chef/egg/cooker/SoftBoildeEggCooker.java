package co.devfoundry.strategy.chef.egg.cooker;

public class SoftBoildeEggCooker implements  EggCooker {
    @Override
    public void eggCook() {
        System.out.println("Gotuję jajka na miękko");
    }
}
