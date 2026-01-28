class Solution {
    public void swap(int [] nums, int a , int b){
        int t=nums[a];
        nums[a]=nums[b];
        nums[b]=t;
    }

    public void rev(int[] nums, int a, int b){
        while(a<b){
            swap(nums,a,b);
            a++;
            b--;
        }
    }

    public void nextPermutation(int[] nums) {
        int idx=-1;

        // find pivot
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        // if no pivot, reverse whole array
        if(idx==-1){
            rev(nums,0,nums.length-1);
            return;
        }
      
        //  find next greater element
        for(int i=nums.length-1;i>idx;i--){
            if(nums[i]>nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }
        rev(nums,idx+1,nums.length-1);
        
    }
}