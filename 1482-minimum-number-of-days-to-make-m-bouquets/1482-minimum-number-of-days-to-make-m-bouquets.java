class Solution {
    
    public boolean possible(int[] arr, int day , int bouquet, int flower_req){
        int cnt=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day) cnt++;
            else{
                ans+=cnt/flower_req;
                cnt=0;
            }
        }
        ans+=cnt/flower_req;
         if(ans>=bouquet) return true;
            return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        if(bloomDay.length<m*k) return -1;

        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        int ans=-1;
        for(int i=0;i<bloomDay.length;i++){
            low=Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);
        }

        while(low<=high){
            int mid=low+(high-low)/2;

            if(possible(bloomDay,mid,m,k)==true){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}