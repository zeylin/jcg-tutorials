package jcgDefaultMethods.staticMethods;

/**
 * Static methods in interfaces.
 */
public class StaticMethodsMain {

    public static void main(String[] args) {

        InterfaceImpl implementation = new InterfaceImpl();
        implementation.toImplement();
        implementation.qualityContent();

        // Note: static methods can be called directly from the interface.
        String sayIt = InterfaceWithDefaultsAndStatics.bitching();
        System.out.println("One more time: " + sayIt);

    }
}
