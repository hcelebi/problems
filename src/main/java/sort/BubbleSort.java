package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = new int[]{15,4,9,2,11,5,1,7,16,3};
        int[] sortedArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    sortedArray[i] = intArray[j];
                }
            }
        }
        System.out.println(Arrays.stream(sortedArray));
    }
}
