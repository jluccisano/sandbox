package net.jls.design.pattern.singleton;

/**
 Using this approach, we rely on the JVM to create the unique instance of the Singleton when

 the class is loaded. The JVM guarantees that the instance will be created before any thread

 accesses the static uniqueInstance variable.

 */
public class SingletonEagerly {

    private static SingletonEagerly uniqueInstance = new SingletonEagerly();

    private SingletonEagerly() {

    }

    public static SingletonEagerly getInstance() {
        return uniqueInstance;
    }

    public static void main(String[] args) {
        SingletonEagerly.getInstance();
    }
}
