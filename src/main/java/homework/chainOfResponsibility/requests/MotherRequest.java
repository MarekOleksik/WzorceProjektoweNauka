package homework.chainOfResponsibility.requests;

import homework.chainOfResponsibility.family.Shelf;

public class MotherRequest {
    private Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }
}
