package net.jls.design.pattern.adapter;

/**
 The DuckTestDrive Pattern converts the interface of a class

 into another interface the clients expect. DuckTestDrive lets

 classes work together that couldn’t otherwise because of

 incompatible interfaces.
 */
public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter= new TurkeyAdapter(wildTurkey);
        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe Duck says");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
