import jp.ac.uryukyu.ie.e205760.*;

public class Main {
    public static void main(String[] args){
        Warrior warrior = new Warrior("スーパー勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);
        String hero_name = warrior.getName();
        String enemy_name = enemy.getName();
        boolean hero_dead = warrior.isDead();
        boolean enemy_dead = enemy.isDead();

        System.out.printf("%s vs. %s\n", hero_name, enemy_name);

        int turn = 0;
        while( hero_dead == false && enemy_dead == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(warrior);
            hero_dead = warrior.isDead();
            enemy_dead = enemy.isDead();
        }
        System.out.println("戦闘終了");
    }
}