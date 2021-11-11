package creatingAndUsingArrays;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        String[] arr = new String[]{"D","E","A","T","g","2"};
        Arrays.sort(arr);
        for (String i : arr) {
            System.out.print(i + " "); // Prints: 2 A D E T g
        }
    }
}
