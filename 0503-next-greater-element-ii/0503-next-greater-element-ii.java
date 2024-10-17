class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // HashMap<Integer,Integer> map = new hashMap();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],i);
        // }
        int ans[] = new int[nums.length];
        boolean next = false;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            next = false;
            for(int j=i+1;j<nums.length+i;j++){
                if(nums[j%n]>nums[i]){
                    ans[i] = nums[j%n];
                    next = true;
                    break;
                }
            }
            if(!next){
                ans[i] = -1;
            }
        }
        return ans;
    }
}