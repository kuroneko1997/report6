package jp.ac.uryukyu.ie.e165741;

/**
 * Created by e1657 on 2016/12/26.
 */
public class Hero extends LivingThing {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack)  {
        super(name,maximumHP,attack);//オーバーライド使用
    }

    public void Fall(){
        System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
    }
}
