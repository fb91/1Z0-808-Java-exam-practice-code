package workingWithMethodsAndEncapsulation;

public class ItMayNotBeInitialized {
    int i = 10;

    public static void main(String[] args) {
        int i;
        if (new ItMayNotBeInitialized().go(10)) i = 5;
//        System.out.print(i); // Variable 'i' might not have been initialized.
    }

    boolean go(int y) {
        if (y>5) return true;
        else return false;
    }
}
