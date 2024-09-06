package com.company;

public class printAToZ {
    public static void main(String[]args){
        String series = "";
        for (int i =0;i<26;i++){
//            System.out.println((char)('a'+i));
            char ch = (char)('a'+i);
            series = series + ch;
        }
        System.out.println(series);
    }
}
