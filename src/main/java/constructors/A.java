/*
 * Given the following code, which of these constructors can be added to class B without causing a compile time error?
 */

package constructors;

import java.io.IOException;
import java.time.LocalDate;

class A{
    int i;
    public A(int x) {
        LocalDate ld = LocalDate.now();
        String asd = "asd";
        asd.concat("asd");
        this.i = x;
    }
}
class B extends A{
    int j;
    public B(int x, int y) {
        super(x);
        this.j = y;
    }
}

class ClassName {
    public String name = "asd";
    protected void ClassName() {
        //this is a simple method, no the constructor
    }
}

class D {
    public static void main(String... args) {
        ClassName c = new ClassName();
        System.out.println((true|false^true));
        System.out.println((true|false)^true);
        System.out.println(c.name);
        try {
            metodo();
        } catch (Exception e) {

        }
        L1:for (int i=0;i<10; i++){
            L2: for(int j=0;j<5;i++) {
                System.out.println(""+i+j);
                if(j==0)continue L1;
            }
        }

    }

    public static int metodo() throws NullPointerException {
        try{
            throw new NullPointerException("sarasa");
        } catch(ClassCastException e) {
            System.out.println("catch");
        }
        finally{
            System.out.println("pepe");
        }
        return 1;

    }
}

/*Answers:
 * B( ) { }
 * B(int y ) { j = y; }
 * B(int y ) { super(y*2 ); j = y; } <---- Correct
 * B(int y ) { i = y; j = y*2; }
 * B(int z ) { this(z, z); } <------------ Correct
 *
 * Explanation:
 * 1. To construct an instance of a sub class, its super class needs to be constructed first. Since an instance can
 * only be created via a constructor, some constructor of the super class has to be invoked. Either you explicitly call
 * it or the compiler will add super() (i.e. no args constructor) as the first line of the sub class constructor.
 * Now, if the super class ( here, A ) does not have a no args constructor, the call super() will fail. Hence, choices
 * B( ) { }, B(int y ) { j = y; } and B(int y ) { i = y; j = y*2; } are not valid and choice
 * B(int y ) { super(y*2 ); j = y; } is valid because it explicitly calls super( int ) which is available in A.
 *
 * 2. Instead of calling super(...) you can also call another constructor of the base class in the first line (as given
 * in choice B(int z ) { this(z, z); } ). Here, this(int, int) is called in the first line which in turn calls
 * super(int). So the super class A is correctly instantiated.
 */
