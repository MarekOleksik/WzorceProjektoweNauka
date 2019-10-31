package homework.state;

public class NoCoinState implements State {

    @Override
    public void insertTheCoin(Fliper fliper) {
        System.out.println("Wrzucono monetę");
        fliper.state = new CoinInsertedState();
    }

    @Override
    public void pullTheLever(Fliper fliper) {
        System.out.println("Wrzuć monetę by zagrać");
    }

    @Override
    public void takeTheWinning(Fliper fliper) {
        System.out.println("Wrzuć monetę by dać sobie szansę na wygraną.");
    }

    @Override
    public void getActualState(Fliper fliper) {
        System.out.println("Aktualny stan - BRAK MONETY");
    }
}
