public class IsOdd {
    public static void main(String[]args){
        int num =57;
        System.out.println(isOdd(num));
    }
    public static boolean isOdd(int n){
        return (n&1)==1;
    }
}
