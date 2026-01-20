class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        return pal(s,0,s.length()-1);
    }
    public boolean pal(String s, int l, int r){
        if(l>=r) return true;
        if(s.charAt(l)!=s.charAt(r)) return false;
        return pal(s,l+1,r-1);
    }
}