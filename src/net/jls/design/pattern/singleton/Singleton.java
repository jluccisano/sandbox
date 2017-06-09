package net.jls.design.pattern.singleton;

/**
 * Created by jls on 23/05/17.
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
    }
}
