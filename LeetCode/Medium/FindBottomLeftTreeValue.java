import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public int findBottomLeftValue(TreeNode root) {
        int bottomLeftValue = 0;
        
        if (root == null) {
            return bottomLeftValue;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            boolean isFirstNode = true;
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                
                if (isFirstNode) {
                    bottomLeftValue = current.val;
                    isFirstNode = false;
                }
                
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
        
        return bottomLeftValue;
    }

}
