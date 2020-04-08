package daySeven;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {

    public int countElements(int[] arr) {
        Set<Integer> map = new HashSet<>();
        for(int num : arr) {
            map.add(num);
        }
        int count = 0;
        for(int num : arr) {
            if(map.contains(num+1))
                count++;
        }
        return count;
    }
}
