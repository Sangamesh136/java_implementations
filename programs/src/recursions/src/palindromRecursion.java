public class palindromRecursion {
    public static void main(String[]args){
        int n=0;
        int ans= pal(n);
        if(ans==1|| ans==0){
            System.out.println("true");
        }
        else
            System.out.println("False");
    }
    static int sum=0;
    static int pal(int n){
        int temp=n;
        if(n==0){
            return 0;
        }
        int rem=n%10;
        sum=sum*10+rem;
        n=n/10;
        pal(n);
        if(sum==temp){
            return 1;
        }
        else
           return -1;
    }
}
