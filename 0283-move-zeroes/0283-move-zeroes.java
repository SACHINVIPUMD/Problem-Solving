class Solution {
    public void moveZeroes(int[] nums) {
        int[] dp= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i]=0;
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                dp[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=dp[i];
        }
    }
}