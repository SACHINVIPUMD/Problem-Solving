class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> list = new ArrayList();
        recur(0,nums,list,ans);
        return ans;
    }
    public void recur(int ind,int[] nums,List<Integer> list,List<List<Integer>> ans){
        if(ind == nums.length){
            ans.add(new ArrayList(list));
            return;
        }
        recur(ind+1,nums,list,ans);
        list.add(nums[ind]);
        recur(ind+1,nums,list,ans);
        list.remove(list.size()-1);
    }
}