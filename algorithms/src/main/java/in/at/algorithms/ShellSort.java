package in.at.algorithms;

public class ShellSort {

    public void sort(int[] nums) {
        int N = nums.length;

        for(int gap = N / 2; gap > 0; gap /= 2) {
            for(int i = gap; i < N; i++) {
                int newElement = nums[i];

                int index = i;

                while(index >= gap && nums[index - gap] > newElement) {
                    nums[index] = nums[index - gap];
                    index -= gap;
                }
                nums[index] = newElement;
            }
        }
    }
}
