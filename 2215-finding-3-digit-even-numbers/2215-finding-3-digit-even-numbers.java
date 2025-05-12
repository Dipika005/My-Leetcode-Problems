class Solution {
    public int[] findEvenNumbers(int[] digits) {
         int[] feq = new int[10];
        int[] ans = new int[451];
        int size = 0;

        for(int i=0;i<digits.length;i++) feq[digits[i]]++;
        for(int i=1;i<10;i++) {
            if(feq[i] == 0) continue;
            feq[i]--;
            for(int j=0;j<10;j++) {
                if(feq[j] == 0) continue;
                feq[j]--;
                for(int k=0;k<10;k+=2) {
                    if(feq[k] == 0) continue;
                    ans[size++] = 100 * i + 10 * j + k;
                }
                feq[j]++;
            }
            feq[i]++;
        }
        return Arrays.copyOf(ans, size);
    }
}