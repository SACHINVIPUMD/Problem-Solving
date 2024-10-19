class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;  // There are no primes less than 2.
        
        // Create a boolean array to mark non-prime numbers
        boolean[] notPrime = new boolean[n];
        
        // 0 and 1 are not prime numbers, so we don't need to worry about them
        
        // Start with 2, the first prime number
        for (int p = 2; p * p < n; p++) {
            // If p is a prime
            if (!notPrime[p]) {
                // Mark all multiples of p starting from p * p as not prime
                for (int i = p * p; i < n; i += p) {
                    notPrime[i] = true;
                }
            }
        }
        
        // Count primes less than n
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}
