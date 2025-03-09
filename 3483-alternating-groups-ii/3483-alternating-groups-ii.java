class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int[] temp = new int[n+k-1];
        int it = 0;
        for(int i=0;i<n;i++){
            temp[it++] = colors[i];
        }
        for(int i=0;i<k-1;i++){
            temp[it++] = colors[i];
        }
        int cnt = 0;
        int left = 0;
        for(int right = left+1;right<temp.length;right++){
            if(temp[right] == temp[right-1]){
                left = right;
            }
            if(right-left+1>=k){
                cnt++;
            }
        }
        return cnt;
    }
}