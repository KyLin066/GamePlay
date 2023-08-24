public class GoodGuy extends Character{
    public GoodGuy(String name) {
        super(name);
    }

    public void doingGood() {
        System.out.println(name + ".doingGood()");
    }
}
