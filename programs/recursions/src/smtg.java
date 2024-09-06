import java.util.ArrayList;

public class smtg {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 5 };
        int key = 2;
        System.out.println(search(arr, key, 0, new ArrayList<>()));

    }

    // static ArrayList<Interger> list = new ArrayList<>();

    public static ArrayList search(int[] arr, int key, int index, ArrayList<Integer> list) {
        if (index == arr.length - 1)
            return list;
        if (key == arr[index])
            list.add(index);
        return search(arr, key, index + 1, list);
    }
}