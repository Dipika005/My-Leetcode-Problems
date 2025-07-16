class Solution {
    public int maximumLength(int[] nums) {
        
        int even =0;
        int odd =0;
        int evenOdd = 0;
         int oddEven = 0;
       int e1 =0;
       int e2 = 0;
       for(int i =0;i<nums.length;i++){
         if(nums[i]%2 == 0){
           even++;
           if(e1 ==0 ){
               evenOdd++;
               e1 = 1;

           }
            if(e2 == 1){
               e2 = 0;
              oddEven++;
           }

         }
        else{
             if(e2 ==0 ){
               oddEven++;
               e2 = 1;

           }
            if(e1 == 1){
               e1 = 0;
              evenOdd++;
           }
           odd++;
       }


       }

      return Math.max(Math.max(even,odd),Math.max(oddEven,evenOdd));
    }
}