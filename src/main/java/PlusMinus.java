import java.text.DecimalFormat;
import java.util.*;

public class PlusMinus {
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(-4 , 3,  -9, 0, 4, 1);
        LinkedHashMap<String, Integer> stack = new LinkedHashMap<>();
        stack.put("positive", 0);
        stack.put("negative", 0);
        stack.put("zero", 0);

        arr.forEach(integer -> {
            if (integer > 0) {
                stack.put("positive", stack.get("positive") + 1);
            } else if (integer == 0) {
                stack.put("zero", stack.get("zero") + 1);
            } else {
                stack.put("negative", stack.get("negative") + 1);
            }
        });

        DecimalFormat decimalFormat = new DecimalFormat("#0.000000");
        stack.forEach((s, integer) -> {
            System.out.println(s + ":" +  decimalFormat.format((float) integer / arr.size()));
        });
    }
}
