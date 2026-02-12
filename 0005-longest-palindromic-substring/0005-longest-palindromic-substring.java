class Solution {

    int maxLen=0;
    int low =0;
    public String longestPalindrome(String s) {

        if(s.length()<2) return s;

        for(int i=0;i<s.length();i++){
            expand(s,i,i);              // for odd
            expand(s,i,i+1);            // for even
        }

        return s.substring(low,low+maxLen);
        
    }

    public void expand(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){       
            left--;          // <--left 
            right++;          // right --> 
        }

        int len=right-left-1;
        if(maxLen<len){
            maxLen=len;
            low=left+1;
        }
    }
}