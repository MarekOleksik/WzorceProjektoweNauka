package co.devfoundry.state;

public class CupFullState implements State {
    @Override
    public void insertTheCoin(CoffeMachine coffeMachine) {
        System.out.println("Zabierz kubek");
    }

    @Override
    public void pushTheButton(CoffeMachine coffeMachine) {
        System.out.println("Zabierz najpierw kubek");
    }

    @Override
    public void takeTheCup(CoffeMachine coffeMachine) {
        System.out.println("Zabrano kubek");
        coffeMachine.state = new NoCoinState();
    }

    @Override
    public void returnTheCoin(CoffeMachine coffeMachine) {
        System.out.println("Za późno");
    }
}
