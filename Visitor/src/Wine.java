public class Wine implements Visitable {

    private double price;

    Wine(double newPrice){
        price = newPrice;
    }

    public double getPrice(){
        return price;
    }

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
