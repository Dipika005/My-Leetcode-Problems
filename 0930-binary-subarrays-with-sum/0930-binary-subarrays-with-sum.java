class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);
        // atMost(nums,goal) = gives all subarr with less then or equal goal
        // atMost(nums,goal-1) = gives subarr with less than goal
    }

    public int atMost(int[] nums, int target){
        int l=0;
        int cnt=0;
        int sum=0;

        for(int r=0;r<nums.length;r++){
            if(target<0) return 0;        // edge case (for goal-1)
            sum+=nums[r];
            while(sum>target){
                sum-=nums[l];
                l++;
            }
            cnt+=(r-l+1);
        }

        return cnt;
    }
}