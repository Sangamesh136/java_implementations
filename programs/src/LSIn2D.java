import java.util.Arrays;

public class LSIn2D {
    public static void main(String[]args){
       int[][] arr={
               {1,2,3,4},
               {5,6,7,8},
               {9,10,11,12}
       };
        int target=12;
       System.out.println(Arrays.toString(search(arr,target)));
       System.out.println("The largest number is " + max(arr));

    }
    static int[] search(int[][]arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
//    to find max :
    static int max(int[][] arr){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        int max=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
