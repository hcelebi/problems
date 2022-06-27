import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(11,2,4));
        arr.add(Arrays.asList(4,5,6));
        arr.add(Arrays.asList(10,8,-12));

        Integer primaryDiagonalSum = 0;
        Integer secondaryDiagonalSum = 0;

        for (int i=0; i< arr.size(); i++) {
            primaryDiagonalSum = arr.get(i).get(i) + primaryDiagonalSum;
            secondaryDiagonalSum = arr.get(i).get(((arr.size()-1)) - i) + secondaryDiagonalSum;
        }

        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));

    }
}
