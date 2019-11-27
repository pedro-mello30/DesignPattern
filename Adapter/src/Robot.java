import java.util.Random;

public class Robot {

    Random generator = new Random();

    public void smashWithHand(){
        int attackDamage = generator.nextInt(5) + 1;

        System.out.println("Enemy robot causes " +attackDamage+" damage with its hands.");
    }

    public void walkForward(){
        int movement = generator.nextInt(3) + 1;

        System.out.println("Enemy robot moves " +movement+" space.");
    }

    public void reactToHuman(String name){
        System.out.println("Enemy robot tramps on "+name);
    }
}
