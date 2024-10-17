class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack();
        for(char c:s.toCharArray()){
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
        StringBuilder result = new StringBuilder();
        for (char ch : st) {
            result.append(ch);
        }
        return result.toString();
    }
}