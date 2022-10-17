// O(N) TC

public class Solution {
    public  int solve(int A, int B) {
        int C=1000000007;
        long fact= factorial(B,C);
        long pow= power(A,fact,C);
        return (int) pow;
    }

    public  long factorial(int n, long mod){
        long fact=1;
        for(int i=2;i<=n;i++){
            fact=(fact*i)%(mod-1);
        }
        return fact;
    }

    public  long power(int a, long B, int C){
        long A=a;
        long res=1;
        while (B > 0) {
            if ((B & 1)==1) {
                res = (res*A)%C;
            }
            A = ((A%C)*(A%C))%C;
            B = B >> 1;
        }
        return res %C;
    }
}
