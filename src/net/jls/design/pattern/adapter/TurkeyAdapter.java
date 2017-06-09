package net.jls.design.pattern.adapter;

/**
 * Created by jls on 24/05/17.
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0; i<5; i++) {
            turkey.fly();
        }
    }
}
