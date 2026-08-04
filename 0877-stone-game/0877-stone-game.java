class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[] dp = piles.clone();

        for(int i=2; i<=n; i++){
            for(int j=0; j+i-1<n; j++){
                int z = j + i - 1;
                dp[j] = Math.max(piles[j] - dp[j+1], piles[z] - dp[j]);
            }
        } return dp[0] > 0;
    }
} 