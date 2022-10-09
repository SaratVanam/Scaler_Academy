// O(1) TC

public class Solution {
    public int divide(int A, int B) {
        long n = A, m = B;
        // determine sign of the quotient
        int sign = 1;
        if (n < 0)
            sign *= -1;
        if (m < 0)
            sign *= -1;
        // remove sign of operands
        n = Math.abs(n);
        m = Math.abs(m);
        // q stores the quotient in computation
        long q = 0, t = 0;
        // test down from the highest bit
        // accumulate the tentative value for valid bits
        for (int i = 31; i >= 0; i--) {
            if (t + (m << i) <= n) {
                t += m << i;
                q |= (long) 1 << i;
            }
        }
        // assign back the sign
        if (sign < 0)
            q = -q;
        // check for overflow and return
        if (q > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        else
            return (int) q;
    }
}
