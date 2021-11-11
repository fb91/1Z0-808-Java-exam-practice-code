package constructors;

public class ExerciseSupSubSub {
    public static void main(String[] args) {
        //System.out.println(new SubSub().s);
        System.out.println("valor de s="+new SubSub(3).s);
        Integer wi = 0b1;
        Integer wi2 = 03;
        Integer wi3 = 0x3;
//      Integer wiOctal = 0328;
        Character c = 'a';
//      Character c1 = "a";
        Double d = 12d;
//      Double d2 = 12f;
//      Double d3 = 12;
//      Double d4 = "23";
        Float f = 2f;
//      Float f2 = 2;
//      Float f3 = 032;

        int x = 1;
        int y = 2;
        int z = 3;

        System.out.println((z/y)+z*2);
        System.out.println(z/(y+z)*2);
        System.out.println((z/y+z)*2);
        System.out.println(z/y+z*2);

        System.out.println();

    }
}

class Sup {
    String s = "";
    Sup() {
        s += "sup ";
    }
    Sup(int a) {
        System.out.println("constructor Sup(int a)");
    }
}

class Sub extends Sup {
    Sub() {
        s += "sub";
    }
}

class SubSub extends Sup {
    SubSub() {
        super();
        s += "subsub";
    }

    SubSub(int num) {
        //super(num);
        s+="constructor con suma";
    }
}
