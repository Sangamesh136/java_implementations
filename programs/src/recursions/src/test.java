package recursions.src;

public class test {
//    public static void main(String[]args){
//        fun(12);
//    }
//    public static int fun(int n){
//        int res;
//        if(n>0){
//            res= fun(n - 3) + n + fun(n - 6);
//            System.out.println(res);
//        } else {
//            res = 0;
//        }
//        return res;
//    }
    public static void main(String[]args){
        recur(27);
        System.out.println(recur(27));
    }
    public static int recur(int n){
        if(n<=10)
            return n*2;
        else return recur(recur(n/3));
    }
}

