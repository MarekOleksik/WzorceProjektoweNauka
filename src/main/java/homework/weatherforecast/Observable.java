package homework.weatherforecast;

import homework.notification.Observer;

public interface Observable {
        void registerObserver(Observer observer);
        void unregisterObserver(Observer observer);
        void notifyObservers();
    }

