package homework.fasada;

import homework.fasada.bank.AtmMachineFacade;

public class Main {
    public static void main(String[] args) {
        AtmMachineFacade atmMachineFacade = new AtmMachineFacade();
        atmMachineFacade.withdrawMoney();
    }
}
