class Solution {
    public int totalFruit(int[] fruits) {
        
        HashMap<Integer,Integer> map= new HashMap<>();

        int max=0;
        int left=0;

        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

            while(map.size()>2){
                int val = fruits[left];
                map.put(val,map.get(val)-1);
                if(map.get(val)==0) map.remove(val);
                left++;
            }

            max=Math.max(max,right-left+1);
        }
        return max;
    }
}