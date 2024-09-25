class Solution {
    public int findlast(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid +1;
            }

            else if (arr[mid] > target) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;

    }

    public int findfirst(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
           int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;

    }

    public int[] searchRange(int[] nums, int target) {
        int ans[] = { -1, -1 };
        ans[0] = findfirst(nums, target);
        ans[1] = findlast(nums, target);
        return ans;

    }

}
