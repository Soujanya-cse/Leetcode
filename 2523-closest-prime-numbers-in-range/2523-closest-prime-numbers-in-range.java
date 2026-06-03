class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] prime = new boolean[right + 1];

        // Assume all numbers are prime initially
        for (int i = 2; i <= right; i++) {
            prime[i] = true;
        }

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= right; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    prime[j] = false;
                }
            }
        }

        int prev = -1;
        int minDiff = Integer.MAX_VALUE;
        int[] ans = {-1, -1};

        for (int i = Math.max(2, left); i <= right; i++) {
            if (prime[i]) {
                if (prev != -1) {
                    int diff = i - prev;

                    if (diff < minDiff) {
                        minDiff = diff;
                        ans[0] = prev;
                        ans[1] = i;
                    }
                }
                prev = i;
            }
        }

        return ans;
    }
}