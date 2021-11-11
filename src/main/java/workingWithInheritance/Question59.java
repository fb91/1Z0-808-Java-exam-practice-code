package workingWithInheritance;

public class Question59 {
    public static void main(String[] args) {
        PersonQ59 p = new StudentQ59("Livera");
        System.out.println("p.getName() = " + p.getName());
    }
}

abstract class PersonQ59 {
    protected String name;
    PersonQ59(String s) {
        name = s;
    }
    public abstract String getName();
}

class StudentQ59 extends PersonQ59 {
    StudentQ59(String s) {
        super(s);// Without this line, compilation fails.
    }
    public String getName() {
        return name;
    }
}
