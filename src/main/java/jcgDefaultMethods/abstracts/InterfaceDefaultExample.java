package jcgDefaultMethods.abstracts;

/*
    Since interfaces have to state,
    default methods cannot change the state of variables (unlike abstract classes).
 */
public interface InterfaceDefaultExample {

    int cachedTwo = -1;

    int calculateTwoPlusTwo();

    default int returnTwo()
    {
        if( cachedTwo != -1 ) // Warning: Comparing identical expressions
            return cachedTwo; // Warning: Dead code
//        cachedTwo = 2; // Not going to work. Cannot assign value to final variable
        return 2;
    }

}
