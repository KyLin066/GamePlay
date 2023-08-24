public class GamePlay  {
    public static void main(String[] args) {
        System.out.println("main(): GamePlay_Start");

        Player player1 = new Player("p1");

        Enemy enemy1 = new Enemy("e1");
        
        Enemy enemy2 = new Enemy("e2");

        player1.shoot();

        enemy1.shoot();

        enemy2.shoot();

        enemy1.hit(10);

        player1.hit(5);

        player1.miss();
    }
}
