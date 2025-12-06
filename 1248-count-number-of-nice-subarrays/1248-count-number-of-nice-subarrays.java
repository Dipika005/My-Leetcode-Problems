class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count=0;
        int prefix=0;

        for(int i:nums){
            prefix+=i%2;

            if(map.containsKey(prefix-k)){
                count+=map.get(prefix-k);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}