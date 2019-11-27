public class EnemyMonsterFactory {
    public EnemyMonster makeMonster(String typeEnemyMonster){
        EnemyMonster enemyMonster = null;

        if(typeEnemyMonster.equals("G")){
            enemyMonster = new GorillaEnemyMonster();
            return enemyMonster;

        } else if(typeEnemyMonster.equals("A")){
            enemyMonster = new AlligatorEnemyMonster();
            return enemyMonster;

        } else return null;
    }
}
