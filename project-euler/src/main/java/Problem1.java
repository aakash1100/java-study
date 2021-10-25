public class Problem1 {

    private long sumDivisibleBy(int max, int n) {
        int range = max / n;
        return n * (range * (range + 1)) / 2;
    }

    public static void main(String[] args) {
        final int max = 999;
        Problem1 problem1 = new Problem1();
        long ans = problem1.sumDivisibleBy(max,3)
                + problem1.sumDivisibleBy(max,5)
                - problem1.sumDivisibleBy(max,15);
        System.out.println(ans);
    }

}
