package jcgMoreOnDefaultsAndStatics;

/**
 * A sample interface with a default method.
 */
public interface SampleEhInterface {

    void toImplement();

    default void defaultMethodEh() {
        System.out.println("Default, eh?");
    }

}
