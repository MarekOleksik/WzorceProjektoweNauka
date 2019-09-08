package co.devfoundry.observator.notification;

import co.devfoundry.observator.order.Order;

public interface Observer {
    void update(Order order);
}
