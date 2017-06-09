package net.jls.design.pattern.factory;

/**
 * Created by jls on 23/05/17.
 * Factory: that designs should be "open for extension but closed for modification"
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    }
}
