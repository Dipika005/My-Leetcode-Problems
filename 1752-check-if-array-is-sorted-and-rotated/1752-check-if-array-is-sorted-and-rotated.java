class Solution {
    public boolean check(int[] nums) {
        int n= nums.length;
        int limit=0;
        int i=0;
        while(i<n){
            if(nums[i]>nums[(i+1)%n]) limit++;
            i++;
        }
        if(limit<=1) return true;
        return false;
    }
}