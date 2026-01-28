class Solution {
    public int majorityElement(int[] nums) {
        // Moore’s Voting Algorithm

        int ele=0;
        int cnt=0;

       for(int i=0;i<nums.length;i++){
        if(cnt==0){
            ele=nums[i];
        }
        if(nums[i]==ele) cnt++;
        else cnt--;
       }

       // checking 
       int finalcnt=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==ele) finalcnt++;
       }

       if(finalcnt>nums.length/2) return ele;
       return -1;
    }
}