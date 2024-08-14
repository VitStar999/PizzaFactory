public class ChicagoPizzaFactory extends PizzaStore{


    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new ChicagoStylePepperoniPizza();
        }else
            return null;
        return pizza;
    }
}
