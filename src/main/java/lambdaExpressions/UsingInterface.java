package lambdaExpressions;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UsingInterface {
    public static void main(String[] args) {
        Runnable run = () -> System.out.println("Run");
    }
}

// Interface funcional
interface Runnable {
    public void run();
}
