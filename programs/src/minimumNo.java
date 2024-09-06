public class minimumNo {
    public static void main(String[]args){
        int []arr={1,5,3,6,3,7,4,6,8,4,0,-6};
        System.out.println(mini(arr));
    }
    static int mini(int []arr){
//        assume lowest number is the number in 1st index.
         int ans=arr[0];
         for(int i=0;i<arr.length;i++){
             if(arr[i]<arr[0]){
                 ans=arr[i];
             }
         }
         return ans;
    }
}
