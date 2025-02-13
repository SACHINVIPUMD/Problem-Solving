class Solution {
    public int minimumOperations(int[] nums) {
        int sol = 0;
        for(int num:nums){
            sol += num%3 == 0 ? 0 : 1;
        }
        return sol;
    }
}