class Solution {
    public boolean isSubsequence(String s, String t) {
        char [] arr = s.toCharArray();
        int ind = 0;
        for(char c:t.toCharArray()){
            if(ind<s.length() && arr[ind] == c){
                ind++;
            }
        }
        return ind == s.length();
    }
}