package com.Nutan;

public class DLLMain {
    public static void main(String[]args){
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);

        list.display();
        list.displayReverse();
      list.insertLast(100);
      System.out.println();
        list.display();

    }
}
