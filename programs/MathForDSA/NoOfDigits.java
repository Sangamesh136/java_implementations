
// Number of digits in binary representation of a number:
public class NoOfDigits {
    public static void main(String[]args){
        int b = 10;
        int n = 34567;
        int ans = (int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
}
