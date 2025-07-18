class Solution {
    public long minimumDifference(int[] nums) {
        int m = nums.length, n = m / 3;
        long[] pre = new long[m + 1];
        long[] suf = new long[m + 1];

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        long s = 0;
        // Calculate min sum for left half using max heap
        for (int i = 1; i <= 2 * n; ++i) {
            s += nums[i - 1];
            maxHeap.offer(nums[i - 1]);
            if (maxHeap.size() > n) {
                s -= maxHeap.poll();
            }
            pre[i] = s;
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        s = 0;
        // Calculate max sum for right half using min heap
        for (int i = m; i > n; --i) {
            s += nums[i - 1];
            minHeap.offer(nums[i - 1]);
            if (minHeap.size() > n) {
                s -= minHeap.poll();
            }
            suf[i] = s;
        }

        long ans = Long.MAX_VALUE;
        for (int i = n; i <= 2 * n; ++i) {
            ans = Math.min(ans, pre[i] - suf[i + 1]);
        }
        return ans;
    }
}