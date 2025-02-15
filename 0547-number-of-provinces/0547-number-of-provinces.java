class Solution {
    public void bfs(int u,int[][] isConnected,boolean[] visited){
        visited[u] = true;
        int n = isConnected.length;
        Queue<Integer> q = new LinkedList();
        q.offer(u);
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int i=0;i<n;i++){
                if(isConnected[curr][i] == 1 && !visited[i]){
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                cnt++;
                bfs(i,isConnected,visited);
            }
        }
        return cnt;
    }
}