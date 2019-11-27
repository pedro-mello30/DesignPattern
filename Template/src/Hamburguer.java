public abstract class Hamburguer {
    public void makeHamburguer() {
        cutBun();

        if (customerWantsMeat()){
            addMeat();
        }

        if(customerWantsCheese()){
            addCheese();
        }

        if(customerWantsVegetables()){
            addVegetables();
        }

        if(customerWantsCondiments()){
            addCondiments();
        }

            wrapHamburguer();
    }

    public abstract void addMeat();
    public abstract void addCheese();
    public abstract void addVegetables();
    public abstract void addCondiments();

    public boolean customerWantsMeat(){ return true; }
    public boolean customerWantsCheese(){ return true; }
    public boolean customerWantsVegetables(){ return true; }
    public boolean customerWantsCondiments(){ return true; }


    public void cutBun(){
        System.out.println("Cuting the bun.");
    }

    public void wrapHamburguer(){
        System.out.println("Wraping the hamburguer.");
    }

}