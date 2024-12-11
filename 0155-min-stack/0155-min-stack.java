class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;
    // int minval = Integer.MAX_VALUE;
    public MinStack() {
        st = new Stack();
        min = new Stack();
    }
    public void push(int val) {
        if(st.isEmpty()){
            min.push(val);
            st.push(val);
        }
        else{
            st.push(val);
            min.push(Math.min(min.peek(),val));
        }
    }
    
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */