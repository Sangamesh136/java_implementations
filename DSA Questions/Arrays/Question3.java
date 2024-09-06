// To check whether the array is sorted or not:

public class Question3{
    public static void main(String[]args){
        int[] arr1={3,4,5,1,2};
        // int[] arr2={5,6,7,8,9};
        boolean isSorted=status(arr1);
        System.out.println(isSorted);
    }
    static boolean status(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            // for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]>arr[i+1]){
                    return false;
                }
                
            // }
        }
        return true;
    }
    
}