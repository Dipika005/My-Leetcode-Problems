class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n=nums.length;
        int[] ans={-1};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<n;i++){
            if(!hm.containsKey(target-nums[i])){
                hm.put(nums[i],i);
            }
            else{
                ans=new int[]{i,hm.get(target-nums[i])};
            }
        }
        return ans;

    }
}

// TC : O(N)
// SC : O(N)