package co.devfoundry.templateMethod;

public class BottonCarStartingSequence {
    public void startTheCar(){
        fastenSeatBelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void setTheGear() {
        System.out.println("Wybieramy bieg");
    }

    private void go() {
        System.out.println("Wciskamy pedał gazu");
    }

    private void startTheIgnition() {
        System.out.println("Przekręcamy kluczyk");
    }

    private void fastenSeatBelts() {
        System.out.println("Zapinamy pasy");
    }
}
