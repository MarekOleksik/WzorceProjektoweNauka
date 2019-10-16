package homework.dekorator;

public class ChickenMealDecorator extends MealDecorator{
    public ChickenMealDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }
    private void addChicken(){
        System.out.println("Do dania dodaję kurczaka.");
    }
    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChicken();
    }
}
