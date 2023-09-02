public class Npc extends GoodGuy implements Runnable {
    public Npc(String name) {
        super(name);
    }

    public String yell(String extWord) {
        return super.yell("I_Am:Good_Guy " + extWord);
    }

    @Override
    public void run() {
        // 在这里编写NPC线程的逻辑
        System.out.println("Npc_Runnable:running");
    }
}
