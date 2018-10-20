public class BuilderPatternDemo {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegeMeal();
        System.out.println("Veg Meal");
        vegMeal.listItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareMeatMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.listItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
