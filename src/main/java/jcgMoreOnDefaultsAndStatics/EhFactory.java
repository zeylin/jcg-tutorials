package jcgMoreOnDefaultsAndStatics;

import java.util.function.Supplier;

/**
 * Sample interface with a static method.
 */
public interface EhFactory {

    static SampleEhInterface create(Supplier<SampleEhInterface> supplier) {
        return supplier.get();
    }

}
