class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;      // no. of rows
        int m = matrix[0].length;   // no. of col

        int st=0;
        int end=n*m-1;

        while(st<=end){
            int mid = st +(end-st)/2;
            int midEle = matrix[mid/m][mid%m]; // row = mid/(no.ofcols) & col= mid%(no.ofcols)

            if(target == midEle) return true;

            if(target<midEle){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }

        return false;   
    }
}