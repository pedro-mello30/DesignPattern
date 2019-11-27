public class Main {

    public static void main(String[] args) {


        WeaponDecorator machineGunA = new WeaponTelescopicSight(new WeaponLight(new WeaponBase()));

        System.out.println("Machine Gun A Attack: " + machineGunA.getAttack());
        System.out.println("Machine Gun A Description: " + machineGunA.getDescription());

        WeaponDecorator machineGunB = new WeaponTelescopicSight(new WeaponBase());
        System.out.println("Machine Gun B Attack: " + machineGunB.getAttack());
        System.out.println("Machine Gun B Description: " + machineGunB.getDescription());


        WeaponDecorator machineGunC = new WeaponLight(new WeaponTelescopicSight(new WeaponBase()));

        System.out.println("Machine Gun C Attack: " + machineGunC.getAttack());
        System.out.println("Machine Gun C Description: " + machineGunC.getDescription());
    }
}
