class Solution {
    
    public int count(int[] nums, int l, int mid, int r){
        int right=mid+1;
        int cnt=0;
        for(int i=l;i<=mid;i++){
            while(right<=r && nums[i] > 2L * nums[right]) right++;
            cnt+=(right-(mid+1));
        }
        return cnt;
    }
    public int algo(int[] nums, int l, int r){
        int cnt=0;
        if(l>=r) return cnt;
        int mid=(l+r)/2;
        cnt+=algo(nums,l,mid);
        cnt+=algo(nums,mid+1,r);
        cnt+=count(nums, l, mid,r);
        merge(nums,l, mid, r);
        return cnt;
    }

    public void merge(int[] nums, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];
        int left = l;
        int right = mid + 1;
        int idx = 0;

        while (left <= mid && right <= r) {
            if (nums[left] <= nums[right]) {
                temp[idx++] = nums[left++];
            } else {
                temp[idx++] = nums[right++];
            }
        }

        while (left <= mid) temp[idx++] = nums[left++];
        while (right <= r) temp[idx++] = nums[right++];

        for (int i = 0; i < temp.length; i++) {
            nums[l + i] = temp[i];
        }
    }

    public int reversePairs(int[] nums) {
        return algo(nums,0,nums.length-1);
    }
}