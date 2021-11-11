/*
 * Consider the following code:
 */

package workingWithInheritance;

class A{
    public double m1(int a){
        return a*10/4-30;
    }
}
class A2 extends A{
    public double m1(int a){
        return a*10/4.0;
    }
}

/*
 * What can be substituted for XXX and YYY so that it can compile without any problems?
 * int, int
 * --- a*10/4.0; generates a double so, A2's m1() cannot return an int. (It will need a cast otherwise:
 * --- return (int) (a*10/4.0);)
 *
 * int, double
 * --- The return type should be same for overridden and overriding method.
 *
 * double, double
 * --- a*10/4-30; generates an int which can be returned as a double without any cast.
 *
 * double, int
 * --- The return type should be same for overridden and overriding method.
 *
 * Nothing, they are simply not compatible.
 *
 *
 * Explanation:
 * Note that when a method returns objects (as opposed to primitives, like in this question), the principle of covariant
 * returns applies. Meaning, the overriding method is allowed to return a subclass of the return type defined in the
 * overridden method. Thus, if a base class's method is: public A m(); then a subclass is free to override it with:
 * public A1 m(); if A1 extends A.
 */