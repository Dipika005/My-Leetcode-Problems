class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder ans=new StringBuilder();

        int count=0;
        int start=0;
        int end=0;

        while(end<s.length()){
            if(s.charAt(end)== '(') count++;
            else count--;

            if(count==0){
                ans.append(s.substring(start+1,end));
                start=end+1;
            }
            end++;
        }
        return ans.toString();
    }
}