package javaBasics;

public class Constants {
    public static void main(String[] args) {
//        Double d = 10;//need a double, not an int
        Double doubleNumber = 10.0;
        System.out.println("doubleNumber.BYTES = " + doubleNumber.BYTES); // 8
        System.out.println("doubleNumber.SIZE = " + doubleNumber.SIZE); // 64
        System.out.println("doubleNumber.MIN_VALUE = " + doubleNumber.MIN_VALUE); // 4.9E-324
        System.out.println("doubleNumber.MAX_VALUE = " + doubleNumber.MAX_VALUE); // 1.7976931348623157E308

//        Error: Constants are defined in Wrappers
//        double doublePrimitiveNumber = 10.0;
//        System.out.println("doublePrimitiveNumber.BYTES = " + doublePrimitiveNumber.BYTES);
//        System.out.println("doublePrimitiveNumber.SIZE = " + doublePrimitiveNumber.SIZE);
//        System.out.println("doublePrimitiveNumber.MIN_VALUE = " + doublePrimitiveNumber.MIN_VALUE);
//        System.out.println("doublePrimitiveNumber.MAX_VALUE = " + doublePrimitiveNumber.MAX_VALUE);

        Float floatNumber = 10.0f;
        System.out.println("floatNumber.BYTES = " + floatNumber.BYTES); // 4
        System.out.println("floatNumber.SIZE = " + floatNumber.SIZE); // 32
        System.out.println("floatNumber.MIN_VALUE = " + floatNumber.MIN_VALUE); // 1.4E-45
        System.out.println("floatNumber.MAX_VALUE = " + floatNumber.MAX_VALUE); // 3.4028235E38

        Long longNumber = 10l;
        System.out.println("longNumber.BYTES = " + longNumber.BYTES); // 8
        System.out.println("longNumber.SIZE = " + longNumber.SIZE); // 64
        System.out.println("longNumber.MIN_VALUE = " + longNumber.MIN_VALUE); // -9223372036854775808
        System.out.println("longNumber.MAX_VALUE = " + longNumber.MAX_VALUE); // 9223372036854775807

        Integer integerNumber = 10;
        System.out.println("integerNumber.BYTES = " + integerNumber.BYTES); // 4
        System.out.println("integerNumber.SIZE = " + integerNumber.SIZE); // 32
        System.out.println("integerNumber.MIN_VALUE = " + integerNumber.MIN_VALUE); // -2147483648
        System.out.println("integerNumber.MAX_VALUE = " + integerNumber.MAX_VALUE); // 2147483647

        Short shortNumber = 10;
        System.out.println("shortNumber.BYTES = " + shortNumber.BYTES); // 2
        System.out.println("shortNumber.SIZE = " + shortNumber.SIZE); // 16
        System.out.println("shortNumber.MIN_VALUE = " + shortNumber.MIN_VALUE); // -32768
        System.out.println("shortNumber.MAX_VALUE = " + shortNumber.MAX_VALUE); // 32767

        Byte byteNumber = 10;
        System.out.println("byteNumber.BYTES = " + byteNumber.BYTES); // 1
        System.out.println("byteNumber.SIZE = " + byteNumber.SIZE); // 8
        System.out.println("byteNumber.MIN_VALUE = " + byteNumber.MIN_VALUE); // -128
        System.out.println("byteNumber.MAX_VALUE = " + byteNumber.MAX_VALUE); // 127

//        Error: not defined in String
//        String string = "10";
//        System.out.println("string.BYTES = " + string.BYTES);
//        System.out.println("string.SIZE = " + string.SIZE);
//        System.out.println("string.MIN_VALUE = " + string.MIN_VALUE);
//        System.out.println("string.MAX_VALUE = " + string.MAX_VALUE);
    }
}
