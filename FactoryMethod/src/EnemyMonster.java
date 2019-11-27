public abstract class EnemyMonster {

    private String name;
    private double damange;
    private String order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamange() {
        return damange;
    }

    public void setDamange(double damange) {
        this.damange = damange;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void displayEnemyMonster(){
        System.out.println(getName() + " is on the screen");
    }

    public void enemyMonsterAttack(){
        System.out.println(getName() + " attacks and does " +getDamange()+" demage to hero");
    }
}
