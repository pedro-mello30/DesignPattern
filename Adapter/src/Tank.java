import java.util.Random;

public class Tank {

    Random generator = new Random();

    public void fireWeapon(){
        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy tank does " +attackDamage+" damage.");
    }

    public void driverForward(){
        int movement = generator.nextInt(3) + 1;

        System.out.println("Enemy tank moves " +movement+" space.");
    }

    public void assignDriver(String name){
        System.out.println(name+" is driving the tank.");
    }
}
