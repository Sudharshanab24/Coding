class Solution {
    static final int MOD = 1_000_000_007;

    // Function for modular exponentiation (x^y % mod)
    private long modularExponentiation(long base, long exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) { // If exp is odd, multiply base
                result = (result * base) % mod;
            }
            base = (base * base) % mod; // Square the base
            exp >>= 1; // Divide exp by 2
        }
        return result;
    }

    public int countGoodNumbers(long n) {
        long numEven = (n + 1) / 2; // Count of even indices
        long numOdd = n / 2;        // Count of odd indices

        long powerOf5 = modularExponentiation(5, numEven, MOD);
        long powerOf4 = modularExponentiation(4, numOdd, MOD);

        return (int) ((powerOf5 * powerOf4) % MOD);
    }
}
