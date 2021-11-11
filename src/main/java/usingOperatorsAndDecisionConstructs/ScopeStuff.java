package usingOperatorsAndDecisionConstructs;

public class ScopeStuff {
    static{
        int x = 15; //Initialized here, it'll only exists inside this block
        x++;
    }
    static{
//        System.out.println(x);//static variable x not exists yet
        x = 4;//it compiles
//        System.out.println(x);//no compile. Ilegal forward reference
    }
    static int x=20;//Initialized here, it's an static variable
    public static void main(String[] args) {
        System.out.println("Execution number 4: "+x);//prints the static variable
    }
    static int y=1;
    static{
        System.out.println("Execution number 1: "+x);//prints the static variable
        int x = 99;//static variable shadowing
        System.out.println("Execution number 2: "+x);//prints 99, the local variable
    }
    static{
        x += y;//use the static variables
        System.out.println("Execution number 3: "+x); //prints the static variable
    }
}
