package interfaces;

public class OverrideDefault implements Walk,Run {
    @Override
    public int getSpeed() {
        return Run.super.getSpeed();
    }

    public static void main(String[] args) {
        OverrideDefault a = new OverrideDefault();
        System.out.println(a.getSpeed());
    }

    @Override
    public void nothing2() {

    }
}

interface Walk {
//    public default int getSpeed() {
//        return 10;
//    }
}

interface Run {
    public default int getSpeed() {
        return 15;
    }

    public static void main(String[] args) {
        System.out.println("sarasa");
    }

    default void nothing(){};//no abstract method (it has body)
    public void nothing2();//abstract method
}

abstract interface I {
    default void some(){};
}
