/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let n = prices.length;
    if (n === 0) return 0;
    let dp = new Array(n);
    for (let i = 0; i < n; i++) {
        dp[i] = new Array(2).fill(0);
    }
    dp[0][0] = 0;
    dp[0][1] = -prices[0];
    for (let i = 1; i < n; i++) {
        dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
        if (i >= 2) {
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 2][0] - prices[i]);
        } else {
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }
    }
    return dp[n - 1][0];
};
