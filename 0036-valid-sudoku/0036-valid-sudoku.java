class Solution {

    public boolean isValid(char[][] board, int row, int col, char num){
        int n = board.length;

        // check row
        for(int j=0;j<n;j++){
            if(board[row][j]==num)  return false;
        }

        // check col
        for(int i=0;i<n;i++){
            if(board[i][col]==num) return false;
        }

        // check 3x3 grid
        int a = row/3*3;
        int b = col/3*3;

        for(int i=a;i<a+3;i++){
            for(int j=b;j<b+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        int n= board.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.') continue;
                char num= board[i][j];
                board[i][j]='.';
                if(!isValid(board,i,j,num)) return false;
                board[i][j]=num;
            }
        }
        return true;
    }
}