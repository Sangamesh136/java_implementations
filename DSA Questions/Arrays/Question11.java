// Union of two arrays:

import java.util.ArrayList;

public class Question11{
    public static void main(string[]args){
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> arrAns=unionOfArrays(arr1,arr2);
        for(int val:arrAns){
            System.out.print(val+" ");
        }
    }
    static ArrayList<Integer> unionOfArrays(int[]arr1,int[]arr2){
        if(arr1.length==0&& arr2.length==0){
            return null;
        }
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            list.add(arr1[i]);
        }
        // for(int i=0;i<arr2.length;i++){
        //     int mid=list.size()/2;
        //     if(arr2[i]==list.get(i))
        // }
        return list;
    }
}