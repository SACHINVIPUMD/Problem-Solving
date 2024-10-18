class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> st = new Stack();
        int n = temperatures.length;
        int[] ans = new int[temperatures.length];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()[0]<=temperatures[i]){
                st.pop();
            }
            ans[i] = st.isEmpty()?0:st.peek()[1]-i;
            st.push(new int[]{temperatures[i],i});
        }
        return ans;
    }
}