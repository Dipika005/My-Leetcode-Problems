class Solution {
    public int minMaxDifference(int num) {
        String str = Integer.toString(num);
        String str2 = str;

        int ind =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) !='9'){
                ind=i;
                break;
            }
        }
        if(ind<str.length()){
            str=str.replace(str.charAt(ind),'9');

        }
        str2=str2.replace(str2.charAt(0),'0');
        return Integer.parseInt(str) - Integer.parseInt(str2);

    }
}