class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre=new int[nums.length];
        int[] suf=new int[nums.length];
        int[] sol=new int[nums.length];
        Arrays.fill(pre,1);
        Arrays.fill(suf,1);
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            suf[i]=suf[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            sol[i]=pre[i]*suf[i];
        }
        return sol;
    }
}