class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int[] memo = new int[nums.length+1];
        Arrays.fill(nums,-1);
        return recur(0,nums,target,0,memo);
    }
    public static int recur(int ind,int[] nums,int target,int val,int[] memo){
        if(memo[ind]!=-1){
            return memo[ind];
        }
        if(ind == nums.length){
            if(val == target){
                return 1;
            }
            return 0;
        }
        memo[ind] = recur(ind+1,nums,target,val+nums[ind],memo)+
        recur(ind+1,nums,target,val-nums[ind],memo);
        return memo[ind];
    }
}