class Solution {
    public int maxSubArray(int[] nums) {
        
        // KADANE'S ALGO

        int max=nums[0];
        int currSum=nums[0];

        for(int i=1;i<nums.length;i++){
            currSum=Math.max(nums[i],currSum+nums[i]);
            max=Math.max(currSum,max);
        }
        return max;
    }
}