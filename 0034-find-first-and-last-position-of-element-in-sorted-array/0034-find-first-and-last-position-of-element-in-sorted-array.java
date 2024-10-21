class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = findFirst(nums,target,true);
        ans[1] = findFirst(nums,target,false);
        return ans;
    }
    public int findFirst(int nums[],int target,boolean searchingLeft){
        int left = 0;
        int right = nums.length-1;
        int index = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]<target){
                left = mid+1;
            }
            else if(nums[mid]>target){
                right = mid -1;
            }
            else{
                index = mid;
                if(searchingLeft){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
        }
        return index;
    }
}