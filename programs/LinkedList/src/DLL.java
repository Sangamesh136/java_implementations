package com.Nutan;

public class DLL {
    Node head;
    int size;
    public void insertFirst(int val){
        Node node = new Node(val);

            node.next=head;
            node.prev=null;

        if (head != null) {
            head.prev=node;
        }
        head=node;
    }

    public void insertLast(int val){
        if(head==null){
            insertFirst(val);
        }
        Node node= new Node(val);
        Node temp= head;
        Node last = null;
        while(temp.next!=null){
            last=temp;
            temp=temp.next;
        }
        node.prev= last;
        node.next=null;
        last.next= node;

    }

    public Node find(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.val == val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public void insert(int val, int after){
        Node p = find(after);
        if(p== null){
            System.out.println("doesnt exit");
        }
        Node node= new Node(val);
        node.next= p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=null;
        }

    }


    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val + " -->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void displayReverse(){
    Node temp= head;
    Node last=null;
    while(temp!=null){
        last=temp;
        temp=temp.next;
    }
    while(last!=null){
        System.out.print(last.val + "-->");
        last=last.prev;
    }
    System.out.print("START");
    }



    private class Node{
        int val;
        Node prev;
        Node next;
        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
        public Node(int val) {
            this.val = val;
        }
    }

}




