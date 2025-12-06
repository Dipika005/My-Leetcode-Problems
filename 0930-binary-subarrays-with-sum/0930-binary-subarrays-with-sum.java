class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int max=0;
        
        for(int right=0;right<nums.length;right++){
            int sum=0;
            for(int i=right;i<nums.length;i++){
                sum+=nums[i];
                if(sum==goal){
                    max++;
                }
                if(sum>goal) break;
            }
        }
        return max;
    }
}