public class Enemy extends BadGuy implements Runnable {
    public Enemy(String name) {
        super(name);
    }

    public String yell(String extWord) {
        return super.yell("I_Am:Bad_Guy " + extWord);
    }

    @Override
    public void run() {
        // 在这里编写敌人线程的逻辑
        System.out.println("Enemy_Runnable:running");
    }
}
