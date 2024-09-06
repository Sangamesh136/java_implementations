package com.Nutan.StackAndQueue;

import java.util.Stack;

public class StackInBuilt {
    public static void main(String[]args){
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println(stack.pop());
    }

}
 