class Solution {
    public int findMinMoves(int[] machines) {
        int n = machines.length;
        int res = 0,sum = 0,currSum = 0;
        int target = 0;
        for(int m : machines){
            sum+=m;
        }
        if(sum%n==0){
            target = sum/n;
        }
        else{
            return -1;
        }
        for(int i=0;i<n;i++){
            int diff = machines[i] - target;
            currSum += diff;
            res = Math.max(res,Math.max(Math.abs(currSum),diff));
        }
        return res;
    }
}