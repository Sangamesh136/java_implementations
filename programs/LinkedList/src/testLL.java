package com.Nutan;

public class testLL {
    private Node head;
    private int size=0;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }
    public void insertLast(int value){
        Node node = new Node(value);
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
        }
        temp.next = node;
        temp = node;
        size++;
    }

    public void insert(int value, int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next=node;
        size++;
    }

    public int deleteFirst(){
        int value = head.value;
        head.next = head;
        size--;
        return value;
    }

    public int deleteLast(){
        Node temp = head;

        while(temp.next.next!=null){
            temp= temp.next;
        }
        int removed = temp.next.value;
        temp.next=null;
        size--;
        return removed;
    }
    public int deleteAt(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size){
            deleteLast();
        }
        Node temp = head;
        for(int i = 0; i<index; i++){
            temp = temp.next;
        }
        int removed = temp.value;
        temp.next = temp.next.next;
        size--;
        return removed;
    }

    public void sort(){
        if(head.next ==null){
            System.out.println(head.value);
        }
//        Node first;
//        Node second;
        Node temp2 = null;
        Node temp = head;
        for(int i =0; i<size; i++){
            for(int j = 1; j<size;j++){
                if(temp.value>temp.next.value){
                    temp2.value = temp.value;
                    temp.value= temp.next.value;
                    temp.next.value = temp2.value;
                }
            }
            System.out.println();
        }


    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "-->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    protected class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value= value;
        }
        public Node(int value, Node next){
            this.next = next;
            this.value = value;
        }
    }
    public static void main(String[]args){
        testLL list = new testLL();
        list.insertFirst(0);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insert(5,2);
        list.display();
    }
}
