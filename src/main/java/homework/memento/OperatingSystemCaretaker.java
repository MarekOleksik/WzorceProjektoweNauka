package homework.memento;

public class OperatingSystemCaretaker {
    private OperatingSystemMemento operatingSystemMemento;

    public void addMemento(OperatingSystemMemento operatingSystemMemento) {

        System.out.println("Zapisano backup: "+ operatingSystemMemento.getBackupNumber() + " z datą: " + operatingSystemMemento.getBackupDate());
        this.operatingSystemMemento=operatingSystemMemento;
    }
    public OperatingSystemMemento getMemento() {
        System.out.println("Wczytano backup: " + operatingSystemMemento.getBackupNumber() + " z datą: " + operatingSystemMemento.getBackupDate());
        return operatingSystemMemento;
    }

}
