public class Fusca implements Vehicle {

    public Fusca() {
        System.out.println("Fusca is made.");
    }

    @Override
    public Vehicle copy() {
        Fusca fusca = null;
        try {
            fusca = (Fusca) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Fail to clone.");
            e.printStackTrace();
        }
        return fusca;
    }

    @Override
    public String toString() {
        return "I'm a Fusca";
    }
}
