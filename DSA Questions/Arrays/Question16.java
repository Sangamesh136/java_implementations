public class Question16 {
    public static void main(String[]args){
        int [] arr = {1,2,3,4,5};
        int key = 10;
        boolean varient1 = isPresent(arr,key);
        System.out.println(varient1);
        int [] ans = indexValue(arr,key);
        System.out.println( " [" + ans[0] + "," + ans[1] + "]" );
    }
    static boolean isPresent(int [] arr, int key){
        for(int i = 0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if((arr[i]+arr[j])==key){
                    return true;
                }
            }
        }

        return false;
    }
    static int[] indexValue(int [] arr, int key){
        int [] ans = new int[2];
        ans[0] = ans[1]= -1;
        for(int i = 0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if((arr[i]+arr[j])==key){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;

    }
}
