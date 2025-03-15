class Solution {
    public int backtrack(int start,int[] candidates,List<List<Integer>> res,List<Integer> curr,int target){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return 0;
        }
        if(target<0){
            return 0;
        }
        for(int i=start;i<candidates.length;i++){
            if (i > start && candidates[i] == candidates    [i - 1]){
                continue;
            }
            curr.add(candidates[i]);
            backtrack(i+1,candidates,res,curr,target-candidates[i]);
            curr.remove(curr.size()-1);
        }
        return 0;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(0,candidates,res,curr,target);
        return res;
    }
}