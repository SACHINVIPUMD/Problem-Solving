class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        boolean[][] visited = new boolean[m][n];       
        bfs(sr, sc, image, visited, color,image[sr][sc]);
        return image;
    }

    public void bfs(int r,int c,int[][] copy,boolean[][] visited,int color,int check){
        visited[r][c] = true;
        copy[r][c] = color;
        Queue<int[]> q = new LinkedList();
        q.offer(new int[]{r,c});
        int m = copy.length;
        int n = copy[0].length;
        int[][] direction = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];
            for(int i=0;i<4;i++){
                int drow = row+direction[i][0];
                int dcol = col+direction[i][1];
                if(drow<m && drow>=0 && dcol<n && dcol>=0 && copy[drow][dcol]!=color && copy[drow][dcol]==check &&!visited[drow][dcol]){
                    copy[drow][dcol] = color;
                    q.offer(new int[]{drow,dcol});
                }
            }
        }
    }
}