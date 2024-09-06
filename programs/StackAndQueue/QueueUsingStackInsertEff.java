package com.Nutan.StackAndQueue;

import java.util.Stack;

public class QueueUsingStackInsertEff {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackInsertEff(){
        first= new Stack<>();
        second = new Stack<>();
    }
    public void add(int item){
        first.push(item);
    }

    public int remove()throws Exception {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

    public int peek() throws Exception {            // peek-->returns the element that will be removed
         while(!first.isEmpty()) {                  // in case of Queue, the first element will be removed, so peek returns the first element
             second.push(first.pop());
         }
         int peeked = second.peek();
         while(!second.isEmpty()){
             first.push(second.pop());
         }
         return peeked;
    }
}
