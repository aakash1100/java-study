package in.at.algorithms.util;

public final class AlgorithmUtils {

    private AlgorithmUtils(){}

    public static void swap(int[] arr, int i, int j) {
        if(arr == null || arr.length <= 1) return;
        int N = arr.length;

        if(i == j || i < 0 || i >= N || j < 0 || j >= N) {
            return;
        }

        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
