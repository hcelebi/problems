import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class CountingSort {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,1,3,2,1);
        Integer maxValue = arr.stream().max(Integer::compareTo).get();
        List<Integer> frequencyStack = new ArrayList<>();
        List<Integer> sortedArr = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int finalI = i;
            long count = arr.stream().filter(integer -> integer.equals(finalI)).count();
            frequencyStack.add((int) count);
        }


        IntStream.range(0, frequencyStack.size()).forEach(value -> {
            if (frequencyStack.get(value) > 0) {
                for (int i = 0; i < frequencyStack.get(value); i++) {
                    sortedArr.add(value);
                }
            }
        });



        System.out.println(frequencyStack);
        System.out.println(frequencyStack);
    }
}
