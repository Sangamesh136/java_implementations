// reverse a given string:

package strings;

import java.util.Scanner;

public class Question2 {
    public static void main(String[]args){
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String s = "HEllo everyone";
        System.out.println("Before reversing:");
        System.out.println(s);
        System.out.println("After reversing:");
        System.out.println(result(s));
    }
    public static String result(String s){
        int left = 0;
        int right = s.length()-1;
        String temp="";
        String ans="";

        while(left<=right){
            char ch = s.charAt(left);
            if(ch != ' '){
                temp += ch;
            }
            else if(ch ==' '){
                if(!ans.equals("")){
                    ans = temp + " " + ans;
                }
                else {
                    ans = temp;
                }
                temp ="";
            }
            left++;
        }
        if(!temp.equals("")){
            if(!ans.equals("")){
                ans = temp + " " + ans;

            }
            else {
                ans = temp;
            }
        }
        return ans;
    }
}
