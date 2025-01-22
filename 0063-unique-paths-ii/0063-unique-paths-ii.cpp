class Solution {
public:
    int solve(int i,int j,int m,int n,vector<vector<int>>&dp,vector<vector<int>>&gr){
        if(i>=m || j>=n || gr[i][j]==1){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else{
            return dp[i][j] = solve(i+1,j,m,n,dp,gr)+solve(i,j+1,m,n,dp,gr);
        }
    }
    int uniquePathsWithObstacles(vector<vector<int>>& gr) {
        int m = gr.size();
        int n = gr[0].size();
        vector<vector<int>> dp(m+1,vector<int>(n+1,-1));
        return solve(0,0,m,n,dp,gr);
    }
};