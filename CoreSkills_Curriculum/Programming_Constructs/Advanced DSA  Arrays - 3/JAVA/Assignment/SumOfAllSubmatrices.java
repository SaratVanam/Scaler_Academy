// O(N*M) TC

public class Solution {
    public int solve(int[][] A) {
        int sum=0;
        int n=A.length;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                sum+=A[i][j]*((i+1)*(j+1)*(n-i)*(n-j));
            }
        }
        return sum;
    }
}
