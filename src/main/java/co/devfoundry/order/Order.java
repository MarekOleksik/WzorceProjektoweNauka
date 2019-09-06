package co.devfoundry.order;

import co.devfoundry.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {
    private long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObservers = new HashSet<Observer>();

    public Order(long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : registeredObservers) {
            observer.update(this);
        }
    }

    public void changeOrderStatus(OrderStatus orderStatus){
        setOrderStatus(orderStatus);
        notifyObserver();
    }
}
