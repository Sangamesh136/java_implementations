// TO DELETE THE LAST NODE OF A LINKED LIST

package LinkedList.src;
class LL{
    private Node head;
    private int size;

    public LL(){this.size = 0;}

    public void add(int val, int index){
        Node current = head;
        Node node = new Node(val);
        if(index == 0){
            node.next = head;
            head = node;
        } else {

            while (current.next.next!= null){
                current = current.next;
            }
            current.next = null;
        }
    }
    public void delete(int index){
        Node current = head;
        if(index == 0){
            head= head.next;
        }
        else {
            while(current.next.next !=null){
                current = current.next;
            }
            current.next = null;
        }
    }
}
class Node{
    int value;
    Node next;
    public Node(int value){
        this.value = value;
    }
}
public class Question1 {

}
