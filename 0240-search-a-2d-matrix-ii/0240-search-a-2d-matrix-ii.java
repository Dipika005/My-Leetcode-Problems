class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n= matrix.length;
        int m= matrix[0].length;

        int i=0;    // first row
        int j=m-1;  // last col of 1st row

        while(i<n && j>=0){
            if(matrix[i][j]==target) return true;

            if(target<matrix[i][j]){
                j--;              // decrease col as target is smaller 
            }else{
                i++;               // increase row as target is larger 
            }
        }
        return false;
    }
}