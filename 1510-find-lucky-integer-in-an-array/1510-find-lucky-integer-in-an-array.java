class Solution {
    public int findLucky(int[] arr) {

        Arrays.sort(arr);

        int cnt=1; 
        int ans=-1;

        for(int i=1;i<arr.length;i++){

            if(arr[i]==arr[i-1]){
                cnt++;

            }
            else{

            if(arr[i]!=arr[i-1] && cnt==arr[i-1]){
                ans=Math.max(ans,cnt);
               
            }
             cnt=1;
            }
        }
       
        

      if(cnt==arr[arr.length-1]){
      ans=Math.max(ans,cnt);
      }

      return ans;
        
    }
}