class Solution {
    public boolean isSafe(int col,int row,char[][] board,int n){
        int dcol = col;
        int drow = row;
        while(col>=0){
            if(board[row][col]!='.'){
                return false;
            }
            col--;
        }
        col = dcol;
        while(row>=0 && col>=0){
            if(board[row][col]!='.'){
                return false;
            }
            row--;
            col--;
        }
        row = drow;
        col = dcol;
        while(row<n && col>=0){
            if(board[row][col]!='.'){
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
    public void solve(int col,int n,char[][] board,List<List<String>> ans){
        if(col == n){
            List<String> list = new ArrayList();
            for(int i=0;i<n;i++){
                String st = "";
                for(int j=0;j<n;j++){
                    st+=board[i][j];
                }
                list.add(st);
            }
            ans.add(new ArrayList(list));
            return;
        }
        for(int row = 0;row<n;row++){
            if(isSafe(col,row,board,n)){
                board[row][col] = 'Q';
                solve(col+1,n,board,ans);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> ans = new ArrayList();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        solve(0,n,board,ans);
        return ans;
    }
}