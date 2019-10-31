package homework.state;

public class Main {

    public static void main(String[] args) {

        Fliper fliper = new Fliper();

        fliper.insertTheCoin();
        fliper.getActualState();
        fliper.pullTheLever();
        fliper.getActualState();
        fliper.takeTheWinning();
        fliper.getActualState();

    }

}