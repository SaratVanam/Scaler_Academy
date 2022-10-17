// O(Log N) TC

public class Solution {
    public int pow(int A, int B, int C) {
        long a = A;
        long res = 1L;
        while (B > 0) {
            if (B % 2 == 1) {
                res *= a;
                res %= C;
            }
            a *= a;
            a %= C;
            B = B >> 1;
        }
        res = (res + C) % C;
        return (int) res;
    }
}
