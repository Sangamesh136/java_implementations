public class SkipAString {
    public static void main(String[]args){
        System.out.println(skip("bcaasamaaaa"));
    }
    static String skip(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("sam")){
            return skip(s.substring(3));
        } else {
            return s.charAt(0) + skip(s.substring(1));
        }
    }
}
