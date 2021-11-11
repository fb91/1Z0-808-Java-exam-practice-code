package handlingExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise {
    public static void main(String[] args) {
        try {
            test();
        }
        catch (ClassCastException | NullPointerException | IndexOutOfBoundsException | IllegalArgumentException e) {
            //OK catch unchecked exceptions, it's not needed to be thrown in test() method.
        }
//        catch(ReflectiveOperationException | IOException ex) {}
// FAILS, because ReflectiveOperationException and IOException are checked exceptions and the method test() doesn't throw this type of exception.
        try {
            System.out.println("Simple try");
        } finally {
            System.out.println("Only -try- with a only finally or catch it's OK. A -try- alone it's not allowed.");
        }
    }
    public static void test() {
        System.out.println("Printing test " + 0);
    }
}
