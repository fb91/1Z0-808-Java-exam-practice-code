package constructors;

class Person {
    Person(String s) { super(); }
}

class Employee extends Person {
    Employee(String s) {
        super("");
        System.out.println(s);
    }
    private Employee(String a,int as){
        super(a);
    }
    Employee(){
        this("Kent");
    }
    //some code...

}

public class PersonPrintingKent {
    public static void main(String[] args) {
        Person ab = new Employee();
    }
}
