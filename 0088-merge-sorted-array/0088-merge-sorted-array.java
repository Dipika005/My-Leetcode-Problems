class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1; // Last element in nums1 (excluding extra space)
        int j = n - 1; // Last element in nums2
        int k = m + n - 1; // Last position in nums1 (including extra space)

        // Merge from the end to the beginning
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If nums2 has remaining elements, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
        
    
}