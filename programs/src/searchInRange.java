
import java.util.Arrays;
public class searchInRange {
    public static void main(String[]args){
        int []arr={1,2,3,5,4,6,7,8,9,0};
        int target=6;
        System.out.println(search(arr,target));

        String str="Sangamesh";
        char tar='g';

        System.out.print("Given String:");
        System.out.println(str);

        System.out.println("String in the form of character array:");
        System.out.println(Arrays.toString(str.toCharArray()));

        System.out.println(search2(str,tar));
    }
//    search integer:
    static boolean search(int[]arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int i=2;i<=8;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
//    search character in string:
    static boolean search2(String str,char tar){
        if(str.length()==0){
            return false;
        }
        for(int i=2;i<=9;i++){
            if(str.charAt(i)==tar){
                return true;
            }
        }
        return false;
    }
}
