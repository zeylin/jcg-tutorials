package jcgDefaultMethods.abstracts;

/*
    Abstract classes can make use of and update internal variables
    (unlike interface default methods).
 */
public abstract class AbstractClassExample {

    int cachedTwo = -1;

    public abstract int calculateTwoPlusTwo();

    public int returnTwo() {
        if( cachedTwo != -1 ) { // this works
            return cachedTwo;
        }
        cachedTwo = 2;
        return 2;
    }

}
