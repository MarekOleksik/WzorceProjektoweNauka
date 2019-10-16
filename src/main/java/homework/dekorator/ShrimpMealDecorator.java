package homework.dekorator;

public class ShrimpMealDecorator extends MealDecorator{
    public ShrimpMealDecorator(Meal decoratedMeal) {
        super(decoratedMeal);
    }
    public void addShrimp(){
        System.out.println("Do dania dodaję krewetki.");
    }
    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addShrimp();
    }
}
