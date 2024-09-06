import java.util.ArrayList;

public class AllSubSets {
    public static void main(String[]args){
        subsets("","abc");
    }
    static void subsets(String p,String s){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = s.charAt(0);
        subsets(p+ch, s.substring(1));
        subsets(p, s.substring(1));
    }
    static ArrayList<String> subsetRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetRet(p+ch , up.substring(1));
        ArrayList<String> right = subsetRet(p , up.substring(1));
        left.addAll(right);
        return left;
    }
}
