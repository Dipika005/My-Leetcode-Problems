class Solution {
    public int romanToInt(String s) {
        
        // create hasmap for mapping symbol to value;
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int ans=0;
        for(int i=0;i<s.length();i++){
            int currVal=hm.get(s.charAt(i));        // gets int value of curr roman
            if(i+1<s.length() && currVal<hm.get(s.charAt(i+1))) ans-=currVal;       
            else ans+=currVal;
        }

        return ans;
    }
}