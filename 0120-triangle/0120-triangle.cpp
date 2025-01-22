class Solution {
public:
    int solve(int i,int j,int m,vector<vector<int>>&triangle,vector<vector<int>>&dp){
        if(i==m-1){
            return triangle[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else{
            return dp[i][j] = triangle[i][j] + min(solve(i+1,j,m,triangle,dp),solve(i+1,j+1,m,triangle,dp));
        }
    }
    int minimumTotal(vector<vector<int>>& triangle) {
        int m = triangle.size();
        vector<vector<int>> dp(m);
        for (int i = 0; i < m; ++i) {
            dp[i] = vector<int>(triangle[i].size(), -1);
        }
        return solve(0,0,triangle.size(),triangle,dp);
    }
};