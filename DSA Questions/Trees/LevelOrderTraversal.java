//import javax.swing.tree.TreeNode;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class LevelOrderTraversal {
//    public static void main(String[] args){
//
//    }
//    public List<List<Integer>> levelOrder(TreeNode root){
//        Queue<TreeNode> queue = new LinkedList<>();
//        List<List<Integer>> ans = new LinkedList<List<Integer>>();
//        if(root == null){
//            return ans;
//        }
//        queue.offer(root);
//        if(!queue.isEmpty()){
//            int levelSize = queue.size();
//            List<Integer> subList = new LinkedList<Integer>();
//            for(int i = 0; i<levelSize;i++){
//                if(queue.peek().left != null) queue.offer(queue.peek().left);
//                if(queue.peek().right != null) queue.offer(queue.peek().right);
//            }
//        }
//        return
//    }
//}
