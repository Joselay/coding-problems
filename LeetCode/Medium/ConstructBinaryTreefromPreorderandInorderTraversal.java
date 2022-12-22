import java.util.HashMap;

public class Solution {
    private HashMap<Integer, Integer> map = new HashMap<>();
    private int[] preorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(0, 0, inorder.length - 1);
    }

    private TreeNode helper(int preStart, int inStart, int inEnd) {
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inIndex = map.get(root.val);
        root.left = helper(preStart + 1, inStart, inIndex - 1);
        root.right = helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd);
        return root;
    }
}
