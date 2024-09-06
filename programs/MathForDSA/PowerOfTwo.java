public class PowerOfTwo {
    public static void main(String[]args){
        int n =0;
        System.out.println(isTrue(n));
    }
    public static boolean isTrue(int n){
        if(n==0) return false; //fix for n == 0;
        return (n & (n-1))==0;
    }


}
