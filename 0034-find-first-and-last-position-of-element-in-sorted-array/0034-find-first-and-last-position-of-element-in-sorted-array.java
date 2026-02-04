class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = new int[]{-1,-1};
        int l=0;
        int h=nums.length-1;

        while(l<=h){
            int mid= l+(h-l)/2;

            if(nums[mid]==target){
                int m1=mid;
                int m2=mid;
                
                while(m1>0 && nums[m1]==nums[m1-1]) m1--;
                while(m2<nums.length-1 && nums[m2]==nums[m2+1]) m2++;
                ans[0]=m1;
                ans[1]=m2;
                return ans;
            }
            else if(nums[mid]>target) h=mid-1;

            else l=mid+1;
        }
        return ans;
    }
}