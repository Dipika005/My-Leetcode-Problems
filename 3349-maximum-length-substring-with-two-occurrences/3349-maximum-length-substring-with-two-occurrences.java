class Solution {
    public int maximumLengthSubstring(String s) {
        int arr[]= new int[26];
        int n = s.length();
        int l=0;
        int r=0;
        int max =0;

        while(r<n){
            arr[s.charAt(r)-'a']++;
            while(arr[s.charAt(r)-'a'] > 2 && l<r){
                arr[s.charAt(l)-'a']--;
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
        
        
    }
}