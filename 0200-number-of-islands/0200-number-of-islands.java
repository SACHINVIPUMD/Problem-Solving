class Solution {
    public int numIslands(char[][] grid) {
        int island = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean visited[][] = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    island++;
                    bfs(i,j,grid,visited);
                }
            }
        }
        return island;
    }
    public void bfs(int r,int c,char[][] grid,boolean[][] visited){
        int m = grid.length;
        int n = grid[0].length;
        visited[r][c] = true;
        Queue<int[]> q = new LinkedList();
        q.offer(new int[]{r,c});
        int[][] direction = new int[][] {{1,0} , {0,1} , {-1,0} , {0,-1}};
        while(!q.isEmpty()){
            int curr[] = q.poll();
            int row = curr[0];
            int col = curr[1];
            for(int i=0;i<4;i++){
                int drow = row+direction[i][0];
                int dcol = col+direction[i][1];
                if(drow<m && dcol<n &&drow>=0 && dcol>=0 && grid[drow][dcol] == '1' && !visited[drow][dcol]){
                    visited[drow][dcol] = true;
                    q.offer(new int[]{drow,dcol});
                }
            }
        }
    }
}