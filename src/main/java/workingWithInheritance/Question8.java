package workingWithInheritance;

public class Question8 {
    public static void main(String[] args) {
        Ab ab = new Sub();
//        ab.print();
    }
}

class Ab {
    private final void print() {
        System.out.println("class Ab");
    }
}

class Sub extends Ab {
    private void print() { //There is no oveeride problem, because method "print" of class Ab is private.
        // It's impossible to override because the method is not inherited.
        System.out.println("class Sub");
    }
}
