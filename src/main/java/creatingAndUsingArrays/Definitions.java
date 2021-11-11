/*
 * Consider the following array definitions.
 * Which of the following are valid statements?
 *
 * array2 = array3; <-- true
 * array2 = array4; <-- true
 * array1 = array2;
 * array4 = array1;
 * array5 = array3; <-- true
 */

package creatingAndUsingArrays;

public class Definitions {
    int[] array1, array2[];
    int[][] array3;
    int[] array4[], array5[];
    /*
     * Explanation:
     * There is a subtle difference between: int[] i; and int i[]; although in both the cases, i is an array of integers.
     * The difference is if you declare multiple variables in the same statement such as: int[] i, j; and int i[], j;, j is
     * not of the same type in the two cases. In the first case, j is an array of integers while in the second case, j is
     * just an integer. Therefore, in this question: array1 is an array of int array2, array3, array4, and array5 are arrays
     * of int arrays.
     * Therefore, option 1, 2 and 5 are valid.
     */

    public static void main(String[] args) {
        double[] arr = new double[]{1,2,5,3};
        double arr2[] = new double[]{1,2,5,3};
        double[] arr3 = {1,2,5,3};
        double[] arr4;
//        arr4 = {1,2,5,3};// FAILS - Array initializer is not allowed here
        arr4 = new double[]{1,2,5,3};//OK


        int arr99[]=new int[5];
        int[] arr39=new int[5];
        int arr32[]=new int[]{1,2,3};
        int arr343[]=new int[0];

    }



}

