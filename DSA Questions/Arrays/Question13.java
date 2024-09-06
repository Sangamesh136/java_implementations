// Maximum consicative ones:

public class Question13{
    public static void main(String[]args){
        int[]arr={1,1,1,0,1,1,1,1,0,1,1,1,1,1,0,1};
        int n=arr.length;
        
        int ans=consicative(arr,n);
        System.out.println(ans);
    }
    static int consicative(int[]arr,int n){
        int count=0,count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            count2=Math.max(count2,count);
        }
        
        return count2;
    }
}
