class Solution {
    public int singleNonDuplicate(int[] nums) {
        int num=nums[0];
        if(nums.length>1){
            if(nums[0]!=nums[1]){
                num=nums[0];
            }
            if(nums[nums.length-1]!=nums[nums.length-2]){
                num=nums[nums.length-1];
            }
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                num=nums[i];
            }
        }
        return num;
    }
}