class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int maxlength = 1;
        int usedbits = 0;
        int left = 0;
        for(int right=0;right<n;right++){
            while((usedbits & nums[right]) != 0){
                usedbits ^= nums[left];
                left++;
            }
            usedbits |= nums[right];
            maxlength = Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}