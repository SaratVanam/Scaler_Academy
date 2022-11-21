// O(N^2LogN) TC

public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        long ans=0;
        int mod=1000000007;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                ans+=(pow(2,j-i-1,mod)*(A[j]-A[i])%mod)%mod;
            }
        }
        return (int) (ans%mod);
    }

    public long pow(int a, int B, int C) {
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
