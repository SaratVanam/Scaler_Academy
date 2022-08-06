public class Solution {
    public int[] solve(int[][] A) {
        int[] ans = new int[A.length];
        for(int i=0;i<A.length;i++){
            int sum=0;
            for(int j=0;j<A[0].length;j++){
                sum+=A[i][j];
            }
            ans[i]=sum;
        }
        return ans;
    }
}
