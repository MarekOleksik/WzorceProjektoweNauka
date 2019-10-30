package co.devfoundry.strategy;

import co.devfoundry.strategy.chef.Chef;
import co.devfoundry.strategy.chef.egg.cooker.HardBoiledEggCooker;
import co.devfoundry.strategy.chef.egg.cooker.SoftBoildeEggCooker;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Gessler");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        chef.setEggCooker(new SoftBoildeEggCooker());
        chef.cook();
    }
}
