public class BadGuy extends Character{
    public BadGuy(String name) {
        super(name);
    }

    public void doingBad() {
        System.out.println(name + ".doingBad()");
    }
}
