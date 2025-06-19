class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int min=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]-nums[min]>k){
                count++;
                min=i;
            }
        }
        count++;
        return count;
    }
}