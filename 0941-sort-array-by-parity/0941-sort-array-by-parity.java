class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even=0;
        int arr[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){

        if(nums[i]%2==0){
        arr[even]=nums[i];
        even++;
        }

        
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                arr[even]=nums[i];
                even++;
            }
        }
        return arr;
        
    }
}