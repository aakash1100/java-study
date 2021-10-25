package at.solutions;

public class Problem1953 {

    public long numberOfWeeks(int[] milestones) {
        long max = 0, sum = 0;

        for(int milestone : milestones) {
            max = Math.max(milestone, max);
            sum += milestone;
        }
        long withoutMax = sum - max;

        if(max - withoutMax > 1) {
            return sum - (max - withoutMax - 1);
        }

        return sum;
    }

}
