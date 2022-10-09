// O(logN)

public class Solution {
    public int solve(int A) {
        long N = A + 1, mod = 1000*1000*1000 + 7;
        long ans = 0, pow2 = 1;
        for(int i = 0; i < 32; i++) {
            ans += ((N / (pow2 << 1)) * pow2)%mod + Math.max(0, N % (pow2 << 1) - pow2);
            ans %= mod;
            pow2 <<= 1;
        }
        return (int)ans;
    }
}
