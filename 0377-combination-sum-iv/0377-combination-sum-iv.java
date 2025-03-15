import java.util.*;

class Solution {
    public int backtrack(int target, int[] nums, Map<Integer, Integer> memo) {
        if (target == 0){
            return 1;
        } 
        if (target < 0){
            return 0;
        } 
        if (memo.containsKey(target)){
            return memo.get(target);
        }
        
        int res = 0;
        for (int num : nums) {
            res += backtrack(target - num, nums, memo);
        }

        memo.put(target, res);
        return res;
    }

    public int combinationSum4(int[] nums, int target) {
        return backtrack(target, nums, new HashMap<>());
    }
}
