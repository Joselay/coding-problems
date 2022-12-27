/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} node
 * @return {void}
 */
var deleteNode = function(node) {
    node.val = node.next.val;
    node.next = node.next.next;
};
