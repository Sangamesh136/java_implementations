public class sumOfDigits {
    public static void main(String[]args){
        int n=1234;
        int ans=sum(n);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0){
          return n;
        }
        int rem =n%10;
        n=n/10;
        return rem+sum(n);
    }
}
