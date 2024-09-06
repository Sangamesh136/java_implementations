import java.util.ArrayList;

public class Permutations {
    public static void main(String[]args){
        permutations("","abc");
        System.out.println(permutationList("", "abc"));
        System.out.println(permutationCount("","abc"));
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i= 0; i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            permutations(first+ch+second,up.substring(1));
        }
    }
    static ArrayList<String> permutationList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i = 0; i<= p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            ans.addAll(permutationList(first+ch+second,up.substring(1)));
        }
        return ans;
    }
    static int permutationCount(String p, String up){
        if(up.isEmpty()) return 1;
        char ch = up.charAt(0);
        int count =0;
        for(int i = 0; i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            count = count + permutationCount(first+ch+second,up.substring(1));

        }
        return count;
    }

}
