class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> arr= new ArrayList<>();
        k=k%nums.length;

        for(int i=nums.length-k;i<nums.length;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<nums.length-k;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
    }
}