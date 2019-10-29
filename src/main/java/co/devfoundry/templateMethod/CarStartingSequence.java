package co.devfoundry.templateMethod;

public abstract class CarStartingSequence {
    public final void startTheCar(){
        fastenSeatBelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go(){
        System.out.println("Wciskamy pedał gazu");
    };

    public abstract void setTheGear();

    protected abstract void startTheIgnition();

    public void fastenSeatBelts() {
        System.out.println("Zapinamy pasy");
    }
}
