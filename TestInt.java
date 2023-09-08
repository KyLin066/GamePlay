public class TestInt {
    protected int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public TestInt(int pnum) {
        this.num = pnum;
    }

    public void add(int val) {
        synchronized (TestInt.class) {
            this.num += val;
        }
    }
}
