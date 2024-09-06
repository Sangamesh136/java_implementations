import java.util.Arrays;

public class insertionSorting {
    //    public static void main(String[]args){
//        int[] arr ={4,5,1,2,3,};
//        sorting(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void sorting(int[]arr){
//        for(int i=0;i<arr.length-1;i++){
////            int index=i;
//            for(int j=i+1;j>0;j--){
//                if(arr[j]<arr[j-1]) {
//                    swap(arr,j,j-1);
////                    index = j;
//                }
//            }
////            int smallerNumber=arr[index];
////            arr[index]=arr[i];
////            arr[i]=smallerNumber;
//        }
//    }
//    static void swap(int[]arr,int first,int second){
//        int temp=arr[first];
//        arr[first]=arr[second];
//        arr[second]=temp;
//    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 2, 6, 7, 5, 8, 9};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else
                    break;
            }
        }
    }
    static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}

























