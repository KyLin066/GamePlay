import java.util.ArrayList;

public class Producer extends Thread {

    protected ArrayList<BadGuy> badGuys;

    public Producer(ArrayList<BadGuy> pBadGuys) {
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
            if (badGuys.size() >= 10)
                break;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void test(){
        System.out.println("test");
    }
}
