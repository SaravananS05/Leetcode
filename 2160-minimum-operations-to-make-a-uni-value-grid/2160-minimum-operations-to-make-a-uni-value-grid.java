class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int[] nums = new int[m*n];
        int index = 0;
        for(int[] grids : grid){
            for(int k:grids){
                nums[index++] = k;
            }
        }
        Arrays.sort(nums);
        int totOperation = 0;
        int mid = nums[nums.length/2];
        for(int k:nums){
            int temp = Math.abs(k-mid);
            if(temp%x != 0){
                return -1;
            }
            totOperation += temp/x;
        }
        return totOperation;
    }
}