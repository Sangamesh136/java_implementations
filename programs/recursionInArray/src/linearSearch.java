import java.util.ArrayList;

public class linearSearch {
    public static void main(String[]args){
        int[]arr={1,2,3,4,5,5,6,7,8};
        int target=5;
//        int ans= searchFromFirst(arr,target,0);
//        System.out.println(ans);
//        int ans1=searchFromLast(arr,target,arr.length-1);
//        System.out.println(ans1);
//        findAllIndex(arr,target,0);
//        System.out.println(list);
        ArrayList<Integer> ans= search(arr,target,0,new ArrayList<>());
        System.out.println(ans);

    }
    static int searchFromFirst(int []arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return searchFromFirst(arr,target,index+1);
    }
    static int searchFromLast(int[]arr,int target,int index){
        if(index==-1){
            return -1;
        }
        if(target==arr[index]){
            return index;
        }
        return searchFromLast(arr,target,index-1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[]arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(target==arr[index]){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
//    linear search using recursion where we have to return an array list
    static ArrayList<Integer> search(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(target==arr[index]){
            list.add(index);
        }
        return search(arr,target,index+1,list);
    }
}
