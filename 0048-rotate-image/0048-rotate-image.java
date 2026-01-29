class Solution {
    public void rotate(int[][] matrix) {

        // transpose by swapping diagonally 
        for(int i=0;i<matrix.length-1;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        // reverse each row 
        int n=matrix.length;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
    }
}