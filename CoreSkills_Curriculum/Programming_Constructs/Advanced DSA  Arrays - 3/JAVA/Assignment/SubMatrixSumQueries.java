// O(Q+N*M) TC

public class Solution {
    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int n=A.length;
        int m=A[0].length;
        int[][] psum= new int[n][m];
        int mod=1000000007;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0){
                    psum[i][j]=(psum[i][j]+A[i][j])%mod;
                }
                else {
                    psum[i][j]=(psum[i][j]+A[i][j]+psum[i][j-1])%mod;
                }
            }
        }

        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                if(i>0){
                    psum[i][j]=(psum[i][j]+psum[i-1][j])%mod;
                }
            }
        }
        int ans[] = new int[B.length];
        for(int i=0;i<B.length;i++){
            int sum=0;
            int TL[]={B[i],C[i]};
            int BR[]={D[i],E[i]};
            int a1=TL[0]-1;
            int b1=TL[1]-1;
            int a2=BR[0]-1;
            int b2=BR[1]-1;
            sum+=psum[a2][b2];
            if(a1>0){
                sum=(sum-psum[a1-1][b2])%mod;
            }
            if(b1>0){
                sum=(sum-psum[a2][b1-1])%mod;
            }
            if(a1>0 && b1>0){
                sum=(sum+psum[a1-1][b1-1])%mod;
            }
            ans[i]=sum%mod;
        }
        return ans;
    }
}
