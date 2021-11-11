/*
 * What will the following code print when run?
 */

package javaBasics;

public class TestClass {
    public static long main(String[] args) {
        System.out.println("Hello");
        return 10L;
    }
}

/*
 * Answers:
 * Hello
 * It will not print anything.
 * It will not compile
 * It will throw an Error at runtime. <--- Correct
 * None of the above.
 *
 * Explanation:
 * When the program is run, the JVM looks for a method named main() which takes an array of Strings as input and returns
 * nothing (i.e. the return type is void). But in this case, it doesn't find such a method ( the given main() method is
 * returning long!) so it throws a java.lang.NoSuchMethodError. Note that java.lang.Error does not extend Exception
 * class. It extends java.lang.Throwable and so it can be "thrown".
 */