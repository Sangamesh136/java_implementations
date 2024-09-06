//To implement stacks using Arrays:

public class Question1 {
    private int [] arr;
    private static final int DEFAULT_SIZE=5;
    private int ptr=-1;
    private int size=0;
    public Question1(){
        this(DEFAULT_SIZE);
    }

    public Question1(int size){
        this.arr= new int[size];
    }

    public boolean isFull(){
        return ptr==arr.length-1;
    }

    public boolean isEmpty(){
        return ptr==-1;
    }

    public int size(){
        return ptr+1;
    }

    public boolean add(int val)throws Exception{
        if(isFull())throw new Exception("The stack is Full!!");
        arr[++ptr]=val;
        size++;
        return true;
    }
    public int remove()throws Exception{
        if(isEmpty())throw new Exception("The stack is empty!!");
        size--;
        return arr[ptr--];
    }
    public int peek()throws Exception{
        if(isEmpty()) throw new Exception("The stack is Empty");
        return arr[ptr];
    }
    public void display(){
        for(int j=0;j<= ptr;j++){
            System.out.print(arr[j] + "-->");
        }
        System.out.println("END");
    }
    public static void main(String[]args) throws Exception {
        Question1 stack = new Question1(5);
        stack.add(0);
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.display();
        System.out.println("PEEKED: " +stack.peek());
        System.out.println("REMOVED: " + stack.remove());
        stack.display();
        System.out.println("PEEKED: " + stack.peek());
        System.out.println("REMOVED:" + stack.remove());
        stack.display();
        stack.add(5);
        stack.display();
    }




}
