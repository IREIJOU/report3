package jp.ac.uryukyu.ie.e205760;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 生物の名前
     * @param maximumHP 生物のHP
     * @param attack 生物の攻撃力
     */
    public LivingThing (String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    } 

    public boolean isDead(){
        return this.dead;
    }
    public void setDead(boolean dead){
        this.dead = dead;
    }
    public String getName(){
        return this.name;
    }
    public int getHitPoint(){
        return this.hitPoint;
    }
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }
    public int getAttack(){
        return this.attack;
    }


    /**
     * LivingThingへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent){
        if(!(dead)){
            int damage = (int)(Math.random() * attack);
            String o_name = opponent.getName();
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, o_name, damage);
            opponent.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
