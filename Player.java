public class Player extends GoodGuy {
    public Player(String name) {
        super(name);
    }

    public String yell(String extWord) {
        return super.yell("I_Am:Good_Guy " + extWord);
    }
}
