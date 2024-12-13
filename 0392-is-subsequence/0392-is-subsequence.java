class Solution {
    public boolean isSubsequence(String s, String t) {
        // char [] arr = s.toCharArray();
        int ind = 0;
        for(char c:t.toCharArray()){
            if(ind<s.length() && s.charAt(ind) == c){
                ind++;
            }
        }
        return ind == s.length();
    }
}