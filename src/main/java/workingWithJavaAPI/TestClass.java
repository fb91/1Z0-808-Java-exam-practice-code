/*
 * What will the following code print when compiled and run?
 */

package workingWithJavaAPI;

public class TestClass {
    public static void main(String[] args) {
        System.out.println(getMsg((char) 10));
    }

    public static String getMsg(char x) {
        String msg = "Input value must be ";
        msg = msg.concat("smaller than X");
        msg.replace('X', x); // there is no assignation
        String rest = " and larger than 0";
        msg.concat(rest); // there is no assignation
        return msg;
    }
}

/*
 * Answer: Input value must be smaller than X
 *
 * Explanation:
 * Remember that a String once created cannot be changed. Therefore, when you call replace or concat methods on a
 * String, a new String object is created. The old String remains as it is. Here, the first call to concat returns a new
 * String object containing "Input value must be smaller than X" and it is assigned back to msg. The original String
 * referred to by msg is now lost (i.e. there is no reference to it anymore). The first call to replace also creates a
 * new String object but it is not assigned to any reference and is therefore lost and msg keeps pointing to the same
 * String object. The same thing happens to the second call to concat. It create a new String object but it is not
 * assigned back to msg, therefore, msg keeps pointing to the same object i.e. "Input value must be smaller than X"
 */