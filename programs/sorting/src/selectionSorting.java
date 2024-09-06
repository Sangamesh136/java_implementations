import java.util.Arrays;

public class selectionSorting{
  public static void main(String[]args){
      int[] arr={1,2,4,3,6,8,7,0,9};
      sorting(arr);
      System.out.println(Arrays.toString(arr));
  }
  static void sorting(int []arr){
//      first get the last index for every comparasion
      for(int i=0;i<arr.length;i++){
//          get the last index:
          int last=arr.length-1-i;
//          get the index of max element:
          int maxIndex=getMax(arr,0,last);
//          got the last element index as well as the max element index
//          Now swap both the values present in that particular index
          swap(arr,maxIndex,last);
      }
  }
  static int getMax(int[]arr,int start,int end){
      int max=start;
      for(int i=0;i<=end;i++){
          if(arr[max]<arr[i]){
              max=i;
          }
      }
      return max;
  }
  static void swap(int[]arr,int first,int second){
      int temp=arr[first];
      arr[first]=arr[second];
      arr[second]=temp;
  }

}
