public class TankAdapter implements Enemy {
    private Tank tank;

    public TankAdapter(Tank tank){
        this.tank = tank;
    }

    @Override
    public void attack() {
        tank.fireWeapon();
    }

    @Override
    public void move() {
        tank.driverForward();
    }

    @Override
    public void assignName(String name) {
        tank.assignDriver(name);
    }
}
