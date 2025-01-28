class Solution {
public:
    static bool compare(vector<int>&a , vector<int>&b){
        return a[1]<b[1];
    }
    int eraseOverlapIntervals(vector<vector<int>>& intervals) {
        int n = intervals.size();
        sort(intervals.begin(),intervals.end(),compare);

        int prev = 0;
        int count = 0;

        for(int i= 1 ;i < n ; i++){
            if(intervals[prev][1] <= intervals[i][0]){
                prev = i;
            }else{
                count++;
            }
        }
        return count;
    }
};