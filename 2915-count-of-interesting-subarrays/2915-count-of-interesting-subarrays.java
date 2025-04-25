class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
      Map<Integer, Long> freq = new HashMap<>();
        freq.put(0, 1L); 

        long res = 0;
        int count = 0;

        for (int num : nums) {
            if (num % modulo == k) count++;

            int currMod = count % modulo;
            int targetMod = (currMod - k + modulo) % modulo;

            res += freq.getOrDefault(targetMod, 0L);
            freq.put(currMod, freq.getOrDefault(currMod, 0L) + 1);
        }

        return res;
    }
}