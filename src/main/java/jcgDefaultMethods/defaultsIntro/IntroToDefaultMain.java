package jcgDefaultMethods.defaultsIntro;

/**
 * Intro to default methods in interfaces.
 */
public class IntroToDefaultMain {

    public static void main(String[] args) {

        // Call methods through the interface
        InterfaceWithDefault interfaceWithDefault = new InterfaceWithDefaultImpl();
        interfaceWithDefault.defaultMethod();
        interfaceWithDefault.toImplementMethod();

        System.out.println("---");
        // Call through implementation
        InterfaceWithDefaultImpl interfaceImpl = new InterfaceWithDefaultImpl();
        interfaceImpl.callDefault();
        interfaceImpl.toImplementMethod();

        System.out.println("---");
        // Call the default method - option 2
        ((InterfaceWithDefaultImpl) interfaceWithDefault).callDefault();

    }

}
