
public abstract class WeaponDecorator implements Weapon{

    Weapon weaponTemp;

    WeaponDecorator(Weapon newWeapon){
        weaponTemp = newWeapon;
    }

    @Override
    public double getAttack() {
        return weaponTemp.getAttack();
    }

    @Override
    public String getDescription() {
        return weaponTemp.getDescription();
    }
}
