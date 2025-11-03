class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }else{
                hm.put(ch,hm.get(ch)+1);
            }
        }    

            for(int i=0;i<t.length();i++){
                Character ch = t.charAt(i);
                if(!hm.containsKey(ch)){
                    return false;
                }else{
                    hm.put(ch,hm.get(ch)-1);
                }
            }

            for(Integer i : hm.values()){
                if(i!=0) return false;
            }

        return true;
        
    }
}