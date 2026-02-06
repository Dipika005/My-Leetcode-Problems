class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            high=Math.max(high,nums[i]);
        }
        int ans=0;

        while(low<=high){
            int mid=low+(high-low)/2;

            long hrs=0;
            for(int i=0;i<nums.length;i++){
                hrs+=(int)Math.ceil((double)nums[i]/mid);
            }
            if(hrs<=h){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}