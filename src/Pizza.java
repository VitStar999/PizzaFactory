public class Pizza {

    String name;
    String dough;
    String sauce;

    public void prepare() {
        System.out.println("підготовка" + name + dough + sauce);
    }

    public void bake() {
        System.out.println("випічка" + name);
    }

    public void cut() {
        System.out.println("нарізання" + name);
    }

    public void box() {
        System.out.println("упаковка" + name + "\n");
    }



}
