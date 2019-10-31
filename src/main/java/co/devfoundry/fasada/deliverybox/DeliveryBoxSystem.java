package co.devfoundry.fasada.deliverybox;

 class DeliveryBoxSystem {

     void sendNotification() {
         System.out.println("Text message sent to the client.");
     }

     boolean isUserDataValidated() {
         System.out.println("User data has been validated.");
        return true;
    }

     boolean isPaymentSecured() {
         System.out.println("Payment has been secured.");
        return true;
    }

    void scheduleDelivery(){
        System.out.println("Delivery has been scheduled.");
    }
}
