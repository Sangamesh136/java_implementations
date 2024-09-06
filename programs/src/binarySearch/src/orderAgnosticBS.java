import java.util.*;
public class orderAgnosticBS {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        int []arr = new int[10];
//        System.out.println("enter the array elements:");
//        for(int i=0;i<arr.length;i++){
//            arr[i]= sc.nextInt();
//        }
//        System.out.println("enter the target element:");
//        int target=sc.nextInt();
//        System.out.println(Bsearch(arr,target));
//
//    }
////    finding whether the array is sorted in asscending or descending order.
//    static int Bsearch(int[]arr,int target){
//        if (arr[0] > arr[arr.length-1])
//           return BsearchD(arr,target);
//        else
//           return BsearchA(arr,target);
//
//    }
////    for descending order:
//    static int BsearchD(int[]arr,int target){
//        int start =0;
//        int end=arr.length;
//        int mid;
//        if(start>end){
//            return -1;
//        }
//        while(start<end){
//            mid= start+(end-start)/2;
//
//            if(target>arr[mid]){
//                end=mid-1;
//            }
//            else if(target<arr[mid]){
//                start= mid+1;
//            }
//            else
//                return mid;
//        }
//        return -1;
//    }
//    static int BsearchA(int[]arr,int target){
//        int start=0;
//        int end =arr.length;
//        int mid;
//        if(start>end){
//            return -1;
//        }
//        while(start<end){
//            mid= start+ (end-start)/2;
//            if(target>arr[mid]){
//                start=mid+1;
//            }
//            else if(target<arr[mid]){
//                end=mid-1;
//            }
//            else
//                return mid;
//        }
//        return -1;
//    }


//    Another way:
    public static void main(String[]args){
        
    }
}
