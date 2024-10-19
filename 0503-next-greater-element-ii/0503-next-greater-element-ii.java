class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack();
        int n = nums.length;
        int ans[] = new int[n];
        for(int i=2*n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            ans[i%n] = st.isEmpty()?-1:st.peek();
            st.push(nums[i%n]);
        }
        return ans;
    }
}