package homework.chainOfResponsibility.family;

import homework.chainOfResponsibility.requests.MotherRequest;

public class Antek extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Antek zdjął słoik z półki!");
        } else {
            System.out.println("Wydaj polecenie innemu dziecku!");
        }
    }
}
