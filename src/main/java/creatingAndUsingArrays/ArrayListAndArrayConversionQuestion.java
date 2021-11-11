package creatingAndUsingArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAndArrayConversionQuestion {
    public static void main(String[] args) {
        int a = 053;
        int b = 43;
        B b1 = new B("Pepe");
        B b2 = b1;
        b2.name = "Luis";
        Double d1 = 0.0/0.0;
        System.out.println(d1 instanceof Object);
        System.out.println("d1 = " + d1);
        System.out.println("b1.name = " + b1.name);
        System.out.println("b2.name = " + b2.name);
        System.out.println(a==b);
        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("coke");
        myArray.add("pepsi");
        myArray.add("miranda");

        System.out.println("Total Array List ::" + myArray);
        String[] ws1 = new String[myArray.size()];
        String[] ws2 = myArray.toArray(ws1);
        System.out.println("ws1==ws2:"+(ws1==ws2));
        System.out.println("ws1:" + Arrays.toString(ws1));
        System.out.println("ws2:" + Arrays.toString(ws2));

        ws1 = new String[1];
        ws1[0]="Test Data";
        ws2=myArray.toArray(ws1);

        System.out.println("ws1==ws2:" + (ws1==ws2));
        System.out.println("ws1:" + Arrays.toString(ws1));
        System.out.println("ws2:" + Arrays.toString(ws2));
    }
}

class A {
    String name;
    A(){
        super();
    }
}
class B extends A{
    B(String a){
        StringBuilder sb=new StringBuilder();
        System.out.println(a);
        this.name=a;
    }
}