class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        boolean[] notPrime = new boolean[n];
        for(int p=2;p*p<n;p++){
            if(!notPrime[p]){
                for(int i=p*p;i<n;i+=p){
                    notPrime[i] = true;
                }
            }
        }
        int count = 0;
        for(int i=2;i<n;i++){
            if(notPrime[i] == false){
                count++;
            }
        }
        return count;
    }
}