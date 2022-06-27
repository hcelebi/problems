import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.IntStream;

public class MiniMaxSum {
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(1,9,5,3,7);
        Collections.sort(arr);

        long minSum = IntStream.range(0, arr.size()).filter(value -> value < 4).mapToLong(value -> arr.get(value)).sum();
        long maxSum = IntStream.range(1, arr.size()).filter(value -> value < 5).mapToLong(value -> arr.get(value)).sum();
        System.out.println(minSum);
        System.out.println(maxSum);
    }
}
