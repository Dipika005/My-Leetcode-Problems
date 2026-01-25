class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        int i=0;
        int j=k-1;
        while(j<n){
            int diff=nums[j]-nums[i];
            ans=Math.min(ans,diff);
            i++;
            j++;
        }
        return ans;
    }
}