package co.devfoundry.flyweight;

public class TeslaTank {
    private String name;
    private int hp;
    private int armour;
    private int damageDealt;
    private int speed;
    private int x;
    private int y;
    private int hpLeft;
    private int resourceCost;
    private UnitStats stats;

    public TeslaTank(int x, int y) {
        this.stats = UnitStatsRepository.getTeslaTankUnitStats();
        this.hpLeft = stats.getHp();

    }
}
