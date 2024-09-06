import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        bubble(arr, 4, 0);
        System.out.println(Arrays.toString(arr));
    }

    // public static void sort(int[] arr) {
    // int i = arr.length - 1;
    // int j = 0;
    // helper(arr, i, j);
    // System.out.println(Arrays.toString(arr));
    // }

    // public static void helper(int[] arr, int i, int j) {
    // if (i == 0) {
    // return;
    // }
    // if (arr.length == 0) {
    // return;
    // }
    // if (i > j) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // helper(arr, i, j + 1);
    // }
    // }
    // helper(arr, i - 1, 0);
    // }
    public static void bubble(int[] arr, int i, int j) {
        if (i == 0) {
            return;
        }
        if (arr.length == 0) {
            return;
        }
        if (i > j) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            bubble(arr, i, j + 1);
        }
        bubble(arr, i - 1, 0);
    }
}
