/*
 * How many objects have been created by the time the main method reaches its end in the following code?
 */

package workingWithJavaDataTypes;

public class Noobs {
    public Noobs() {
        try {
            throw new MyException();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Noobs a = new Noobs();
        Noobs b = new Noobs();
        Noobs c = a;
    }
}

class MyException extends Exception {
}





/*
 * Answer: 4
 *
 * Explanation: When a Noobs object is created, a MyException object is also created. Therefore a total of 4 objects are
 * created. The line Noobs c = a; just assigns an existing Noobs object to c. No new object is created.
 * Note: Some candidates have reported getting a similar question.
 * The question is ambiguous because two Class objects (one for Noobs and one for MyException) are also created. If you
 * consider those, then the answer would be 6. Further, several Thread objects are also created (although not directly
 * by this code.) Since this is out of scope for the exam, it is best to ignore these kind of objects and consider only
 * the objects created directly by the code.
 */