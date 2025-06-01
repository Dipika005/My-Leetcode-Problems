class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
        int m = nums1.length;
        int n=nums2.length;
         int[] nums3 = new int[m+n];
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                nums3[i+j]=nums1[i];
                i++;
            }
            else{
                nums3[i+j]=nums2[j];
                j++;
            }
        }
        while(i<m){
            nums3[i+j]=nums1[i];
            i++;
        }
         while(j<n){
            nums3[i+j]=nums2[j];
            j++;
        }
        if((m+n)%2==0){
            return (double) (nums3[(m+n)/2] + nums3[(n+m)/2-1])/2;
        }
        else{
            return (double) nums3[(n+m)/2];
        }
    }
}