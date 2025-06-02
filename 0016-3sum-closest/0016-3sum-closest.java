class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n= nums.length;
        Arrays.sort(nums);

        int closest=Integer.MAX_VALUE / 2;

        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;

            while(j<k){
                int curr= nums[i]+nums[j]+nums[k];

                if(Math.abs(curr-target)<Math.abs(closest-target)){
                    closest=curr;
                }
                if(curr<target) j++;
                else if(curr>target) k--;
                else return curr;
            }
        }
        return closest;
    }
}