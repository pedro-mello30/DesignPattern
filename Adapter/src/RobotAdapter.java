public class RobotAdapter implements Enemy{
    private Robot robot;

    RobotAdapter(Robot robot){
        this.robot = robot;
    }
    @Override
    public void attack() {
        robot.smashWithHand();
    }

    @Override
    public void move() {
        robot.walkForward();
    }

    @Override
    public void assignName(String name) {
        robot.reactToHuman(name);
    }
}
