package workingWithMethodsAndEncapsulation;

public class Question54 {
//    int _ = $; //Works in Java 8. Since Java 9, '_' is a keyword and may not be used as an identifier.
    int a_ = $;
    static int $ = 2;

    public static void main(String[] args) {
        System.out.println($ + new Question54().a_);
    }
}
