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
    public void Hero_attack(int damage,LivingThing opponent,String k){
        if(damage==0){
            System.out.printf("%sの攻撃！だが%sは攻撃を回避した！！\n", getName(), opponent.getName());
        }
        if (isDead() == false&&damage>0) {
            System.out.printf("%sの攻撃！%s%sに%dのダメージを与えた！！\n", getName(),k, opponent.getName(), damage);
        }
    }
    @Override
    public int attacksistem(int damage, LivingThing opponent){
        if(Math.random()>0.2) {
            String k="";
            Hero_attack(damage,opponent,k);
        }else{
            String k="痛恨の一撃‼︎";
            damage=damage*2;
            Hero_attack(damage,opponent,k);
        }
        return damage;
    }


    public void Fall(){
        System.out.printf("スライムは消滅した。\n");
    }
}
