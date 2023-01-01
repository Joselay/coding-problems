class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            dfs(i, n, res);
        }
        return res;
    }

    private void dfs(int cur, int n, List<Integer> res) {
        if (cur > n) return;
        res.add(cur);
        for (int i = 0; i < 10; i++) {
            dfs(cur * 10 + i, n, res);
        }
    }
}
