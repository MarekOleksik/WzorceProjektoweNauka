package homework.strategy.shop;

public class RegularPrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
    if (isSignedUpForNewsletter==false) {
        System.out.println("Normalna cena: " + price + "zł");
    }
    else {
        System.out.println("Użytkownik zapisany do newslettera, należy wybrać inną strategię cenową!");
    }
    }
}
