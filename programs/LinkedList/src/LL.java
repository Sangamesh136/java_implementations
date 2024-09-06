package com.Nutan;

public class LL {                                    // LL must contain a head, a tail, size of it, its constructor and its properties
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    //    To insert the element at the first of the linkedList
    public void insertFirst(int val) {
        Node node = new Node(val);                  //1st need to create a node
        node.next = head;                           // Always the new created node's next element will be the head
        head = node;                                // Assign the head to the newly created node so that it becomes the 1st element of the linkList

        if (tail == null) {                         // That means LL has only one element, hence head is equal to tail
            tail = head;
        }
        size += 1;

    }

    //    to insert the elements at the last of the linked list
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //    To insert the elements in between at some particular index:
    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

//        node.next=temp.next; 
//        temp.next=node;
    }

    //    To display the elements of the linkedList
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Creating a Node
    private class Node {                                     // each unit of the LL, it must contain its value and the info about the next node. Has to have its constructor
        private int value;
        private Node next;

        public Node(int value) {                             // Constructor
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //    To delete the 1st element aand display the deleted item (Just move the head once)
    public int deleteFirst() {
        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    //    to delete the first element and the display the linkedList:
    public void deleteFirst1() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }


    public Node getNode(int index) {                     //To get the node at some particular index
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void deleteLast() {                          // To delete the last element using of the LL using the size
        tail = getNode(size - 2);
        tail.next = null;
        size--;
    }

    public int deleteLast1() {
        if (size <= 1) {
            return deleteFirst();
        }
        int value = tail.value;
        tail = getNode(size - 2);

        tail.next = null;
        return value;
    }

    public void delete(int index) {                    //To remove the element at a particular index
        Node temp = head;
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size - 1) {
            deleteLast();
            return;
        }
        Node prev = getNode(index - 1);
        prev.next = prev.next.next;
    }

    public int delete1(int index) {                   //To get the deleted element's value
        if (index == 0) {
            return deleteFirst();

        }
        if (index == size - 1) {
            return deleteLast1();
        }

        Node prev = getNode(index - 1);
        int val = prev.value;
        prev.next = prev.next.next;
        return val;
    }

    public void deleteValue(int val) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == val) {
                delete(i);
            }
        }
    }

    //    To return a node with given value:
    public Node find(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    //   In order to add elements in the LL using recursion:
    public void insertRec(int val, int index) {
        head = insertRec(val,  index,head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

//   Questions::

//    To remove the duplicates from the sorted list:
    public void duplicates(){
        Node node = head;
        while(node.next!=null){
            if(node.value== node.next.value){
                node.next= node.next.next;
                size--;
            } else{
                node=node.next;
            }
        }
    }

//    Merging two sorted linked lists
 public static LL merge(LL first, LL second){
        Node f= first.head;
        Node s = second.head;
        LL ans = new LL();
        while(f!=null && s!=null) {
            if (f.value <= s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.value);
            f=f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;
    }


//     To check if the LL has a cycle or not:
    public boolean hasCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast!=null && slow != null){
            fast = fast.next.next;
            slow= slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }


//    To find the length of the cycle:
    public  int lengthOfCycle(Node head){
        Node fast  = head;
        Node slow = head;
        while(fast!=null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast== slow){
                int length=0;
                Node temp= slow;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!= slow);
                return length;
            }
        }
        return 0;
    }


//    To return the first element of the cycle form which the cycle started:
    public Node firstElementOfNode(Node head){
//        We need to find the length of the cycle 1st
        int length=0;
        Node fast = head;
        Node slow = head;
       while(fast!=null && slow!=null){
           fast=fast.next.next;
           slow=slow.next;
           if(fast==slow){
               length=lengthOfCycle(slow);                      // here we get the length of the cycle
               break;
           }
       }
        //           To find the start Node
        if(length==0){ return null;}
        Node f=head;
        Node s = head;
        while(length>0){                                        // To move the s pointer length times
            s=s.next;
            length--;
        }

//           Now move both the first and the second pointers so that they meet at the starting of the cycle
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }



//   To check whether a number is a happy number or not:

    public boolean isHappy(int n){
        int f=n;                                               // Here the f and s pointer start from the number itself
        int s=n;

        do{
            s =findSquare(s);
            f= findSquare(findSquare(f));
        }while(s != f);
        if(s == 1){
            return true;
        }
        return false;
    }

    private int findSquare(int number){
        int ans=0;
        while(number>0){
            int rem=number % 10;
            ans+=rem*rem;
            number /= number;
        }
        return ans;
    }


//    To find the middle of the linked List
//    use f and s pointer approch
public Node middleOfTheLL(Node head){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
}

// Reverse of the linked list using Recursion:

    public void reverseLL(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverseLL(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }

//     Reverse of the LL using ittiration:

    public Node reverseLLI(){
        if(size<2){
            return head;
        }
        Node prev=null;
        Node present = head;
        Node nextNode=present.next;
        while(present !=null){
            present.next=prev;
            prev=present;
           present=nextNode;
            if(nextNode!=null){
                nextNode=nextNode.next;
            }
        }
        return prev;
    }

//    To check if the LL is a Palindrome or not:

//    public boolean isPalindrome(Node head){
//        Node mid = middleOfTheLL(head);
//        Node headSecond = reverseLL(mid);
//    }

    public static void main(String[]args){
        LL first = new LL();
        LL second = new LL();
        LL ans = new LL();
        first.insertFirst(1);
        first.insertFirst(3);
        first.insertFirst(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);
        second.insertLast(20);

        ans = LL.merge(first,second);
        ans.display();


    }
}
