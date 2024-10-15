class Solution {
    public long minimumSteps(String s) {
        long sol = 0;
        int ocount = 0;
        int n = s.length();
        for(int i = n-1; i >= 0; i--) {
            if(s.charAt(i) == '0') {
                ocount++;
            }
            else {
                sol += ocount;
            }
        }        
        return sol;
    }
}