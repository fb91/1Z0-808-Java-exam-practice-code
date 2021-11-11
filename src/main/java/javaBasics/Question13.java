package javaBasics;

public class Question13 {
    int x = 5;
    int y = 5;

    public static void main(String[] args) {
        new Question13().print(2);
    }
    public void print(int x) {
        System.out.println(x+y);
        int y = 4;
    }

    public static void printStatic(int x) {
//        System.out.println(x+y);//y is not static
        int y = 4;
    }
}
