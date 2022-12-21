class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (n <= 0 || k <= 0 || k > n) return result;
        dfs(result, new ArrayList<>(), 1, n, k);
        return result;
    }
    
    private void dfs(List<List<Integer>> result, List<Integer> temp, int start, int n, int k) {
        if (k == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i <= n; i++) {
            temp.add(i);
            dfs(result, temp, i + 1, n, k - 1);
            temp.remove(temp.size() - 1);
        }
    }
}
