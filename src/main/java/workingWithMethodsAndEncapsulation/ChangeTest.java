/*
 * What will the following program print when run?
 */

package workingWithMethodsAndEncapsulation;

public class ChangeTest {

    private int myValue = 0;

    public void showOne(int myValue){
        myValue = myValue;
    }

    public void showTwo(int myValue){
        this.myValue = myValue;
    }

    public static void main(String[] args) {
        ChangeTest ct = new ChangeTest();
        ct.showTwo(200);
        System.out.println(ct.myValue);
        ct.showOne(100);
        System.out.println(ct.myValue);
    }
}







/*
 * Answers:
 * 0 followed by 100.
 * 100 followed by 100.
 * 0 followed by 200.
 * 100 followed by 200.
 * 200 followed by 200. <----- Correct
 * 200 followed by 100
 *
 * Explanation:
 * There are a couple of important concepts in this question:
 *
 * 1. Within an instance method, you can access the current object of the same class using 'this'. Therefore, when you
 * access this.myValue, you are accessing the instance member myValue of the ChangeTest instance.
 *
 * 2. If you declare a local variable (or a method parameter) with the same name as the instance field name, the local
 * variable "shadows" the member field. Ideally, you should be able to access the member field in the method directly
 * by using the name of the member (in this example, myValue). However, because of shadowing, when you use myValue, it
 * refers to the local variable instead of the instance field.
 *
 * In showTwo method, there are two variables accessible with the same name myValue. One is the method parameter and
 * another is the member field of ChangeTest object. Ideally, you should be able to access the member field in the
 * method directly by using the name myValue but in this case, the method parameter shadows the member field because it
 * has the same name. So by doing this.myValue, you are changing the instance variable myValue by assigning it the value
 * contained in local variable myValue, which is 200. So in the next line when you print ct.myValue, it prints 200.
 *
 * Now, in the showOne method also, there are two variables accessible with the same name myValue. One is the method
 * parameter and another is the member field of ChangeTest object. So when you use myValue, you are actually using the
 * method parameter instead of the member field.
 *
 * Therefore, when you do : myValue = myValue; you are actually assigning the value contained in method parameter
 * myValue to itself. You are not changing the member field myValue. Hence, when you do System.out.println(ct.myValue);
 * in the next line, it still prints 200.
 *
 */