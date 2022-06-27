import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CeaserChiper {
    public static void main(String[] args) {
        String s = "Ciphering.";
        Integer k = 26;

        char[] chars = s.toCharArray();
        List<String> newString = new ArrayList<>();
        for (int i = 0; i<s.length();i++) {
            if (k > 25) {
                k=k%26;
            }
            if (Pattern.matches("[a-zA-Z]+", Character.toString(chars[i]))) {
                int oldIndex = chars[i];
                int newIndex = oldIndex + k;
                if ((oldIndex > 96 && newIndex > 122) || (oldIndex > 64 && newIndex > 90 && oldIndex < 96)) {
                    newIndex = newIndex - 26;
                }
                newString.add(Character.toString((char) newIndex));
            } else {
                newString.add(Character.toString(chars[i]));
            }

        }
        String collect = newString.stream().map(Objects::toString).collect(Collectors.joining());
        System.out.println(collect);

/*
        if (k > 25) {
            k = k%25;
        }
        List<String> newString = new ArrayList<>();
        Integer finalK = k;
        s.chars().forEach(value -> {
            if (Pattern.matches("[a-zA-Z]+", Character.toString((char) value))) {

                    if ((value > 96 && value + finalK > 122) || (value > 64 && value < 91 && value + finalK > 90)) {
                        value = value - 26;
                    }
                newString.add(Character.toString((char)(value+ finalK)));
            } else {
                newString.add(Character.toString((char)(value)));
            }
        });
        String collect = newString.stream().map(Objects::toString).collect(Collectors.joining());
        System.out.println(collect);
        */

    }
}
