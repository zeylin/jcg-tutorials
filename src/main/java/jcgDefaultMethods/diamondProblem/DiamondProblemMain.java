package jcgDefaultMethods.diamondProblem;

/**
 * Diamond problem example.
 * (A class implementing several interfaces with the same default methods).
 */
public class DiamondProblemMain {

    public static void main(String[] args) {

        ClassImplementingThemRocks themRocks = new ClassImplementingThemRocks();

        themRocks.shine();
        themRocks.toImplementEmerald();
        themRocks.toImplementRuby();

        themRocks.callDefault();
        themRocks.callRuby();
        themRocks.callEmerald();
    }

}
