public class MealDirector {

    MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal getMeal(){
        return this.mealBuilder.getMeal();
    }

    public void makeMeal(){
        this.mealBuilder.buildMainItem();
        this.mealBuilder.buildSideItem();
        this.mealBuilder.buildDrink();
    }
}
