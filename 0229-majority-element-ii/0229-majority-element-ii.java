class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int cnt=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                cnt++;
            }
            else{
                if(cnt>(n/3)) ans.add(nums[i-1]);
                cnt=1;
            }   
        }
         // check last element group
        if (cnt > n / 3)
            ans.add(nums[n - 1]);
        return ans;
    }
}