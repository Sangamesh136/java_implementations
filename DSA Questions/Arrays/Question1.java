// Largest element of an array:

import java.util.Arrays;
public class Question1{
    public static void main(String[]args){
        // Without sorting:
        // int []arr={1,2,3,4,5};
        
        // int max=0;

        // for(int i=0;i<=arr.length;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        //     i++;
        // }
        // System.out.println(max);

        // With sorting:
      int []arr={5,3,1,4,2};
      int max=largestInArray(arr);
            System.out.println("Largest number in the array is: "+ max);
    }
    static int largestInArray(int[] arr){
        // sorting:
        for(int j=0;j<arr.length-1;j++){
            for(int i=0;i<j;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
           
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr[arr.length-1];
    }

}
