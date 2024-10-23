class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> queue = new LinkedList();
        int time = 0;
        int m = grid.length;
        int n = grid[0].length;
        int cntfresh = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    queue.add(new Pair(i,j,0));
                }
                else if(grid[i][j] == 1){
                    cntfresh++;
                }
            }
        }
        int cnt = 0;
        int[] drow = {-1,0,0,1};
        int[] dcol = {0,1,-1,0};
        while(!queue.isEmpty()){
            int r = queue.peek().row;
            int c = queue.peek().col;
            int t = queue.peek().tm;
            queue.poll();
            time = Math.max(time,t);
            for(int i=0;i<4;i++){
                int row = r+drow[i];
                int col = c+dcol[i];
                if(row>=0 && row<m && col>=0 && col<n && grid[row][col]==1){
                    queue.add(new Pair(row,col,t+1));
                    grid[row][col] = 2;
                    cnt++;
                }
            }
        }
        if(cntfresh!=cnt){
            return -1;
        }
        return time;
    }
}
class Pair{
    int row;
    int col;
    int tm;
    Pair(int row,int col,int tm){
        this.row = row;
        this.col = col;
        this.tm = tm;
    }
}