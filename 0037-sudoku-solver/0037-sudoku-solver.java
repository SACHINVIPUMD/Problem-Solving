class Solution {
    public boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == '.'){
                    for(int x=1;x<=9;x++){
                        if(isSafe(board,i,j,x)){
                            board[i][j] = (char)(x+'0');
                            if(solve(board)){
                                return true;
                            }
                        }
                        board[i][j] = '.';
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isSafe(char[][] board,int row,int col,int val){
        char c = (char)(val+'0');
        for(int i=0;i<9;i++){
            if(board[row][i] == c){
                return false;
            }
            if(board[i][col] == c){
                return false;
            }
            if(board[3*(row/3)+i/3][3*(col/3)+i%3] == c){
                return false;
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}