class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int c1=0, e1=Integer.MIN_VALUE;
        int c2=0, e2=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if (nums[i] == e1) {
                c1++;
            }
            else if (nums[i] == e2) {
                c2++;
            }
            else if (c1 == 0) {
                e1 = nums[i];
                c1 = 1;
            }
            else if (c2 == 0) {
                e2 = nums[i];
                c2 = 1;
            }
            else {
                c1--;
                c2--;
            }
        }
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==e1) cnt1++;
            if(nums[i]==e2) cnt2++; 
        } 
        if(cnt1>n/3) ans.add(e1);
        if(cnt2>n/3) ans.add(e2);
        return ans;
    }
}