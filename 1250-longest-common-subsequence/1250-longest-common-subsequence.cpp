class Solution {
public:
    int LCS(int i,int j,string& t1,string& t2,vector<vector<int>>&dp){
        if(i>=t1.size() || j>=t2.size()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(t1[i]==t2[j]){
            return dp[i][j] = 1 + LCS(i+1,j+1,t1,t2,dp);
        }
        else{
            return dp[i][j] = max(LCS(i+1,j,t1,t2,dp),LCS(i,j+1,t1,t2,dp));
        }
    }
    int longestCommonSubsequence(string text1, string text2) {
        int n1 = text1.size();
        int n2 = text2.size();
        vector<vector<int>> dp(n1+1,vector<int>(n2+1,-1));
        return LCS(0,0,text1,text2,dp);
    }
};