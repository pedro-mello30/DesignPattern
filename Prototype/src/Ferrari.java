public class Ferrari implements Vehicle{

    public Ferrari() {
        System.out.println("Ferrari is made.");
    }

    @Override
    public Vehicle copy() {
        Ferrari ferrari = null;
        try {
            ferrari = (Ferrari) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Fail to clone.");
            e.printStackTrace();
        }

        return ferrari;
    }

    @Override
    public String toString() {
        return "I'm a Ferrari.";
    }
}
