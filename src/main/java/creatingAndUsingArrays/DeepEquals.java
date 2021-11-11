package creatingAndUsingArrays;

import java.util.Arrays;

public class DeepEquals {
    public static void main(String[] args) {
        int[] ints = {1,5,3,2,0};
        int[] ints2 = {1,5,3,2,0};
        System.out.println("ints == ints2 = " + (ints == ints2)); //false
        System.out.println("ints.equals(ints2) = " + ints.equals(ints2)); //false
        System.out.println("Arrays.equals(ints, ints2) = " + Arrays.equals(ints, ints2)); //true

        Integer[] intsw = {1,5,3,2,0};
        Integer[] intsw2 = {1,5,3,2,0};
        System.out.println("Arrays.deepEquals(ints, ints2) = " + Arrays.deepEquals(intsw, intsw2)); //true

        System.out.println("***");

        Integer[][] a = {{1,2,3},{4,5,6}};
        Integer[][] b = {{1,2,3},{93,21,49}};
        Integer[][] a2 = {{1,2,3},{4,5,6}};
        System.out.println("Arrays.equals(a, b) = " + Arrays.equals(a, b)); //false
        System.out.println("Arrays.deepEquals(a, b) = " + Arrays.deepEquals(a, b)); //false

        System.out.println("Arrays.equals(a, a2) = " + Arrays.equals(a, a2)); //false
        System.out.println("Arrays.deepEquals(a, a2) = " + Arrays.deepEquals(a, a2)); //true
    }
}
