package workingWithInheritance;

class ParentClass {
    String name;
    void method() {
        System.out.println("Method from Parent");
    }
}

class Child extends ParentClass {
    int id;
    void method() {
        System.out.println("Method from Child");
    }
    void newMethod(){
        System.out.println("method from child!");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        //Upcasting implicitly:
        ParentClass p = new Child();

        p.name = "Fabri";
        System.out.println(p.name);
        p.method();

        // Downcasting implicity (ERROR):
//        Child cc = p; //error: incompatible types: ParentClass cannot be converted to Child
//        Child ccc = new ParentClass(); //error: incompatible types: ParentClass cannot be converted to Child
        // Downcasting explicitly:
        Child c = (Child)p;

        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
    }
}