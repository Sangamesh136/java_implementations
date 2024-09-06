import java.util.Arrays;

public class MergeSort {
    //    public static void main(String[]args){
//        int[]arr={8,3,4,12,5,6};
//        int[] sorted=sort(arr);
//        System.out.println(Arrays.toString(sorted));
//
//    }
//    static int[] sort(int[]arr){
//
//        if(arr.length==1){
//            return arr;
//        }
//        int mid=arr.length/2;
//        int[]left= sort(Arrays.copyOfRange(arr,0,mid));
//        int[]right=sort(Arrays.copyOfRange(arr,mid,arr.length));
//
//        return merge(left,right);
//    }
//    static int[] merge(int[]first,int[]second){
//        int i=0;
//        int j=0;
//        int k=0;
//        int[]newArray=new int[first.length+second.length];
//
//        while(i<first.length && j<second.length){
//            if(first[i]<second[j]){
//                newArray[k]=first[i];
//                i++;
//            }
//            else{
//                newArray[k]=second[j];
//                j++;
//            }
//            k++;
//
//        }
//        while(i<first.length){
//            newArray[k]=first[i];
//            i++;
//            k++;
//        }
//        while(j<second.length){
//            newArray[k]=second[j];
//            j++;
//            k++;
//        }
//        return newArray;
//    }
//    public static void main(String[] args) {
//    int[]arr={8,4,3,12,5,6};
//    arr=sort(arr);
//    System.out.println(Arrays.toString(arr));
//    }
//    static int[] sort(int[]arr){
//        if(arr.length==1){
//            return arr;
//        }
//        int mid=arr.length/2;
//
//        int[] left=sort(Arrays.copyOfRange(arr,0,mid));
//        int[] right=sort(Arrays.copyOfRange(arr,mid,arr.length));
//
//        return merge(left,right);
//    }
//    static int[] merge(int[] first,int[]second){
//        int i=0,j=0,k=0;
//        int[] newArray=new int[first.length+second.length];
//        while(i<first.length && j<second.length){
//            if(first[i]<second[j]){
//                newArray[k]=first[i];
//                i++;
//            } else {
//                newArray[k]=second[j];
//                j++;
//            }
//            k++;
//        }
//        while(i<first.length){
//            newArray[k]=first[i];
//            i++;
//            k++;
//        }
//        while(j<second.length){
//            newArray[k]=second[j];
//            j++;
//            k++;
//        }
//        return newArray;
//    }
    public static void main(String[]args){
        int[] arr= {8,4,3,1,9,0,2,5};
        int[] newArr=sort(arr);
        System.out.println(Arrays.toString(newArr));
    }
    static int[] sort(int[]arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;

        int[] first=sort(Arrays.copyOfRange(arr,0,mid));
        int[] second=sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(first,second);
    }
    static int[] merge(int[]first,int[]second){
        int[]arr=new int[first.length+second.length];
        int i=0,j=0,k=0;

        while(i<first.length && j<second.length){
            if(first[i]<=second[j]){
                arr[k]=first[i];
                i++;
            }
            else{
                arr[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            arr[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            arr[k]=second[j];
            j++;
            k++;
        }
        return arr;
    }


}
























