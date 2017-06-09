package net.jls.design.pattern.singleton;

/**
 With double-checked locking, we first check to see if an instance is created, and if not, THEN we

 synchronize. This way, we only synchronize the first time through, just what we want.
 */
public class SingletonMultiThreading {

    private volatile static SingletonMultiThreading uniqueInstance;

    private SingletonMultiThreading() {

    }

    public static SingletonMultiThreading getInstance() {
        if(uniqueInstance == null) {
            synchronized (Singleton.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new SingletonMultiThreading();
                }
            }
        }
        return uniqueInstance;
    }

    public static void main(String[] args) {
        SingletonMultiThreading.getInstance();
    }
}
