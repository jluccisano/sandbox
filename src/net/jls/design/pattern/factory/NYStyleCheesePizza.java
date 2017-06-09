package net.jls.design.pattern.factory;

/**
 * Created by jls on 23/05/17.
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce= "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
