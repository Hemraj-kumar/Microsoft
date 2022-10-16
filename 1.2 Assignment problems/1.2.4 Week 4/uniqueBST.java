class Solution {
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        dp[0]=dp[1]=1;
        for(int index=2;index<=n;index++){
            for(int ctr=1;ctr<=index;ctr++){
                dp[index]+=dp[ctr-1]*dp[index-ctr];
            }
        }
        return dp[n];
    }
}