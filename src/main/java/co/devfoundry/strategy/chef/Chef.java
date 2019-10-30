package co.devfoundry.strategy.chef;

import co.devfoundry.strategy.chef.egg.cooker.EggCooker;

public class Chef {
    private String name;
    private EggCooker eggCooker;

    public EggCooker getEggCooker() {
        return eggCooker;
    }

    public void setEggCooker(EggCooker eggCooker) {
        this.eggCooker = eggCooker;
    }

    public Chef(String name) {
        this.name = name;
    }

    public void cook(){
        this.eggCooker.eggCook();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
