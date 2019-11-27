public class WeaponTelescopicSight extends WeaponDecorator {

    WeaponTelescopicSight(Weapon newWeapon) {
        super(newWeapon);
        System.out.println("Adding Telescopic Sight");

    }

    @Override
    public double getAttack() {
        return super.getAttack() + 3.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Telescopic Sight";
    }
}
