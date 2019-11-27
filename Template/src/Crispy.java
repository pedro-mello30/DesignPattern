public class Crispy extends Hamburguer {

    public boolean customerWantsMeat(){ return false; }

    @Override
    public void addMeat() {

    }

    @Override
    public void addCheese() {
        System.out.println("Adding triple cheese.");
    }

    @Override
    public void addVegetables() {
        System.out.println("Adding tomato.");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding ketchup.");
    }

}
