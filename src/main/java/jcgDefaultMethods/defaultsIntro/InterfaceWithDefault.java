package jcgDefaultMethods.defaultsIntro;

public interface InterfaceWithDefault {

    default void defaultMethod() {
        System.out.println("I am the default method of the interface.");
    }

    void toImplementMethod();

}
