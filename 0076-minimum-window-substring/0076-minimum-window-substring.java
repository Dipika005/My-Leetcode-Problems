class Solution {
    public String minWindow(String s, String t) {
        // edge case 
        if(t.length()==1 && s.contains(t)) return t;

        int n=s.length();
        int m=t.length();

        int minLen=Integer.MAX_VALUE;
        int startIdx=-1;
        int left=0,right=0;
        int count=0;

        int[] hash = new int[256];

        // loading in arr for tracking t char
        for(int i=0;i<m;i++) hash[t.charAt(i)]++;

        while(right<n){
            if(hash[s.charAt(right)]>0) count++;  // t has this char
        

            hash[s.charAt(right)]--;
            while(count==m){
                if((right-left+1)<minLen){
                    minLen=right-left+1;
                    startIdx=left;
                }
                hash[s.charAt(left)]++;
                if(hash[s.charAt(left)]>0) count--;
                left++;
            }
            right++;
        }

        return startIdx==-1? "": s.substring(startIdx,startIdx+minLen);

    }
}