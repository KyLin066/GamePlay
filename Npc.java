public class Npc extends GoodGuy {
    public Npc(String name) {
        super(name);
    }

    public String yell(String extWord) {
        return super.yell("I_Am:Good_Guy " + extWord);
    }
}
