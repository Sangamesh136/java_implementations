package com.Nutan.StackAndQueue;

public class Main {
    public static void main( String [] args) {
        CustomStack  stack = new CustomStack();
        stack.push(34);
        stack.push(35);
        stack.push(36);
        stack.push(37);
        stack.push(38);
        stack.push(39);
        stack.push(30);
        stack.push(31);
        try {
            System.out.println(stack.pop());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
