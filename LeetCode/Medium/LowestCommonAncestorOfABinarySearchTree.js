/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {TreeNode}
 */
var lowestCommonAncestor = function(root, p, q) {
    if (p.val > root.val && q.val > root.val)
        return lowestCommonAncestor(root.right, p, q);
    else if (p.val < root.val && q.val < root.val)
        return lowestCommonAncestor(root.left, p, q);
    else
        return root;
};
