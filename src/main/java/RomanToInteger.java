import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RomanToInteger {

    private final static Map<String, Integer> romanCharMap = Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000
    );

    public int convert(String s) {
        Integer[] integers = new Integer[s.length()];
        for (int i = 0; i < s.length(); i++) {
            integers[i] = romanCharMap.get(String.valueOf(s.charAt(i)));
        }

        List<Integer> stack = new ArrayList<>();
        for (int i = 0; i < integers.length; i++) {
            try {
                if (integers[i] >= integers[i+1]) {
                    stack.add(integers[i]);
                } else {
                    stack.add(integers[i+1] - integers[i]);
                    i++;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                stack.add(integers[i]);
            }
        }

        if (stack.size() == 1) {
            return stack.get(0);
        } else if (integers.length == 2 && stack.get(0) < stack.get(1)) {
            return stack.get(1) - stack.get(0);
        } else {
            return stack.stream().mapToInt(value -> value.intValue()).sum();
        }
    }
}
