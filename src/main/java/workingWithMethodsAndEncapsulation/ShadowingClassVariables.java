package workingWithMethodsAndEncapsulation;

public class ShadowingClassVariables {
    static int x=2;
    static int z;

    public static void main(String[] args) {
        System.out.println("START psvm method, value of x="+x+" value of z="+z);
        System.out.println("x+z = " + (x+z));
        System.out.println("Creating object...");
        ShadowingClassVariables obj = new ShadowingClassVariables();
        System.out.println("x+z = " + (x+z));

        /*
         * Output:
         * START static block, value of x=2 value of z=0
         * END static block, value of x=3 value of z=3
         * START second static block, value of x=2 value of z=3
         * END static block, value of x=7 value of z=3
         * START psvm method, value of x=2 value of z=3
         * x+z = 5
         * Creating object...
         * START block,  value of x=2 value of z=3
         * END block,  value of x=9 value of z=9
         * x+z = 11
         */
    }

    static {
        System.out.println("START static block, value of x="+x+" value of z="+z);
        int x=3;//variable shadowing, it's ok. This variable will only exists inside this block.
        z=x;//change the static variable z, at the end of this block, variable x will no longer exists.
//        int x=5;//Variable 'x' is already defined in the scope.
        System.out.println("END static block, value of x="+x+" value of z="+z);
    }

    {
        System.out.println("START block,  value of x="+x+" value of z="+z);
        int x = 9;//shadowing variable
        z=x;
        System.out.println("END block,  value of x="+x+" value of z="+z);
    }

    static {
        System.out.println("START second static block, value of x="+x+" value of z="+z);
        int x=7;//variable shadowing, it's ok. This variable will only exists inside this block.
        System.out.println("END static block, value of x="+x+" value of z="+z);
    }
}
