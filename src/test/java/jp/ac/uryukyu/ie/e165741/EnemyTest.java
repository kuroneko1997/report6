package jp.ac.uryukyu.ie.e165741;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by e1657 on 2016/12/26.
 */
public class EnemyTest {
    @Test
    public void attack() throws Exception {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        enemy.ddead(true);
        for (int i = 0; i < 10; i++) {
            enemy.attack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        assertEquals(heroHP, hero.dhitpoint());
    }
}
