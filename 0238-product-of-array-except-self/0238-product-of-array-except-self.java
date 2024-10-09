class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int proval = 1;
        boolean flag = false;
        for(int num:nums){
            if(flag && num==0){
                proval = 0;
            }
            if(num==0){
                flag=true;
            }

        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            proval*=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                product[i]=proval;
            }
            else{
                if(!flag)
                product[i] = proval/nums[i];
            }
        }
        return product;
    }
}