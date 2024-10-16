class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sol = new StringBuilder();
        int ac = 0 , bc = 0 , cc = 0;
        int total = a + b + c;
        for(int i = 0 ; i< total ; i++) {
            if((a >= b && a >= c && ac != 2) || (bc == 2 || cc == 2) && a > 0) {
                sol.append("a");
                a--;
                ac++;
                bc = 0;
                cc = 0;
            } else if((b >= a && b >= c && bc != 2) || (ac == 2 || cc == 2) && b > 0) {
                sol.append("b");
                b--;
                bc++;
                ac = 0;
                cc = 0; 
            } else if((c >= b && c >= a && cc != 2) || (bc == 2 || ac == 2) && c > 0) {
                sol.append("c");
                c--;
                cc++;
                bc = 0;
                ac = 0;
            } else break;
        }
        return sol.toString();
    }
}