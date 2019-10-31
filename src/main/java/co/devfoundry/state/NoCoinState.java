package co.devfoundry.state;

public class NoCoinState implements State {
    @Override
    public void insertTheCoin(CoffeMachine coffeMachine) {
        System.out.println("Moneta zostałą wrzucona");
        coffeMachine.state = new CoinInsertedState();
    }

    @Override
    public void pushTheButton(CoffeMachine coffeMachine) {
        System.out.println("Wrzuć monetę");
    }

    @Override
    public void takeTheCup(CoffeMachine coffeMachine) {
        System.out.println("Wrzuć monetę");
    }

    @Override
    public void returnTheCoin(CoffeMachine coffeMachine) {
        System.out.println("Wrzuć monetę");
    }
}
