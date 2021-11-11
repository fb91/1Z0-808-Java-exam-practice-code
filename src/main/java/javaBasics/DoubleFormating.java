package javaBasics;

public class DoubleFormating {
    public static void main(String[] args) {
        try {
            Double number = Double.valueOf("120D");
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
        // The variable "number" is created inside the "try" block, so the scope is limited to that block only.
        //System.out.println(number);
    }

}
