import java.util.*;
public class recursion {
   public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
//       printIncreasing(n);
       printDecreasing(n);
   }
   static void printIncreasing(int n){
       if(n==1){
           System.out.println(n);
           return;
       }
       printIncreasing(n-1);
       System.out.println(n);
   }
   static void printDecreasing(int n){
       if(n==1){
           System.out.println(n);
           return;
       }
       System.out.println(n);
       printDecreasing(n-1);

   }
}
