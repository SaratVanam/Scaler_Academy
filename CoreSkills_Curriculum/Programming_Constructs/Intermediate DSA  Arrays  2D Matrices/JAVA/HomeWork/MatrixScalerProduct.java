public class Solution {
    public int[][] solve(int[][] A, int B) {
        int[][] ans = new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                ans[i][j]=B*A[i][j];
            }
        }
        return ans;
    }
}
