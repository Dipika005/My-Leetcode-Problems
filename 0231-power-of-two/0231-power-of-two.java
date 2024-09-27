class Solution {

    public boolean rec(int n){

        if(n<=0) return false;
        if(n==1) return true;

        if(n%2!=0) return false;
        return rec(n/2);
    }
    public boolean isPowerOfTwo(int n) {
        return rec(n);


        
    }
}