package workingWithJavaAPI;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithString {
    public static void main(String[] args) {
        // Lists.toArray(): Returns an array containing all the elements in this list in proper sequence
        // (from first to last element); the runtime type of the returned array is that of the specified array. If the
        // list fits in the specified array, it is returned therein. Otherwise, a new array is allocated with the
        // runtime type of the specified array and the size of this list.

        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        String[] arr2 = new String[2];
        String[] arr2bis = new String[2];
        String[] arr3 = new String[3];
        arr2 = strings.toArray(arr2);  //It doesn't fit, then a new array is allocated and returned.
        strings.toArray(arr3); //Fits well, so the result is returned therein.
        strings.toArray(arr2bis);
        for (String s : arr2) {
            System.out.println("arr2: " + s);
        }
        for (String s : arr3) {
            System.out.println("arr3: " + s);
        }

        char[] name = {'F','a','b','r','i','c','i','o'};
        System.out.println(String.copyValueOf(name, 1, 4));//only works with char[]. Offset: 1, Count: 4

        char[] chars = new char[4];
        chars[0]=0;
        chars[1]=2;
        String out = "123456789";
        out.getChars(0, 3, chars, 0);
        for (char c : chars)
            System.out.println(c);
        //123
    }
}
