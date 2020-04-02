package dayTwo;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        if(n == 0)
            return false;
        if(n == 1)
            return true;

        Set<Integer> set = new HashSet<>();
        while(n != 1) {
            int num = n;
            int sum = 0;
            while(num != 0) {
                int a = num % 10;
                sum += a*a;
                num /= 10;
            }
            if(sum == 1)
                return true;
            if(set.contains(sum))
                return false;
            set.add(sum);
            n = sum;
        }
        return true;
    }
}
