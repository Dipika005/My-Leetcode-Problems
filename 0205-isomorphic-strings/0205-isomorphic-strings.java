class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        // TWO HASHMAP APPROACH 
        // (to avoid containsValue time(o(n) which is used if we use one hashmap approach(o(n^2))

        if(s.length()!=t.length()) return false;

        HashMap<Character, Character> hm = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char sch = s.charAt(i);
            char tch = t.charAt(i);

            if(hm.containsKey(sch) && hm.get(sch)!=tch) return false;
            if(hm2.containsKey(tch) && hm2.get(tch)!=sch) return false;

            hm.put(sch,tch);
            hm2.put(tch,sch);
        }

        return true;

    }
}