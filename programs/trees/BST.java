class BST {
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
    public BST(){

    }

    public int height (Node node){
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
        return node;
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
