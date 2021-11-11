package abstractClass;

public class Substraction extends Operation {

    private int avalue;

    public int getAvalue() {
        return avalue;
    }


    @Override
    public int compute(int a, int b) {
        return a - b;
    }
}
