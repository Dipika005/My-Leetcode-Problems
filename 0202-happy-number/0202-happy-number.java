class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> li = new HashSet<>();
       // List<Integer> li = new ArrayList<>()
        li.add(n);

        while (true) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum = sum + digit * digit;
                n = n / 10;
            }

            
            if(sum == 1)  return true;
            
            if(li.contains(sum)==true) break;

            li.add(sum);
        
            n=sum;
        }
        return false;

    }
}