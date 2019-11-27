public class Main {

    public static void main(String[] args) {
	// write your code here
        Enemy[] enemies = {new RobotAdapter(new Robot()), new TankAdapter(new Tank())};

        for (Enemy enemy : enemies){
            if(enemy.getClass().getSimpleName().equals("RobotAdapter")){
                enemy.assignName("Jack");
            }else{
                enemy.assignName("Juliete");
            }
            enemy.attack();
            enemy.move();
        }
    }
}
