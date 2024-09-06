// Right rotate an array k elements:
import java.util.Arrays;
public class Question8{
    public static void main(String[]args){
        int []arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=2;
        rotateRight(arr,n,k);
        System.out.println(Arrays.toString(arr));


    }
    static void rotateRight(int[]arr,int n,int k){
        if(n==0)
        return;
        k=k%n;
        if(k==0)
        return;
        int[]temp=new int[k];
        int[]temp1=new int[n-k];

        for(int i=n-k;i<n;i++){
            temp[i-n+k]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            // arr[k+i]=arr[i];
            temp1[i]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
        for(int i=k;i<n;i++){
            arr[i]=temp1[i-k];
        }

    }
}
