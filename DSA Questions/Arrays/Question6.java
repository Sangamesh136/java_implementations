// Left rotate an array by 1 place:

import java.util.Arrays;

public class Question6{
    public static void main(String[]args){
        int []arr={1,2,3,4,5};
        Lrotate(arr);
        System.out.println(Arrays.toString(arr));
        }
    static void Lrotate(int []arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
}
