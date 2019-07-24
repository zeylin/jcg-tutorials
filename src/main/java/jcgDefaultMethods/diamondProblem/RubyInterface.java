package jcgDefaultMethods.diamondProblem;

public interface RubyInterface {

    /* public */ default void shine() {
        System.out.println("shine bright");
    }

    void toImplementRuby();

}
