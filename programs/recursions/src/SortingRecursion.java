public class SortingRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 9, 3 };
        isSorted(arr);
    }

    public static void isSorted(int[] arr) {
        int i = 0;
        System.out.println(helper(arr, i));
    }

    public static boolean helper(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] <= arr[i + 1]) {
            return helper(arr, i + 1);
        }
        return false;
    }
}
