class NumArray {
    int[] nums;
    int[] tree;
    int n;

    public NumArray(int[] nums) {
        this.nums = nums;
        n = nums.length;
        tree = new int[n * 4];
        buildTree(0, 0, n - 1);
    }

    private void buildTree(int node, int start, int end) {
        if (start == end) {
            tree[node] = nums[start];
        } else {
            int mid = start + end >> 1;
            buildTree(node * 2 + 1, start, mid);
            buildTree(node * 2 + 2, mid + 1, end);
            tree[node] = tree[node * 2 + 1] + tree[node * 2 + 2];
        }
    }

    public void update(int i, int val) {
        update(0, 0, n - 1, i, val);
    }

    private void update(int node, int start, int end, int idx, int val) {
        if (start == end) {
            tree[node] = val;
            nums[idx] = val;
        } else {
            int mid = start + end >> 1;
            if (start <= idx && idx <= mid) {
                update(node * 2 + 1, start, mid, idx, val);
            } else {
                update(node * 2 + 2, mid + 1, end, idx, val);
            }
            tree[node] = tree[node * 2 + 1] + tree[node * 2 + 2];
        }
    }

    public int sumRange(int i, int j) {
        return sumRange(0, 0, n - 1, i, j);
    }

    private int sumRange(int node, int start, int end, int l, int r) {
        if (r < start || end < l) {
            return 0;
        }
        if (l <= start && end <= r) {
            return tree[node];
        }
        int mid = start + end >> 1;
        int p1 = sumRange(node * 2 + 1, start, mid, l, r);
        int p2 = sumRange(node * 2 + 2, mid + 1, end, l, r);
        return p1 + p2;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */
