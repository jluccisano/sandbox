package net.jls.design.pattern.adapter;

/**
 * Created by jls on 24/05/17.
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
