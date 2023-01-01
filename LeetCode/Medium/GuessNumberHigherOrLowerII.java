class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];
        return helper(dp, 1, n);
    }

    private int helper(int[][] dp, int l, int r) {
        if (l >= r) return 0;
        if (dp[l][r] != 0) return dp[l][r];
        int res = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            int t = i + Math.max(helper(dp, l, i - 1), helper(dp, i + 1, r));
            res = Math.min(res, t);
        }
        dp[l][r] = res;
        return res;
    }
}
