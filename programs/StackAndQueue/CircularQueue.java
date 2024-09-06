package com.Nutan.StackAndQueue;

public class CircularQueue{
        private int[] data;
        private static final int DEFAULT_SIZE = 10;
        protected int end = 0;
        protected int front=0;
        private int size = 0;

        public CircularQueue () {
            this(DEFAULT_SIZE);
        }

        public CircularQueue (int size) {
            this.data = new int[size];
        }

        public boolean isFull() {
            return size == data.length-1;
        }

        public boolean isEmpty() {
            return size== 0;
        }

        public boolean insert(int item) {
            if(isFull()) {
                return false;
            }
            data[end]=item;
            end++;
            end= end % data.length;
            size++;
            return true;
        }
        public int remove()  {
            if(isEmpty()) {
                System.out.println("Queue is empty");
            }
//        in order to remove the element from the Queue we must shift the elements to the behind
            int removed = data[front++];
            front = front%data.length;
            size--;
            return removed;
        }

        public int front() throws Exception {
            if(isEmpty()) {
                throw new Exception("Queue is empty");
            }
            return data[front];
        }

        public void display(){
            int i = front;
            do {
                System.out.print(data[i] + "-->");
                i++;
                i=i%data.length;
            }while(i!=end);
            System.out.print("END");
        }


}
