package at.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem932 {

    public int[] beautifulArray(int N) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);

        while(ans.size() < N) {
            List<Integer> odds = new ArrayList<>();
            List<Integer> evens = new ArrayList<>();

            for(int n : ans) {
                int odd = n * 2 - 1;
                int even = n * 2;
                if(odd <= N) odds.add(odd);
                if(even <= N) evens.add(even);
            }

            ans = new ArrayList<>(odds.size() + evens.size());
            ans.addAll(odds);
            ans.addAll(evens);
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }

}
