package workingWithMethodsAndEncapsulation;

public class StaticBlock {
    static{
        x=10;//x is non-static
        y=5;//know y because it's static
    }
    static int x;
    final static int y;//Here it's legal initialize a final variable this way, because it's static and has a default value.
    public static void main(String[] args) {
        try{
            StaticBlock sb = new StaticBlock();
            int c = sb.x/y;
            System.out.println(c);
        } catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
    }
}
