package abstractClass;

public class MainOperations {
    public static void main(String[] args) {
        String operation = "1 * 2";
        String[] elements = operation.split(" ");
        Integer leftOp = Integer.parseInt(elements[0]);
        String sign = elements[1];
        Integer rightOp = Integer.parseInt(elements[2]);
        Operation op = Operation.of(sign);
        System.out.println(op.compute(leftOp, rightOp));
    }
}
