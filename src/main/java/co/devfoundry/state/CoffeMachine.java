package co.devfoundry.state;

public class CoffeMachine {

    State state;

    public CoffeMachine() {
        state = new NoCoinState();
    }

    public void insertTheCoin() {
        state.insertTheCoin(this);

    }

    public void pushTheButton() {
        state.pushTheButton(this);

    }

    public void takeTheCup() {
       state.takeTheCup(this);
    }

    public void returnTheCoin() {
        state.returnTheCoin(this);
    }

}
