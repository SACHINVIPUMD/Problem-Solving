class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k>0 && st.peek()>num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        result.reverse();
        while(result.length()>1 && result.charAt(0) == '0'){
            result.deleteCharAt(0);
        }
        if(result.length() == 0){
            return "0";
        }
        return result.toString();
    }
}