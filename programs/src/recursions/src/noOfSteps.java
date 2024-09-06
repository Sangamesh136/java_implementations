public class noOfSteps {
    public static void main(String[]args){
        int n=8;
        steps(n);
        System.out.println(count);
    }
    static int count=0;
    static void steps(int n){
        if(n==0) {
            return;
        }
        if(n%2==0){
            n=n/2;

        }
        else
            n-=1;
        count++;
        steps(n);
    }

}
