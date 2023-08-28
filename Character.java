
public class Character {
    protected String name;
    protected int HP = 100;

    public Character(String pName) {
        this.name = pName;
        System.out.println(pName + ".Character()");
    }

    public String yell(String extWord) {
        String res = name + ".yell(): " + "My_Name:" + name + " " + extWord;
        System.out.println(res);
        return res;
    }

    public void shoot(Character pTarget, int hitVal) {
        System.out.println(name + ".shoot(" + pTarget.name + "," + hitVal + ")");
        pTarget.attack(hitVal);
        // if( pTarget instanceof GoodGuy){
        // ((GoodGuy)pTarget).doingGood();
        // }else if（pTarget instanceof BadGuy){
        // ((BadGuy)pTarget).doingBad();
        // }
        return;
    }

    public int attack(int hitVal) {

        if (Math.random() < 0.5) {
            return hit(hitVal);
        } else {
            return miss();
        }
    }

    public int hit(int hitVal) {
        int oldHP = this.HP;

        if (hitVal < 0) {
            System.out.println(name + ".hit(" + hitVal + "): old_hp:" + oldHP + " new_hp:" + this.HP);
            return this.HP;
        }

        this.HP = this.HP - hitVal;
        if (this.HP < 0) {
            this.HP = 0;
        }
        System.out.println(name + ".hit(" + hitVal + "): old_hp:" + oldHP + " new_hp:" + this.HP);
        return this.HP;
    }

    public int miss() {
        System.out.println(name + ".miss(): old_hp:" + HP + " new_hp:" + HP);
        return this.HP;
    }
}
