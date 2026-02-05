class Solution {
    public int findPeakElement(int[] nums) {
        int ans=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>nums[i+1]) ans=i;
        }
        return ans;
    }
}