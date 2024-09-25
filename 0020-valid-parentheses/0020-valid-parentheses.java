class Solution {
    public boolean isValid(String s) {

       
        
        Stack<Character> st = new Stack<>();
         int n = s.length();
         
         for(int i=0;i<n;i++){
            //opening
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
             //closing
            else{
                if(st.isEmpty()==true) return false;
                if(s.charAt(i)==')' && st.peek( )== '('){
                    st.pop();
                }
                else if(s.charAt(i)== ']' && st.peek()=='['){
                    st.pop();

                }
                else if(s.charAt(i)=='}' && st.peek()=='{'){
                    st.pop();
                }
                else {
                    return false;
                }

                
            }
         
         }
            if(st.isEmpty()) return true;
         
            return false;
         
        
         



    }
}