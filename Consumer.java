import java.util.ArrayList;

public class Consumer implements Runnable {

    protected ArrayList<BadGuy> badGuys;

    public Consumer(ArrayList<BadGuy> pBadGuys) {
        this.badGuys = pBadGuys;
    }

    @Override
    public void run() {
        while (true) {
            BadGuy newOne;
            if (Math.random() < 0.2) {
                newOne = new Boss("Boss");
            } else {
                newOne = new Enemy("Enemy");
            }
            badGuys.add(newOne);
            System.out.println("Consumer_Counting:" + this.badGuys.size());
            if (badGuys.size() >= 10)
                break;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
