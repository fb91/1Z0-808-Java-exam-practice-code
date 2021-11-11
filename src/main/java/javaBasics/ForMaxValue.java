package javaBasics;

public class ForMaxValue {
        public static void main(String[] args) {
                int y = 0;
                while (y-- < 10) continue;
                String message = y > 10 ? "Greater than" : "Less than";
                System.out.println(message+"10");
                //Prints Greater than 10.
                // When int reach minimum value and you decrement it, it will shift to the maximum.
                System.out.println("y = " + y);
        }
}
