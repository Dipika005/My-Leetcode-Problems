class Solution {
    public void helper(int[] nums, int idx, List<List<Integer>> ans){
        int n= nums.length;
        if(idx==n-1){
            List<Integer> al = new ArrayList<>();
            for(int i=0;i<n;i++){
                al.add(nums[i]);
            }
            ans.add(al);
            return;
        }

        for(int i=idx;i<n;i++){
            swap(i,idx,nums);
            helper(nums,idx+1,ans);
            swap(i,idx,nums);
        }
    }
    public void swap(int i,int j, int[]arr){
        int t= arr[i];
        arr[i]= arr[j];
        arr[j]=t;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        helper(nums,0,ans);
        return ans;
    }
}