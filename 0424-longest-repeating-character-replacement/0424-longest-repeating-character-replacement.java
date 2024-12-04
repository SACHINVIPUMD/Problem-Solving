class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r = 0;
        int maxfreq = 0;
        int maxlen = 0;
        Map<Character,Integer> map = new HashMap();
        char curr;
        while(r<s.length()){
            curr = s.charAt(r);
            map.put(curr,map.getOrDefault(curr,0)+1);
            maxfreq = Math.max(maxfreq,map.get(curr));
            if((r-l+1)-maxfreq>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            maxlen = Math.max((r-l+1),maxlen);
            r++;
        }
        return maxlen;
    }
}