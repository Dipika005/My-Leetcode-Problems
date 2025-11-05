class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int ele : nums){
            if(!hm.containsKey(ele)) hm.put(ele,1);
            else hm.put(ele,hm.get(ele)+1);
        }

        List<Integer> list = new ArrayList<Integer>(hm.keySet());
        Collections.sort(list,(a,b)->{
            if(hm.get(a)==hm.get(b)) return b-a;
            return hm.get(a) - hm.get(b);
        });

        int[] ans= new int[nums.length];
        int idx=0;
        for(int num:list){
            for(int i=0;i<hm.get(num);i++){
                ans[idx]=num;
                idx++;
            }
        }
        return ans;
        
    }
}