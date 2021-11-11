package workingWithJavaAPI;

import java.io.FileNotFoundException;
import java.io.IOException;

public class WorkingWithStringBuilder {
    public static void main(String[] args)throws IOException {
        StringBuilder sb = new StringBuilder("Java");
        sb.insert(0,"The latest").append("version is").append(" 1.7").delete(27,28).append("8").substring(4);
        // substring returns a NEW String that contains a subsequence of characters starting at position 4.
        // But it doesn't replace, it just returns a new String.

        StringBuilder sb2= new StringBuilder("Whiz");
        sb2.append(new char[]{'l','a','b'},0,2);
        System.out.println(sb2);

        StringBuilder sb3= new StringBuilder("Whiz");
        sb3.delete(2,3);
        System.out.println("sb3 = " + sb3);

        StringBuilder sb4 = new StringBuilder(4);
        StringBuilder sb5 = new StringBuilder("abcd"); //Initial capacity = 16 + 4 chars by constructor = 20
        System.out.println("sb4.capacity() = " + sb4.capacity()); // 4
        System.out.println("sb5.capacity() = " + sb5.capacity()); // 20

        StringBuilder sb6 = new StringBuilder("Abcdefg");
        char[] ch = new char[4];
//        sb6.getChars(1, 5, ch, 1);// srcBegin:1, srcEnd:5, charDest:ch, dstBegin:1//FAILS: out of bounds
        for (char c: ch) {
            System.out.println(c);
        }

        String stringJoin = String.join("-", "1", "1");
        System.out.println("stringJoin = " + stringJoin); //returns 1-1

        StringBuilder sb7 = new StringBuilder("123456"); // Initial capacity is 16 + 6 length constructor = 22
        sb7.ensureCapacity(35); //twice old capacity + 2. (22*2+2)
        System.out.println("sb7.capacity() = " + sb7.capacity());
        sb7.ensureCapacity(22); // already have more capacity, do not make effect.
        System.out.println("sb7.capacity() = " + sb7.capacity());

        StringBuilder sb8 = new StringBuilder("Hola test");
        sb8.setLength(2);
        System.out.println(sb8);

        StringBuilder sbCompare1 = new StringBuilder("Java");
        StringBuilder sbCompare2 = new StringBuilder("Java");
        System.out.println("sbCompare1==sbCompare2 = " + (sbCompare1==sbCompare2));
        System.out.println("sbCompare1.equals(sbCompare2) = " + sbCompare1.equals(sbCompare2));
        System.out.println("sbCompare1.toString().equals(sbCompare2.toString()) = " + sbCompare1.toString().equals(sbCompare2.toString()));


    }
}
