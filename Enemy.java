public class Enemy extends BadGuy {
    public Enemy(String name) {
        super(name);
    }

    public String yell(String extWord) {
        return super.yell("I_Am:Bad_Guy " + extWord);
    }
}
