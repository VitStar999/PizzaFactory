//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        SiimplePizzaFactory factory = new SiimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        factory.createPizza("cheese");



    }
}