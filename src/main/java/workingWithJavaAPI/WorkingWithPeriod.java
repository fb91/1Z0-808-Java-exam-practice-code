package workingWithJavaAPI;

import java.time.Period;

public class WorkingWithPeriod {
    public static void main(String[] args) {
        Period p = Period.ofMonths(13);
        System.out.println("p.normalized() = " + p.normalized());
    }
}
