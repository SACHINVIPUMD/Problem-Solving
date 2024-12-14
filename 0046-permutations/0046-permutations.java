class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> temp = new ArrayList();
        recur(0,nums,ans,temp);
        return ans; 
    }
    public void recur(int ind,int[] nums,List<List<Integer>> ans,List<Integer> temp){
        if(ind == nums.length){
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                recur(ind+1,nums,ans,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
}