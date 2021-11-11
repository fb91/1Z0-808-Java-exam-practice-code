import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class OrderedGrid {
    public static void main(String[] args) {
        List<String> myGrid = new ArrayList<>();
        myGrid.add("mpxz");
        myGrid.add("abcd");
        myGrid.add("wlmf");
        System.out.println(gridChallenge(myGrid));
    }

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        int height = grid.size();
        int width = grid.get(0).length();
        Boolean isOrdered = Boolean.TRUE;
        for (int i = 0; i < height; i++) {
            char[] charsArr = grid.get(i).toCharArray();
            Arrays.sort(charsArr);
            grid.set(i, String.valueOf(charsArr));
        }
        for (int i = 0; i < width; i++) {
            // Prepare String for col i
            StringBuilder column = new StringBuilder(height);
            for (int j = 0; j < height; j++) {
                column.append(grid.get(j).charAt(i));
            }
            char[] auxColumnCharArr = column.toString().toCharArray();
            Arrays.sort(auxColumnCharArr);
            String orderedColumn = String.valueOf(auxColumnCharArr);
            if (!column.toString().equals(orderedColumn)) {
                isOrdered = Boolean.FALSE;
                break;
            }
        }
        return isOrdered ? "YES" : "NO";
    }
}
