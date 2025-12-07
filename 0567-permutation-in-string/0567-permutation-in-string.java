class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char ch:s1.toCharArray()){
            freq1[ch-'a']++;
        }

        int ws=s1.length(); // window size

        // first window
        for(int i=0;i<ws;i++){
            freq2[s2.charAt(i)-'a']++;
        }
        if(matches(freq1,freq2)) return true;

        // sliding window
        for(int j=ws;j<s2.length();j++){
            freq2[s2.charAt(j)-'a']++;       // adding ele to check firther new window 
            freq2[s2.charAt(j-ws)-'a']--;    // remove starting ele to shrink the window
            if(matches(freq1,freq2)) return true;
        }
        return false;
    }

    private boolean matches(int[] a, int[] b){
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}