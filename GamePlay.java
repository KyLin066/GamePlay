public class GamePlay {
    public static void main(String[] args) {
        System.out.println("main(): GamePlay_Start");

        Player player1 = new Player("p1");

        Enemy enemy1 = new Enemy("e1");

        Npc npc1 = new Npc("n1");

        Boss boss1 = new Boss("b1");

        enemy1.yell("");

        enemy1.doingBad();

        player1.yell("haha");

        npc1.yell("");

        boss1.yell("");

        // player1.shoot();

        // enemy1.shoot();

        // enemy1.hit(10);

        // player1.hit(5);

        // player1.miss();
    }
}
