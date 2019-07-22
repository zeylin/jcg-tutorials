package jcgLambdas;

/*
 Custom functional interface.

 From javadoc: Functional interfaces provide target types for lambda expressions and method references.
 Each functional interface has a single abstract method, called the functional method for that functional interface,
 to which the lambda expression's parameter and return types are matched or adapted.
 */
@FunctionalInterface
public interface Print {
    public abstract void print();
}
