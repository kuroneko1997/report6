package jp.ac.uryukyu.ie.e165741;

/**
 * Created by e1657 on 2016/12/26.
 */
public abstract class LivingThing {
    private String name;//名前
    private int hitPoint;//体力値
    private int attack;//攻撃値
    private boolean dead;//状態　true=死

    //コンストラクタ（名前、最大体力値、攻撃値）
    public LivingThing(String name, int maximumHP, int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public  boolean isDead(){
        return  dead;
    }

    public String getName(){
        return name;
    }

    public  void  ddead(boolean dead){this.dead = dead;}

    public void Fall(){}

    public int getAttack(){return attack;}

    public int dhitpoint(){return hitPoint;}
    /**
     * 攻撃対象へ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、.wounded()によりダメージ処理を実行。
     * @param
     **/
    public void attack (LivingThing opponent) {
        if (isDead() == false) {
            int damage=(int)(Math.random()*attack);
            damage=attacksistem(damage,opponent);
            opponent.wounded(damage);
        }
    }
    public abstract int attacksistem(int damage,LivingThing opponent);
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            Fall();
        }
    }
}
