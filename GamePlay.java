import java.util.ArrayList;

public class GamePlay {
    public static void main(String[] args) {
        System.out.println("main(): GamePlay_Start");

        Player player1 = new Player("p1");
        Thread playerThread = new Thread(player1);
        // playerThread.start();

        Enemy enemy1 = new Enemy("e1");
        Thread enemyThread = new Thread(enemy1);
        // enemyThread.start();

        Npc npc1 = new Npc("n1");
        Thread npcThread = new Thread(npc1);
        // npcThread.start();

        Boss boss1 = new Boss("b1");
        Thread bossThread = new Thread(boss1);
        // bossThread.start();

        enemy1.yell("");

        enemy1.doingBad();

        player1.yell("haha");

        npc1.yell("");

        boss1.yell("");

        player1.shoot(enemy1, 10);

        enemy1.shoot(player1, 5);

        ArrayList<BadGuy> badGuyList = new ArrayList<BadGuy>();

        Producer producer = new Producer(badGuyList);
        Thread consumer = new Thread(new Consumer(badGuyList));

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Game_Over");

    }

    // private ArrayList<Integer> intList;
}
