class Solution {
    public int mySqrt(int x) {
        

        int ans = 0;
        long first = 1;
        long last = x;

        while (first <= last) {

            long mid = (first+last)/ 2;

            if (mid * mid == x) {
                return (int) mid;
            }

            else if (mid * mid < x) {
                ans =(int) mid;
                 first = mid + 1;

            }

            else {
                last = mid - 1;
            }

        }
        return ans;

    }
}