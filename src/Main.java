//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




PizzaStore nyStore = new NYPizzaFactory();
nyStore.orederPizza("cheese");

PizzaStore chicagoStore = new ChicagoPizzaFactory();
chicagoStore.orederPizza("cheese");






    }
}