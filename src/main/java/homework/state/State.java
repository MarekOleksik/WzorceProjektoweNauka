package homework.state;

public interface State {
    void insertTheCoin(Fliper fliper);
    void pullTheLever(Fliper fliper);
    void takeTheWinning(Fliper fliper);
    void getActualState(Fliper fliper);
}
