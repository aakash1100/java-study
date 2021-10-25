package at.solutions;

import java.util.Arrays;

public class Problem1775 {

    public int minOperations(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int nums1Sum = Arrays.stream(nums1).sum();
        int nums2Sum = Arrays.stream(nums2).sum();

        if (nums1Sum == nums2Sum) return 0;

        if (nums2Sum > nums1Sum) {
            int tempSum = nums1Sum;
            nums1Sum = nums2Sum;
            nums2Sum = tempSum;

            int[] tempArr = nums1;
            nums1 = nums2;
            nums2 = tempArr;
        }

        final int n1 = nums1.length;
        final int n2 = nums2.length;

        int minPossibleValueOfN1 = n1 * 1;
        int maxPossibleValueOfN2 = n2 * 6;

        if (maxPossibleValueOfN2 < minPossibleValueOfN1) return -1;

        int i = n1 - 1;
        int j = 0;
        int operations = 0;

        while ((i >= 0 || j < n2) && nums1Sum > nums2Sum) {
            int changeInN1Sum = -1, changeInN2Sum = -1;

            if (i >= 0) {
                changeInN1Sum = nums1[i] - 1;
            }

            if (j < n2) {
                changeInN2Sum = 6 - nums2[j];
            }

            if (changeInN1Sum >= changeInN2Sum) {
                nums1Sum -= nums1[i--];
                nums1Sum += 1;
            } else if (changeInN2Sum > changeInN1Sum) {
                nums2Sum -= nums2[j++];
                nums2Sum += 6;
            }

            operations++;
        }

        return operations;
    }

}
