class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int ele:weights){
            low=Math.max(ele,low);
            high+=ele;
        }
        int ans=0;

        while(low<=high){

            int mid = low+(high-low)/2;

            int day=1;
            int load=0; 
            for(int i=0;i<n;i++){
                if(load+weights[i]>mid){
                    day++;
                    load=weights[i];
                }
                else{
                    load+=weights[i];
                }
            }

            if(day<=days){
                ans = mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        
        return ans;

    }
}