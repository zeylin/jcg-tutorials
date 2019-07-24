package jcgDefaultMethods.staticMethods;

/**
 * Static methods in interfaces.
 *
 * In addition to default methods, Java 8 offers the possibility to define static methods.
 * They can be used by other static and default methods inside the interface.
 *
 * Side note: It used to be common to implement static methods in utility classes
 * that were used in several places afterwards.
 * Now, we can use interface static methods instead.
 */
public interface InterfaceWithDefaultsAndStatics {

    default void qualityContent() {
        System.out.println("\nPresenting, best of the interwebs (and tv):\n");
        System.out.println("woke: pretty");
        System.out.println("broke: " + bitching());
    }

    /*public*/ static String bitching() {
        return "bitching";
    }

    void toImplement();

}
