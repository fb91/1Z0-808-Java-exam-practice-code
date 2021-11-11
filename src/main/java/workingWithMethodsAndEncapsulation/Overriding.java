package workingWithMethodsAndEncapsulation;

public class Overriding {
    public static void main(String[] args) {
        Base b1 = new SubClass();
        SubClass b2 = new SubClass();
        System.out.println("SubClass.printStatic() = " + SubClass.printStatic());   // SubClass
        System.out.println("Base.printStatic() = " + Base.printStatic());           // Base
        System.out.println("b1.printInstance() = " + b1.printInstance());           // SubClass
        System.out.println("b2.printInstance() = " + b2.printInstance());           // SubClass

        /* Static methods cannot be overridden */
    }
}

class Base {
    public static String printStatic() {
        return "Base";
    }
    public String printInstance() {
        return "SubClass";
    }
}

class SubClass extends Base {
    public static String printStatic() {
        return "SubClass";
    }
    public String printInstance() {
        return "SubClass";
    }
}
