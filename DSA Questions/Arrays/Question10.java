// Linear search:

public class Question10{
    public static void main(String[]args){
        int[]arr={1,2,3,4,5,6,7};
        int num=7;
        int i=linearSearch(arr,num);
        System.out.println(i);
    }
    static int linearSearch(int[]arr,int num){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
