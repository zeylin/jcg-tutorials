package jcgLambdas;

import java.time.LocalDateTime;

/*
Sample functional interfaces used below.
 */
@FunctionalInterface
interface InterfaceGreet {
    public void greetings();
}

@FunctionalInterface
interface InterfaceName {
    public void name(String name);
}

@FunctionalInterface
interface InterfaceAdd {
    public void add(int a, int b);
}

@FunctionalInterface
interface InterfaceMultiply {
    public int multiple(int x);
}

/**
 * From another JCG tutorial on lambda expressions (via functional interfaces).
 *
 * Link: https://examples.javacodegeeks.com/core-java/lamba-expressions-introduction-example/
 */
public class JcgAnotherLambdaTutorial {

    public static void main(String[] args) {

        morning();

//        sampleFuncInterfacesWithLambdas();
    }

    private static void morning() {

        GoodMorningInterface morningInterface = (String name, LocalDateTime dateTime) -> {
            System.out.println("Good morning, " + name);
            System.out.println("It's " + dateTime.getDayOfWeek().name() + ", "
                    + dateTime.getHour() + ":" + dateTime.getMinute() + ", rise & shine!");
        };

        LocalDateTime now = LocalDateTime.now();
        morningInterface.morning("Jin Mi", now);
    }

    private static void sampleFuncInterfacesWithLambdas() {
        // Lambda expression with no parameter.
        // With a statement block
        InterfaceGreet interfaceGreet = () -> {
            System.out.println("Hello World!");
        };
        interfaceGreet.greetings();

//        // Same, but expression lambda (i.e. expression block)
//        InterfaceGreet interfaceGreet = () -> System.out.println("Hello World!");
//        interfaceGreet.greetings();
//
//        // Same, but using method reference
//        InterfaceGreet interfaceGreet = JcgAnotherLambdaTutorial::greetings;
//        interfaceGreet.greetings();
//
//        // Same, but using anonymous class
//        InterfaceGreet interfaceGreet = new InterfaceGreet() {
//            @Override
//            public void greetings() {
//                System.out.println("Hello World!");
//            }
//        };
//        interfaceGreet.greetings();

        // -------------------

        // Lambda expression with single parameter.
        // Here java compiler can detect the parameter type based on the context (i.e. Type coherence).
        // Thus the lambda expression can be rewritten as :: InterfaceName interfaceName = (name) -> {    System.out.println("My name is= " + name);      };
        InterfaceName interfaceName = (String name) -> {
            System.out.println("My name is = " + name);
        };
        interfaceName.name("Java");

        // Lambda expression with multiple parameters.
        InterfaceAdd interfaceAdd = (int a, int b) -> {
            System.out.println("Total sum is = " + (a+b));
        };
        interfaceAdd.add(5, 6);

        // Lambda expression with return keyword.
        // Here as curly parentheses consists of a single statement, we can omit them and the return keyword.
        // Thus the lambda expression can be rewritten as :: InterfaceMultiply interfaceMultiply = (int x) -> x*x;
        InterfaceMultiply interfaceMultiply = (int x) -> {
            return x*x;
        };
        System.out.println("Total result is = " + interfaceMultiply.multiple(10));

        // -------------------

        NameInterface nameInterface = (String name) -> System.out.println("The name is: " + name);
        nameInterface.name("Jin Mi");
        nameInterface.name("Rin Yu");
    }

    private static void greetings() {
        System.out.println("Hello World!");
    }

}
