package co.devfoundry;

/*import co.devfoundry.notification.Email;
import co.devfoundry.notification.MobileApp;
import co.devfoundry.notification.TextMessage;
import co.devfoundry.order.Order;
import co.devfoundry.order.OrderStatus;*/

import co.devfoundry.patterns.singleton.GameEngine;

public class Main {
    public static void main(String[] args) {

       /* Observator
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
        order.changeOrderStatus(OrderStatus.ODEBRANE);*/

        GameEngine engine = GameEngine.getInstance();
        GameEngine engine1 = GameEngine.getInstance();
        System.out.println(engine==engine1);

    }
}
