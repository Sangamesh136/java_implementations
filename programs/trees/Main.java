import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
//        tree.display();
//        tree.prettyDisplay();

//        BST tree = new BST();
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        tree.populate(arr);
//        tree.display();
//       System.out.println(tree.isEmpty());

//        AVLTree tree = new AVLTree();
//        for(int i = 0;i<1000;i++) tree.insert(i);
//        System.out.println(tree.height());

        int [] a = {3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(a);
//        tree.display();
        System.out.println(tree.query(1,6));

    }

}
