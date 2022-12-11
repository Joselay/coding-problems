class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            public int compare(ListNode a, ListNode b) {
                return a.val - b.val;
            }
        });
        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }
        
        while (!pq.isEmpty()) {
            tail.next = pq.poll();
            tail = tail.next;
            
            if (tail.next != null) {
                pq.add(tail.next);
            }
        }
        
        return dummy.next;
    }
}
