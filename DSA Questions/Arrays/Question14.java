// return the number that is repeated only once:

public class Question14{
    public static void main(String[]args){
        int[]arr={1,2,2,3,3,4,4};
        int n=arr.length;
        int ans=repeatOnce(arr,n);
        System.out.println(ans);
    }
    static int repeatOnce(int[]arr,int n){
        int temp=0;
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<n;i++){
            temp=temp^arr[i];
        }
        return temp;
    }
}
