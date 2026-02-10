class Solution {
    public String reverseWords(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder res= new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
            if(st.isEmpty() && s.charAt(i)== ' ') continue;
            if(s.charAt(i)==' '){
                while(st.size()!=0) res.append(st.pop());
                res.append(' ');
            }
            else {
                st.push(s.charAt(i));
            }
        }

        while(st.size()!=0) res.append(st.pop());

        return res.toString().trim();
    }
}                                                                 