public class WeaponLight extends WeaponDecorator {

    WeaponLight(Weapon newWeapon) {
        super(newWeapon);

        System.out.println("Adding Light");

    }

    @Override
    public double getAttack() {
        return super.getAttack() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Light";
    }
}
