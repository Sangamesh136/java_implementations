class AVLTree {
    public class Node{
        int value;
        int height;
        Node right;
        Node left;
        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public AVLTree(){

    }
    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node==null) return -1;
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void display(){
        display(root, "Root node:");
    }
    public void display(Node node, String details){
        if(node == null) return;
        System.out.println(details + node.getValue());
        display(node.left,"left node of " + node.getValue() + ":");
        display(node.right,"right node of " + node.getValue() + ":");
    }
    public void insert(int value){
        root = insert(root,value);
    }
    private Node insert(Node node, int value){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(node.left, value);
        }
        if(value > node.value){
            node.right = insert(node.right, value);
        }
        node.height = Math.max(height(node.left), height(node.right)) +1;
        return rotate(node);
    }
    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
//            left heavy(2 cases)
            if(height(node.left.left)-height(node.left.right)>0){
//                left left case (Right rotate P)
                return rightRotate(node);
            } else {
//                left right case(first left rotate then right rotate)
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.right) - height(node.left) >1){
//            right heavy
            if(height(node.right.right)-height(node.right.left)>0){
//                right-right case
                return leftRotate(node);
            } else {
//                right - left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    private Node rightRotate(Node p){
        Node c= p.left;
        Node t = c.right;
        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left),height(p.right) +1);
        c.height = Math.max(height(c.left),height(c.right) +1);
        return c;
    }
    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;
        p.left = c;
        c.right = t;
        p.height = Math.max(height(p.left),height(p.right) +1);
        c.height = Math.max(height(c.left),height(c.right) +1);
        return p;
    }
    public void isBalanced(){
        isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if(node == null) return true;
        return Math.abs(height(node.right)- height(node.left)) <=1 && isBalanced(node.left) && isBalanced(node.right);
    }
    public void populate(int[] nums){
        for(int i = 0; i<nums.length;i++){
            this.insert(nums[i]);
        }
    }
    public void populateWithSorted(int[] nums){
        populateWithSorted(nums,0, nums.length);
    }
    private void populateWithSorted(int[]nums,int start, int end){
        if(start>= end) return;
        int mid = (start+end)/2;
        this.insert(nums[mid]);
        populateWithSorted(nums,start,mid);
        populateWithSorted(nums,mid+1,nums.length);
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null) return;
        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);

    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null) return;
        inOrder(node.left);
        System.out.println(node.value + " ");
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");

    }
}
