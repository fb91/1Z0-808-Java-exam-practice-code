/*
 * Which of the following statements will print true when executed?
 */

package workingWithJavaDataTypes;

public class PrintingBoolean {
    public static void main(String[] args) {
        System.out.println(Boolean.parseBoolean("true"));
        // true

        System.out.println(new Boolean(null));
        // This will print false

        //System.out.println(new Boolean());
        // This will not compile because Boolean class does not have a no-args constructor. Remember that no other
        // wrapper class has a no-args constructor either. So new Integer(), or new Long() will also not compile.

        System.out.println(new Boolean("true"));
        // Case of the String parameter does not matter. As long as the String equals "true" after ignoring the case, it
        // will be parsed as true. However, if you have extra spaces, for example, " true" or "true ", it will be parsed
        // as false.

        System.out.println(new Boolean("trUE"));
        // Case of the String parameter does not matter. As long as the String equals "true" after ignoring the case, it
        // will be parsed as true. However, if you have extra spaces, for example, " true" or "true ", it will be parsed
        // as false.
    }
}

/*
 * Explanation:
 * You need to remember the following points about Boolean:
 *
 * 1. Boolean class has two constructors - Boolean(String) and Boolean(boolean) The String constructor allocates a
 * Boolean object representing the value true if the string argument is not null and is equal, ignoring case, to the
 * string "true". Otherwise, allocate a Boolean object representing the value false. Examples: new Boolean("True")
 * produces a Boolean object that represents true. new Boolean("yes") produces a Boolean object that represents false.
 * The boolean constructor is self explanatory.
 *
 * 2. Boolean class has two static helper methods for creating booleans - parseBoolean and valueOf.
 * Boolean.parseBoolean(String ) method returns a primitive boolean and not a Boolean object (Note - Same is with the
 * case with other parseXXX methods such as Integer.parseInt - they return primitives and not objects). The boolean
 * returned represents the value true if the string argument is not null and is equal, ignoring case, to the string
 * "true".  Boolean.valueOf(String ) and its overloaded Boolean.valueOf(boolean ) version, on the other hand, work
 * similarly but return a reference to either Boolean.TRUE or Boolean.FALSE wrapper objects. Observe that they don't
 * create a new Boolean object but just return the static constants TRUE or FALSE defined in Boolean class.
 *
 * 3. When you use the equality operator ( == ) with booleans, if exactly one of the operands is a Boolean wrapper, it
 * is first unboxed into a boolean primitive and then the two are compared (JLS 15.21.2). If both are Boolean wrappers,
 * then their references are compared just like in the case of other objects. Thus,
 * new Boolean(true) == new Boolean(true) is false, but new Boolean(true) == Boolean.parseBoolean("true") is true.
 */