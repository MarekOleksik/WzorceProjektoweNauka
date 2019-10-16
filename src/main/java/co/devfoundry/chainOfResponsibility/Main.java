package co.devfoundry.chainOfResponsibility;

import co.devfoundry.chainOfResponsibility.message.Message;
import co.devfoundry.chainOfResponsibility.officer.*;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Atakować", 20, OfficerRank.GENERAL);
        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();
        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);
        sergeant.processMessage(message);
    }
}
