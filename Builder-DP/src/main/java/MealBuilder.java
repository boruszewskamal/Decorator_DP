public class MealBuilder {
    public Meal prepareVegeMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareMeatMeal(){
        Meal meal = new Meal();
        meal.addItem(new Hamburger());
        meal.addItem(new Sprite());
        return meal;
    }
}
