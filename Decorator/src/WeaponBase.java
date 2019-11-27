public class WeaponBase implements Weapon{

    double damange = 5.0;
    String description = "Machine Gun";

    @Override
    public double getAttack() {
        return damange;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
