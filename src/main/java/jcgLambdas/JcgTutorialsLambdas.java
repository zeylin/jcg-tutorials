package jcgLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Following JavaCodeGeeks tutorial on Java 8 Lambda expressions (introductory).
 * Link: https://examples.javacodegeeks.com/core-java/java-8-lambda-expressions-tutorial-2/
 * Date: July 22, 2019
 */
public class JcgTutorialsLambdas {

    public static void main(String[] args) {

        /*
        (int x, int y) -> x + y
        (argument list) -> [arrow token] body

        The argument can be zero, one or more statement in lambda expressions.
        The type of parameter can be declared or can be inferred from the context. This is called “target typing”.

        The body can be either a single expression or a statement block.

        () -> 33 // body is the expression form
        (String str) -> { System.out.println(str); } // body is the block form
        (int x, int y) -> x + y // body is the expression form

        In the expression form, the body is simply evaluated and returned.
        In the block form, the body is evaluated like a method body and a return statement returns control
        to the caller of the anonymous method.
         */

        lambdaWithStreamsExample();
    }

    /*
    In Java, anonymous inner classes provide a way to implement classes that may occur only once in an application.
    Lambda expressions are a useful replacement for anonymous inner classes to simplify the code.
     */
    private static void simpleLambdaExample() {

        // Runnable interface
        Runnable ar = new Runnable(){
            @Override
            public void run(){
                System.out.println("Anonymous Runnable!");
            }
        };

        Runnable lr = () -> System.out.println("Lambda Runnable!");
        ar.run();
        lr.run();
    }

    // Example: with comparator interface
    private static void anotherExampleUsingLambdas() {
        List<Node> nodes = new ArrayList<Node>();

        // Sort with Inner Class
        Collections.sort(nodes, new Comparator<Node>() {
            public int compare(Node n1, Node n2) {
                return n1.getValue().compareTo(n2.getValue());
            }
        });

        System.out.println("=== Sorted Ascending ===");
        for(Node node:nodes){
            System.out.println(node.toString());
        }

        // Replace with lambdaExpression
        System.out.println("=== Sorted Ascending ===");
        Collections.sort(nodes, (Node n1, Node n2) -> n1.getValue().compareTo(n2.getValue()));

        for(Node node:nodes){
            System.out.println(node.toString());
        }

        /*
        The first lambda expression declares the parameter type passed to the expression.
        However, seeing from the second lambda expression below, this is optional.
        Lambda supports “target typing” which infers the object type from the context in which it is used.
         */
        System.out.println("=== Sorted Descending ===");
        Collections.sort(nodes, (n1, n2) -> n2.getValue().compareTo(n1.getValue()));

        for(Node node:nodes){
            System.out.println(node.toString());
        }
    }

    // Assigning a lambda expression to a custom functional interface.
    private static void functionalInterfaceExample() {
        /*
        A Functional Interface includes only an abstract method.
        A lambda expression can be implicitly assigned to a functional interface as below.
         */
        Print p = () -> System.out.println("Printing some text.");
        p.print();

        System.out.println("again");
        p.print();
    }

    private static void lambdasWithPredicateExample() {

        List<Edge> cities = new ArrayList<>();
        cities.add(new Edge(new Node("LA"), new Node("NY"), 50));
        cities.add(new Edge(new Node("Sydney"), new Node("Melbourne"), 30));
        cities.add(new Edge(new Node("Rome"), new Node("Venice"), 20));

        /*
        Predicate interface (from java.util.function) takes a generic class and returns a boolean result.
        Useful for filtering.

        From javadoc on functional interfaces:

        Functional interfaces provide target types for lambda expressions and method references.
        Each functional interface has a single abstract method, called the functional method for that functional interface,
        to which the lambda expression's parameter and return types are matched or adapted.

        The interfaces in this package are general purpose functional interfaces used by the JDK,
        and are available to be used by user code as well.
        While they do not identify a complete set of function shapes to which lambda expressions might be adapted,
        they provide enough to cover common requirements.
        Functional interfaces often represent abstract concepts like functions, actions, or predicates.

        Predicate<T> interface represents a predicate (boolean-valued function) of one argument.
        (Evaluates an input argument given the predicate.)
        (word def: something which is affirmed or denied concerning a given argument.)

        Link: https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
         */

        /*
        The following example uses the Predicate interface to compare the distance between two cities with a constant value.
        It will print the distance if it is greater than 30.
         */
        Predicate<Edge> edgePredicate = e -> e.getDist() >= 30; // checks if a given Edge's distance is >= 30

        filter(edgePredicate, cities);
    }

    private static void filter(Predicate<Edge> predicate,
                              List<Edge> items) {
        for(Edge item: items) {
            if(predicate.test(item)) {
                System.out.println(item.getOrigin().getValue().toString() + " to " +
                        item.getDest().getValue().toString() + " : " + item.getDist());
            }
        }
    }

    /*
     Stream operations are either intermediate or terminal. Intermediate operations return a stream
     so we can chain multiple intermediate operations without using semicolons.
     Terminal operations are either void or return a non-stream result.
     In the example below, filter, map and sorted are intermediate operations whereas forEach is a terminal operation.
     A chain of stream operations is known as “operation pipeline”.
     */
    private static void lambdaWithStreamsExample() {
        List<String> myList =
                Arrays.asList("area", "block", "building", "city", "country");

        myList.stream()
                .filter(s -> s.startsWith("c")) // intermediate operation
                .map(String::toUpperCase) // intermediate operation
                .sorted() // intermediate
                .forEach(System.out::println); // terminal operation
    }

}
