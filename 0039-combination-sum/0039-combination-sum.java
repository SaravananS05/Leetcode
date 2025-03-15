class Solution {
    public int backtrackCombinationSum(int start,int[] candidates,List<List<Integer>> res,List<Integer> curr,int target){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return 0;
        }
        if(target<0){
            return 0;
        }
        for(int i=start;i<candidates.length;i++){
            curr.add(candidates[i]);
            backtrackCombinationSum(i,candidates,res,curr,target-candidates[i]);
            curr.remove(curr.size()-1);
        }
        return 0;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrackCombinationSum(0,candidates,res,curr,target);
        return res;
    }
}