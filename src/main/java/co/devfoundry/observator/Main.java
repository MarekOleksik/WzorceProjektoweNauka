package co.devfoundry.observator;

import co.devfoundry.observator.notification.Email;
import co.devfoundry.observator.notification.MobileApp;
import co.devfoundry.observator.notification.TextMessage;
import co.devfoundry.observator.order.Order;
import co.devfoundry.observator.order.OrderStatus;

public class Main {
    public static void main(String[] args) {


        Order order = new Order(110l, OrderStatus.ZAREJESTROWANE);
        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();
        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);
        order.notifyObserver();
        System.out.println("---------------------------------");

        order.changeOrderStatus(OrderStatus.WYSŁANE);
        order.unregisterObserver(email);
        System.out.println("---------------------------------");
        order.changeOrderStatus(OrderStatus.ODEBRANE);


    }
}
