public class PizzaStore {

    // Классу PizzaStore передается ссылка на SiimplePizzaFactory
    SiimplePizzaFactory factory;

    // PizzaStore сохраняет ссылку в конструктор
    public PizzaStore(SiimplePizzaFactory factory) {
        this.factory = factory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza;
        // Метод order Pizza() обращается к фабрике с запросом на создание объектап ередавая заказ
      // Вызов оператора new заменяется вызовом метода create объекта фабрики
        pizza = factory.createPizza("cheese");
        return  pizza;
    }
}
