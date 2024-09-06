// binary search:

public class Question1 {
    public static void main(String[]args){
        int []arr = {1,2,3,4,5,6,7};
        int target = 10;
        int result = binarySearch(arr, target);
        if(result==-1) System.out.println("not found!");
        else System.out.println(result);
    }
    public static int binarySearch(int [] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int result = binarySearchAlgo(arr, target,low, high );
        return result;
    }
    public static int binarySearchAlgo(int[]arr, int target, int low, int high){
        if(low> high) return -1;
        int mid = (high+low)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]> target) return binarySearchAlgo(arr, target,0,mid-1);
        return binarySearchAlgo(arr, target, mid+1, arr.length-1);

    }
}
