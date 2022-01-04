package jp.ac.uryukyu.ie.e205760;

public class Warrior extends LivingThing{

    //コンストラクタ
    public Warrior(String name, int hitPoint, int attack){
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        int damage = (int)(getAttack() * 1.5);    
        if(!(this.isDead())){
            String o_name = opponent.getName();
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), o_name, damage);
            opponent.wounded(damage);
        } 
    }
}
