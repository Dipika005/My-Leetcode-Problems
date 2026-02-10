class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        // USING 2 ARRAYS

        // edge case
        if(s.length()!=t.length()) return false;

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for(int i=0;i<s.length();i++){
            char sch = s.charAt(i);
            char tch = t.charAt(i);

            if(map1[sch]!=map2[tch]) return false;

            map1[sch]=i+1;          
            map2[tch]=i+1;
        }

        return true;
    }
}