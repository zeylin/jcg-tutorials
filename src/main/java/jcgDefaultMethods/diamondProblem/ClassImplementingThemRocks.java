package jcgDefaultMethods.diamondProblem;

/**
 * A class that implements several interfaces
 * that have the same default method, has to implement this method itself.
 */
public class ClassImplementingThemRocks implements RubyInterface, EmeraldInterface {

    // Implement the common default method.
    // Note: no need to override; just implement it.
    public void shine() {
        System.out.println("Implementing the shining...");
    }

    // Note: alternatively, you can give preference to one of the interfaces.
//    public void shine() {
//        RubyInterface.super.shine();
//    }

    @Override
    public void toImplementRuby() {
        System.out.println("Implementing ruby.");
    }

    @Override
    public void toImplementEmerald() {
        System.out.println("Implementing emerald.");
    }

    public void callDefault() {
        this.shine();
    }

    // Call the interface's implementation
    public void callRuby() {
        RubyInterface.super.shine();
    }

    // Call the interface's implementation
    public void callEmerald() {
        EmeraldInterface.super.shine();
    }

}
