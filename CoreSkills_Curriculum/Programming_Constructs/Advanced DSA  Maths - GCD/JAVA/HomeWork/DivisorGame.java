// O(Logmin(a,b)) TC

public class Solution {
    public int gcd(int x, int y) {
        if (x == 0)
            return y;
        return gcd(y % x, x);
    }
    public int solve(int A, int B, int C) {
        long lcm = (long) B * C / gcd(B, C);
        return (int)(A / lcm);
    }

}
