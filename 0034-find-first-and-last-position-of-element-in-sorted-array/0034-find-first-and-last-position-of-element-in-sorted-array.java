class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int p1 = 0;
        int p2 = nums.length-1;
        while(p1<nums.length || p2>=0){
            if(nums[p1] == target && ans[0] == -1){
                ans[0] = p1;
            }
            if(nums[p2] == target && ans[1] == -1){
                ans[1] = p2;
            }
            p1++;
            p2--;
        }
        return ans;
    }
}