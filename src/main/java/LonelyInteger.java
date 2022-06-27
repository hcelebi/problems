import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,1);
        HashMap<Integer, Integer> stack = new HashMap<>();
        arr.forEach(integer -> {
            if (stack.get(integer) != null) {
                stack.put(integer, stack.get(integer) + 1);
            } else {
                stack.put(integer, 1);
            }
        });
        if (stack.size() == 1) {
            System.out.println(stack.entrySet().stream().map(Map.Entry::getKey).findFirst().get());
            return;
        }

        System.out.println(
                stack.entrySet().stream().filter(
                        integerIntegerEntry -> integerIntegerEntry.getValue() == 1
                ).map(Map.Entry::getKey).findFirst().get()
        );
    }
}
