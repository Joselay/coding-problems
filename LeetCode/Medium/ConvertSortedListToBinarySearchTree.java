public class Solution {
    private ListNode head;

    public TreeNode sortedListToBST(ListNode head) {
        this.head = head;
        int size = 0;
        ListNode node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        return helper(0, size - 1);
    }

    private TreeNode helper(int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode leftNode = helper(left, mid - 1);
        TreeNode root = new TreeNode(head.val);
        root.left = leftNode;
        head = head.next;
        root.right = helper(mid + 1, right);
        return root;
    }
}
