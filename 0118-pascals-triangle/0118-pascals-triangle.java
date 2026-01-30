class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> anss = new ArrayList<>();
          
          for(int i=1;i<=numRows;i++){
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(1);
            int ans=1;
            for(int j=1;j<i;j++){
                ans=ans*(i-j);
                ans=ans/j;
                pair.add(ans);
            }
            anss.add(pair);
          }
        return anss;
    }
}