public class SkipAChar {
    public static void main(String[]args){
        skip("","baccab");

        System.out.println(skip("bhacd"));
    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }
        else {
            skip(p+ch,up.substring(1));
        }
    }
    static String skip(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
            return skip(s.substring(1));
        } else {
            return ch + skip(s.substring(1));
        }
    }
}
