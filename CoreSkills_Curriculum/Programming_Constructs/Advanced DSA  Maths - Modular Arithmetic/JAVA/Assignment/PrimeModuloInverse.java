// O(log N) TC

public class Solution {
    long power(long x, long y, long p) { 
        long res = 1;        // Initialize result 
        x = x % p;        // Update x if it is more than or equal to p 
        while (y > 0) { 
            // If y is odd, multiply x with result 
            if ((y & 1) == (long)1) 
                res = (res*x) % p; 
            y = y >> 1; 
            x = (x * x) % p; 
        }
        return res; 
    }
    
    public int solve(int A, int B) {
        // Modular inverse of A Modulo B = pow(A, B - 2, B)
        return (int)power(A, B - 2, B);
    }
}
