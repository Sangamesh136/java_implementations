public class binarySearching {
    public static void main(String[]args){
        int[]arr={-20,-15,-50,10,15,14,36,45,54,100};
        int target=100;
        int target2=36;
        System.out.println(binarySearch(arr,target));
        System.out.println(binarySearch2(arr,target2));
    }
    static int binarySearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        if(start>end){
            return -1;
        }
        int mid;
        while(start<=end){
           mid=start+ (end-start)/2;
           if(target>arr[mid]){
               start=mid+1;
           }
           else if(target<arr[mid]){
               end=mid-1;
           }
           else
               return mid;
        }
        return -1;
    }
    static int binarySearch2(int []arr,int target){
        int start=0,end=arr.length-1;
        if(start>end){
            return -1;
        }
        while(start<=end){
            int mid=start+ (end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else
                return mid;
        }
        return -1;

    }

}
