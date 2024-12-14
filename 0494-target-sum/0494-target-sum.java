class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return recur(0,nums,target,0);
    }
    public static int recur(int ind,int[] nums,int target,int val){
        if(ind == nums.length){
            if(val == target){
                return 1;
            }
            return 0;
        }
        return recur(ind+1,nums,target,val+nums[ind])+
        recur(ind+1,nums,target,val-nums[ind]);
    }
}