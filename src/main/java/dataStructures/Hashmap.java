package dataStructures;

import java.time.Instant;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {

        int[] ints = new int[]{2,1,3,5,6,5};

        Instant t1 = Instant.now();
        int recurringCharacter = firstRecurringCharacterV2(ints);
        Instant t2 = Instant.now();
        System.out.println(t2.getNano() - t1.getNano());
    }
    public static int firstRecurringCharacter(int[] ints) {
        for (int i=0; i<ints.length;i++) {
            for (int j=i+1; j<ints.length;j++) {
                if (ints[i] == ints[j]) {
                    return ints[i];
                }
            }
        }
        return 0;
    }

    public static int firstRecurringCharacterV2(int[] ints) {
        HashMap temporaryHash = new HashMap();
        for (int i = 0; i < ints.length; i++) {
            if (temporaryHash.containsKey(ints[i])) {
                return ints[i];
            } else {
                temporaryHash.put(ints[i], true);
            }
        }
        return 0;
    }
}
