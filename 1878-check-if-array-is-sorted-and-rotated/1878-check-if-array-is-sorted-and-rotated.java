class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int temp[]= new int[2*n];
         int j =0;
         for(int i=0;i<n;i++){
            temp[j]=nums[i];
            j++;
            
         }
           for(int i=0;i<n;i++){
            temp[j]=nums[i];
            j++;
            
         }
         Arrays.sort(nums);
         for(int i=0;i<2*n;i++){
            if(temp[i]==nums[0])  {
                j=0;
                int x=i;
                while(x<2*n && j<n){
                    if(temp[x]!= nums[j])
                    break;
                    x++;
                    j++;
                }
                if(j==n )return true;
            }       
         }
         return false;
    }
}