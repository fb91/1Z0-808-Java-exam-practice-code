package workingWithJavaAPI;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithArrayList {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(3);
        ints.add(4);
        ints.add(2,3); // index 2, element 3. It ADDS, no replace.
        ints.removeIf(e -> e<3);
        System.out.println("ints = " + ints);

        List list = new ArrayList<>();
        list.add(5);
        list.add(5);
//        System.out.println(Integer.max(list.get(0), 1));
//        Compilation fails, list.get(0) is an Object, not an Integer

        List list2 = new ArrayList(1);
        list2.add(1);
        list2.add("A");
        list2.add(new Integer(5));
        System.out.println("list2 = " + list2);
    }
}
