package co.devfoundry.chainOfResponsibility.officer;

import co.devfoundry.chainOfResponsibility.message.Message;

public class Officer {
    private boolean sergent;
    private boolean captain;
    private boolean general;

    public void receiveMessage(Message message) {
        if(sergent) {
            System.out.println("Sierżant otrzymał wiadomość: " + message.getContent());
        }
        else if(captain) {
            System.out.println("Kapitan otrzymał wiadomość: " + message.getContent());
        }
        else if(general) {
            System.out.println("Generał otrzymał wiadomość: " + message.getContent());
        }
        else {
            System.out.println("Zły adresat wiadomości!");
        }
    }

    public void setSergent(boolean sergent) {
        this.sergent = sergent;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }

    public void setGeneral(boolean general) {
        this.general = general;
    }
}
