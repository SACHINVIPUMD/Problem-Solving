class Solution {
    public boolean isSafe(int col,int row,char[][] board){
        int drow = row;
        int dcol = col;
        while(col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            col--;
            //here this col act as row while checking
        }
        col = dcol;
        while(row>=0 && col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row--;
            col--;
        }
        row = drow;
        col = dcol;
        while(row<board.length && col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
    public void solve(int col,List<List<String>> ans,char[][] board,int n){
        if(col == n){
            List<String> li = new ArrayList();
            for(int i=0;i<n;i++){
                String str = "";
                for(int j=0;j<n;j++){
                    str+=board[i][j];
                }
                li.add(str);
            }
            ans.add(li);
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(col,row,board)){
                board[row][col] = 'Q';
                solve(col+1,ans,board,n);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<List<String>>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }

        solve(0,ans,board,n);
        return ans;
    }
}