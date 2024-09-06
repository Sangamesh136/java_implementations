public class BSPractice {
    public static void main(String[]args){
        int [] arr= {-29,-18,-4,0,1,4,6,19,25,34};
        int target= -29;
        System.out.println(bSearch(arr,target));

    }
    static int bSearch(int[]arr, int target){
        int start=0;
        int end= arr.length-1;
        int mid;
        if(start>end){
            return -1;
        }
        while(start<=end){
            mid=start+ (end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
