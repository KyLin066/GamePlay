public class Boss extends BadGuy {
    public Boss(String name) {
        super(name);
    }

    public String yell(String extWord) {
        return super.yell("I_Am:Bad_Guy " + extWord);
    }
}
