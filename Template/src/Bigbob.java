public class Bigbob extends Hamburguer {

    public boolean customerWantsVegetables(){ return false; }

    @Override
    public void addMeat() {
        System.out.println("Adding double meat.");
    }

    @Override
    public void addCheese() {
        System.out.println("Adding double cheese.");
    }

    @Override
    public void addVegetables() {

    }

    @Override
    public void addCondiments() {
        System.out.println("Adding ketchup.");
    }
}
