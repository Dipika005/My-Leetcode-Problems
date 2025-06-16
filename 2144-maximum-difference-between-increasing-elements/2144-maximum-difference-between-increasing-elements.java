class Solution {
    public int maximumDifference(int[] nums) {
       int i=0;
       int tempmax=0;
       int ans=0;

       for(int j=1;j<nums.length;j++){
        if(i<j && nums[i]<nums[j]){
          tempmax= nums[j]-nums[i];
          if(tempmax>ans){
            ans=tempmax;
          }
        }
        else{
            i=j;
        }
       }
       if(ans==0){
        return -1;
       }
       return ans;
        
    }
}