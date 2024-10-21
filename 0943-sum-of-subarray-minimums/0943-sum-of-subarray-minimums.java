class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        nextSmaller(arr,nse);
        prevSmaller(arr,pse);
        int mod = 1000000007;
        long ans = 0;
        for(int i=0;i<n;i++){
            int left = i-pse[i];
            int right = nse[i] - i;
            ans=(ans+left*right*(long)arr[i])%mod;
        }
        return (int)ans;
    }
    public void nextSmaller(int[] arr,int[] nse){
        Stack<Integer> st= new Stack();
        int n = arr.length;
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            nse[i] = st.isEmpty()?n:st.peek();
            st.push(i);
        }
    }
    public void prevSmaller(int[] arr,int[] pse){
        Stack<Integer> st= new Stack();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                st.pop();
            }
            pse[i] = st.isEmpty()?-1:st.peek();
            st.push(i);
        }
    }
}