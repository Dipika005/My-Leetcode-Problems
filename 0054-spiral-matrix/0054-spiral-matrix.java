class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m= matrix.length-1;
        int n= matrix[0].length-1;

   ArrayList<Integer> ans = new ArrayList<>();

   int up,down,left,right;

   up =left=0;
   down = m;
   right = matrix[0].length-1;

   while(up<=down && left<=right){

    for( int i=left;i<=right;i++){
        ans.add(matrix[up][i]);
    }
      up++;

    for(int i=up;i<=down;i++){
        ans.add(matrix[i][right]);
    }
     right--;
      
    if(up<=down){
     for(int i=right;i>=left;i--){
        ans.add(matrix[down][i]);
     }
     down--;
    }
     
     if(left<=right){
        for(int i=down;i>=up;i--){
            ans.add(matrix[i][left]);
        }
        left++;
     }

   }
   return ans;

        
    }
}