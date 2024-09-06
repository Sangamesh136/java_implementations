// Longest subset with given sun is K:

import java.util.ArrayList;

public class Question15{
    public static void main(String[]args){
        int []arr={1,2,3,4,5,5};
        int k=10;
        int ans=subsetSumK(arr,k);
        System.out.println(ans);
    }
   
    static int subsetSumK(int[]arr,int k){
        int sum=0;
        int len=0;
        for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            sum=sum+arr[i];
            if(sum==k){
             len=Math.max(len,j-i+1);   
            }
        }
           
        }
        return len;
    }
}
