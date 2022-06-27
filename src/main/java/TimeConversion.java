import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class TimeConversion {
    public static void main(String[] args){
        String s = "12:05:39AM";
        String ampm = s.substring(8,10);
        String time = s.substring(0,8);
        String hour = s.substring(0,2);
        String minutes = s.substring(2,8);

        if (ampm.equals("PM") && !hour.equals("12")) {
            System.out.println(Integer.valueOf(hour) + 12 + minutes);
        } else if (ampm.equals("PM") && hour.equals("12")) {
            System.out.println("12" + minutes);
        } else if (ampm.equals("AM") && hour.equals("12")) {
            System.out.println("00" + minutes);
        } else if (ampm.equals("AM") && !hour.equals("12")) {
            System.out.println(hour + minutes);
        } else {
            System.out.println(Integer.valueOf(hour) + 12 + minutes);
        }
    }
}
