package homework.observator.weatherforecast;

import homework.observator.notification.Observer;

public interface Observable {
        void registerObserver(Observer observer);
        void unregisterObserver(Observer observer);
        void notifyObservers();
    }

