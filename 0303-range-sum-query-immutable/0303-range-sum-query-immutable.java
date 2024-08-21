class NumArray {
    int arr[];
      public NumArray(int[] nums) {
        arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i] =nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int sums=0;
        for(int i=left;i<=right;i++)
        {
            sums =  sums+arr[i];
        }return sums;
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
   