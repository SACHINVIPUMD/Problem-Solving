class Solution {
    public boolean isSubsequence(String s, String t) {
        int ind = 0;
        for(char c:t.toCharArray()){
            if(ind<s.length() && s.charAt(ind) == c){
                ind++;
            }
            else if(ind==s.length()){
                break;
            }
        }
        return ind == s.length();
    }
}