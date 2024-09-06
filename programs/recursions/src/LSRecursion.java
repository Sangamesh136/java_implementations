public class LSRecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int i = 3;
        System.out.println(search(arr, i, 0));
    }

    public static int search(int[] arr, int i, int index) {
        if (index == arr.length - 1)
            return -1;
        if (i == arr[index]) {
            return index;
        } else {
            return search(arr, i, index + 1);
        }
    }

}
