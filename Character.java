public class Character {
    protected String name;
    protected int HP = 100;

    public Character(String name) {
        this.name = name;
        System.out.println(name + "()");
    }

    public void shoot() {
        System.out.println(name + ".shoot()");
    }

    public int hit(int hitVal) {
        int oldHP = HP;

        if (hitVal < 0) {
            System.out.println(name + ".hit(" + hitVal +"): old_hp:" + oldHP + " new_hp:" + HP);
            return HP;
        }

        HP = HP - hitVal;
        if (HP < 0) {
            HP = 0;
        }
        System.out.println(name + ".hit(" + hitVal +"): old_hp:" + oldHP + " new_hp:" + HP);
        return HP;
    }

    public void miss() {
        System.out.println(name + ".miss(): old_hp:" + HP + " new_hp:" + HP);
    }
}
