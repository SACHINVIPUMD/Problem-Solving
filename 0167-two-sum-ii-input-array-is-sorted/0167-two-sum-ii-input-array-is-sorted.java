class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int l = 0;
        int r = nums.length-1;
        int sum = 0;
        while(l<r){
            sum = nums[l]+nums[r];
            if(sum==target){
                arr[0] = l+1;
                arr[1] = r+1;
                break;
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }
        return arr;
    }
}

