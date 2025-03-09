class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans = Integer.MAX_VALUE;
        int l = 0;
        int r = k-1;
        int black = 0;
        while(l<blocks.length()){
            if(l >= k){
                if(blocks.charAt(l-k) == 'B'){
                    black--;
                }
                // r++;
            }
            if(blocks.charAt(l) == 'B'){
                black++;
            }
            ans = Math.min(ans,k-black);
            l++;
        }
        return ans;
    }
}
// k = 7
// black = 4
// l = 7
// r = 6
// ans = 3