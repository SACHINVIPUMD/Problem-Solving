class Solution {
    public long coloredCells(int n) {
        long ans = 1;
        if(n == 1){
            return ans;
        }
        for(int i=0;i<n;i++){
            ans+=4*i;
        }
        // 1 5 13 25
        //    4 8 12 
        return ans;
    }
}