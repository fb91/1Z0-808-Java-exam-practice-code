package workingWithInheritance;

public class Question4 {
    public static void main(String[] args) {
        System.out.println(In2.print());
    }
}

interface In1 {
    public static void print() {
        System.out.println("In1");
    }
}

interface In2 extends In1 {
    static String print() {
        return "In2";
    }
}