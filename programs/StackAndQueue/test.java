package com.Nutan.StackAndQueue;

public class test {
    private int[] arr;
    private static final int DEFAULT_SIZE=5;
    private int ptr=-1;

    public test(){
        this(DEFAULT_SIZE);
    }
    public test(int size){
        this.arr=new int[size];
    }
    public boolean isFull(){
        return ptr==arr.length-1;
    }
    public boolean isEmpty(){
        return ptr==0;
    }
    public boolean add(int val)throws Exception{
        if(isFull())throw new Exception("The stack is full");
        arr[++ptr]=val;
        return true;
    }
    public int remove()throws Exception{
        if(isEmpty())throw new Exception("the stack is empty");
        return arr[ptr--];
    }
    public void display()throws Exception{
        if(isEmpty())throw new Exception("The stack is full");
        for(int i =0; i<=ptr;i++){
            System.out.print(arr[i] + "-->");
        }
        System.out.println("END");
    }

    public int peek()throws Exception{
        if(isEmpty())throw new Exception("stack is empty");
        return arr[ptr];
    }
    public static void main(String[]args) throws Exception {
        test stack = new test(5);
        stack.add(0);
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.display();
        stack.remove();
        stack.remove();
        stack.display();



    }
}


