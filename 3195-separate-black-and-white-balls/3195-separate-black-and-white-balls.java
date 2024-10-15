class Solution {
    public long minimumSteps(String s) {
        long sol = 0;
        int ocount = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == '0') ocount++;
        }
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == '0') ocount--;
            else {
                sol += ocount;
            }
        }
        return sol;
    }
}