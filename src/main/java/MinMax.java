import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinMax {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(
            Arrays.asList(2,14,61,3,83,4,1,82,5,1,65,34,21,65)
        );
        int k = 4;
        List<Integer> selectedElements = new ArrayList<Integer>();
        Collections.sort(arr);
        for (int i=0; i<k; i++) {
            selectedElements.add(arr.get(i));
        }
        Integer max = Collections.max(selectedElements);
        Integer min = Collections.min(selectedElements);
        System.out.println(max-min);
    }
}
