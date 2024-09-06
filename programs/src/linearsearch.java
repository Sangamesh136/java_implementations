public class linearsearch {
    public static void main(String[]args){
     int []arr={1,2,4,5,6,7,8,9,0};
     int target=3;
     int ans=search(arr,target);
     System.out.println(ans);
     int ans2=search2(arr,target);
     System.out.println(ans2);

     System.out.println(search3(arr,target));
   }
   //to return the index:
   static int search(int []arr,int target){
        if(arr.length==0)
            return -1;
        for(int index=0;index<arr.length;index++){
            if(arr[index]==target)
                return index;
        }
        return -1;
   }
//   to return the element:
    static int search2(int[]arr,int target){
        if(arr.length==0)
            return -1;
        for (int j : arr) {
            if (j == target)
                return j;
        }
        return -1;
    }
//    to return true or false with respect to the element:
    static boolean search3(int[]arr,int target){
        if(arr.length==0) {
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return true;
        }
        return false;
    }

}
