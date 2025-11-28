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

    public void solve(char[][] board, int row, int col,char[][] grid){

        if(row==9){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    grid[i][j]=board[i][j];
                }
            }
            return;
        }
        else if(board[row][col]!='.'){      // call
            if(col!=8) solve(board,row,col+1,grid);
            else solve(board,row+1,0,grid);
        } 
        else{
            for(char ch='1';ch<='9';ch++){
                if(isValid(board,row,col,ch)){
                    board[row][col]=ch;
                    if(col<8) solve(board,row,col+1,grid);
                    else solve(board,row+1,0,grid);
                    board[row][col]='.';  // backtracking 
                }
            }
        }
    }

    public void solveSudoku(char[][] board) {
        char[][] grid =new char[9][9];
        solve(board,0,0,grid);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j]=grid[i][j];
            }
        }
    }
}