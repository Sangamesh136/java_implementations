public class Power {
    public static void main(String[]args){
        int base = 3;
        int power = 6;
        System.out.println(powerOfBase(base, power));
    }
    public static int powerOfBase(int base, int power){
        int result =1;
        while(power > 0){
            if((power & 1) == 1){
                result = result*base;
            }
            base *=base;
            power = power >> 1;
        }
        return result;
    }
}
