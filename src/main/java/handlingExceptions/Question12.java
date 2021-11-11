package handlingExceptions;

public class Question12 {

    public static void main(String[] args) {
        try {
            print();
        } catch (Exception e) {}
    }

    static void print() {
        try {
            throw new NullPointerException();
        } catch (ClassCastException e) {
            System.out.print("Class Cast ");
        } finally {
            System.out.print("Final ");
        }
        System.out.print("OCAJP ");
    }
}
