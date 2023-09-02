import java.util.ArrayList;

public class Producer extends Thread {

    protected ArrayList<BadGuy> badGuys;

    public Producer(ArrayList<BadGuy> pBadGuys) {
        this.badGuys = pBadGuys;
    }

    @Override
    public void run() {
        while (true) {
            BadGuy newOne = new BadGuy("");
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
}
