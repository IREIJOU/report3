package jp.ac.uryukyu.ie.e205760;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WorriorTest{    
    /**
     * Warriorクラスからオブジェクトを生成し、attackWithWeponSkillを3回実行し、3回ともattackの150%ダメージになっていることを確認する
     * 検証手順
     *  (1) Warriorと敵を準備。ヒーローの攻撃力は100とする。
     *  (2) Warrior.attackWithWeponSkillを実行し、その際のダメージが150になっていることを確認したい。
     *  (3) そのために、hitPointが1000の敵を用意し、その敵に対して3回(2)を実行後、hitPointが550になっていることを確認する。
     */
    @Test
    void attackTest(){
        int defaultWarriorAttack = 100;
        int defaultEnemyHp = 1000;
        Warrior warrior = new Warrior("デモWarrior", 100, defaultWarriorAttack);
        Enemy slime = new Enemy("スライムもどき", defaultEnemyHp, 100);
        warrior.attackWithWeponSkill(slime);
        warrior.attackWithWeponSkill(slime);
        warrior.attackWithWeponSkill(slime);
        assertEquals(slime.getHitPoint(), 550);
    }
}
