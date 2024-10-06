class Solution {
    public List<Integer> majorityElement(int[] nums) {

        // Boyer Moore Voting Algo Start
        int num1 = -1;
        int num2 = -1;
        int count1 = 0;
        int count2 = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == num1)
                count1++;

            else if (nums[i] == num2)
                count2++;

            else if (count1 == 0) {
                num1 = nums[i];
                count1 = 1;
            }

            else if (count2 == 0) {
                num2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        //End

        List<Integer> ans = new ArrayList<Integer>();

        int cnt1=0;
        int cnt2=0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == num1)
                cnt1++;

            else if (nums[i] == num2)
                cnt2++;

        }
        if (cnt1 > n / 3) {
            ans.add(num1);
        }
        if (cnt2 > n / 3) {
            ans.add(num2);
        }
        return ans;

    }
}