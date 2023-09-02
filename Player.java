public class Player extends GoodGuy implements Runnable {
    public Player(String name) {
        super(name);
    }

    public String yell(String extWord) {
        return super.yell("I_Am:Good_Guy " + extWord);
    }

    @Override
    public void run() {
        // 在这里编写玩家线程的逻辑
        System.out.println("Player_Runnable:running");
    }
}
