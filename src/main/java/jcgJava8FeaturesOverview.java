import java.util.Arrays;

/**
 * Java 8 features overview.
 *
 * Link: https://www.javacodegeeks.com/2014/05/java-8-features-tutorial.html
 */
public class jcgJava8FeaturesOverview {

    public static void main(String[] args) {

        lambdasExample();

    }

    private static void lambdasExample() {

        Arrays.asList( "a", "b", "d" ).forEach(e -> {
            System.out.print(e);
            System.out.print(e);
        } );

        // * Lambdas can access local variables and class members
        // essentially, making them final
        String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                (String e) -> System.out.print(e + separator) );

        // which is equivalent to declaring them final
        final String separatorFinal = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                (String e) -> System.out.print(e + separatorFinal) );

        // * Lambdas may return a value
        // return statement is not required if it's a one liner
        Arrays.asList( "a", "b", "d" )
                .sort( (e1, e2) -> e1.compareTo(e2) );

        // which is equivalent to:
        Arrays.asList( "a", "b", "d" )
                .sort((e1, e2) -> {
                    int result = e1.compareTo(e2);
                    return result;
                });

    }

}
