public class Main {

    public static void main(String[] args) {

        MealBuilder bigbobMeal = new BigbobMealBuilder();
        MealDirector mealDirector = new MealDirector(bigbobMeal);
        mealDirector.makeMeal();

        Meal firstMeal = mealDirector.getMeal();

        System.out.println("Meal Built: "+ firstMeal.hashCode());
        System.out.println("Main Item: " + firstMeal.getMainItem());
        System.out.println("Side Item: " + firstMeal.getSideItem());
        System.out.println("Drink: " + firstMeal.getDrink());

    }
}
