class Solution {
    public int numTilings(int n) {
          // Base cases
        long[] dp = {1, 2, 5};
        if (n <= 3) return (int)dp[n-1];
        
        // Iterative calculation for n >= 4
        for (int i = 4; i <= n; i++) {
            long current = (2 * dp[2] + dp[0]) % 1000000007;
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = current;
        }
        
        return (int)dp[2];
    }
}