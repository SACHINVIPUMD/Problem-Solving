class Solution {
    public int lengthOfLastWord(String s) {
        int length=0;
            String str=s.trim();
        int i = str.length()-1;
        while(i>=0 && str.charAt(i)!=' '){
            length++;
            i--;
        }
        return length;
    }
}