import java.util.Arrays;

public class CyclicSorting {
   public static void main(String[]args){
       int[]arr={2,4,5,3,1};
       sorting(arr);
       System.out.println(Arrays.toString(sorting(arr)));
   }
   static int[] sorting(int[]arr){
       int i=0;
       while(i<arr.length){
           int correct=arr[i]-1;
           if(arr[i]!=arr[correct]){
               swap(arr,i,correct);
           }
           else
               i++;
       }
       return arr;
   }
   static void swap(int[]arr,int first,int second){
       int temp=arr[first];
       arr[first]=arr[second];
       arr[second]=temp;
   }
}

