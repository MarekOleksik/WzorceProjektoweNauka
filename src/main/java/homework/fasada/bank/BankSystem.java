package homework.fasada.bank;

 class BankSystem {

     void transferMoney(){
         System.out.println("Pieniądze zostały przekazane.");
     }

     boolean validatePin(){
         System.out.println("PIN poprawny.");
         return true;
     }

     boolean validateTransaction(){
         System.out.println("Transakcja poprawna");
         return true;
     }

     void getTransactionHistory(){
         System.out.println("Historia transakcji.");
     }
}
