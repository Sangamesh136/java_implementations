package com.Nutan;

//public class CLL {
//
//    Node head;
//    Node tail;
//    public void insert(int val){
//        Node node= new Node(val);
//
//        if(head==null){
//            head = node;
//            tail= node;
//            return;
//        }
//        tail.next= node;
//        node.next= head;
//        node = tail;
//    }
//
//    public void display(){
//        Node temp = head;
//        if(head!=null){
//            do{
//                System.out.print(temp.val + "->") ;
//                temp= temp.next;
//            }while(temp!=head);
//        }
//        System.out.println("HEAD");
//    }
//    public class Node{
//        int val;
//        Node next;
//
//        public Node(int val) {
//            this.val = val;
//        }
//
//
//
//    }
//}
public class CLL{
    Node head;
    Node tail;
    public void insert(int val){
        Node node = new Node(val);
       if(head==null){
           head= node;
           tail=node;
           return;
       }
       tail.next=node;
       node.next=head;
       tail=node;
    }
    public void delete(int val){
        Node temp=head;
        if(head==null){
            System.out.println("The LL is empty");
            return;
        }
        if(temp.val==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n= temp.next;
            if(n.val==val){
                temp.next=n.next;
                break;
            }
            temp=temp.next;
        }while (temp!=head);
    }

    public void display() {
//        if (head == null) {
//            System.out.println("LL is empty");
//            return;
//        }
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.val + "-->");
                temp = temp.next;
            } while (temp != head);
            System.out.print("HEAD");
        }



    }
    public class Node{
        int val;
        Node next;
        public Node(){

        }
        public Node(int val){
            this.val=val;
        }
        public Node(int val, Node next){
            this.val= val;
            this.next=next;
        }

    }
}
