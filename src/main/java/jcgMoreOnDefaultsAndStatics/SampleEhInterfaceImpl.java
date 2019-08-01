package jcgMoreOnDefaultsAndStatics;

/**
 * Straightforward implementation (no overriding default methods).
 */
public class SampleEhInterfaceImpl implements SampleEhInterface {

    @Override
    public void toImplement() {
        System.out.println("Implementing interface.. That's no joke to you.");
    }

    public void callingItEh() {
        this.defaultMethodEh();
    }

}
