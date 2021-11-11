/*
 * What will the following code print?
 */

package workingWithJavaDataTypes;

public class Question1 {
    public static void testInts(Integer obj, int var) {
        obj = var++;
        obj++;
    }

    public static void main(String[] args) {
        Integer val1 = new Integer(5);
        int val2 = 9;
        testInts(val1++, ++val2);
        System.out.println(val1+" "+val2);
    }
}








/*
 * Returns: 6 10
 *
 * Explanation: There are multiple concepts at play here:
 *
 * 1. All the wrapper objects are immutable. So when you do obj++, what actually happens is something like this:
 * obj = new Integer( obj.intValue() + 1);
 *
 * 2. val1++ uses post-increment operator, which implies that you note down the current value of val1, increment it, and
 * then pass the original noted down value to the method testInts. Thus, the reference value of Integer 5 is passed to
 * testInts. But val1 is set to point to a new Integer object containing 6. ++val2 uses pre-increment operator, which
 * implies that you first increment val2 and then pass the incremented value. Therefore, val2 is incremented to 10 and
 * then 10 is passed to the method testInts.
 *
 * 3. Java uses pass by value semantics in method calls. In case of primitive variables, their values are passed, while
 * in case of Objects, their reference values are passed. Thus, when you assign a different object to reference variable
 * in a method, the original reference variable that was passed from the calling method still points to the same object
 * that it pointed to before the call. In this question, therefore, val1 in main still points to 6 after the call to
 * testInts returns.
 */