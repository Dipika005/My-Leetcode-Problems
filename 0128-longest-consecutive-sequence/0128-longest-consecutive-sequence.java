class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> st = new HashSet<>();

        for(int num:nums) st.add(num);

        int max=0;

        for(int ele : st){
            if(!st.contains(ele-1)){
                int currNum= ele;
                int currlen=1;
                while(st.contains(currNum+1)){
                    currlen++;
                    currNum++;
                }
                max= Math.max(max,currlen);
            }
        }
        return max;
    }
}