package homework.chainOfResponsibility;

import homework.chainOfResponsibility.family.*;
import homework.chainOfResponsibility.requests.MotherRequest;

public class Main {
    public static void main(String[] args) {
        MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);
        Child tomek = new Tomek();
        Child ania = new Ania();
        Child antek = new Antek();
        tomek.setTallerChild(ania);
        ania.setTallerChild(antek);
        tomek.processRequest(motherRequest);

    }
}