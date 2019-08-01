package jcgMoreOnDefaultsAndStatics;

/**
 * More on defaults and statics in interfaces.
 * Overriding default implementation, and using static methods.
 *
 * Link: https://www.javacodegeeks.com/2014/05/java-8-features-tutorial.html
 * Part: 2.2. Interface’s Default and Static Methods.
 */
public class SampleInterfaceEhMain {

    public static void main(String[] args) {

        defaultMethodsExample();
        staticMethodExample();

    }

    /**
     * Sample usage of original and overridden default interface implementations.
     */
    private static void defaultMethodsExample() {

        SampleEhInterfaceImpl straightforwardImplementation = new SampleEhInterfaceImpl();
        straightforwardImplementation.toImplement();
        straightforwardImplementation.callingItEh();

        SampleEhInterfaceOverridden overridden = new SampleEhInterfaceOverridden();
        overridden.toImplement();
        overridden.defaultMethodEh();

    }

    /**
     * Example using static method declared in an interface.
     * Can pass different interface implementations to this factory.
     * Combines static [create()] and default [defaultMethodEh()] methods.
     */
    private static void staticMethodExample() {

        SampleEhInterface ehOriginalImpl = EhFactory.create(SampleEhInterfaceImpl::new);
        ehOriginalImpl.defaultMethodEh();

        SampleEhInterface ehOverriddenImpl = EhFactory.create(SampleEhInterfaceOverridden::new);
        ehOverriddenImpl.defaultMethodEh();
    }

}
