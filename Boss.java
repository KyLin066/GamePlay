public class Boss extends BadGuy implements Runnable{
    public Boss(String name) {
        super(name);
    }

    public String yell(String extWord) {
        return super.yell("I_Am:Bad_Guy " + extWord);
    }

    @Override
    public void run() {
        // 在这里编写BOSS线程的逻辑
        System.out.println("Boss_Runnable:running");
    }
}
