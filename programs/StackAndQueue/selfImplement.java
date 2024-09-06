package com.Nutan.StackAndQueue;

public class selfImplement {
    protected int [] data;
    private static final int DEFAULT_SIZE=10;
    private int ptr=-1;
    private int size =0;

    public selfImplement(){
        this(DEFAULT_SIZE);
    }

    public selfImplement(int size){
        this.data = new int[size];
    }

    private boolean isFull(){
        return ptr==data.length-1;
    }

    private boolean isEmpty(){
        return ptr == -1;
    }

    public void display()throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        for(int i = 0; i<data.length; i++){
            System.out.print(data[i]+ " -->");
        }
        System.out.println("END");
    }

    public boolean push(int val)throws Exception{
        if(isFull()){
            throw new Exception("Stack is full");
        }
        data[++ptr]=val;
        size++;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        size--;
        return data[ptr--];
    }

    public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("stack is empty");
        }
        return data[ptr];
    }
    public static void main(String[] args) throws Exception {
        selfImplement stack = new selfImplement(5);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.display();
    }


}
