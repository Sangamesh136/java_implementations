import java.util.Arrays;

public class sortingPractice {
    public static void  main(String[]args){
        int[]arr = {1,3,5,2,7,6,0,9,8};
//        selection(arr);
//        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=getMax(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getMax(int[]arr,int start,int end){
        int max=start;
        for(int i=0;i<end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static void bubble(int[]arr){
        boolean swapped=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if((arr[j]<= arr[j-1])){
//                    int temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                    swap(arr,j,j-1);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
