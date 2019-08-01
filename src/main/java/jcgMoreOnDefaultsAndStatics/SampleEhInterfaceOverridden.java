package jcgMoreOnDefaultsAndStatics;

/**
 * Example overriding a default interface method.
 */
public class SampleEhInterfaceOverridden implements SampleEhInterface {

    @Override
    public void toImplement() {
        System.out.println("Implementing interface.. Simple, classic, no tricks.");
    }

    // Not required, but possible to override the default implementation.
    @Override
    public void defaultMethodEh() {
        System.out.println("Bitch you thought. Override default or die.");
    }

}
