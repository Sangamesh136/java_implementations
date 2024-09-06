// Remove outermost parantheses:

package strings;

import java.io.*;
import java.util.*;

public class test {
//    public static String removeOuterParantheses(String s) {
//        Stack<Character> st = new Stack<Character>();
//        StringBuilder sb = new StringBuilder();
//        for( int i = 0; i<s.length(); i++){
//            char ch = s.charAt(i);
//            if(ch == '('){
//                if(st.size()>0){
//                    sb.append(ch);
//                }
//                st.push(ch);
//            } else {
//                st.pop();
//                if(st.size()>0){
//                    sb.append(ch);
//                }
//            }
//        }
//       return sb.toString();
//    }
//
//
//    public static void main(String[] args) throws Exception {
////        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//
//        String result = removeOuterParantheses(s);
//        System.out.println(result);
//
//    }
    public static void main(String[]args){
        System.out.println("Enter the input:");
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();
        String result = removeOuterParantheses(s);
        System.out.println(result);
    }
    public static String removeOuterParantheses( String s){
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(st.size()>0){
                    sb.append(ch);
                }
                st.push(ch);
            } else {
                if(st.size()>0){
                    st.pop();
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}

