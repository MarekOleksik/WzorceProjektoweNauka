package co.devfoundry.memento;

class SmartAppMemento {
    private Double version;

    SmartAppMemento(Double version) {
        this.version = version;
    }

    Double getVersion() {
        return version;
    }
}
