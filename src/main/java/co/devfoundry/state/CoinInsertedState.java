package co.devfoundry.state;

public class CoinInsertedState implements State {
    @Override
    public void insertTheCoin(CoffeMachine coffeMachine) {
        System.out.println("Moneta została już wrzucona");
    }

    @Override
    public void pushTheButton(CoffeMachine coffeMachine) {
        System.out.println("Nalewam kawę");
        coffeMachine.state = new CupFullState();
    }

    @Override
    public void takeTheCup(CoffeMachine coffeMachine) {
        System.out.println("Wciśnij guzik");
    }

    @Override
    public void returnTheCoin(CoffeMachine coffeMachine) {
        System.out.println("Zwracam monetę");
        coffeMachine.state=new NoCoinState();
    }
}
