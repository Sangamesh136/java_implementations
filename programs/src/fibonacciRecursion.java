import java.util.*;
public class fibonacciRecursion {
    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int n = sc.nextInt();
        int n = 8;
        int ans= fib(n);
       System.out.println(ans);
    }
    static int fib(int n){
        if(n==0 || n==1){

            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
