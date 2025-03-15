class Solution {
    public int backtrack(int start,int k,int n,List<List<Integer>> res,List<Integer> curr){
        if(curr.size() == k){
            if(n==0){
                res.add(new ArrayList<>(curr));
                return 0;
            }
        }
        if(n<0){
            return 0;
        }
        for(int i=start;i<=9;i++){
            curr.add(i);
            backtrack(i+1,k,n-i,res,curr);
            curr.remove(curr.size()-1);
        }
        return 0;
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(1,k,n,res,curr);
        return res;
    }
}