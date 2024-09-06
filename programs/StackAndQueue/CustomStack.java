package com.Nutan.StackAndQueue;

public class CustomStack {
   protected int[] data;
   private static final int DEFAULT_SIZE = 10;

   int ptr = -1;
   public CustomStack() {
        this(DEFAULT_SIZE);
   }
   public CustomStack(int size) {
        this.data = new int[size];
   }
   public boolean push(int item){
       if(isFull ()){
           System.out.println("Stack is full");
           return false;
       }
       ptr++;
       data[ptr]=item;
       return true;
   }
    public int pop () throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop an element as the stack is empty");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek () throws Exception {
       if(isEmpty () ) {
           throw new Exception ("The stack is empty");
       }
       return data[ptr];
    }
   private boolean isFull (){
       return ptr == data.length-1;                   // The array is full if the ptr i.e. index is at the last index.
   }
   private boolean isEmpty (){
       return ptr == -1;
   }

}
