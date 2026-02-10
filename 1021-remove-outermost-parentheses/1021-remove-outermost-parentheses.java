class Solution {
    public String removeOuterParentheses(String s) {
        
        // STACK APPROACH
        Stack<Character> st = new Stack<>();
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== '('){ 
                if(!st.isEmpty()){           // not empty
                    ans.append(s.charAt(i));
                }
                st.push(s.charAt(i));        // empty
            }
            else{
                st.pop();
                if(!st.isEmpty()){       // not empty after popping out
                    ans.append(s.charAt(i));
                }
            }
        }
        return ans.toString();
    }
}