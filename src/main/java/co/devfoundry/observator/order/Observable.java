package co.devfoundry.observator.order;

import co.devfoundry.observator.notification.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObserver();
}
