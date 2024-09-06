package com.Nutan;

public class CLLMain {
    public static void main(String[]args){
        CLL list = new CLL();
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.display();
        list.delete(7);
        System.out.println();
        list.display();
    }

}
