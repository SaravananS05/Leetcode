class Solution {
    public int backtrack(int start,int n,int k,int j,List<List<Integer>> res,List<Integer> curr){
        if(j==k){
            j=0;
            res.add(new ArrayList<>(curr));
            return 0;
        }
        for(int i=start;i<=n;i++){
            curr.add(i);
            backtrack(i+1,n,k,j+1,res,curr);
            curr.remove(curr.size()-1);
        }
        return 0;
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(1,n,k,0,res,curr);
        return res;
        
    }
}