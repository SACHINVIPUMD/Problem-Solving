class Solution {
    public int[] closestPrimes(int left, int right) {
        int ans[] = new int[2];
        Arrays.fill(ans,-1);
        List<Integer> list = new ArrayList();
        boolean[] isPrime = sieve(right);
        int sum = Integer.MAX_VALUE;
        for(int i=left;i<=right;i++){
            if(isPrime[i]){
                list.add(i);
            }
        }
        for(int i=0;i<list.size();i++){
            int j = i+1;
            while(j<list.size() && list.get(j) - list.get(i)<sum){
                sum = list.get(j) - list.get(i);
                ans[0] = list.get(i);
                ans[1] = list.get(j);
                j++;
            }
        }
        return ans;
    }
    private boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i*i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
