public class noOfZeros {
    public static void main(String[]args){
        int n =10203040;
        zeros(n);
        System.out.println(count);
    }

    static int count =0;
    static void zeros(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        if(rem==0) {
            count++;
        }
        n/=10;
        zeros(n);
    }
}

