package homework.strategy.shop;

public class SalePrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
    if(isSignedUpForNewsletter){
        System.out.println("Przecena: " + (price/2) + "zł");
    }
    else {
        System.out.println("Użytkownik nie jest zapisany do newslettera, nalezy wybrać inną strategię cenową!");
    }
    }
}
