class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k)-atMost(nums,k-1);
    }

    public int atMost(int[] nums, int k){
        int left=0;
        int count=0;
        int sum=0;

        for(int r=0;r<nums.length;r++){
            if(k<0) return 0;
            sum+=nums[r]%2;

            while(sum>k){
                sum-=nums[left]%2;
                left++;
            }

            count+=(r-left+1);
        }
        return count;
    }
}