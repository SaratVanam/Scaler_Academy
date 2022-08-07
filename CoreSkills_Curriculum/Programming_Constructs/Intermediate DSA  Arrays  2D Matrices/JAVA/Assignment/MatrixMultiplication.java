//O(N*M*K) TC

public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        int[][] ans = new int[A.length][B[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B[0].length;j++){
                for(int k=0;k<B.length;k++){
                    ans[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        return ans;
    }
}
