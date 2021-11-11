package usingOperatorsAndDecisionConstructs;

public class TernaryEquivalent {
    public static void main(String[] args) {
        int x = 10;
        if (x > 10) {
            System.out.println(">");
        } else if (x < 10) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }

        // Write an equivalente code.
        // Answer:
        System.out.println(x>10?">":x<10?"<":"=");
    }
}
