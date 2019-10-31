package homework.state;

public class WinState implements State {

    @Override
    public void insertTheCoin(Fliper fliper) {
        System.out.println("Przed ponowną grą zabierz swoją nagrodę.");
    }

    @Override
    public void pullTheLever(Fliper fliper) {
        System.out.println("Przed ponowną grą zabierz swoją nagrodę.");
    }

    @Override
    public void takeTheWinning(Fliper fliper) {
        System.out.println("Zabrano monety. Gratulacje.");
        fliper.state = new NoCoinState();
    }

    @Override
    public void getActualState(Fliper fliper) {
        System.out.println("Aktualny stan - WYGRANA");
    }
}
