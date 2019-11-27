public class Necessity implements Visitable {

    private double price;

    Necessity(double newPrice){
        price = newPrice;
    }

    public double getPrice(){
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
