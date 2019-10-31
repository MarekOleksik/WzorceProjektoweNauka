package homework.state;

public class Fliper {
    State state;
    public Fliper() {
        state = new NoCoinState();
    }
    public void insertTheCoin() {
        state.insertTheCoin(this);
    }

    public void pullTheLever() {
        state.pullTheLever(this);
    }

    public void takeTheWinning(){
        state.takeTheWinning(this);
    }

    public void getActualState(){
        state.getActualState(this);
    }
}
