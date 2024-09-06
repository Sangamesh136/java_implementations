// To find the missing element in an array:
// Given the the length of the array is given.

public class Question12{
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6,7};
        int N=8;
        int ans= missingElement(arr,N);
        System.out.println(ans);
    }
    static int missingElement(int[]arr,int N){
        int sum=(N*(N+1))/2;
        int arrsum=0;
        for(int i=0;i<arr.length;i++){
            arrsum=arrsum+arr[i];
        }
        return sum-arrsum;  
    }
   
}
