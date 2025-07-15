class Solution {
    public boolean isValid(String word) {

        if(word.length()<3) return false;

        int cnt = 0;
        int cnt1 = 0;

        for(int i=0;i<word.length();i++){
            char c =word.charAt(i);
            if((c>='a' && c<='z') || c>='A' && c<='Z'){
                c=Character.toLowerCase(c);
                if(c=='a' || c=='i' || c=='o' || c=='e' || c=='u'){
                    cnt++;
                }else{
                    cnt1++;
                }
            }
            else if(c>='0' && c<='9'){
                continue;
            }
            else{
                return false;
            }
        }

        return cnt>0 && cnt1>0;
    }
}