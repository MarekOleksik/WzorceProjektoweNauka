package homework.state;

import java.util.Random;

public class CoinInsertedState implements State {

    static final private Random random  = new Random();


    @Override
    public void insertTheCoin(Fliper fliper) {
        System.out.println("Moneta znajduję się już w automacie.");
    }

    @Override
    public void pullTheLever(Fliper fliper) {
        System.out.println("Trwa losowanie...");
        int result = random.nextInt(99);
        if(result<20) {
            System.out.println("Wygrana! Odbierz swoją nagrodę");
            fliper.state = new WinState();
        } else {
            System.out.println("Przegrana. Może następnym razem się uda?");
            fliper.state = new NoCoinState();
        }
    }

    @Override
    public void takeTheWinning(Fliper fliper) {
        System.out.println("Pociągnij dźwignię");
    }

    @Override
    public void getActualState(Fliper fliper) {
        System.out.println("Aktualny stan - wrzucono monetę");
    }
}
