class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        return ways(m,n,dp);
    }
    public static int ways(int a,int b,int[][] dp){
        if(a==1 ||b==1 ) return 1;
        if(dp[a][b]!=0) return dp[a][b];
        dp[a][b]=ways(a-1,b,dp)+ways(a,b-1,dp);
        return dp[a][b];
    }
}