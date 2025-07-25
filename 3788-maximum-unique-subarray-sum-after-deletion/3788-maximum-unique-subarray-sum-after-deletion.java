class Solution {
    public int maxSum(int[] nums) {

        Arrays.sort(nums);

        int prev=nums[nums.length-1];
        int res=prev;

        for(int i=nums.length-2;i>=0;i--){

            if(nums[i]<=0) return res;

            if(nums[i]!=prev) res+=nums[i];
            prev=nums[i];
        }

        return res;
        
    }
}