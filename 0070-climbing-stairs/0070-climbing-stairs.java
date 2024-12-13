class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        int count = recur(n,0,memo);
        return count;
    }
    public int recur(int n,int step,int[] memo){
        if(step == n){
            return 1;
        }
        else if(step > n){
            return 0;
        }
        if(memo[step]!=-1){
            return memo[step];
        }
        memo[step] = recur(n,step+1,memo)+recur(n,step+2,memo);
        return memo[step];
    }
}