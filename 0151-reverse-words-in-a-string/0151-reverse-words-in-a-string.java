class Solution {
    public String reverseWords(String s) {
        
        // TWO POINTER APPROACH

        StringBuilder ans = new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)== ' ') i--;    // stands at last letter of word
            if(i<0) break;

            int j=i;
            while(j>=0 && s.charAt(j)!=' ') j--;     // stands at white space before first letter of word

            ans.append(s.substring(j+1,i+1)).append(" ");
            i=j;
        }

        return ans.toString().trim();
    }
}