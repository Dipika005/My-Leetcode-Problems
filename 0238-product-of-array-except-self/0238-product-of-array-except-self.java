class Solution {
    public int[] productExceptSelf(int[] nums) {
        
     int n= nums.length;
     int prefix[]=new int[n];
     int suffix[]= new int[n];
     int ans[] = new int[n];

     int x=1;
     for(int i=0;i<n;i++){
        prefix[i]=x;
        x*=nums[i];
     }
     int y=1;
     for(int i=n-1;i>=0;i--){
        suffix[i]=y;
        y*=nums[i];
     }
     for(int i=0;i<n;i++){
        ans[i]=prefix[i]*suffix[i];
     }
     return ans;
    }
}