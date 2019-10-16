package homework.dekorator;

public class SauceMealDecorator extends MealDecorator{
    public SauceMealDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }
    public void addSauce(){
        System.out.println("Do dania dodaję sos.");
    }
    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSauce();
    }
}
