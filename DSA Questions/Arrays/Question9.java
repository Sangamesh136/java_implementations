// move all zeros to the end:
import java.util.ArrayList;
import java.util.Arrays;
public class Question9{
    public static void main(String[]args){
        int[]arr={1,2,3,0,5,7,0,4};
        int n=arr.length;
        // int[] newA=zerosToEnd(arr,n);
        // System.out.println(Arrays.toString(newA));
        int[] newA=optimalSol(arr, n);
        System.out.println(Arrays.toString(newA));
    }
    // BruteForceApproch
    static int[] zerosToEnd(int[]arr,int n){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        int nz=temp.size();
        for(int i=0;i<nz;i++){
            arr[i]=temp.get(i);
        }
        for(int i=nz;i<n;i++){
            arr[i]=0;
        }
        return arr;
    }
    // Optimal Solution:
    static int[] optimalSol(int[] arr,int n){
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
           
        }
        return arr;
    }
}
