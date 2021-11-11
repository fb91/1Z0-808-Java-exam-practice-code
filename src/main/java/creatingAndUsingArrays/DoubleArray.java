package creatingAndUsingArrays;

public class DoubleArray {
    public static void main(String[] args) {
        double[] array = {1,2,3.5,4.2};
        for(double i:array) System.out.print("i="+i+" "); //i=1.0 i=2.0 i=3.5 i=4.2
        //Double[] arrayWrapper = {1,2,3.5,4.2}; //requires Doubles
    }
}
