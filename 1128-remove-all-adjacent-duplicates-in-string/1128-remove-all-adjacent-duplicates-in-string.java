class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack();
        int n = s.length();
        char c;
        for(int i=n-1;i>=0;i--){
            c = s.charAt(i);
            if(!st.isEmpty()){
                if(st.peek()!=c){
                    st.push(c);
                }
                else{
                    st.pop();
                }
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}