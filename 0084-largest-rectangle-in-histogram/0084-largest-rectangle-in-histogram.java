class Solution {
    class Pair{
        int ind;
        int val;
        Pair(){

        }
        Pair(int ind,int val){
            this.ind = ind;
            this.val = val;
        }
    }
    public int[] findNse(int[] arr,int n){
        int[] ans = new int[n];
        Arrays.fill(ans,n);
        Stack<Pair> st = new Stack();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<st.peek().val){
                ans[st.peek().ind] = i;
                st.pop();
            }
            st.push(new Pair(i,arr[i]));
        }
        return ans;
    }
    public int[] findPse(int[] arr,int n){
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        Stack<Pair> st = new Stack();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<st.peek().val){
                ans[st.peek().ind] = i;
                st.pop();
            }
            st.push(new Pair(i,arr[i]));
        }
        return ans;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nse = findNse(heights,n);
        int[] pse = findPse(heights,n);
        int max = 0;
        int width;
        for(int i=0;i<n;i++){
            width = nse[i] - pse[i] -1;
            max = Math.max(max,heights[i]*width);
        }
        return max;
    }
}