import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int elementsQuantity = 10000000;

        for (int i=0; i<=elementsQuantity; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        System.out.println("Size of lists: " + elementsQuantity + " elements.");

        System.out.println("\n*** Obtaining elements");
        // Near finishing
        _obtainElementAtPosition(arrayList, linkedList, (int)Math.round(elementsQuantity*0.9));
        // Near beginning
        _obtainElementAtPosition(arrayList, linkedList, (int)Math.round(elementsQuantity*0.1));
        // In the middle
        _obtainElementAtPosition(arrayList, linkedList, (int)Math.round(elementsQuantity*0.5));

        System.out.println("\n*** Removing elements");
        // Near finishing
        _removeElementAtPosition(arrayList, linkedList, (int)Math.round(elementsQuantity*0.9));
        // Near beginning
        _removeElementAtPosition(arrayList, linkedList, (int)Math.round(elementsQuantity*0.1));
        // In the middle
        _removeElementAtPosition(arrayList, linkedList, (int)Math.round(elementsQuantity*0.5));

        System.out.println("\n*** Modifying elements");
        // Near finishing
        _modifyElementAtPosition(arrayList, linkedList, (int)Math.round(elementsQuantity*0.9));
        // Near beginning
        _modifyElementAtPosition(arrayList, linkedList, (int)Math.round(elementsQuantity*0.1));
        // In the middle
        _modifyElementAtPosition(arrayList, linkedList, (int)Math.round(elementsQuantity*0.5));

        System.out.println("\n*** Adding one element");
        _addNewElement(arrayList, linkedList);

        System.out.println("\n*** Adding one element at start");
        _addNewElementAtStart(arrayList, linkedList);

        System.out.println("\n*** Adding few elements");
        _addFewElements(arrayList, linkedList, elementsQuantity);

        System.out.println("\n*** Adding a lot of elements");
        _addALotOfElements(arrayList, linkedList, elementsQuantity);

    }

    private static void _obtainElementAtPosition(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList, int position) {
        final long startTimeLL = System.nanoTime();
        linkedList.get(position);
        final long endTimeLL = System.nanoTime();

        final long startTimeAL = System.nanoTime();
        arrayList.get(position);
        final long endTimeAL = System.nanoTime();

        _printResults(endTimeAL - startTimeAL, endTimeLL - startTimeLL, "obtaining elements at position ["+position+"]");
    }

    private static void _removeElementAtPosition(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList, int position) {
        final long startTimeLL = System.nanoTime();
        linkedList.remove(position);
        final long endTimeLL = System.nanoTime();

        final long startTimeAL = System.nanoTime();
        arrayList.remove(position);
        final long endTimeAL = System.nanoTime();

        _printResults(endTimeAL - startTimeAL, endTimeLL - startTimeLL, "removing elements at position ["+position+"]");
    }

    private static void _modifyElementAtPosition(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList, int position) {
        final long startTimeLL = System.nanoTime();
        linkedList.set(position, 123);
        final long endTimeLL = System.nanoTime();

        final long startTimeAL = System.nanoTime();
        arrayList.set(position, 123);
        final long endTimeAL = System.nanoTime();

        _printResults(endTimeAL - startTimeAL, endTimeLL - startTimeLL, "modifying elements at position ["+position+"]");
    }

    private static void _addNewElement(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList) {
        final long startTimeLL = System.nanoTime();
        linkedList.add(1);
        final long endTimeLL = System.nanoTime();

        final long startTimeAL = System.nanoTime();
        arrayList.add(1);
        final long endTimeAL = System.nanoTime();

        _printResults(endTimeAL - startTimeAL, endTimeLL - startTimeLL, "adding one element");
    }

    private static void _addNewElementAtStart(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList) {
        final long startTimeLL = System.nanoTime();
        linkedList.add(0, 1);
        final long endTimeLL = System.nanoTime();

        final long startTimeAL = System.nanoTime();
        arrayList.add(0, 1);
        final long endTimeAL = System.nanoTime();

        _printResults(endTimeAL - startTimeAL, endTimeLL - startTimeLL, "adding one element at start");
    }

    private static void _addFewElements(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList, int size) {
        int quantityOfElements = (int) Math.round(size*0.01);
        final long startTimeLL = System.nanoTime();
        for (int i=0; i<quantityOfElements; i++) {
            linkedList.add(i);
        }
        final long endTimeLL = System.nanoTime();

        final long startTimeAL = System.nanoTime();
        for (int i=0; i<quantityOfElements; i++) {
            arrayList.add(i);
        }
        final long endTimeAL = System.nanoTime();

        _printResults(endTimeAL - startTimeAL, endTimeLL - startTimeLL, "adding few elements ("+quantityOfElements+")");
    }

    private static void _addALotOfElements(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList, int size) {
        int quantityOfElements = (int) Math.round(size*0.9);
        final long startTimeLL = System.nanoTime();
        for (int i=0; i<quantityOfElements; i++) {
            linkedList.add(i);
        }
        final long endTimeLL = System.nanoTime();

        final long startTimeAL = System.nanoTime();
        for (int i=0; i<quantityOfElements; i++) {
            arrayList.add(i);
        }
        final long endTimeAL = System.nanoTime();

        _printResults(endTimeAL - startTimeAL, endTimeLL - startTimeLL, "adding a lot of elements ("+quantityOfElements+")");
    }

    private static void _printResults(long diffAL, long diffLL, String description) {
        String alWinner = "";
        String llWinner = "";
        if (diffAL < diffLL) {
            alWinner="[*] " ;
        } else {
            llWinner="[*] ";
        }

        System.out.println(alWinner + "ArrayList time " + description + ": " + diffAL);
        System.out.println(llWinner + "LinkedList time " + description + ": " + diffLL);
    }
}
