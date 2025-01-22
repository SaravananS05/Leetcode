class Solution {
public:
    int solve(int i,int j,int m,int n,vector<vector<int>> &dp,vector<vector<int>> &grid){
        if(i>=m || j>=n){
            return INT_MAX;
        }
        if(i==m-1 && j==n-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else{
            return dp[i][j] = grid[i][j] + min(solve(i+1,j,m,n,dp,grid),solve(i,j+1,m,n,dp,grid));
        }
    }
    int minPathSum(vector<vector<int>>& grid) {
        vector<vector<int>>dp(grid.size()+1,vector<int>(grid[0].size()+1,-1));
        return solve(0,0,grid.size(),grid[0].size(),dp,grid);
    }
};