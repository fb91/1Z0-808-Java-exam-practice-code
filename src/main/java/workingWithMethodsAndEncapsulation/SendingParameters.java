package workingWithMethodsAndEncapsulation;

public class SendingParameters {

    public static void main(String[] args) {
        float floatPrimitive = 5;
//        Float floatWrapper = 5;//wrappers only accept their primitive
        Float floatWrapper = 5f;
        new SendingParameters().printsFloatW(floatPrimitive);
        new SendingParameters().printsFloat(floatWrapper);
        new SendingParameters().printsFloat((float)4.934);

        SendingParameters object = new SendingParameters();
        object.printsDouble(2.0);
        object.printsDouble(2.0d);
        object.printsDouble(floatWrapper);
        Double doubleNumberW = 5d;
        object.printsDouble(doubleNumberW);
        object.printsDoubleW(doubleNumberW);

        object.printsInteger(5);
        object.printsInteger(0x5F);
        object.printsInteger(0b10101);
        object.printsInteger(05);

        object.printsShort((short)2);

//        object.printsInteger(45l);
//        object.printsShort(3);
    }


    private void printsFloat(float number) {
        System.out.println("printsFloat " + number);
    }

    private void printsFloatW(Float number) {
        System.out.println("printsFloatW " + number);
    }

    private void printsDouble(double number) {
        System.out.println("number " + number);
    }

    private void printsDoubleW(Double number) {
        System.out.println("printsDoubleW " + number);
    }

    private void printsInteger(int number) {
        System.out.println("printsInteger " + number);
    }

    private void printsIntegerW(Integer number) {
        System.out.println("printsIntegerW " + number);
    }

    private void printsShort(short number) {
        System.out.println("printsShort " + number);
    }


}


