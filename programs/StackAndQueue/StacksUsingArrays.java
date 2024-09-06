package com.Nutan.StackAndQueue;

public class StacksUsingArrays {

//    implement stack using arrays:
    private static final int DEFAULT_SIZE=5;
    int ptr = -1;
//    int size;
    int [] arr;
    public StacksUsingArrays(){
        this.arr=new int[DEFAULT_SIZE];
    }
    public StacksUsingArrays(int size){
        this.arr=new int[size];
    }
    public boolean isFull(){
        return ptr==arr.length;
    }
    public boolean isEmpty(){
        return ptr==0;
    }
    public void push(int val)throws Exception {
        if(isFull()){
            throw new Exception("The stack is full!!");
        }
        ptr++;
        arr[ptr]=val;
    }

    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("The stack is Empty!!");
        }
        int removed= arr[ptr];
        --ptr;
        return removed;
    }
    public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("The stack is empty!!");
        }

        return arr[ptr--];

    }
    public void display()throws Exception{
        if(isEmpty()){
            throw new Exception("The stack is empty");
        }
        for (int j : arr) {
            System.out.print(j + "-->");
        }
    }
    public int size(){
        return ++ptr;
    }
    public static void main(String[]args) throws Exception {
        StacksUsingArrays stack = new StacksUsingArrays(5);
//        stack.display();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.display();
        System.out.println();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: "+ stack.pop());
        System.out.println("Size:"+stack.size());
        System.out.println("Peek: "+stack.peek());
    }


}
