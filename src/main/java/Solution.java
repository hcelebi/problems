import java.util.Map;

public class Solution {
    private final static Map<Integer, String> romanCharMap = Map.of(
            1, "I",
            5, "V",
            10, "X",
            50, "L",
            100, "C",
            500, "D",
            1000, "M"
    );

    public String intToRoman(Integer integer) {
        if (romanCharMap.get(integer) != null){
            return romanCharMap.get(integer);
        }
        if (integer < 10) {
            if (integer % 5 > 0) {

                return "romanCharMap.get(5)";
            }
        }
        return "";
    }

}
