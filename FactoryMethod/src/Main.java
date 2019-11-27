import java.util.Scanner;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Main{

    public static void main(String[] args) {


        EnemyMonsterFactory monsterFactory = new EnemyMonsterFactory();

        EnemyMonster theEnemy = null;


        System.out.print("What type of monster? (G / A)\n");
        Scanner userInp = new Scanner(System.in);


        if(userInp.hasNextLine()){
            String typeMonster = userInp.nextLine();
//            String typeMonster = "A";

            theEnemy = monsterFactory.makeMonster(typeMonster);

            if(theEnemy != null){
                doStuffEnemy(theEnemy);
            }else System.out.println("Please enter G or A next time");
        }

    }

    public static void doStuffEnemy(EnemyMonster theEnemy){
        theEnemy.displayEnemyMonster();
        theEnemy.enemyMonsterAttack();
    }
}
