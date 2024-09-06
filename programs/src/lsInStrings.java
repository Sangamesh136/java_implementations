import java.util.Arrays;

public class lsInStrings {
    public static void main(String[]args){
        String str="Sangamesh";
        char target='a';
        System.out.println(charSearch(str,target));
        System.out.println(Arrays.toString(str.toCharArray()));

        System.out.println(charSearch2(str,target));
    }
//    using for loop:
    static boolean charSearch(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
//    using for each loop:
    static boolean charSearch2(String name,char target){
        if(name.length()==0){
            return false;
        }
        for(char c: name.toCharArray()){
            if(target==c){
                return true;
            }

        }
        return false;
    }
}
