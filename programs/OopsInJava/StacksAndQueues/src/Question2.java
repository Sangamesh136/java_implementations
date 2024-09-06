public class Question2 {
//    Queues implementation using arrays:
    private int [] arr;
//    private int size=0;
    private int ptr = -1;
    private static final int DEFAULT_SIZE=5;
    public Question2(){
        this(DEFAULT_SIZE);
    }
    public Question2(int size){
        this.arr = new int[size];
    }
    public boolean isFull(){
        return ptr==arr.length;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
    public void add(int val)throws Exception{
        if(isFull())throw new Exception("The Queue is full");
        arr[++ptr]=val;
//        size++;
    }
    public int remove()throws Exception{
        if(isEmpty())throw new Exception("The given Queue is Empty!!");
        int removed = arr[0];
        for (int i =1;i < ptr; i++){
            arr[i-1]=arr[i];
        }
        ptr--;
        return removed;
    }
    public int peek()throws Exception{
        if(isEmpty())throw new Exception("The given Queue is Empty!");
        return arr[0];
    }
    public void display()throws Exception{
        if(isEmpty())throw new Exception("The Queue is empty!1");
        for (int i=0;i<ptr;i++){
            System.out.print(arr[i]+ "-->");
        }
        System.out.println("END");
    }
    public static void main(String[]args)throws Exception{
        Question2 queue = new Question2(5);
        queue.add(0);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.display();
        System.out.println("PEEKED: "+ queue.peek());
        System.out.println("REMOVED: "+ queue.remove());
//        queue.add(5);
        queue.display();
    }




}
