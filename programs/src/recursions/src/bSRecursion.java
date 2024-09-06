public class bSRecursion {
    public static void main(String[]args){
        int []a={1,2,3,4,5,6,7,8,9,0};
        int target= 4;
        int ans=search(a,target,0,a.length-1);
        System.out.println(ans);

    }
    static int search(int []arr, int target,int s,int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (target == arr[m]) {
            return m;
        } else if (target > arr[m]) {
            return search(arr, target, m+1, e);
        } else {
            return search(arr, target, s, m-1);
        }

    }
}
