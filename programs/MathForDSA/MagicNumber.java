
//To find the nth magic number:
public class MagicNumber {
    public static void main(String[]args){
        int n = 6;
        System.out.println(findMagic(n));
    }
    public static int findMagic(int n){
        int result = 0;
        int base = 5;
        while(n!=0){
            int last = n&1;
            result=result + (last*base);
            base = base * 5;
            n=n>>1;
        }
        return result;
    }



}
