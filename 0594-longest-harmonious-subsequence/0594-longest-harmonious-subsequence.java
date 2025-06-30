class Solution {
    public int findLHS(int[] nums) {
        
        Arrays.sort(nums);

        int result=0;
        int left=0;
        int right=1;

        while(right<nums.length){
            int diff= nums[right]-nums[left];

            if(diff==1) result = Math.max(result,right-left+1);

            if(diff<=1) right++;
            else left++;
        
        }
        return result;
    }
}