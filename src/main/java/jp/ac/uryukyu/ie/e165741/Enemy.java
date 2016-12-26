package jp.ac.uryukyu.ie.e165741;

/**
 * Created by e1657 on 2016/12/26.
 */
public class Enemy extends LivingThing {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);//オーバーライド使用
    }


    public void Fall(){
        System.out.printf("スライムは消滅した。\n");
    }
}
