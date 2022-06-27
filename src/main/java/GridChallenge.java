import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GridChallenge {
    public static void main(String[] args) {
        int rowCount = 1;
        int cellSize = 5;
        List<String> grid = Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv");
        List<String> collect = grid.stream().map(s -> {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }).collect(Collectors.toList());

        List<String> newGrid = new ArrayList<>();
        collect.stream().forEach(s -> {
            char[] chars = s.toCharArray();
            for (int i = 0;i<s.length();i++) {
                try {
                    String currentString = newGrid.get(i);
                    currentString += chars[i];
                    newGrid.set(i, currentString);

                } catch (IndexOutOfBoundsException e) {
                    newGrid.add(i, Character.toString(chars[i]));
                }
            }
        });


        List<Boolean> sortedControl = newGrid.stream().map(s -> {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            if (sortedString.equals(s)) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toList());

        if (sortedControl.stream().filter(aBoolean -> !aBoolean).count() == 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
