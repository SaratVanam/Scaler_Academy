// O(NLogN) TC

public class Solution {
    public int[] solve(int[] A) {
        int MOD =1000000007;
        Arrays.sort(A);
        int n = A.length;
        int[] B = new int[2];
        for(int j=0;j<A.length/2;j++){
            B[0] = (B[0] + (A[n/2+j]-A[j])%MOD)%MOD;
        }
        for(int i=1;i<A.length;i+=2){
            B[1] = (B[1] + (A[i]-A[i-1])%MOD)%MOD;
        }

        return B;
    }
}
