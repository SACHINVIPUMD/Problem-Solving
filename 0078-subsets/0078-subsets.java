class Solution {
    public void subseq(int ind,int[] nums,List<List<Integer>> ans,List<Integer> arr){
        if(ind == nums.length){
            ans.add(new ArrayList(arr));
            return;
        }
        arr.add(nums[ind]);
        subseq(ind+1,nums,ans,arr);
        arr.remove(arr.size()-1);
        subseq(ind+1,nums,ans,arr);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> arr = new ArrayList();
        subseq(0,nums,ans,arr);
        return ans;
    }
}