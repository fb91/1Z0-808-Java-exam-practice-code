package javaBasics;

public class ComparingWrappersAndPrimitives {
    public static void main(String[] args) {
        Integer iw = 10;  // Wrapper Integer accepts any int literal (just a decimal, or an octal, hexa or binary)
        int i = 10;       //an int or any short primitive
        Double dw = 10.0; // Wrapper Double only accepts a double (10.0 or 10d)
        double d = 10;    //a double or any short primitive
        Float fw = 10f;   //Wrapper Float only accepts a float (10f or 10.0f)
        float f = 10;     //a float or any short primitive
        Long lw = 10L;    //Wrapper Loan only accepts a long
        long l = 10;      //a long or any short primitive

        Float fw2 = 10.1f;
        float f2 = 10.1f;

//        System.out.println("dw==fw = " + dw==fw); // Compilation FAILS
        System.out.println("dw.equals(fw) = " + dw.equals(fw));
        System.out.println("iw.equals(dw) = " + iw.equals(dw));
        System.out.println("iw.equals(fw2) = " + iw.equals(fw2));
        System.out.println("iw.equals(f) = " + iw.equals(f)); // Can compare wrapper and primitive
//        System.out.println("f.equals(iw) = " + f.equals(iw)); // Primitives don't have equals method, it's not an object.

//        System.out.println("i==d = " + i==d); // Without parenthesis it doesn't compile. It tries to compare String and double
        System.out.println("i==d = " + (i==d));
        System.out.println("i==f = " + (i==f));
        System.out.println("i==l = " + (i==l));

        System.out.println("i==f2 = " + (i==f2));

        System.out.println("Integer.decode(\"023\") = " + Integer.decode("023"));//19 (octal value converted to decimal)
        System.out.println("Integer.valueOf(\"023\") = " + Integer.valueOf("023"));//23

        System.out.println("(d+i) = " + (d+i));
        System.out.println("(int)(d+i) = " + (int)(d+i));
        System.out.println("(f2+i) = " + (f2+i));
        System.out.println("(int)(f2+i) = " + (int)(f2+i));
        System.out.println("(i+dw) = " + (i+dw));
        
        char letter = 65;
        System.out.println("letter = " + letter);

    }
}
