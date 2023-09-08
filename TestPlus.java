public class TestPlus implements Runnable {

    TestInt num;

    public static void main(String[] args) {

        TestInt num = new TestInt(0);

        // 创建三个 TestPlus 对象
        TestPlus tp1 = new TestPlus(num);
        TestPlus tp2 = new TestPlus(num);
        TestPlus tp3 = new TestPlus(num);

        // 为每个对象创建一个新线程
        Thread t1 = new Thread(tp1);
        Thread t2 = new Thread(tp2);
        Thread t3 = new Thread(tp3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Result: " + num.getNum());
    }

    public TestPlus(TestInt num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // System.out.println("before " + num.getNum());
            num.add(1);
            // System.out.println("after " + num.getNum());
        }
    }

}
