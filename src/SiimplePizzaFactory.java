public class SiimplePizzaFactory {


    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese")) {
            pizza = new CheesePizza();
        }else if(type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }else if(type.equals("clam")) {
            pizza = new ClamPizza();
        }else if(type.equals("veggie")) {
            pizza = new VeggiePizza();
        } else
            System.out.println(" We don't have that type of pizza.");

        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
        return pizza;
    }


}
