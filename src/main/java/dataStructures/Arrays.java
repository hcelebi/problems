package dataStructures;

import java.util.stream.Collectors;

public class Arrays {
    public static void main(String[] args) {
        String[] keywords = {"ahmet", "ali", "ayşe", "ata"};
        String collect = java.util.Arrays.stream(keywords).map(String::toString).collect(Collectors.joining(", "));
        System.out.println(collect);
    }
}
