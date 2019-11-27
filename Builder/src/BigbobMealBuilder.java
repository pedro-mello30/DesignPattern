public class BigbobMealBuilder implements MealBuilder {

    private Meal meal;

    public BigbobMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void buildMainItem() {
        meal.setMainItem("Bigbob Hamburger");
    }

    @Override
    public void buildSideItem() {
        meal.setSideItem("Fries");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Coke");
    }

    @Override
    public Meal getMeal(){
        return meal;
    }
}
