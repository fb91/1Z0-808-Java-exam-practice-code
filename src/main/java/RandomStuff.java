import java.io.IOException;
import java.util.*;

public class RandomStuff {
    static Integer istatic;
    public static void main(String[] args) {
        RandomStuff a1 = new RandomStuff();
        Integer wi;
//        Integer wii = new Integer;// ( expected
        Integer wii = new Integer(1);//deprecated but it works
        int i;
//        System.out.println(wi);//variable wi not initialized
        System.out.println(wii);
        float mifloatvar = 4f;
        double midoublevar = 4.5;
        long milongvar = 4l;
        String anString = "hello";
//        switch(mifloatvar){}//float not allowed
//        switch(midoublevar){}//double not allowed
//        switch(milongvar){}//long not allowed
//        float, double and long can not be used in switch, and neither in case statement

        //ok
        System.out.println();
        //Not ok
//        System.out.println(null);
        System.out.println(new Date());
//        System.out.println(a1.print(2));

        String myString = "Hello world";
       // myString = myString.substring(myString.indexOf("hello"), myString.lastIndexOf("World"));
        //Runtime exception: java.lang.StringIndexOutOfBoundsException: begin -1, end -1, length 11

        int x1=-10;
        int x2=10;
        System.out.println("10%(3) = "+10%(3));
        System.out.println("10%(-3) = "+10%(-3));
        System.out.println("-10%(-3) = "+(-10%(-3)));
        
        int a[]={1,2,3};
        System.out.println("RANDOM");
        for(int i2=0;i2<30;i2++){
            System.out.println((int)(Math.random()*6)+1);
        }

        int var1,var2=100; //var1 is not initialized. Only var2 is initialized.

       //Switch statement only accepts: char, byte, short, int, Character, Byte, Short, Integer, String, Enum.
       //So, the next statements are not allowed:
//        switch(2L){}
//        switch(true){}
//        switch (2.0f){}
//        switch(2.0d){}

    }

    void print(int i, final int a) {
        System.out.println("i="+i);
    }

}
