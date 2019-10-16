package co.devfoundry.chainOfResponsibility;

import co.devfoundry.chainOfResponsibility.message.Message;
import co.devfoundry.chainOfResponsibility.officer.Officer;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Atakować");
        Officer officer = new Officer();
//        officer.setCaptain(true);
//        officer.setSergent(true);
        officer.receiveMessage(message);
    }
}
