package jcgLambdas;

import java.time.LocalDateTime;

@FunctionalInterface
public interface GoodMorningInterface {

    // Modifier "public" is redundant for interface methods.
    /* public */ void morning(String name, LocalDateTime date);
}
