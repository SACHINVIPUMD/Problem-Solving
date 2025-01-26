class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(k<2 || nums[i]!=nums[k-2]){
                nums[k++] = nums[i];
            }
        }
        return k;
        // 1 1 
        // k=2 , i =2 
    }
}