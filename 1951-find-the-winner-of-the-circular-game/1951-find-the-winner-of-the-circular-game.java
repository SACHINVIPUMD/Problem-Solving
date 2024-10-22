class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> circle = new ArrayList();
        for(int i=1;i<=n;i++){
            circle.add(i);
        }
        int i=0;
        while(circle.size()>1){
            i = (i+k-1)%circle.size();
            circle.remove(i);
        }
        return circle.get(0);
    }
}