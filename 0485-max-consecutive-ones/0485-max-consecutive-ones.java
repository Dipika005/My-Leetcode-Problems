class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE;
        int cnt=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]==1){
                cnt++;
                i++;
            }
            else{
                cnt=0;
                i++;
            }
            max= Math.max(cnt,max);
        }
        return max;
    }
}