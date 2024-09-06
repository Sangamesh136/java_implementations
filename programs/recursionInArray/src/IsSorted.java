//checking whether the array is sorted or not:
public class IsSorted {
  public static void main(String[]args){
      int[]arr={1,2,3,4,5,6,7,9,8};
      boolean ans=sorted(arr,0);
      System.out.println(ans);
  }
  static boolean sorted(int[]arr,int index){
      if(index==arr.length-1){
          return true;
      }
      return arr[index]<arr[index+1] && sorted(arr,index+1);
  }
}

