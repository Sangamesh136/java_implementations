package com.Nutan.StackAndQueue;

import java.util.Stack;

public class QueuesUsingStackRemoveEff {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueuesUsingStackRemoveEff(){
        first=new Stack<>();
        second = new Stack<>();
    }
    public int remove(){
        return first.pop();
    }
    public void add(int item){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);
        while (!second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int peek(){
        return first.peek();                        // as the stacks are stored in reverse order,
    }
}
