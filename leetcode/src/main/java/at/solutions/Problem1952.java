package at.solutions;

import java.util.ArrayList;
import java.util.List;

public class Problem1952 {

    public boolean isThree(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) count++;
            if(count > 3) break;
        }
        return count == 3;
    }

}
