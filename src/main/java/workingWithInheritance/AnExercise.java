package workingWithInheritance;

class Person {
    int age;
    String name;
    public void read() {
        System.out.println("Person is reading");
    }
    private void other(){};
}

class Livera extends Person {
    Livera(String s, int i) {
        age = i;
        name = s;
    }
    public void read() {
        System.out.println(name + " is reading");
    }
    public void other()throws Exception{}
}

public class AnExercise {
    public static void main(String[] args) {
        Livera s = new Livera("Livera", 22);
        Person p = s; //We create the object Livera just ONE time. So p==s.
        s.read();
        p.read();
    }
}
